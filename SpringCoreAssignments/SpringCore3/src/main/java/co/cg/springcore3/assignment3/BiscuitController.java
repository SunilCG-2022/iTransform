package co.cg.springcore3.assignment3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("biscuitController")
public class BiscuitController {
	
	@Autowired
	BiscuitService biscuitService;
	
	public Biscuit createNewBuiscuit() {
		return biscuitService.createNewBiscuit();
		
	}
	
	
	

}
