package adapter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class notSepSum implements sumCal{
    Scanner sc;

    @Override
    public double sumSpace(String file) {
        return 0;
    }
    @Override
    public double notSum(String file) {
        double r=0;
        File fileObj=new File(file);
        try {
            sc=new Scanner(fileObj);


            while (sc.hasNextLine()){
                String s=sc.nextLine();
                String sarr[]=s.split("~");
                for(int i=0;i<sarr.length;i++){
                    r+=Double.parseDouble(sarr[i]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        return r;
    }
}
