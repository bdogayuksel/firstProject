package gun29._03_Protected.bir;

import gun29._03_Protected.bir.Doctor;

public class hastaneAnkara {
    public static void main(String[] args) {

        Doctor doc1=new Doctor();
        doc1.name="berk";
        doc1.bolumu="kardio";
        doc1.hastaneAd="ankara hast";


        Doctor doc2=new Doctor("doga");
    }
}
