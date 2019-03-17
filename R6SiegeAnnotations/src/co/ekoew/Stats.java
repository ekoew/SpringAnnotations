package co.ekoew;

public class Stats {
	//Attributes
	int opspeed;
	int oparmor;
	
	//Methods
	public Stats() {
		
	}

	public Stats(int opspeed, int oparmor) {
		this.opspeed = opspeed;
		this.oparmor = oparmor;
	}

	public int getOpspeed() {
		return opspeed;
	}

	public void setOpspeed(int opspeed) {
		this.opspeed = opspeed;
	}

	public int getOparmor() {
		return oparmor;
	}

	public void setOparmor(int oparmor) {
		this.oparmor = oparmor;
	}

	@Override
	public String toString() {
		return "Stats [opspeed=" + opspeed + ", oparmor=" + oparmor + "]";
	}

}
