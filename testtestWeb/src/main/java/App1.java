import jakarta servlet.ServletException;
import jakarta servlet.http.HttpServlet;
import jakarta servlet.http.HttpServletRequest;
import jakarta servlet.http.HttpServletReseponse;

public class App1 extends HttpServlet {

    public App1() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
        //パラメータ取得
        String param1 = request.getParameter("param1");
        String param2 = request.getParameter("param2");
        String param3 = request.getParameter("param3");

        //HTMLを作成する処理
        String html = "<html><body><h1>Hello, World!</h1></body></html>";
        response.getWriter().println(html);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }
}