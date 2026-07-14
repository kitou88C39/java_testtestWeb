public class Kensaku {

    public List<String> execute(String kw){

    ArrayList<String> resultList = new ArrayList<String>();

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
