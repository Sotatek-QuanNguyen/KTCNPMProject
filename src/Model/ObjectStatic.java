package Model;

import java.util.ArrayList;

public class ObjectStatic {
	private static ObjectStatic instance;
	private TAW taw;
	private TFW tfw;
        private TBF tbf;

        public TBF getTbf() {
            return tbf;
        }

        public void setTbf(TBF tbf) {
            this.tbf = tbf;
        }

	private Hs listH;
	public static ObjectStatic getInstance() {
		return instance;
	}
	public static void setInstance(ObjectStatic instance) {
		ObjectStatic.instance = instance;
	}
	public Hs getListH() {
		return listH;
	}
	public void setListH(Hs listH) {
		this.listH = listH;
	}
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
		tfw = new TFW(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                tbf = new TBF(0, 0, 0, 0, 0, 0, 0, 0, 0);
		listH = new Hs(new ArrayList<H>());
	}
	public TFW getTfw() {
		return tfw;
	}
	public void setTfw(TFW tfw) {
		this.tfw = tfw;
	}
	
}
