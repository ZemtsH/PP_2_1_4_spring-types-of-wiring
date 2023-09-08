package koschei.models;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Duck5 {
    @Autowired
    private Egg6 egg6;

    @Override
    public String toString() {
        return ", в утке яйцо " + "" + egg6.toString();
    }
}
