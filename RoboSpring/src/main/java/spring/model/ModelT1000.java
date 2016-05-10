package spring.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spring.interfaces.Hand;
import spring.interfaces.Head;
import spring.interfaces.Leg;

@Component(value = "t1000")
public class ModelT1000 extends BaseModel {
    private String name;
    private int id;
    private boolean soundEnabled;

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ModelT1000 model1() {
        return new ModelT1000("Stepan", 43, false);
    }

    public ModelT1000() {
    }

    public ModelT1000(Head head, Hand hand, Leg leg) {
        super(head, hand, leg);
    }

    public ModelT1000(String name, int id, boolean soundEnabled) {
        this.name = name;
        this.id = id;
        this.soundEnabled = soundEnabled;
    }

    public ModelT1000(Head head, Hand hand, Leg leg, String name, int id, boolean soundEnabled) {
        super(head, hand, leg);
        this.name = name;
        this.id = id;
        this.soundEnabled = soundEnabled;
    }

    @Override
    public void action() {
        super.getHand().catchSomething();
        super.getHead().calc();
        super.getLeg().go();
        System.out.println(this.toString());
    }

    @Override
    public void dance() {
        System.out.println("Dance!!!");
    }

    //@Required // во время сборки bean'a нужно обязательно собирать(внедрять) эти объекты
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    //@Required
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    //@Required
    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }
    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    @Override
    public String toString() {
        return "ModelT1000: " +
                " name='" + name + '\'' +
                ", id=" + id +
                ", soundEnabled=" + soundEnabled;
    }

    public void initObject() {
        System.out.println("Init: " + this.name + this.hashCode());
    }
    public void destroyObject() {
        System.out.println("Destroy: " + this.name + this.hashCode());
    }
}
