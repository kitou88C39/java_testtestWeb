public class Sv28 extends HttpServlet {

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    //データ追加ページを表示
    ServletContext sc = getServletContext();
    RequestDispatcher rd = sc.getRequestDispatcher("/WEB-INF/jsp/out.jsp");
    rd.forward(req,resp);
    }

@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    //入力パラメータを取得
    String kenCode = req.getParameter("txtKenCode");

    //データの削除
    Sakujo t = new Sakujo();
    t.excute(kenCode);

    int updateRowa = t.getUpdateRows();

    //結果をリクエストにセット
    req.setAttribute("ken_code", kenCode);
    req.setAttribute("update_Rows", updateRows);

    //検索条件を表示
    ServletContext sc = getServletContext();
    RequestDispatcher rd = sc.getRequestDispatcher("/WEB-INF/jsp/out.jsp");
    rd.forward(req,resp);
    }
  }
