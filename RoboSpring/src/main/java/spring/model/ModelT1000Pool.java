package spring.model;

import spring.interfaces.Robot;
import spring.interfaces.RobotPool;

import java.util.Map;

public class ModelT1000Pool implements RobotPool {
    private Map<Integer, ModelT1000> robots;

    public ModelT1000Pool() {
    }

    public ModelT1000Pool(Map<Integer, ModelT1000> robots) {
        super();
        this.robots = robots;
    }

    public void setRobots(Map<Integer, ModelT1000> robots) {
        this.robots = robots;
    }

    @Override
    public Map<Integer, ModelT1000> getRobotCollection() {
        return robots;
    }

    public void action() {
        for (Map.Entry<Integer, ModelT1000> element : robots.entrySet()) {
            System.out.println(element.getKey());
            element.getValue().action();
        }
    }
}
