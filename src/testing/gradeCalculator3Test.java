package testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class gradeCalculator3Test {

    final String notmarks="hello";
    final String negmarks="-10";
    final String invalidmarks="500";

    final String gradeAUb="399.3";
    final String gradeA="260";
    final String gradeALb="239.3";
    final String gradeBUb="238.3";
    final String gradeB="220";
    final String gradeBLb="209.3";
    final String gradeCUb="208.3";
    final String gradeC="200";
    final String gradeCLb="179.3";
    final String gradeFub="178.4";
    final String invalidUbEdge="500.3";
    final String negEdg="-0.3";
    final String zeroEdge="0.3";

    gradeCalculator3 g3=new gradeCalculator3();

    @Test
    void notmarks(){

        String msg=g3.calculate(notmarks);
        assertEquals(g3.notmarks,msg);
    }
    @Test
    void negmarks(){
        String msg=g3.calculate(negmarks);
        assertEquals(g3.negMarks,msg);
    }
    @Test
    void Invalidmarks(){
        String msg=g3.calculate(invalidmarks);
        assertEquals(g3.invalidMarks,msg);
    }
    @Test
    void g3Aub(){
        String msg=g3.calculate(gradeAUb);
        //System.out.println(msg);
        assertEquals(g3.A,msg);
    }
    @Test
    void g3Asafe(){
        String msg=g3.calculate(gradeA);
        assertEquals(g3.A,msg);
    }
    @Test
    void g3Alb(){
        String msg=g3.calculate(gradeALb);
        assertEquals(g3.A,msg);
    }
    @Test
    void g3BUb(){
        String msg=g3.calculate(gradeBUb);
        assertEquals(g3.B,msg);
    }
    @Test
    void g3Bsafe(){
        String msg=g3.calculate(gradeB);
        assertEquals(g3.B,msg);
    }
    @Test
    void g3BLb(){
        String msg=g3.calculate(gradeBLb);
        assertEquals(g3.B,msg);
    }
    @Test
    void g3CUb(){
        String msg=g3.calculate(gradeCUb);
        assertEquals(g3.C,msg);
    }
    @Test
    void g3Csafe(){
        String msg=g3.calculate(gradeC);
        assertEquals(g3.C,msg);
    }
    @Test
    void g3CLb(){
        String msg=g3.calculate(gradeCLb);
        assertEquals(g3.C,msg);
    }
    @Test
    void g3FUb(){
        String msg=g3.calculate(gradeFub);
        assertEquals(g3.F,msg);
    }
    @Test
    void zerotest (){
        String msg=g3.calculate("0");
        assertEquals(g3.F,msg);
    }
    @Test
    void invalidEdgeTest(){
        String msg=g3.calculate(invalidUbEdge);
        assertEquals(g3.invalidMarks,msg);
    }
    @Test
    void negEdgeTest(){
        String msg =g3.calculate(negEdg);
        assertEquals(g3.negMarks,msg);
    }
    @Test
    void zeroEdgeTest(){
        String msg =g3.calculate(zeroEdge);
        assertEquals(g3.F,msg);
    }
}