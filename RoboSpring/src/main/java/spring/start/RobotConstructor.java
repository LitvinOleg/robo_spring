package spring.start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.interfaces.Robot;
import spring.interfaces.RobotBuilder;
import spring.model.ModelT1000;


public class RobotConstructor {
	
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        /*ModelT1000 t1000Sony1 = (ModelT1000) context.getBean("sonyT1000"),
                   t1000Sony2 = (ModelT1000) context.getBean("sonyT1000"),
                   t1000Toshiba1 = (ModelT1000) context.getBean("toshibaT1000"),
                   t1000Toshiba2 = (ModelT1000) context.getBean("toshibaT1000");
        System.out.println(t1000Sony1.hashCode());
        System.out.println(t1000Sony2.hashCode());
        System.out.println(t1000Toshiba1.hashCode());
        System.out.println(t1000Toshiba2.hashCode());

        RobotBuilder t1000Builder = (RobotBuilder) context.getBean("t1000builder");

        Robot robot1 = t1000Builder.createRobot(),
                robot2 = t1000Builder.createRobot(),
                robot3 = t1000Builder.createRobot();

        robot1.action();
        robot2.action();
        robot3.action();*/

        ModelT1000 modelT1000 = (ModelT1000) context.getBean("t1000Pool");
        modelT1000.action();

    }
}
