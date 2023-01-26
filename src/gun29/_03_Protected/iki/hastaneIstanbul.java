package gun29._03_Protected.iki;

import gun29._03_Protected.bir.Doctor;

import javax.print.Doc;

public class hastaneIstanbul {
    public static void main(String[] args) {
        Doctor doc1=new Doctor("sada");

        doc1.hastaneAd="İstanbul sehir";

        //BURADAN PROTECTED VEYA PRİVATE VARIABLELARA ULAŞAMAZ
    }
}
