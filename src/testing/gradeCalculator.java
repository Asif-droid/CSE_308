package testing;

public class gradeCalculator {
    protected double marksHighest3=300;
    protected double marksHighest4=400;

    public String A="A";
    public String B="B";
    public String C="C";
    public String F="F";

    public String notmarks="not marks";
    public String negMarks="neg Marks";
    public String invalidMarks="Invalid marks";

    protected double A3Min=240;
    protected double A3Max=400;
    protected double B3Min=210;
    protected double B3Max=239;
    protected double C3Min=180;
    protected double C3Max=209;

    protected double A4Min=320;
    protected double A4Max=400;
    protected double B4Min=280;
    protected double B4Max=319;
    protected double C4Min=240;
    protected double C4Max=279;

    public String calculate(String s){
        double marks;
        try {
            marks=Double.parseDouble(s);
            if(marks<0){
                //System.out.println("negative marks ");
                return negMarks;
            }

        }catch (Exception e){
            //System.out.println("Non number marks");
            return notmarks;
        }
        return "marks";

    }

}
