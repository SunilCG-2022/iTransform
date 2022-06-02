package co.cg.springcore3.assignment3;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BiscuitBean.xml");
		
		BiscuitController controller = (BiscuitController) context.getBean("biscuitController");
		  Biscuit biscuit = controller.createNewBuiscuit();
		  System.out.println("Biscuit Name : " + biscuit.getBiscuitName());
		  System.out.println("Biscuits in a Packet : " + biscuit.getBiscuitsInAPacket());

	}

}