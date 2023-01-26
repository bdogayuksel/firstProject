package gun43;

public class _06_CheckedUncheckedException {
    public static void main(String[] args) {

        String str="";

        char ilkHarf=str.charAt(0);

        try {
            Thread.sleep(1000);

        }

        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
