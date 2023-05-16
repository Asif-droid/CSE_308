package bank;

import bank.account.accTyp;
import bank.account.account;
import bank.emloyee.cashier;
import bank.emloyee.managingDirector;
import bank.emloyee.officer;

import java.util.ArrayList;
import java.util.Scanner;

public class bank {

    private static int fund=0;
    managingDirector md;
    officer o1;
    officer o2;
    cashier c1;
    cashier c2;
    cashier c3;
    cashier c4;
    cashier c5;


    public bank(){

        md=new managingDirector();
        o1=new officer();
         o2=new officer();
        c1=new cashier();
        c2=new cashier();
         c3=new cashier();
         c4=new cashier();
         c5=new cashier();
        fund=1000000000;
        System.out.println("bank created");


    }
    public static int getFund(){
        return fund;
    }


    public static void main(String[] args) {

        bank bank=new bank();


        ArrayList<account> accounts=new ArrayList<>();
        ArrayList<account> loan=new ArrayList<>();

        accTyp accTyp=new accTyp();

        Scanner sc=new Scanner(System.in);

        while(true){
            String command=sc.nextLine();
            String cArr[]=command.split(" ");
            if(cArr[0].equalsIgnoreCase("create")){

                account ac=accTyp.accType(cArr[2]);
                int amount=Integer.parseInt(cArr[3]);
                ac.createAcc(cArr[1],amount,cArr[2]);

                accounts.add(ac);

            }
            else if(cArr[0].equalsIgnoreCase("open")){


                if(cArr[1].equalsIgnoreCase("md")){
                    if(!loan.isEmpty()){
                        System.out.println("loan req");
                        for(account ac:loan){
                            System.out.println(ac.getName()+" req for "+ac.getRloan());
                        }
                    }

                    while(true){
                        String emc=sc.nextLine();
                        String emcAr[]=emc.split(" ");
                        if(emc.equalsIgnoreCase("close")){
                            System.out.println("close for md");
                            break;
                        }
                        else if(emc.equalsIgnoreCase("approve")){
                            for(account ac:loan){
                                bank.md.approval(ac,ac.getRloan());
                            }
                            System.out.println("loan approved");

                        }
                        else if(emcAr[0].equalsIgnoreCase("lookup")){

                            for(account ac:accounts){
                                String name=ac.getName();
                                if(name.equalsIgnoreCase(emcAr[1])){
                                   ac.query();
                                }
                            }


                        }
                        else if(emcAr[0].equalsIgnoreCase("change")){
                            double r=Double.parseDouble(emcAr[2]);
                            bank.md.change(emcAr[1],r);
                            System.out.println(emcAr[1]+" changed to "+r);

                        }
                        else if(emc.equalsIgnoreCase("see")){
                            bank.md.see();
                        }
                    }


                }
                else if(cArr[1].equalsIgnoreCase("o1")){

                    if(!loan.isEmpty()){
                        System.out.println("loan req");
                        for(account ac:loan){
                            System.out.println(ac.getName()+" req for "+ac.getRloan());
                        }
                    }
                    while(true){
                        String emc=sc.nextLine();
                        String emcAr[]=emc.split(" ");
                        if(emc.equalsIgnoreCase("close")){
                            System.out.println("close for officer");
                            break;
                        }
                        else if(emc.equalsIgnoreCase("approve")){
                            for(account ac:loan){
                                bank.o1.approval(ac,ac.getRloan());
                            }
                            System.out.println("loan approved");

                        }
                        else if(emcAr[0].equalsIgnoreCase("lookup")){

                            for(account ac:accounts){
                                String name=ac.getName();
                                if(name.equalsIgnoreCase(emcAr[1])){
                                    ac.query();
                                }
                            }


                        }
                        else if(emcAr[0].equalsIgnoreCase("change")){

                            bank.o1.change(emcAr[1],1);

                        }
                        else if(emc.equalsIgnoreCase("see")){
                            bank.o1.see();
                        }
                    }

                }
                else if(cArr[1].equalsIgnoreCase("o2")){

                }
                else if(cArr[1].equalsIgnoreCase("c1")){

                    while(true){
                        String emc=sc.nextLine();
                        String emcAr[]=emc.split(" ");
                        if(emc.equalsIgnoreCase("close")){
                            System.out.println("close for cashier");
                            break;
                        }
                        else if(emc.equalsIgnoreCase("approve")){
                            System.out.println("no permission");

                        }
                        else if(emcAr[0].equalsIgnoreCase("lookup")){

                            for(account ac:accounts){
                                String name=ac.getName();
                                if(name.equalsIgnoreCase(emcAr[1])){
                                    ac.query();
                                }
                            }


                        }
                        else if(emcAr[0].equalsIgnoreCase("change")){

                            bank.c1.change(emcAr[1],1);

                        }
                        else if(emc.equalsIgnoreCase("see")){
                            bank.c1.see();
                        }
                    }


                }
                else if(cArr[1].equalsIgnoreCase("c2")){

                }
                else{
                    account Pac=null;
                    boolean f=false;
                    for(account ac:accounts){
                        String name=ac.getName();
                        if(name.equalsIgnoreCase(cArr[1])){
                            Pac=ac;
                            System.out.println("welcome "+Pac.getName());
                            f=true;
                            break;
                        }
                    }
                    if(f){


                        while(true){

                            String pComnd=sc.nextLine();
                            String pcAr[]=pComnd.split(" ");

                            if(pComnd.equalsIgnoreCase("close")){
                                System.out.println("close for "+Pac.getName());
                                break;
                            }
                            else if(pComnd.equalsIgnoreCase("query")){
                                Pac.query();
                            }
                            else if(pcAr[0].equalsIgnoreCase("deposit")){
                                int am=Integer.parseInt(pcAr[1]);
                                Pac.deposit(am);
                            }
                            else if(pcAr[0].equalsIgnoreCase("withdraw")){
                                int am=Integer.parseInt(pcAr[1]);
                                Pac.withDraw(am);
                            }
                            else if(pcAr[0].equalsIgnoreCase("request")){


                                int am=Integer.parseInt(pcAr[1]);
                                String t=Pac.getType();
                                if(t.equalsIgnoreCase("student")){
                                    if(am>1000){
                                        System.out.println("maximum 10000");
                                    }
                                    else
                                    {
                                        Pac.setRloan(am);
                                        loan.add(Pac);
                                    }

                                }
                                else if(t.equalsIgnoreCase("savings")){
                                    if(am>10000){
                                        System.out.println("maximum 10000");
                                    }
                                    else
                                    {
                                        Pac.setRloan(am);
                                        loan.add(Pac);
                                    }


                                }
                                else if(t.equalsIgnoreCase("fixed")){
                                    if(am>100000){
                                        System.out.println("maximum 10000");
                                    }
                                    else
                                    {
                                        Pac.setRloan(am);
                                        loan.add(Pac);
                                    }

                                }
                                else if(t.equalsIgnoreCase("loan")){
                                    int ln=Pac.getAmount();
                                    double aplln=ln*.05;
                                    if(am>aplln){
                                        System.out.println("maximum "+aplln);
                                    }
                                    else {
                                        Pac.setRloan(am);
                                        loan.add(Pac);
                                    }
                                }



                            }
                        }
                    }
                    else{
                        System.out.println("not found");
                    }


                }


            }
            else if(cArr[0].equalsIgnoreCase("INC")){
                for (account ac:accounts){
                    String type=ac.getType();
                    if(type.equalsIgnoreCase("student")){
                        ac.interest(.05);
                        ac.loandeduct();
                    }
                    if(type.equalsIgnoreCase("savings")){
                        ac.interest(.1);
                        ac.loandeduct();
                    }
                    if(type.equalsIgnoreCase("fixed")){
                        ac.interest(.15);
                        ac.loandeduct();
                    }
                }
            }
            else if(cArr[0].equalsIgnoreCase("off")){
                break;
            }



        }


    }
}
