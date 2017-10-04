package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public abstract class InputFromExcel extends BaseView {
	private JButton importExcel;
	@Override
	protected void setup() {
		// TODO Auto-generated method stub
		importExcel = new JButton("Đọc từ Excel");
		add(importExcel);
		importExcel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				handleImportExcel();
			}
		});
	}
	
	
	protected abstract void handleImportExcel();
}
