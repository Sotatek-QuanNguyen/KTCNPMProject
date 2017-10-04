package Model;

public class TAW {
	private int easyNumber;
	private int normalNumber;
	private int hardNumber;
	
	public int getEasyNumber() {
		return easyNumber;
	}
	public void setEasyNumber(int easyNumber) {
		this.easyNumber = easyNumber;
	}
	public int getNormalNumber() {
		return normalNumber;
	}
	public void setNormalNumber(int normalNumber) {
		this.normalNumber = normalNumber;
	}
	public int getHardNumber() {
		return hardNumber;
	}
	public void setHardNumber(int hardNumber) {
		this.hardNumber = hardNumber;
	}
	
	public int getTAW() {
		return easyNumber*1 + normalNumber*2 + hardNumber*3;
	}
}
