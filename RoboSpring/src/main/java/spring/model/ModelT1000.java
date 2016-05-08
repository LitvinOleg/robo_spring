package spring.model;

import spring.interfaces.Hand;
import spring.interfaces.Head;
import spring.interfaces.Leg;

public class ModelT1000 extends BaseModel {
    private String name;
    private int id;
    private boolean soundEnabled;

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

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }
    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }

    @Override
    public String toString() {
        return "ModelT1000{" +
                "\nname='" + name + '\'' +
                ", \nid=" + id +
                ", \nsoundEnabled=" + soundEnabled +
                '}';
    }

    public void initObject() {
        System.out.println("Init: " + this.name + this.hashCode());
    }
    public void destroyObject() {
        System.out.println("Destroy: " + this.name + this.hashCode());
    }
}
