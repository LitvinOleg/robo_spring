package spring.start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.interfaces.Robot;
import spring.interfaces.RobotBuilder;
import spring.model.ModelT1000;
import spring.model.T1000GoldenPool;
import spring.model.T1000Pool;


public class RobotConstructor {
	
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
        t1000.action();
        ModelT1000 model1 = (ModelT1000) context.getBean("model1");
        model1.action();
        /*ModelT1000 t1000Sony1 = (ModelT1000) context.getBean("sonyT1000"),
                   t1000Sony2 = (ModelT1000) context.getBean("sonyT1000"),
                   t1000Toshiba1 = (ModelT1000) context.getBean("toshibaT1000"),
                   t1000Toshiba2 = (ModelT1000) context.getBean("toshibaT1000");
        t1000Sony1.action();
        t1000Sony2.action();
        t1000Toshiba1.action();
        t1000Toshiba2.action();

        RobotBuilder t1000Builder = (RobotBuilder) context.getBean("t1000builder");

        Robot robot1 = t1000Builder.createRobot(),
                robot2 = t1000Builder.createRobot(),
                robot3 = t1000Builder.createRobot();

        robot1.action();
        robot2.action();
        robot3.action();
        T1000Pool pool = (T1000Pool) context.getBean("t1000Pool");
        pool.action();*/
    }
}
