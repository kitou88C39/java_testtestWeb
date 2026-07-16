package yurufuwa prog sample;

import java sql.Connection;
import java sql.ResultSet;
import java sql.Statement;
import java sql.ArrayList;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Kensaku24 {

    private ArrayList<Todofuken> todofukenList = null;

public void execute {

    todofukenList = new ArrayList<Todofuken>();

    Connection conn = null;

    try {
    //DBに接続
    InitialContext ctx = new InitialContext();
    DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/mysql");
    conn = ds.getConnection();

    //SQLを発行
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.excuteQuery();

    //結果を取得
    while(rs.next()){

      Todofuken t = new Todofuken();
      t.setKenCode(rs.getString(1));
      t.setKenName(rs.getString(2));
      t.setYogigana(rs.getString(3));

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

public ArrayList<String> getKenCodeList(){
    return kenCodeList;
}

public ArrayList<String> getNameCodeList(){
    return kenNameList;
}

public ArrayList<String> getYomiganaList(){
    return yomiganaList;
}
}
