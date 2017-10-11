package View;

import Controller.BaseController;
import Event.Command;
import Model.YeuCauChucNang;
import ViewController.PanelQuanLy;
import javax.swing.JLabel;


public class PanelOutput extends PanelQuanLy<YeuCauChucNang>{
	protected BaseController<YeuCauChucNang> controllerGlobal;
	public PanelOutput() {
		controllerGlobal = controller.takeConstroller(Command.CQuanLyDSYC);
		OutPutView outPutView = new OutPutView();
		setInputContent(outPutView);
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
			((OutPutView)viewInput).getlUUCP().setText(""+object.getUUCP());
			((OutPutView)viewInput).getlAUCP().setText(""+object.getAUCP());
			((OutPutView)viewInput).getlP().setText(""+object.getP());
			((OutPutView)viewInput).getlE().setText(""+object.getE());
			((OutPutView)viewInput).getlG().setText(""+object.getG());
			break;
		case ChangeTCF:
			((OutPutView)viewInput).getlTCF().setText(""+object.getTfw().getTCFval());
			((OutPutView)viewInput).getlAUCP().setText(""+object.getAUCP());
			((OutPutView)viewInput).getlP().setText(""+object.getP());
			((OutPutView)viewInput).getlE().setText(""+object.getE());
			((OutPutView)viewInput).getlG().setText(""+object.getG());
			break;
		
		case ChangeEF:
			((OutPutView)viewInput).getlEF().setText(""+object.getEf().getEFval());
			((OutPutView)viewInput).getlAUCP().setText(""+object.getAUCP());
			((OutPutView)viewInput).getlP().setText(""+object.getP());
			((OutPutView)viewInput).getlE().setText(""+object.getE());
			((OutPutView)viewInput).getlG().setText(""+object.getG());
			break;
		case ChangeTBF:
			((OutPutView)viewInput).getlTBF().setText(""+object.getTbf().getTBFval());
			((OutPutView)viewInput).getlUUCP().setText(""+object.getUUCP());
			((OutPutView)viewInput).getlAUCP().setText(""+object.getAUCP());
			((OutPutView)viewInput).getlP().setText(""+object.getP());
			((OutPutView)viewInput).getlE().setText(""+object.getE());
			((OutPutView)viewInput).getlG().setText(""+object.getG());
		case ChangeH:
			((OutPutView)viewInput).getlH().setText(""+object.getListH().getH());
			((OutPutView)viewInput).getlP().setText(""+object.getP());
			((OutPutView)viewInput).getlG().setText(""+object.getG());
		case ChangeES:
			((OutPutView)viewInput).getlES().setText(""+object.getEs().getES());
		default:
			break;
		}
	}
}
