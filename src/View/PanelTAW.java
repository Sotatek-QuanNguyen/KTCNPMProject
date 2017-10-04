package View;

import java.awt.BorderLayout;

import javax.swing.JScrollPane;

import Controller.BaseController;
import Event.Command;
import Model.DanhSachYeuCau;
import Model.ObjectStatic;
import Model.YeuCauChucNang;
import ViewController.PanelQuanLy;

public class PanelTAW extends PanelQuanLy<DanhSachYeuCau> {
	protected BaseController<YeuCauChucNang> controllerGlobal;
	public PanelTAW() {
		System.out.println("1");
		controllerGlobal = controller.takeConstroller(Command.CQuanLyDSYC);
		setInputContent(new InputTAWView());
		setImportExcel(new PanelImportExcelTAW());
		setup();
		setTitle("TINH TAW");
		
	}
	@Override
	public void update(Command command, Object data) {
		// TODO Auto-generated method stub
		super.update(command, data);
		switch (command) {
		case RThemYC:
		
			break;
		case RSuaYC:
		
			break;
		
		case RXoaYC:
	
			break;

		default:
			break;
		}
	}
	
	
}
