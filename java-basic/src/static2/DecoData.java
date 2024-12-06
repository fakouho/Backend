package static2;

public class DecoData {
    private int instanceValue;
    private static int staticVlaue;

    public static void staticCall(){
        //instanceValue++
        //instanceMethod++
        staticVlaue++;
        staticMethod();
    }
    public void instanceCall(){
        instanceValue++;
        instanceMethod();
        staticVlaue++;
        staticMethod();
    }

    public static void stCall(DecoData data){
        data.instanceCall();
        data.instanceMethod();
    }

    private void instanceMethod(){
        System.out.println("인스턴스"+instanceValue);
    }

    private static void staticMethod(){
        System.out.println("스테틱"+staticVlaue);
    }



}
