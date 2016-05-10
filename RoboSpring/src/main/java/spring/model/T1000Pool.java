package spring.model;

import spring.interfaces.Robot;
import spring.interfaces.RobotPool;

import java.util.Collection;

public class T1000Pool implements RobotPool {
    private Collection<Robot> robotCollection;

    public T1000Pool(Collection<Robot> robotCollection) {
        super();
        this.robotCollection = robotCollection;
    }

    @Override
    public Collection<Robot> getRobotCollection() {
        return robotCollection;
    }

    public void action() {
        for (Robot robot : robotCollection)
            robot.action();
    }
}
