package gun29.Soru;

public class Hesap {
    private int yatan=0;
    private int cekilen=0;
    private int bakiye=0;

    void paraYatir(int yatan){
        this.yatan=yatan;//THIS: ILK DEĞER NE TANIMLI OLURSAOLSUN BİZİMYOLLADIĞIMIZ DEĞERİ ALIR
        bakiye+=yatan;

        System.out.println("yatan = " + yatan);
    }

     void paraCek(int cekilen){
        this.cekilen=cekilen;
        bakiye-=cekilen;
        System.out.println("cekilen = " + cekilen);
    }

    void bakiyeGoster(){
        System.out.println("bakiye = " + bakiye);
    }



}
