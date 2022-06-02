package co.cg.springcore3.assignment3;

import org.springframework.stereotype.Repository;

@Repository("biscuitRepository")
public class BiscuitRepository 
{
	public Biscuit createNewBiscuit() {
		  
		  Biscuit biscuit = new Biscuit("Tiger Biscuits", 13);
		  return biscuit;
		}

}
