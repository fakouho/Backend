package enumerartion.ex1;

public class DiscountService2 {

    public int discount(String grade, int price){
        int discountPercent = 0;
        if(grade.equals(StringGrade.BASIC)){
            discountPercent=10;
        }else if(grade.equals(StringGrade.GOLD)){
            discountPercent=20;
        }else {
            System.out.println(grade+"할인 불가");
        }
        return price * discountPercent/100;
    }
}
