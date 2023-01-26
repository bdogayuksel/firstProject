package gun43;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _03_TryCatch {
    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);

            System.out.println("Sai1: ");
            int sy1 = input.nextInt();

            System.out.println("sai2: ");
            int sy2 = input.nextInt();

            int bolum = sy1 / sy2;
            System.out.println("bolum = " + bolum);
        }
        //catchlere yazıldığı sıra ile girer
        //catchlerin sırası önemli
        catch (InputMismatchException ex) {//belirli bir hata

            System.out.println("sayı gir mal");
        }
        catch (ArithmeticException ex){//spesifik bir hata

            System.out.println("Sıfıra bölme hatası");
        }

        catch (Exception ex){//genel hata
            System.out.println("hata oldu"+ex.getMessage());
        }

        System.out.println("bitti");
    }
}
