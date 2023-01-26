package gun09;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter password: ");
        String pass1=input.nextLine();
        System.out.print("enter password again: ");
        String pass2=input.nextLine();

        boolean same=pass1.equals(pass2);

        if(same==true){
            System.out.println("Matched");
        }

        else{
            System.out.println("try again");
        }
        /*
        Kullanıcıdan alınan inputlarda çalışmaz
        if (pass1==pass2){
            System.out.println("matched");
        }*/
    }
}
