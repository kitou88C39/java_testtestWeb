public class Sv2 extends HttpServlet {

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

//JSPへフォワード
    ServletContext sc = getServletContext();
    RequestDispatcher rd = sc.getRequestDispatcher("/WEB-INF/sv2_in.jsp");
    rd.forward(req,resp

@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    //入力内容(文字列)を取得
    String str = req.getParameter("str");

    //文字列を加工
    Editor e = new Editor();
    String editStr = e.execute(str);

    //リクエストへ加工した文字列をセット
    req.setAttribute("result", editStr);

    //JSPへフォワード
    ServletContext sc = getServletContext();
    }
  }
}
