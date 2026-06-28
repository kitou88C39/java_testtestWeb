import jakarta servlet.ServletException;

public class App1 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public App1() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("Hello, World!");
    }
}
