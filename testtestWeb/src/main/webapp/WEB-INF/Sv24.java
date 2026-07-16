public class Sv24 extends HttpServlet {

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    //都道府県名の一覧を取得
    Kensaku e = new Kensaku();
    K.execute();

    ArrayList<Todofuken> todofukenList = k.getTodofukenList();

    //結果をリクエストにセットして、jspにフォワード
    req.setAttribute("todofuken_list", todofukenList);

    ServletContext sc = getServletContext();
    RequestDispatcher rd = sc.getRequestDispatcher("/WEB-INF/jsp/out.jsp");
    rd.forward(req,resp);
    }
  }
