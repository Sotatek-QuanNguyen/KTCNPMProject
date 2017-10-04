package View;

import Controller.BaseController;
import Event.Command;
import Model.YeuCauChucNang;
import ViewController.PanelQuanLy;


public class PanelOutput extends PanelQuanLy<YeuCauChucNang>{
	protected BaseController<YeuCauChucNang> controllerGlobal;
	public PanelOutput() {
		controllerGlobal = controller.takeConstroller(Command.CQuanLyDSYC);
		setInputContent(new OutPutView());
		setup();
		setTitle("Ket Qua");
		
	}
	@Override
	public void update(Command command, Object data) {
		// TODO Auto-generated method stub
		super.update(command, data);
		switch (command) {
		case ChangeTAW:
			((OutPutView)viewInput).getlTAW().setText(""+object.getTaw().getTAW());
			break;
		case ChangeTCF:
			((OutPutView)viewInput).getlTCF().setText(""+object.getTfw().getTCFval());
			break;
		
		case RXoaYC:
	
			break;

		default:
			break;
		}
	}
}
