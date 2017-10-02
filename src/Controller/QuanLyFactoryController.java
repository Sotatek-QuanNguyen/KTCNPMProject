package Controller;

import Controller.BaseController;
import Controller.SapXepYeuCauChucNangController;
//import Controller.QuanLyDSDHController;
//import Controller.QuanLyDSMHController;
import Event.Command;
import Factory.FactoryController;

public class QuanLyFactoryController extends FactoryController {

	@Override
	protected BaseController createController(Command type) {
		switch (type) {
		case CQuanLyDSYC:
			return new SapXepYeuCauChucNangController();
//		case CQuanLyDSDH:
//			return new QuanLyDSDHController();
		default:
			return null;
		}
		
	}

}
