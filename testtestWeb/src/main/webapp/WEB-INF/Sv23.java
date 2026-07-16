public class Sv23 extends HttpServlet {

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    //都道府県名の一覧を取得
    Kensaku e = new Kensaku();
    K.execute();

    ArrayList<String>kenCodeList = k.getKenCodeList();
    ArrayList<String>kenNameList = k.getKenNameList();
    ArrayList<String>yomiganaList = k.getYomiganaList();

    req.setAttribute("ken_code_list", kenCodeList);
    req.setAttribute("ken_name_list", kenNameList);
    req.setAttribute("yomigana_list", yomiganaList);

    ServletContext sc = getServletContext();
    RequestDispatcher rd = sc.getRequestDispatcher("/WEB-INF/jsp/out.jsp");
    rd.forward(req,resp);
    }
  }
