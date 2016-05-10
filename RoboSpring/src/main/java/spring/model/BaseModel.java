package spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import spring.interfaces.Hand;
import spring.interfaces.Head;
import spring.interfaces.Leg;
import spring.interfaces.Robot;

@Component
public abstract class BaseModel implements Robot {
    @Autowired/*(required = false)*/// Не обязателен к заполнению
    //@Qualifier("toshibaHead") // Позволяет автоматически связывать byName
    private Head head;

    @Autowired
    private Hand hand;

    @Autowired
    private Leg leg;

    public BaseModel() {
        System.out.println(this + " - base model.");
    }

    public BaseModel(Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    //@Required
    public Head getHead() {
        return head;
    }
    public void setHead(Head head) {
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }
    //@Required
    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }
    //@Required
    public void setLeg(Leg leg) {
        this.leg = leg;
    }
}
