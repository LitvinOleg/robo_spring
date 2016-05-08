package spring.model;

import org.springframework.beans.factory.support.MethodReplacer;
import spring.interfaces.Robot;
import spring.interfaces.RobotBuilder;

public abstract class BuilderT1000 implements RobotBuilder {

    @Override
    public abstract Robot createRobot();
}
