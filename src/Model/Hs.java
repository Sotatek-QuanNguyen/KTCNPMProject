package Model;

import java.util.ArrayList;

public class Hs {
	public Hs(ArrayList<H> listH) {
		super();
		this.listH = listH;
	}

	private ArrayList<H> listH;

	public ArrayList<H> getListH() {
		return listH;
	}

	public void setListH(ArrayList<H> listH) {
		this.listH = listH;
	}
	
	public float getH() {
		float tongTien = 0;
		float socb = 0;
		for (int i = 0; i < listH.size(); i++) {
			tongTien += listH.get(i).getSoCanBo() * listH.get(i).getMucLuong();
			socb += listH.get(i).getSoCanBo();
		}
		return tongTien/(160*socb);
	}
}
