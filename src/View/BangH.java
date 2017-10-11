package View;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import Event.Command;
import Model.DanhSachYeuCau;
import Model.Hs;
import Model.YeuCauChucNang;
import Model.H;
public class BangH extends BangDuLieu<Hs> {

	public void setInputData(Hs data) {
		//headers for the table
        String[] columns = new String[] {
            "STT","Mức lương/tháng (đồng)","Số lượng cán bộ"
        };
        
        //actual data for the table in a 2d array

        ArrayList<H> listMH = data.getListH();
        
		DefaultTableModel model = new DefaultTableModel(columns,0);
		for (int i = 0; i < listMH.size(); i++) {
			int maMH = i;
			double mucLuong = listMH.get(i).getMucLuong();
			int loai = listMH.get(i).getSoCanBo();
			Object[] dataMH = {maMH,mucLuong,loai};
			model.addRow(dataMH);
		}
		setModel(model);
		notifyObserver(Command.ChangeH, null);
	}
	

}
