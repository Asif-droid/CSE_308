package parser;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        editor editor=new editor();

        while(true){

            String file=sc.nextLine();
            if(file.equalsIgnoreCase("off")){
                break;
            }

            String s[]=file.split("\\.");


            editor.setParser(s[1]);
            editor.setFont(s[1]);
            editor.show();

        }
    }
}
