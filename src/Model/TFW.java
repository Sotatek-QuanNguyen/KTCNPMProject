package Model;

public class TFW {
	private int gtHTPT;
	private int gtDUTT;
	private int gtHQSDTT;
	private int gtDPTXL;
	private int gtTSDMN;
	private int gtDSD;
	private int gtDCD;
	private int gtKNCD;
	private int gtKNDTD;
	private int gtSDDT;
	private int gtBMDB;
	private int gtTN3P;
	private int gtPTDTDB;
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
        
	public TFW(int gtHTPT,int gtDUTT,int gtHQSDTT,int gtDPTXL,int gtTSDMN,int gtDSD,int gtDCD,int gtKNCD,int gtKNDTD,int gtSDDT,int gtBMDB,int gtTN3P,int gtPTDTDB){
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
	public void setGtHTPT(int gtHTPT) {
		this.gtHTPT = gtHTPT;
	}
	public int getGtDUTT() {
		return gtDUTT;
	}
	public void setGtDUTT(int gtDUTT) {
		this.gtDUTT = gtDUTT;
	}
	public int getGtHQSDTT() {
		return gtHQSDTT;
	}
	public void setGtHQSDTT(int gtHQSDTT) {
		this.gtHQSDTT = gtHQSDTT;
	}
	public int getGtDPTXL() {
		return gtDPTXL;
	}
	public void setGtDPTXL(int gtDPTXL) {
		this.gtDPTXL = gtDPTXL;
	}
	public int getGtTSDMN() {
		return gtTSDMN;
	}
	public void setGtTSDMN(int gtTSDMN) {
		this.gtTSDMN = gtTSDMN;
	}
	public int getGtDSD() {
		return gtDSD;
	}
	public void setGtDSD(int gtDSD) {
		this.gtDSD = gtDSD;
	}
	public int getGtDCD() {
		return gtDCD;
	}
	public void setGtDCD(int gtDCD) {
		this.gtDCD = gtDCD;
	}
	public int getGtKNCD() {
		return gtKNCD;
	}
	public void setGtKNCD(int gtKNCD) {
		this.gtKNCD = gtKNCD;
	}
	public int getGtKNDTD() {
		return gtKNDTD;
	}
	public void setGtKNDTD(int gtKNDTD) {
		this.gtKNDTD = gtKNDTD;
	}
	public int getGtSDDT() {
		return gtSDDT;
	}
	public void setGtSDDT(int gtSDDT) {
		this.gtSDDT = gtSDDT;
	}
	public int getGtBMDB() {
		return gtBMDB;
	}
	public void setGtBMDB(int gtBMDB) {
		this.gtBMDB = gtBMDB;
	}
	public int getGtTN3P() {
		return gtTN3P;
	}
	public void setGtTN3P(int gtTN3P) {
		this.gtTN3P = gtTN3P;
	}
	public int getGtPTDTDB() {
		return gtPTDTDB;
	}
	public void setGtPTDTDB(int gtPTDTDB) {
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
