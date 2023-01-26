package gun31._04_Soru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class pizzaOrder {
    public static void main(String[] args) {//static in içindeki butun fonksiyonlar static olmalı
        Scanner input=new Scanner(System.in);

        ArrayList<Pizza> orders=new ArrayList<>();

        int secim=0;
        do {

            menu();
            secim=input.nextInt();
            switch (secim){
                case 1://small
                    Pizza sp=new Pizza(pizzaSizes.Small);
                    orders.add(sp);
                    break;
                case 2://medium
                    Pizza mp=new Pizza(pizzaSizes.Medium);
                    orders.add(mp);
                    break;
                case 3://large
                    Pizza lp=new Pizza(pizzaSizes.Large);
                    orders.add(lp);
                    break;
                case 4:
                    printOrders(orders);
                    break;
            }

        }while (secim<=4);

    }

    public static void menu(){
        System.out.println("*******Pizza Menu********");
        System.out.println("1-Small");
        System.out.println("2-Medium");
        System.out.println("3-Large");
        System.out.println("4-İşleme Al-Sipariş Göster");
        System.out.println("5-Çıkış");
        System.out.println("Seçiminiz: ");
    }

    public static void printOrders(ArrayList<Pizza> orders){

        int s=0;
        int m=0;
        int l=0;
        for (Pizza p:orders) {
            if(p.size==pizzaSizes.Small)
                s++;
            else if (p.size==pizzaSizes.Medium) {
                m++;
            } else if (p.size==pizzaSizes.Large) {
                l++;
            }


        }
        System.out.println("****Orders****");
        System.out.println("Small size: "+s);
        System.out.println("Medium size: "+m);
        System.out.println("Large size: "+l);
    }
}
