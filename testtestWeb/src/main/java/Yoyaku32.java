package yurufuwa prog sample;

import java sql.Connection;
import java sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Yoyaku32 {

    piravate int updCount1 = -1;
    piravate int updCount2 = -1;

public void execute(String zasekiNo, String userId, String userName) throws Exception {

    Connection conn = null;

    try {
    //DBに接続
    InitialContext ctx = new InitialContext();
    DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/mysql");
    conn = ds.getConnection();
    conn.setAutoCommit(false);

    //SQLを発行(予約追加、座席更新)
    try{
        insertYoyaku(conn, userId, userName, zasekiNo);
        updateZaseki(conn, userId, zasekiNo);
    } catch(Exception e){
    //更新失敗
    conn.rollback();
    thorw e;
    }

    //コミットと返り値の判断
    if(updCount1 == 1 && updCount2 == 1){
    //更新成功
    conn.commit();
    return true;
    );

    todofukenList = new ArrayList<Todofuken>();

    //結果を取得
    while(rs.next()){

        Todofuken t = new Todofuken(
            rs.getString(1),
            rs.getString(2),
            rs.getString(3)
        );
        todofukenList.add(t);
        }
        rs.close();
        stmt.close();

         } catch(Exception e){
       e.printStackTrace();
    } finally {
       try {
    //接続を閉じる
        conn.close();
    } catch(Exception e){
    }
  }
}

public ArrayList<Todofuken> getTodofukenList(){
    return todofukenList;
    }
}
