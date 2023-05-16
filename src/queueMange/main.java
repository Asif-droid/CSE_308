package queueMange;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String type;
        int disNum;
        String comT;

        director d=new director();

        while(true){

            System.out.println("enter system type (space) number of display unit (space) com channel (wifi/data)");

            String cmnd=sc.nextLine();
            if(cmnd.equalsIgnoreCase("off")){
                break;
            }
            String s[]=cmnd.split(" ");
            type=s[0];
            disNum=Integer.parseInt(s[1]);
            comT=s[2];
            sysFac sysFac=new sysFac();
            builder builder=sysFac.sysBuilder(type,disNum,comT);
            d.construct(builder);
            product p=builder.getsystem();
            p.show();
            System.out.println("Total system price (without yearly data/wifi charge) :"+p.totalPrice());

        }

       /* builder dbui=new optimal(2,"wifi");
        d.construct(dbui);
        product p=dbui.getsystem();
        p.show();
        System.out.println(p.totalPrice());*/

    }
}
