package spring.impls.sony;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import spring.interfaces.Leg;

@Component
public class SonyLeg implements Leg {
	
	public void go(){
		System.out.println("Go to Sony!");
	}

}
