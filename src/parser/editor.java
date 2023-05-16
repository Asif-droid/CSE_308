package parser;

public class editor {
    facProducer facProducer=new facProducer();
    abstractFac parseFac;
    abstractFac fontFac;
    parser p1;
    font f1;
    public editor(){
        parseFac=facProducer.getFact("parser");
       fontFac=facProducer.getFact("font");
    }

    public void setParser(String s){
        p1=parseFac.getParser(s);
    }
    public void setFont(String s){
        f1=fontFac.getFont(s);
    }
    public void show(){
        System.out.println("Parser : "+p1.getParserName());
        System.out.println("Font : " +f1.getFontName());
    }
}
