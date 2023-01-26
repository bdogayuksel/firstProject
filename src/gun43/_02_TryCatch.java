package gun43;

import java.time.LocalDate;
import java.time.Month;

public class _02_TryCatch {
    public static void main(String[] args) {

        System.out.println("basladı");

        try {//program kırılmasın diye kullanılır
            LocalDate tarih=LocalDate.of(2023, Month.FEBRUARY,30);
        }

        catch (Exception ex){//Hata alındığında yapılması istenenler eklenir

            System.out.println("hata oluştu, dene");
            System.out.println("hata mesajı: "+ex);
            System.out.println("açıklaması "+ex.getMessage());

        }

        System.out.println("bitti");

        try{

        }

        catch (Exception ex){

        }
    }
}
