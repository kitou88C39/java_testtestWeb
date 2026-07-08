public class SaveDataServlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // パラメータを取得
        String data = req.getParameter("param");

        //　セッションを生成
        HttpSession session = req.getSession(true);

        //　セッションに値をセット
        session.setAttribute("param", data);
    }
}
