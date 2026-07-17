public class Sv26 extends HttpServlet {

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    //データ追加ページを表示
    ServletContext sc = getServletContext();
    RequestDispatcher rd = sc.getRequestDispatcher("/WEB-INF/jsp/out.jsp");
    rd.forward(req,resp);
    }

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    //入力パラメータを取得
    String kenCode = req.getParameter("txtKenCode");
    String kenName = req.getParameter("txtKenName");
    String yomigana = req.getParameter("txtYomigana");

    //データの追加
    Tuika t = new Tuika();
    t.execute(kenCode, kenName, yomigana);

    int updateRowa = t.getUpdateRows();

    //結果をリクエストにセット
    req.setAttribute("ken_code", kenCode);
    req.setAttribute("ken_name", kenName);
    req.setAttribute("yomigana", yomigana);
    req.setAttribute("update_Rows", updateRows);

    //検索条件を表示
    ServletContext sc = getServletContext();
    RequestDispatcher rd = sc.getRequestDispatcher("/WEB-INF/jsp/out.jsp");
    rd.forward(req,resp);
    }
  }
 }
