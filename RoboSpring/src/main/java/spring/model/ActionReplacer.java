package spring.model;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Created by Олег on 06.05.2016.
 */
public class ActionReplacer implements MethodReplacer {
    @Override
    public Object reimplement(Object o, // Объект для замещения
                              Method method,
                              Object[] objects) throws Throwable {
        System.out.println("Новый актион");
        return o;
    }
}
