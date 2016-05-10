package spring.impls.sony;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import spring.interfaces.Head;

@Component
public class SonyHead implements Head {
	
	public void calc(){
		System.out.println("Thinking about Sony...");
	}

}
