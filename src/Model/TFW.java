package Model;

public class TFW {
	private float gtHTPT;
	private float gtDUTT;
	private float gtHQSDTT;
	private float gtDPTXL;
	private float gtTSDMN;
	private float gtDSD;
	private float gtDCD;
	private float gtKNCD;
	private float gtKNDTD;
	private float gtSDDT;
	private float gtBMDB;
	private float gtTN3P;
	private float gtPTDTDB;
	private float TFWval;
	private float TCFval;
	
	public static final float HTPT = 2;
	public static final float DUTT = 1;
	public static final float HQSDTT = 1;
	public static final float DPTXL = 1;
	public static final float TSDMN = 1;
	public static final float DSD = 0.5f;
	public static final float DCD = 0.5f;
	public static final float KNCD = 2;
	public static final float KNDTD = 1;
	public static final float SDDT = 1;
	public static final float BMDB = 1;
	public static final float TN3P = 1;
	public static final float PTDTDB = 1;
        
	public TFW(float gtHTPT,float gtDUTT,float gtHQSDTT,float gtDPTXL,float gtTSDMN,float gtDSD,float gtDCD,float gtKNCD,float gtKNDTD,float gtSDDT,float gtBMDB,float gtTN3P,float gtPTDTDB){
		this.gtHTPT = gtHTPT;
		this.gtDUTT = gtDUTT;
		this.gtHQSDTT = gtHQSDTT;
		this.gtDPTXL = gtDPTXL;
		this.gtTSDMN = gtTSDMN;
		this.gtDSD = gtDSD;
		this.gtDCD = gtDCD;
		this.gtKNCD = gtKNCD;
		this.gtKNDTD = gtKNDTD;
		this.gtSDDT = gtSDDT;
		this.gtBMDB = gtBMDB;
		this.gtTN3P = gtTN3P;
		this.gtPTDTDB = gtPTDTDB;
                
                //calculated value
                this.TFWval = HTPT*gtHTPT+DUTT*gtDUTT+HQSDTT*gtHQSDTT+DPTXL*gtDPTXL+TSDMN*gtTSDMN+DSD*gtDSD+DCD*gtDCD+KNCD*gtKNCD+KNDTD*gtKNDTD+SDDT*gtSDDT+BMDB*gtBMDB+TN3P*gtTN3P+PTDTDB*gtPTDTDB;	
		this.TCFval = 0.6f + (0.01f * TFWval);
	}
	public float getGtHTPT() {
		return gtHTPT;
	}
	public void setGtHTPT(float gtHTPT) {
		this.gtHTPT = gtHTPT;
	}
	public float getGtDUTT() {
		return gtDUTT;
	}
	public void setGtDUTT(float gtDUTT) {
		this.gtDUTT = gtDUTT;
	}
	public float getGtHQSDTT() {
		return gtHQSDTT;
	}
	public void setGtHQSDTT(float gtHQSDTT) {
		this.gtHQSDTT = gtHQSDTT;
	}
	public float getGtDPTXL() {
		return gtDPTXL;
	}
	public void setGtDPTXL(float gtDPTXL) {
		this.gtDPTXL = gtDPTXL;
	}
	public float getGtTSDMN() {
		return gtTSDMN;
	}
	public void setGtTSDMN(float gtTSDMN) {
		this.gtTSDMN = gtTSDMN;
	}
	public float getGtDSD() {
		return gtDSD;
	}
	public void setGtDSD(float gtDSD) {
		this.gtDSD = gtDSD;
	}
	public float getGtDCD() {
		return gtDCD;
	}
	public void setGtDCD(float gtDCD) {
		this.gtDCD = gtDCD;
	}
	public float getGtKNCD() {
		return gtKNCD;
	}
	public void setGtKNCD(float gtKNCD) {
		this.gtKNCD = gtKNCD;
	}
	public float getGtKNDTD() {
		return gtKNDTD;
	}
	public void setGtKNDTD(float gtKNDTD) {
		this.gtKNDTD = gtKNDTD;
	}
	public float getGtSDDT() {
		return gtSDDT;
	}
	public void setGtSDDT(float gtSDDT) {
		this.gtSDDT = gtSDDT;
	}
	public float getGtBMDB() {
		return gtBMDB;
	}
	public void setGtBMDB(float gtBMDB) {
		this.gtBMDB = gtBMDB;
	}
	public float getGtTN3P() {
		return gtTN3P;
	}
	public void setGtTN3P(float gtTN3P) {
		this.gtTN3P = gtTN3P;
	}
	public float getGtPTDTDB() {
		return gtPTDTDB;
	}
	public void setGtPTDTDB(float gtPTDTDB) {
		this.gtPTDTDB = gtPTDTDB;
	}
        
        //return the results
	public float getTFWval() {
                this.TFWval = HTPT*gtHTPT+DUTT*gtDUTT+HQSDTT*gtHQSDTT+DPTXL*gtDPTXL+TSDMN*gtTSDMN+DSD*gtDSD+DCD*gtDCD+KNCD*gtKNCD+KNDTD*gtKNDTD+SDDT*gtSDDT+BMDB*gtBMDB+TN3P*gtTN3P+PTDTDB*gtPTDTDB;
		return this.TFWval;
	}
	public float getTCFval() {
		this.TCFval = 0.6f + (0.01f * this.getTFWval());
		return this.TCFval;
	}
	
	
}
