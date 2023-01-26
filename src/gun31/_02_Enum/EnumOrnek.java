package gun31._02_Enum;

public class EnumOrnek {


    public static void main(String[] args) {
        //DURUMLARIN KESİN VE DEĞİŞMEZ
        // OLDUĞU DURUMLARDA ENUM KULLANILIR

        User us1=new User("user1", userRole.ADMIN, userStatus.AKTIF);
        User us2=new User("user2", userRole.MUDUR, userStatus.AKTIF);
        User us3=new User("user3", userRole.SATIS, userStatus.PASIF);

        userDelete(us1);
        userDelete(us2);
        userDelete(us3);




        }

    public static void userDelete(User user){
        if (user.rol== userRole.ADMIN)
        {
            System.out.println("CANNOT DELETE");
        }
    }



}
