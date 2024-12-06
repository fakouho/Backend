package ref;

public class mon1 {
    public static void main(String[] args) {
        ProductOrder[] orders=new ProductOrder[2];

        orders[0]=pd("감자",2500,30);
        orders[1]=pd("사과",2000,27);

//        ProductOrder name =pd("감자",2500,30);
//        ProductOrder name1 =pd("사과",2000,27);
//
//        System.out.println("이름"+name.productNmae);
//        System.out.println("이름2"+name1.productNmae);

    }
    public static ProductOrder pd(String st,int a, int b){
        ProductOrder pdo=new ProductOrder();
        pdo.productNmae=st;
        pdo.price=a;
        pdo.quantity=b;
        return pdo;
    }
}
