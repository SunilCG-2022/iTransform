package co.cg.springcore3.assignment3;

public class Biscuit {

	String biscuitName;
	int biscuitsInAPacket;
	public Biscuit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Biscuit(String biscuitName, int biscuitsInAPacket) {
		super();
		this.biscuitName = biscuitName;
		this.biscuitsInAPacket = biscuitsInAPacket;
	}
	public String getBiscuitName() {
		return biscuitName;
	}
	public void setBiscuitName(String biscuitName) {
		this.biscuitName = biscuitName;
	}
	public int getBiscuitsInAPacket() {
		return biscuitsInAPacket;
	}
	public void setBiscuitsInAPacket(int biscuitsInAPacket) {
		this.biscuitsInAPacket = biscuitsInAPacket;
	}
	@Override
	public String toString() {
		return "Biscuit [biscuitName=" + biscuitName + ", biscuitsInAPacket=" + biscuitsInAPacket + "]";
	}
	
}
