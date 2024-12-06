package extend1.access.parent;

public class Parent {
    public int pulbicval;
    protected int protectval;
    int defaultval;
    private int privateval;

    public void publicMethod(){
        System.out.println("Parent.publicMethod");
    }
    protected void protectedMethod(){
        System.out.println("Parent.protectedMethod");
    }
    void defaultMethod(){
        System.out.println("Parent.defaultMethod");
    }
    private void privateMethod(){
        System.out.println("Parent.privateMethod");
    }

    public void printParent(){
        System.out.println("Parent.printParent");
        System.out.println("pulbicval = " + pulbicval);
        System.out.println("protectval = " + protectval);
        System.out.println("defaultval = " + defaultval);
        System.out.println("privateval = " + privateval);
        defaultMethod();
        protectedMethod();
        privateMethod();
        printParent();
    }
}
