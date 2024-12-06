package extend1.access.Child;

import extend1.access.parent.Parent;

public class Child extends Parent {

    public void call(){
        pulbicval=1;
        protectval=1;

        publicMethod();
        
    }
}
