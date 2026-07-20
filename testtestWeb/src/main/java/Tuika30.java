package yurufuwa prog sample;

import java sql.Connection;
import java sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Tusika30 {

    piravate int updateRows = -1;

public void execute(String kenCode, String kenName, String yomigana) {

    Connection conn = null;

    try {
    //DBに接続
    InitialContext ctx = new InitialContext();
    DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/mysql");
    conn = ds.getConnection();

    //SQLを発行
    Statement stmt = conn.createStatement();
    updateRows = stmt.executeUpdate(
        "INSERT INTO todofuken(ken_code, ken_name, yomigana)"
        + "VALUES ("
        + "'" + kenCode + "',"
        + "'" + kenName + "',"
        + "'" + yomigana + "')
    );
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

public int getUpdateRows(){
    return updateRows;
    }
}
