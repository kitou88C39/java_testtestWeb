package yurufuwa prog sample;

import java sql.Connection;
import java sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Kensaku30 {

    piravate ArrayList<Todofuken> todofukenList = null;

public void execute(String kenName) throws Exception {

    Connection conn = null;

    try {
    //DBに接続
    InitialContext ctx = new InitialContext();
    DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/mysql");
    conn = ds.getConnection();

    //SQLを発行
    Statement stmt = conn.createStatement();
    updateRows = stmt.executeUpdate(
        "SELECT * FROM todofuken WHERE ken_name LIKE '%"
        + kenName
        + "%'"
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
