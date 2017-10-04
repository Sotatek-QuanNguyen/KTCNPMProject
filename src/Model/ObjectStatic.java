package Model;

public class ObjectStatic {
	private static ObjectStatic instance;
	private TAW taw;
	public TAW getTaw() {
		return taw;
	}
	public void setTaw(TAW taw) {
		this.taw = taw;
	}
	public static ObjectStatic shareInstance() {
		if(instance == null) {
			instance = new ObjectStatic();
		}
		return instance;
	}
	public ObjectStatic() {
		taw = new TAW();
	}
	
}
