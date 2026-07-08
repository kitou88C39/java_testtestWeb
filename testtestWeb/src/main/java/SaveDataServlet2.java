public class SaveDataServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //　セッションを取得
        HttpSession session = req.getSession(false);

        //　セッションから値を取得
        Strig data = (String)session.setAttribute("param");
    }
}
