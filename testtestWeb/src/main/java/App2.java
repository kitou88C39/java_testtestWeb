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
    String str2 = req.getParameter("str2");

    //モデルで文字列結合
    Concat c = new Concat();
    c.setStr1(str1);
    c.setStr2(str2);
    c.join()

    //結合結果を取得
    String ans = c.getAnswer();

    //結合結果をリクエストにセット
    req.setAttribute("ansewer", ans);

    //ビュー(JSP)に結果を出力してもらう
    ServletContext ctx = getServletContext();
    RequestDispatcher rd = ctx.getRequestDispacher("/WEB-INF/join.jsp");
    rd.forward(req, resp);
    }
}
