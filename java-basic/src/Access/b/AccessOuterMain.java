package Access.b;


import Access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData date = new AccessData();

        //public
        date.publicField=20;
        date.publicMethod();

        //defult-> 불가

        //private -> 불가

        date.inneraccess();

    }
}
