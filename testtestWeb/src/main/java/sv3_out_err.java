public class sv3_out_err extends HttpServlet {

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

//検索条件のJSPにフォワード
    ServletContext sc = getServletContext();
    RequestDispatcher rd = sc.getRequestDispatcher("/WEB-INF/sv3_out_err.jsp");
    rd.forward(req,resp);

@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    //パラメータ(キーワード)を取得
    String kw=req.getParameter("kw");

    Kensaku e = new Kensaku();
    List<String> resultList=k.execute(kw);

    //検索結果の有無で分岐
    if(resultList size()= 0){

    req.setAttribute("keyword", kw);

    ServletContext sc = getServletContext();
    getRequestDispatcher rd = sc.getRequestDispatcher("/WEB-INF/sv3_out_err.jsp");
    rd.forward(req, resp);

    } else {

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
