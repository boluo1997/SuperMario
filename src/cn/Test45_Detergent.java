package cn;

class Cleanser{

    private String s = "Cleanser";

    public void append(String a){
        s += a;
    }

    public void dilute(){
        append((" dilute()"));
    }

    public void apply(){
        append((" apply()"));
    }

    public void scrub(){
        append((" scrub()"));
    }

    public String toString(){
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }

}

public class Test45_Detergent extends Cleanser{

    public void scrub(){
        append(" Detergent.scrub()");
        super.scrub();
    }

    public static void main(String[] args) {
        Test45_Detergent x = new Test45_Detergent();
        x.dilute();
        x.scrub();

        System.out.println(x);
        Cleanser.main(args);
    }


}


