public class sv21 extends HttpServlet {

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

    Connection conn = null;

    try {
    //DBに接続
    IntialContext ctx = new IntialContext();
    DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/mysql");
    conn = ds.getConnection();

    //SQLを発行
    Statemenst stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("select now()");

    //結果を取得
    resq.getWriter().append("<html><header><meta charset=¥"UTF-8¥">");
    resq.getWriter().append("</header><body>");

    while(rs.next()){
        resp.getWriter().appdend(rs.getString(1)).appdend("<br/>");
    }
    rs.close();
    stmt.close();

    resq.getWriter().append("</body></html>");

    } catch(Exception e){
        e.printStackTrace();
    } finally {
    //接続を閉じる
    conn.close();
    } catch(Exception sqle){
  }
 }
}
}
