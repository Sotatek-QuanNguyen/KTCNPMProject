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
public abstract class PanelQuanLy2<T> extends BaseViewController {
	private JLabel title;
	protected BangDuLieu<T> bang;
	protected PanelThemSuaXoa themSuaXoaView;
	protected BaseView viewInput;
	protected ObjectStatic object;
	protected InputFromExcel importExcel;
	protected JPanel panel;

	public PanelQuanLy2() {
		setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		panel.setLayout(new GridLayout(2, 1, 0, 0));
		// TODO Auto-generated constructor stub
		controller = new QuanLyFactoryController();
		notifier = Notifier.controllerNotifier;
		object = ObjectStatic.shareInstance();
		setup();
	}
	public void setQuanLyView(PanelThemSuaXoa themSuaXoaView) {
		this.themSuaXoaView = themSuaXoaView;
	}
	
	public void setInputContent(BaseView viewInput) {
		this.viewInput = viewInput;
	}
	
	public void setImportExcel(InputFromExcel importExcel) {
		this.importExcel = importExcel;
	}
	public void setBang(BangDuLieu bang) {
		this.bang = bang;
	}
	
	protected void setup() {
		notifier.addObserver(this);
		title = new JLabel("");
	
		System.out.println("1");
		if (viewInput != null && importExcel != null && bang != null && themSuaXoaView != null) {
//			add(title, BorderLayout.NORTH);
			add(viewInput, BorderLayout.NORTH);
			panel.add(importExcel);
			add(bang, BorderLayout.CENTER);
			panel.add(themSuaXoaView);
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

