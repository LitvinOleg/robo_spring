package spring.impls.toshiba;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import spring.interfaces.Head;

public class ToshibaHead implements Head {
	
	public void calc(){
		System.out.println("Thinking about Toshiba...");
	}

}
