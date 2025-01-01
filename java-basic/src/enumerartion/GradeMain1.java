package enumerartion;

public class GradeMain1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService ds = new DiscountService();
        int basic=ds.discount("BASIC",price);
    }
}
