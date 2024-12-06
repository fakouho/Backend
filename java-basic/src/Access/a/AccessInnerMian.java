package Access.a;

public class AccessInnerMian {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        //public
        data.publicField=1;
        data.publicMethod();

        //defult
        data.defultField=2;
        data.defultMethod();

        //private -> 접근 불가
        
        // public 메서드
        data.inneraccess();
    }
}
