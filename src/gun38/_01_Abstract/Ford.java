package gun38._01_Abstract;

public class Ford extends BinekOto implements IBinekOto{

    public Ford(String marka, int uretimYili, int videsAdi) {
        super(marka, uretimYili, videsAdi);
    }

    @Override
    public int HizlanmaSuresi() {
        return 0;
    }
}
