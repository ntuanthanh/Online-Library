/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.admin;

import controller.authorization.BaseAuthController;
import dal.CategoryDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modal.Category;

/**
 *
 * @author pv
 */
public class InsertCategory extends BaseAuthController {

    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        int pageSize = 10; 
        String page = request.getParameter("page");
        if(page == null || page.trim().length() == 0){
            page = "1"; 
        }
        CategoryDBContext categoryDB = new CategoryDBContext(); 
        int pageIndex = Integer.parseInt(page);
        ArrayList<Category> categories = categoryDB.getAllCategories(pageIndex, pageSize);
        int count = categoryDB.count();
        int totalPage = (count % pageSize == 0) ? (count / pageSize) : (count / pageSize) + 1;
        String url = "insert?";
        request.setAttribute("totalPage", totalPage);
        request.setAttribute("pageIndex", pageIndex);
        request.setAttribute("categories", categories);
        request.setAttribute("url",url);
        request.getRequestDispatcher("../../view/admin/insertCategory.jsp").forward(request, response);
    }

    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        CategoryDBContext CategoryDB = new CategoryDBContext();
        String catoryName = request.getParameter("categoryName");
        // ki???m tra t??n danh m???c s??ch v???a nh???p ???? t???n t???i trong dbi ch??a
        boolean checkExistCname = CategoryDB.checkExistCname(catoryName.trim());
        // n???u kh??ng th?? ti???p t???c v??o InsertCategory ????? insert v??o dbi
        if(catoryName != null || catoryName.trim().length() > 0){
            // n???u c?? th?? chuy???n l???i trang insert v?? th??ng b??o message l?? ???? c??
            if (checkExistCname == true) {
                ArrayList<Category> categories = CategoryDB.getAllCategories(1, 10);
                int count = CategoryDB.count();
                int totalPage = (count % 10 == 0) ? (count / 10) : (count / 10) + 1;
                String url = "insert?";
                request.setAttribute("totalPage", totalPage);
                request.setAttribute("pageIndex", 1);
                request.setAttribute("categories", categories);
                request.setAttribute("url",url);
                request.setAttribute("message_ExistCategoryName", "Danh m???c s??ch n??y ???? t???n t???i");
                request.getRequestDispatcher("../../view/admin/insertCategory.jsp").forward(request, response);
            }else{
                Category c = new Category(); 
                c.setName(catoryName);
                CategoryDB.insert(c);
                response.sendRedirect("insert");
            }
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
