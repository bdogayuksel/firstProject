package gun29._03_Protected.bir;

import javax.print.Doc;

public class Doctor {

    protected String name;//default ile aynı

    String bolumu;

    private String SicilNo;

    public String hastaneAd;


    Doctor(){

    }
   public Doctor(String name){
        this.name=name;
    }
}
