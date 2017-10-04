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
import View.PanelInput;
import View.PanelThemSuaXoa;
import ViewController.BaseViewController;

/**
 * @param <T> Data Type transfered between FormTimKiem and BangDuLieu
 */
public abstract class PanelQuanLy<T> extends BaseViewController {
	private JLabel title;
	protected BangDuLieu<T> bang;
	protected PanelThemSuaXoa themSuaXoaView;
	protected PanelInput inputContent;
	protected ObjectStatic object;
	public PanelQuanLy() {
		// TODO Auto-generated constructor stub
		controller = new QuanLyFactoryController();
		notifier = Notifier.controllerNotifier;
		object = ObjectStatic.shareInstance();
	}
	public void setQuanLyView(PanelThemSuaXoa themSuaXoaView) {
		this.themSuaXoaView = themSuaXoaView;
	}
	
	public void setInputContent(PanelInput inputContent) {
		this.inputContent = inputContent;
	}
	
	public void setBang(BangDuLieu bang) {
		this.bang = bang;
	}
	
	protected void setup() {
		this.setLayout(new BorderLayout());
		notifier.addObserver(this);
		title = new JLabel();
		
		if (bang!=null && themSuaXoaView != null && inputContent != null){
			add(inputContent, BorderLayout.NORTH);
			add(new JScrollPane(bang),BorderLayout.CENTER);
			add(themSuaXoaView, BorderLayout.SOUTH);
			
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
