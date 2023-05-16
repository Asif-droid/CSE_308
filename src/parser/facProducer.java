package parser;

public class facProducer {
    public abstractFac getFact(String s){
        if(s.equalsIgnoreCase("parser")){
            return new parserFac();
        }
        else if(s.equalsIgnoreCase("font")){
            return new fontFac();
        }
        return null;
    }
}
