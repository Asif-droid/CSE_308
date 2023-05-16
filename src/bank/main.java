package bank;

import bank.account.accTyp;
import bank.account.account;
import bank.account.stAcc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class main {







    public static void main(String[] args) {



        ArrayList<account> accounts=new ArrayList<>();

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

                }
                else if(cArr[1].equalsIgnoreCase("o1")){

                }
                else if(cArr[1].equalsIgnoreCase("o2")){

                }
                else if(cArr[1].equalsIgnoreCase("c1")){

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
                        }
                    }
                    else{
                        System.out.println("not found");
                    }


                }


            }
            else if(cArr[0].equalsIgnoreCase("off")){
                break;
            }



        }

    }
}
