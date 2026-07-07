package yurufuwa.prog.sample;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.HttpServlet;
import jakarta.servlet.HttpServletRequest;
import jakarta.servlet.HttpServletResponse;

public class App2 extends HttpServlet{

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException,IOException{

    //パラメータの取得
    String str1 = req.getParameter("str1");

    }
}
