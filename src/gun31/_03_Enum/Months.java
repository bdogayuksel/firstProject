package gun31._03_Enum;

public class Months {
    public static void main(String[] args) {
        //AYIN BÜTÜN ÖZELLİKLERİNİ MONTHSENUM
        // İÇİNDE YAZDIK
        
        MonthsEnum mo=MonthsEnum.AGUSTOS;

        System.out.println("mo = " + mo);
        System.out.println("mo.ayNo = " + mo.ayNo);
        System.out.println("mo.gunMiktar = " + mo.gunMiktar);
        System.out.println("mo.ayAd = " + mo.ayAd);

        for (MonthsEnum m:MonthsEnum.values()) {
            System.out.println(m.ayNo+" "+m.gunMiktar+" "+m.ayAd);
        }
    }
}
