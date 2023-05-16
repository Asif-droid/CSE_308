package testing;

public class gradeCalculator3 extends gradeCalculator {
    @Override
    public String calculate(String s) {
       String res=super.calculate(s);
       if(res.equalsIgnoreCase("marks")){
           double marks=Double.parseDouble(s);
           double rounded=(int)marks;
           if(marks>rounded){
               rounded++;
           }
           if(rounded>A3Max) return invalidMarks;
           if(rounded>=A3Min&&rounded<=A3Max) return A;
           else if(rounded>=B3Min&&rounded<=B3Max) return B;
           else if(rounded>=C3Min&&rounded<=C3Max) return C;
           else return F;
       }
       else {
           return res;
       }




    }
}
