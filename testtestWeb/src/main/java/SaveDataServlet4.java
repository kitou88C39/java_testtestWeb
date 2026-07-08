public class SaveDataServlet4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //　セッションを取得
        HttpSession session = req.getSession(false);

        //　セッションから値を消去
        session.removeAttribute("Param1");
    }
}
