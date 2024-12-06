package static1;

public class DataCountMian3 {

    public static void main(String[] args) {
        Data3 dt = new Data3("a");
        System.out.println(dt.count);
        Data3 dt2 = new Data3("b");
        System.out.println(dt2.count);
        Data3 dt3 = new Data3("c");
        System.out.println(Data3.count);
    }
}
