package static2;


//import static static2.DecoData.*;
public class DecoDataMain {
    public static void main(String[] args) {
        DecoData.staticCall();

        DecoData dt  = new DecoData();
        dt.instanceCall();
    }
}
