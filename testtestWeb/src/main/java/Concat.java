private String str1 = null;
private String str2 = null;
private ConcatResult result = null;

public void join(){
    //文字列の結合
    String answer = str1 + str2;

    //結果クラスに結合結果をセット
    result = new ConcatResult();
    result.setAnsewer(answer);
}

public ConcatResult getResult(){
    return result;
}
