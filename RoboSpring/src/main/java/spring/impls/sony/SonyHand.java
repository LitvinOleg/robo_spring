package spring.impls.sony;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import spring.interfaces.Hand;

@Component
public class SonyHand implements Hand {
	
	public void catchSomething(){
		System.out.println("Catched from Sony!!");
	}

}
