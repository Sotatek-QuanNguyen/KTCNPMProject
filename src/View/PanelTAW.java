package View;

import java.awt.BorderLayout;

import javax.swing.JScrollPane;

import Controller.BaseController;
import Event.Command;
import Model.DanhSachYeuCau;
import Model.ObjectStatic;
import Model.TAW;
import Model.YeuCauChucNang;
import ViewController.PanelQuanLy;

public class PanelTAW extends PanelQuanLy<DanhSachYeuCau> {
	protected BaseController<YeuCauChucNang> controllerGlobal;
	public PanelTAW() {
		controllerGlobal = controller.takeConstroller(Command.CQuanLyDSYC);
		setInputContent(new InputTAWView());
		setImportExcel(new PanelImportExcelTAW());
		setup();
		setTitle("TAW = 0");
		
	}
	@Override
	public void update(Command command, Object data) {
		// TODO Auto-generated method stub
		super.update(command, data);
		switch (command) {
		case ChangeTAW:
		setTitle("TAW = "+object.getTaw().getTAW());
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
