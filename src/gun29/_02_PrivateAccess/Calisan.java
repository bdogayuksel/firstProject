package gun29._02_PrivateAccess;

public class Calisan {
    //yanında access işareti olmayanlar default olur(int, string vb)
    int id;
    String name;
    String surname;

    //Sadece bulnduğu class dan eriimi var
    private String password;

    public void sifreAta(String sifre){

        if (sifre.length()<8)
            System.out.println("tekrar dene");
        else {
            //this her zaman asıl değiştirmek istediğimizin yanına eklenir
            this.password = sifre;//normal kullanıcıdan aldığımız şifreyi
            //private parametreye götürmek için kullandık
            System.out.println("başarılı");
        }
    }

    public void showPassword(){
        System.out.println("*********"+password.substring(4));
    }
}
