package stockex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {

        File file=new File("F:\\3-1\\softwareEng\\src\\stockex\\input.txt");
        Scanner sc=new Scanner(file);
        Scanner in=new Scanner(System.in);
        LinkedList<stock> stocks=new LinkedList<>();
        while(sc.hasNextLine()){

            String s=sc.nextLine();
            System.out.println(s);
            String sa[]=s.split(" ");
            String id=sa[0];
            int c=Integer.parseInt(sa[1]);
            double p=Double.parseDouble(sa[2]);
            stock stock=new stock(id,c,p);
            stocks.add(stock);
        }
        LinkedList<user> users=new LinkedList<>();
        while(true){
            String s=in.nextLine();
            if(s.equalsIgnoreCase("off")){
                break;
            }
            String com[]=s.split(" ");
            if(com[0].equalsIgnoreCase("s")){
                String id=com[2];
                user u=null;
                boolean found=false;
                for(user t:users){
                    if(t.id.equalsIgnoreCase(id)){
                        found=true;
                        u=t;
                        break;
                    }
                }
                if(!found){
                    u=new user(id);
                    users.add(u);
                }


                String pid=com[1];
                stock temp;
                for(stock st:stocks){
                    if(st.id.equalsIgnoreCase(pid)){
                        temp=st;
                        u.buy(temp);
                        break;
                    }
                }



            }
            else if(com[0].equalsIgnoreCase("u")){
                String id=com[2];
                user u=null;
                boolean found=false;
                for(user t:users){
                    if(t.id.equalsIgnoreCase(id)){
                        found=true;
                        u=t;
                        break;
                    }
                }
                if(!found){
                    System.out.println("not reg any stock");
                    continue;
                }
                else{
                    String pid=com[1];
                    stock temp;
                    for(stock st:stocks){
                        if(st.id.equalsIgnoreCase(pid)){
                            temp=st;
                            u.unsub(temp);
                            break;
                        }
                    }

                }

            }
            else if(com[0].equalsIgnoreCase("i")||com[0].equalsIgnoreCase("d")){

                String pid=com[1];
                int p=Integer.parseInt(com[2]);

                for(stock st:stocks){
                    if(st.id.equalsIgnoreCase(pid)){
                        st.priceUpdate(p);
                        break;
                    }
                }


            }
            else if(com[0].equalsIgnoreCase("c")){
                String pid=com[1];
                int c=Integer.parseInt(com[2]);

                for(stock st:stocks){
                    if(st.id.equalsIgnoreCase(pid)){
                        st.countupdate(c);
                        break;
                    }
                }

            }
            else{
                System.out.println("not rec");
            }




        }
        for(user u:users){
            System.out.println(u.id);
        }

    }
}
