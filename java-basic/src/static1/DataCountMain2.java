package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 dt = new Data2("a",counter);
        System.out.println(counter.count);
        Data2 dt1 = new Data2("b",counter);
        System.out.println(counter.count);
    }
}
