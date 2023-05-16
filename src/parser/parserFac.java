package parser;

public class parserFac extends abstractFac {
    @Override
    public parser getParser(String s){
        if(s.equalsIgnoreCase("c")){
            return new cParser();
        }if(s.equalsIgnoreCase("cpp")){
            return new cppParser();
        }
        if(s.equalsIgnoreCase("py")){
            return new pyParser();
        }
        else{
            return null;
        }


    }

    @Override
    public font getFont(String s) {
        return null;
    }


}
