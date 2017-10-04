package ViewController;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Controller.BaseController;
import Controller.QuanLyFactoryController;
import Event.Command;
import Event.Notifier;
import Model.ObjectStatic;
import View.BangDuLieu;
import View.BaseView;
import View.InputFromExcel;
import View.PanelThemSuaXoa;
import ViewController.BaseViewController;
import javax.swing.JSplitPane;
import java.awt.GridLayout;

/**
 * @param <T> Data Type transfered between FormTimKiem and BangDuLieu
 */
public abstract class PanelQuanLy<T> extends BaseViewController {
	private JLabel title;
//	protected BangDuLieu<T> bang;
//	protected PanelThemSuaXoa themSuaXoaView;
	protected BaseView viewInput;
	protected ObjectStatic object;
	protected InputFromExcel importExcel;

	public PanelQuanLy() {
		setLayout(new BorderLayout(0, 0));
		// TODO Auto-generated constructor stub
		controller = new QuanLyFactoryController();
		notifier = Notifier.controllerNotifier;
		object = ObjectStatic.shareInstance();
		setup();
	}
	
	public void setInputContent(BaseView viewInput) {
		this.viewInput = viewInput;
	}
	
	public void setImportExcel(InputFromExcel importExcel) {
		this.importExcel = importExcel;
	}
	
	protected void setup() {
		notifier.addObserver(this);
		title = new JLabel("");
		if (viewInput != null) {
			add(viewInput, BorderLayout.CENTER);
			add(title, BorderLayout.NORTH);
		}
		if(importExcel != null) {
			add(importExcel, BorderLayout.SOUTH);
		}

	}
	@Override
	public void update(Command command, Object data) {
		// TODO Auto-generated method stub
		switch (command) {
		case Error:
			JOptionPane.showMessageDialog(null,"Error!");
			break;
		
		default:
			super.update(command, data);
			break;
		}
		
	}

	public void setTitle(String title){
		this.title.setText(title);
	}
}
