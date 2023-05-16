package testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class gradeCalculator4Test {
    final String notmarks="hello";
    final String negmarks="-10";
    final String invalidmarks="500";

    final String gradeAUb="399.3";
    final String gradeA="360";
    final String gradeALb="319.3";
    final String gradeBUb="318.3";
    final String gradeB="300";
    final String gradeBLb="279.3";
    final String gradeCUb="278.3";
    final String gradeC="250";
    final String gradeCLb="239.3";
    final String gradeFub="238.4";
    final String invalidUbEdge="500.3";
    final String negEdg="-0.3";
    final String zeroEdge="0.3";

    gradeCalculator4 g4=new gradeCalculator4();

    @Test
    void notmarks(){

        String msg=g4.calculate(notmarks);
        assertEquals(g4.notmarks,msg);
    }
    @Test
    void negmarks(){
        String msg=g4.calculate(negmarks);
        assertEquals(g4.negMarks,msg);
    }
    @Test
    void Invalidmarks(){
        String msg=g4.calculate(invalidmarks);
        assertEquals(g4.invalidMarks,msg);
    }
    @Test
    void g3Aub(){
        String msg=g4.calculate(gradeAUb);
        //System.out.println(msg);
        assertEquals(g4.A,msg);
    }
    @Test
    void g3Asafe(){
        String msg=g4.calculate(gradeA);
        assertEquals(g4.A,msg);
    }
    @Test
    void g3Alb(){
        String msg=g4.calculate(gradeALb);
        assertEquals(g4.A,msg);
    }
    @Test
    void g3BUb(){
        String msg=g4.calculate(gradeBUb);
        assertEquals(g4.B,msg);
    }
    @Test
    void g3Bsafe(){
        String msg=g4.calculate(gradeB);
        assertEquals(g4.B,msg);
    }
    @Test
    void g3BLb(){
        String msg=g4.calculate(gradeBLb);
        assertEquals(g4.B,msg);
    }
    @Test
    void g3CUb(){
        String msg=g4.calculate(gradeCUb);
        assertEquals(g4.C,msg);
    }
    @Test
    void g3Csafe(){
        String msg=g4.calculate(gradeC);
        assertEquals(g4.C,msg);
    }
    @Test
    void g3CLb(){
        String msg=g4.calculate(gradeCLb);
        assertEquals(g4.C,msg);
    }
    @Test
    void g3FUb(){
        String msg=g4.calculate(gradeFub);
        assertEquals(g4.F,msg);
    }
    @Test
    void zerotest (){
        String msg=g4.calculate("0");
        assertEquals(g4.F,msg);
    }
    @Test
    void invalidEdgeTest(){
        String msg=g4.calculate(invalidUbEdge);
        assertEquals(g4.invalidMarks,msg);
    }
    @Test
    void negEdgeTest(){
        String msg =g4.calculate(negEdg);
        assertEquals(g4.negMarks,msg);
    }
    @Test
    void zeroEdgeTest(){
        String msg =g4.calculate(zeroEdge);
        assertEquals(g4.F,msg);
    }

}