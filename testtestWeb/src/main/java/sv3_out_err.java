public class Sv2 extends HttpServlet {

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

//検索条件のJSPにフォワード
    ServletContext sc = getServletContext();
    RequestDispatcher rd = sc.getRequestDispatcher("/WEB-INF/sv2_in.jsp");
    rd.forward(req,resp);

@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    //パラメータ(キーワード)を取得
    String kw=req.getParameter("kw");

    //検索のクラスでキーワードを検索
    Kensaku e = new Kensaku();
    List<String> resultList=k.execute(kw);

    //キーワードと検索結果をリクエストにセット
    req.setAttribute("keyword", kw);
    req.setAttribute("result", resultList);

    //検索条件のJSPへフォワード
    ServletContext sc = getServletContext();
    RequestDispatcher rd = sc.getRequestDispatcher("/WEB-INF/sv3.jsp");
    rd.forward(req,resp);
    }
  }
}
