public class Kensaku {

    public List<String> execute(String kw){

    ArrayList<String> resultList = new ArrayList<String>();

    //キーワードが未入力なら、検索しない
    if(kw.equals("")){
        return resultList;
    }
    //キーワードを半角スペースで分解する
    String[] kwArray = kw.split("");

    try{
    //ファイルの読み込み
    List<String> dataList = loadFile();

    //キーワードを含む行を検索
    for(String s : dataList){
        if(s.indexOf(kw) != -1){
            resultList.add(s);
        }
    } catch(Exception e){
    return null;
    }
    return resultList;
    }

    private List<String> loadFile() throws FileFoundException, FileFoundException{

    }
  }
}
