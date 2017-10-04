package View;

import Controller.BaseController;
import Event.Command;
import Model.YeuCauChucNang;
import ViewController.PanelQuanLy2;

public class PanelH extends PanelQuanLy2<YeuCauChucNang>{
	protected BaseController<YeuCauChucNang> controllerGlobal;
	public PanelH() {
		controllerGlobal = controller.takeConstroller(Command.CQuanLyDSYC);
		setInputContent(new HView());
		setBang(new BangH());
		setQuanLyView(new PanelThemSuaXoaH());
		setImportExcel(new PanelImportExcelTAW());
		setup();
		setTitle("TINH EF");
		
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
