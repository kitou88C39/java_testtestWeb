public class Sv29 extends HttpServlet {

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    //検索条件を表示
    ServletContext sc = getServletContext();
    RequestDispatcher rd = sc.getRequestDispatcher("/WEB-INF/jsp/out.jsp");
    rd.forward(req,resp);
    }

@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    //検索条件を取得
    String kenName = req.getParameter("txtKenName");

    try {
    //都道府県名の一覧を取得
    Kensaku k = new Kensaku();
    k.excute(kenName);

    ArrayList<Todofuken> todofukenList = k.getTodofukenList();

    //結果をリクエストにセット
    req.setAttribute("ken_name", kenName);
    req.setAttribute("update_Rows", updateRows);

    //検索条件を表示
    ServletContext sc = getServletContext();
    RequestDispatcher rd = sc.getRequestDispatcher("/WEB-INF/jsp/out.jsp");
    rd.forward(req,resp);
    } catch(Exception e) {
    ServletContext sc = getServletContext();
    RequestDispatcher rd = sc.getRequestDispatcher("/WEB-INF/jsp/err.jsp");
    rd.forward(req,resp);
    }
  }
