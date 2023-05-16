package parser;

public class fontFac extends abstractFac{
    @Override
    public parser getParser(String s) {
        return null;
    }

    @Override
    public font getFont(String s) {
        if(s.equalsIgnoreCase("c")){
            return new courierNew();
        }if(s.equalsIgnoreCase("cpp")){
            return new Monaco();
        }
        if(s.equalsIgnoreCase("py")){
            return new consolas();
        }
        else{
            return null;
        }
    }
}
