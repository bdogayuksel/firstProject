package gun17;

public class _01_JavaArraySoru {
    public static void main(String[] args) {
        int[] numArray=new int[50];

        for (int i = 0; i < numArray.length ; i++) {
            numArray[i]=(int)(Math.random()*11);
            System.out.println("öncesi: "+numArray[i]);
        }

        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i]%2==0) {
                numArray[i]=0;

            }

            else
                numArray[i]=1;
        }


        for (int i = 0; i < numArray.length; i++) {
            System.out.println("sonrası: "+numArray[i]);
        }
    }
}
