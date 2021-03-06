/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.user;

import dal.AccountDBContext;
import dal.BookDBContext;
import dal.BorrowDBContext;
import dal.CategoryDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modal.Account;
import modal.Book;
import modal.Category;
import modal.Student;

/**
 *
 * @author pv
 */
public class DetailController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        CategoryDBContext categoryDB = new CategoryDBContext();
        BookDBContext bookDB = new BookDBContext();
        ArrayList<Category> categories = categoryDB.getAllCategories();
        String raw_bid = request.getParameter("bid");
        if(raw_bid == null || raw_bid.length() == 0){
            raw_bid = "-1"; 
        }
        BorrowDBContext borrowDB = new BorrowDBContext();
        int max = 10; 
        int turnNumber = borrowDB.turnNumber(10);
        request.getSession().setAttribute("turnNumber", turnNumber);
        int bid = Integer.parseInt(raw_bid); 
        Book book = bookDB.getBook(bid); 
        request.setAttribute("book", book);
        request.setAttribute("categories",categories);
        request.getRequestDispatcher("../view/detail.jsp").forward(request, response);               
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String raw_bid = request.getParameter("bid"); 
        int bid = Integer.parseInt(raw_bid);
        Account account = (Account)request.getSession().getAttribute("account");
        AccountDBContext accountDB = new AccountDBContext();
        BorrowDBContext borrowDB = new BorrowDBContext(); 
        // ??i???u ki???n 1 : Account ph???i l?? student m???i c?? quy???n m?????n
        Student student = accountDB.getStudent(account);
        if(student != null){
           // ??i???u ki???n 2 : C??n c?? s??? l?????t m?????n trong ng??y <= 50 l?????t
           int numberBorrowed = borrowDB.checkTurnBoroww(student); 
           if(numberBorrowed < 10){
               // ??i???u ki???n 3 : 1 ng??y t???i ??a m?????n ???????c 4 quy???n
               int numberBook = borrowDB.checkNumberBook(student);
               if(numberBook < 4){
                   // ??i???u ki???n 4 : s??ch m?????n ti???p theo kh??ng ???????c tr??ng trong waiting borrow
                   if(!borrowDB.bookExist(student, bid)){
                        // Th??m v??o b???ng borrow waiting 
                        borrowDB.add(student, bid);
                        request.setAttribute("message_borrow", "???? m?????n th??nh c??ng - b???n mang th??? sinh vi??n l??n th?? vi???n ????? l???y s??ch");
                   }else{
                       // quy???n s??ch v???a m?????n b???n ???? ???????c m?????n
                       request.setAttribute("message_borrow", "B???n ???? m?????n quy???n n??y");
                   }
               }else{
                   // th??ng b??o v??? ???? h???t s??? l?????c m?????n s??ch trong ng??y c???a account
                    request.setAttribute("message_borrow", "M???t ng??y b???n ch??? ???????c m?????n t???i ??a 4 quy???n");
               }
           }else{
               // th??ng b??o v??? kh??ng ????? s??? l?????t m?????n
               request.setAttribute("message_borrow", "S??? l?????t m?????n s??ch trong ng??y ???? h???t");
           }
        }else{
             request.setAttribute("message_borrow", "B???n kh??ng ph???i l?? h???c sinh");
        }
        BookDBContext bookDB = new BookDBContext();
        CategoryDBContext categoryDB = new CategoryDBContext();
        ArrayList<Category> categories = categoryDB.getAllCategories();
        Book book = bookDB.getBook(bid); 
        request.setAttribute("book", book);
        request.setAttribute("categories",categories);
        request.getRequestDispatcher("../view/detail.jsp").forward(request, response);
    }

}
