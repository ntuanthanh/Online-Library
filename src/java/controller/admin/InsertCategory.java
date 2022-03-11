/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.admin;

import dal.CategoryDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modal.Category;

/**
 *
 * @author pv
 */
public class InsertCategory extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Chuyển đến trang insert category
        request.getRequestDispatcher("../../view/admin/insertCategory.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        CategoryDBContext CategoryDB = new CategoryDBContext();
        String catoryName = request.getParameter("categoryName");
        // kiểm tra tên danh mục sách vừa nhập đã tồn tại trong dbi chưa
        boolean checkExistCname = CategoryDB.checkExistCname(catoryName);
        // nếu không thì tiếp tục vào InsertCategory để insert vào dbi
        if(catoryName != null || catoryName.trim().length() > 0){
            // nếu có thì chuyển lại trang insert và thông báo message là đã có
            if (checkExistCname == true) {
                request.setAttribute("message_ExistCategoryName", "Danh mục sách này đã tồn tại");
                request.getRequestDispatcher("../../view/admin/insertCategory.jsp").forward(request, response);
            }else{
                Category c = new Category(); 
                c.setName(catoryName);
                CategoryDB.insert(c);
            }
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}