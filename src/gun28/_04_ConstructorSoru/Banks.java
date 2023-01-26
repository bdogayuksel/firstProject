package gun28._04_ConstructorSoru;

public class Banks {
    public static void main(String[] args) {
        Bank bank1=new Bank();
        bank1.name="Dneiz";
        bank1.sube=2;
        bank1.estDate=1997;

        Bank bank2=new Bank("American", 1992);

        Bank bank3=new Bank("German",1872,4);

        System.out.println("bank1 = " + bank1);
        System.out.println("bank2 = " + bank2);
        System.out.println("bank3 = " + bank3);
    }
}
