package enumerartion.ex1;



public class GradeMain1 {
    public static void main(String[] args) {
        int price = 10000;

       DiscountService2 d2 = new DiscountService2();
       int basic = d2.discount(StringGrade.BASIC,price);
       int gold = d2.discount(StringGrade.GOLD,price);
    }
}
