package cn;

/**
 * 适配器模式：
 * 将一个类的接口变换成客户端所期待的另一种接口，
 * 从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作
 */
public class Test44_AdapterPattern {
    public static void main(String[] args) {
        new Adaper(new Speaker()).translator();
    }
}

class Speaker{
    public String speak(){
        return "speak";
    }
}

interface Translator{
    public String translator();
}

class Adaper implements Translator{

    private Speaker speaker;

    public Adaper(Speaker speaker){
        this.speaker = speaker;
    }

    @Override
    public String translator() {
        String str = speaker.speak();
        //适配
        return str;
    }
}

