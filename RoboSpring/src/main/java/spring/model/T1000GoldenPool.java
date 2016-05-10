package spring.model;

import spring.interfaces.Robot;
import spring.interfaces.RobotPool;

import java.util.Collection;

/**
 * Created by Олег on 08.05.2016.
 */
public class T1000GoldenPool implements RobotPool {
    private Collection<Robot> robotCollection;

    public T1000GoldenPool(Collection<Robot> robotCollection) {
        super();
        this.robotCollection = robotCollection;
    }

    @Override
    public Collection<Robot> getRobotCollection() {
        return null;
    }

    public void beginShow() {
        for (Robot robot : robotCollection)
            robot.action();
    }
}
