package lang.object.equals;

import java.util.Objects;

public class Userv2 {
    private String id;

    public Userv2(String id){
        this.id=id;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Userv2 userv2 = (Userv2) object;
        return Objects.equals(id, userv2.id);
    }
}
