package gun34._03_Protected.Paket2;

import gun34._03_Protected.Paket1.P1Hayvan;

public class P2Kedi extends P1Hayvan {

    //  EXTEND YAPILAN CLASSLARDAN PROTECTED A ERİŞİLEBİLİR
    public P2Kedi(String ad, String cins) {
        this.ad=ad;
        this.cins=cins;
    }
}
