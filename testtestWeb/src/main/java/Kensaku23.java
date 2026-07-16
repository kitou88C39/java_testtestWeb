package yurufuwa prog sample;

import java sql.Connection;
import java sql.ResultSet;
import java sql.Statement;
import java sql.ArrayList;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Kensaku23 {

    private ArrayList<String> kenCodeList = null;
    private ArrayList<String> kenNameList = null;
    private ArrayList<String> yomiganaList = null;

public void execute {

    kenCodeList = new ArrayList<String>();
    kenNameList = new ArrayList<String>();
    yomiganaList = new ArrayList<String>();

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
      kenCodeList.add(rs.getString(1));
      kenNameList.add(rs.getString(2));
      yomiganaList.add(rs.getString(3));
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
