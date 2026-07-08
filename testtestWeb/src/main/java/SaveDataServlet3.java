public class SaveDataServlet3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //　セッションを取得
        HttpSession session = req.getSession(false);

        //　セッションを無効化
        session.invalidate();
    }
}
