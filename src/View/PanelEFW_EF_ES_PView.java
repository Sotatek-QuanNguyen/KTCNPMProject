package View;

import Controller.BaseController;
import Event.Command;
import Model.YeuCauChucNang;
import ViewController.PanelQuanLy;

public class PanelEFW_EF_ES_PView extends PanelQuanLy<YeuCauChucNang> {
	protected BaseController<YeuCauChucNang> controllerGlobal;
	public PanelEFW_EF_ES_PView() {
		System.out.println("1");
		controllerGlobal = controller.takeConstroller(Command.CQuanLyDSYC);
		setInputContent(new InputEFW_EF_ES_PView());
		setImportExcel(new PanelImportExcelTAW());
		setup();
		setTitle("EF = 0");
		
	}
	@Override
	public void update(Command command, Object data) {
		// TODO Auto-generated method stub
		super.update(command, data);
		switch (command) {
		case ChangeEF:
                    setTitle("EF = "+object.getEf().getEFval());
		
			break;
		case ChangeES:
		
			break;
		
		case RXoaYC:
	
			break;

		default:
			break;
		}
	}
	
}
