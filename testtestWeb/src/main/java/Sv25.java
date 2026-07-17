public class Sv25 extends HttpServlet {

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    //検索条件を表示
    ServletContext sc = getServletContext();
    RequestDispatcher rd = sc.getRequestDispatcher("/WEB-INF/jsp/out.jsp");
    rd.forward(req,resp);
    }

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

  }
 }
