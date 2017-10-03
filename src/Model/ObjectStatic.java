package Model;

public class ObjectStatic {
	private static ObjectStatic instance;
	private DanhSachYeuCau listYCCN;
	public static ObjectStatic shareInstance() {
		if(instance == null) {
			instance = new ObjectStatic();
		}
		return instance;
	}
	public ObjectStatic() {
		// TODO Auto-generated constructor stub
		System.out.println("instance");
	}
	
}
