package gun43;

import java.util.Scanner;

public class _05_ThrowExample {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Yeni şifre oluşturma");

        System.out.println("Yeni şifre: ");
        String newPass=input.nextLine();


        try {
            if (newPass.length() < 8) {//throw ile suni hata oluşturulur
                //System.out.println("en az 8 karakter olmalı");
                throw new Exception("en az 8 karakter olmalı");
            }

            if (newPass.length() > 15) {
                //System.out.println("en fazla 15 karakter");
                throw new Exception("en fazla 15 karakter");
            }

        }
        catch (Exception ex){
            //hatalar bir yeretoplanıp, hepsi için yapılması
            // gereken işlemler birarada burada yapılır
            System.out.println("Dikkat");
            System.out.println(ex.getMessage());
        }
    }
}
