package gun27._01_Ornek;

public class JavaStaticandNonStaticMethods {
    public static void main(String[] args) {

        int num=345;
        String strNum=String.valueOf(num);

        int intNum=Integer.parseInt(strNum);

        Utility ut=new Utility();
        String strNum2=ut.getString(num);

        String styNum3=Utility.getString2(num);

    }

}
