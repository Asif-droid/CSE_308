package testing;

public class gradeCalculator4 extends gradeCalculator {
    @Override
    public String calculate(String s) {
        String res=super.calculate(s);

        if(res.equalsIgnoreCase("marks")){
            double marks=Double.parseDouble(s);
            double rounded=(int)marks;
            if(marks>rounded){
                rounded++;
            }
            if(rounded>A4Max) return invalidMarks;
            if(rounded>=A4Min&&rounded<=A4Max) return A;
            else if(rounded>=B4Min&&rounded<=B4Max) return B;
            else if(rounded>=C4Min&&rounded<=C4Max) return C;
            else return F;
        }
        else {
            return res;
        }



    }
}
