package Model;

import java.util.ArrayList;

import com.sun.j3d.utils.behaviors.interpolators.TCBKeyFrame;

public class ObjectStatic {
	private static ObjectStatic instance;
	private TAW taw;
	private TFW tfw;
    private TBF tbf;
    private EF ef;
    private ES es;
        
        public ES getEs() {
		return es;
	}

	public void setEs(ES es) {
		this.es = es;
	}

		public EF getEf() {
            return ef;
        }

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
                ef = new EF(0, 0, 0, 0, 0, 0, 0, 0);
		listH = new Hs(new ArrayList<H>());
		es = new ES(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
		
	}
	public TFW getTfw() {
		return tfw;
	}
	
	public float getUUCP() {
		return this.taw.getTAW() + this.tbf.getTBFval();
	}
	
	public float getAUCP() {
		return this.getUUCP()*getTfw().getTCFval()*getEf().getEFval();
	}
	
	public float getP() {
		if (getEs().getES() < 1) return 48;
		else if(getEs().getES() >= 3) return 20;
		else if(getEs().getES() >= 1) return 32;
		return 0;
		
	}
	
	public float getE() {
		return getAUCP()*10/6;
	}
	
	public float getG() {
		return (float) (1.4*getE()*getP()*getListH().getH());
	}
	public void setTfw(TFW tfw) {
		this.tfw = tfw;
	}
	
}
