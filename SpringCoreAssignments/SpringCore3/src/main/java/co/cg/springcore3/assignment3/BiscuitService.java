package co.cg.springcore3.assignment3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("countryService")
public class BiscuitService 
{
	 @Autowired
	 BiscuitRepository biscuitRepository;
	 public Biscuit createNewBiscuit() {
	  
	   return biscuitRepository.createNewBiscuit();
	 }
	
}
