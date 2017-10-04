package View;

import Controller.BaseController;
import Event.Command;
import Model.YeuCauChucNang;
import ViewController.PanelQuanLy;

public class PanelTCF extends PanelQuanLy<YeuCauChucNang>{
	protected BaseController<YeuCauChucNang> controllerGlobal;
	public PanelTCF() {
		System.out.println("1");
		controllerGlobal = controller.takeConstroller(Command.CQuanLyDSYC);
		setInputContent(new InputTCFView());
		setImportExcel(new PanelImportExcelTAW());
		setup();
		setTitle("TINH TBF");
		
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
