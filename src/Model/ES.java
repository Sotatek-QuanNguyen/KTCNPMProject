package Model;

public class ES {
		private float gtxhRUP;
	    public ES(float gtxhRUP, float gtxhUDTT, float gtxhHDT, float gtxhLDN, float gtxhTCND, float gtxhODYC,
				float gtxhNVBTG, float gtxhNNLTK) {
			super();
			this.gtxhRUP = gtxhRUP;
			this.gtxhUDTT = gtxhUDTT;
			this.gtxhHDT = gtxhHDT;
			this.gtxhLDN = gtxhLDN;
			this.gtxhTCND = gtxhTCND;
			this.gtxhODYC = gtxhODYC;
			this.gtxhNVBTG = gtxhNVBTG;
			this.gtxhNNLTK = gtxhNNLTK;
		}

		private float gtxhUDTT;
	    private float gtxhHDT;
	    private float gtxhLDN;
	    private float gtxhTCND;
	    private float gtxhODYC;
	    private float gtxhNVBTG;
	    private float gtxhNNLTK;
		public float getGtxhRUP() {
			return gtxhRUP;
		}
		public void setGtxhRUP(float gtxhRUP) {
			this.gtxhRUP = gtxhRUP;
		}
		public float getGtxhUDTT() {
			return gtxhUDTT;
		}
		public void setGtxhUDTT(float gtxhUDTT) {
			this.gtxhUDTT = gtxhUDTT;
		}
		public float getGtxhHDT() {
			return gtxhHDT;
		}
		public void setGtxhHDT(float gtxhHDT) {
			this.gtxhHDT = gtxhHDT;
		}
		public float getGtxhLDN() {
			return gtxhLDN;
		}
		public void setGtxhLDN(float gtxhLDN) {
			this.gtxhLDN = gtxhLDN;
		}
		public float getGtxhTCND() {
			return gtxhTCND;
		}
		public void setGtxhTCND(float gtxhTCND) {
			this.gtxhTCND = gtxhTCND;
		}
		public float getGtxhODYC() {
			return gtxhODYC;
		}
		public void setGtxhODYC(float gtxhODYC) {
			this.gtxhODYC = gtxhODYC;
		}
		public float getGtxhNVBTG() {
			return gtxhNVBTG;
		}
		public void setGtxhNVBTG(float gtxhNVBTG) {
			this.gtxhNVBTG = gtxhNVBTG;
		}
		public float getGtxhNNLTK() {
			return gtxhNNLTK;
		}
		public void setGtxhNNLTK(float gtxhNNLTK) {
			this.gtxhNNLTK = gtxhNNLTK;
		}
		
		public float getES() {
			return getGtxhHDT() + getGtxhLDN() + getGtxhNNLTK() + getGtxhNVBTG() + getGtxhODYC() + getGtxhRUP() + getGtxhTCND() + getGtxhUDTT();
		}

}
