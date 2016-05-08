package spring.interfaces;

import spring.model.ModelT1000;

import java.util.Map;

/**
 * Created by Олег on 07.05.2016.
 */
public interface RobotPool {
    Map<Integer, ModelT1000> getRobotCollection();
}
