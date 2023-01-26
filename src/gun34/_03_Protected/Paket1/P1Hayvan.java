package gun34._03_Protected.Paket1;

public class P1Hayvan {

    public String ad;//her paketten ulaşılabilir
    int yas;//(default)sadece bulunduğu pakettekiler ulaşabilir
    protected String cins;//default gibi, diğer paketlerden
    private String renk;//bulunduğu class dan erişilebilir
}
