package Access.a;

public class AccessData {
    public int publicField;
    int defultField;
    private  int privateFiel;

    public void publicMethod(){
        System.out.println("publicFiled 호출 + "+publicField);
    }

    void defultMethod(){
        System.out.println("publicFiled 호출 + "+defultField);
    }

    private void privateMethod(){
        System.out.println("publicFiled 호출 + "+privateFiel);
    }

    public void inneraccess(){
        publicField=100;
        defultField=200;
        privateFiel=300;

        publicMethod();
        defultMethod();
        privateMethod();
    }
}
