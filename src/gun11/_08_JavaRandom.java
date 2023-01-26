package gun11;

public class _08_JavaRandom {
    public static void main(String[] args) {
        //Math.Random() 0-0.999999 ARASINDA RANDOM DOUBLE SAYI ÜRETİR

        double rnd=Math.random();
        System.out.println("rnd = " + rnd);
        int rndNum=(int)(Math.random()*6);//0 ile 6 arasında random sayı bas

        System.out.println("rndNum = " + rndNum);
    }
}
