package View;

import java.awt.BorderLayout;

import javax.swing.JScrollPane;

import Controller.BaseController;
import Event.Command;
import Model.DanhSachYeuCau;
import Model.ObjectStatic;
import Model.YeuCauChucNang;
import ViewController.PanelQuanLy;

public class PanelSapXepThuTuUuTien extends PanelQuanLy<DanhSachYeuCau> {
	
	protected BaseController<YeuCauChucNang> controllerGlobal;
	private ObjectStatic object;
	protected DanhSachYeuCau dsyc;
	public PanelSapXepThuTuUuTien() {
		controllerGlobal = controller.takeConstroller(Command.CQuanLyDSYC);
		dsyc = new DanhSachYeuCau();
		setQuanLyView(new PanelThemSuaXoaDanhSachYeuCau());
		setBang(new BangDuLieuDanhSachYeuCau());
		setInputContent(new InputSapXepYeuCau());
		setup();
		setTitle("QUAN LY DANH SACH MAT HANG");
		
	}
	@Override
	public void update(Command command, Object data) {
		// TODO Auto-generated method stub
		super.update(command, data);
		switch (command) {
		case RThemYC:
			
			String moTa = ((InputSapXepYeuCau) inputContent).getfMota().getText();
			String loai = ((InputSapXepYeuCau) inputContent).getfPhanLoai().getText();
			YeuCauChucNang yccn = new YeuCauChucNang(moTa, loai);
			dsyc.dsyc.add(yccn);
			capNhatDSMH(dsyc);
			break;
		case RSuaYC:
			System.out.println(bang.getSelectedRow());
			object = ObjectStatic.shareInstance();
			object = ObjectStatic.shareInstance();	
			break;
		
		case RXoaYC:
			System.out.println(bang.getSelectedRow());
			break;

		default:
			break;
		}
	}
	
	private void capNhatDSMH(Object data) {
		// TODO Auto-generated method stub
		((BangDuLieuDanhSachYeuCau)bang).setInputData((DanhSachYeuCau)data);
	}
	
}
