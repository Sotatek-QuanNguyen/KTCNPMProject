package View;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import Event.Command;

public class InputTCFView extends BaseView {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	@Override
	protected void setup() {
		// TODO Auto-generated method stub
setLayout(new GridLayout(1, 3, 0, 0));
		
		JPanel panel_2 = new JPanel();
		add(panel_2);
		panel_2.setLayout(new GridLayout(14, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Các hệ số");
		panel_2.add(lblNewLabel);
		
		JLabel lblHThngPhn = new JLabel("Hệ thống phân tán ");
		panel_2.add(lblHThngPhn);
		
		JLabel lblTnhChtp = new JLabel("Tính chất đáp ứng tức thời hoặc yêu cầu đảm bảo thông lượng ");
		panel_2.add(lblTnhChtp);
		
		JLabel lblHiuQuS = new JLabel("Hiệu quả sử dụng trực tuyến ");
		panel_2.add(lblHiuQuS);
		
		JLabel lblPhcTp = new JLabel("Độ phức tạp của xử lý bên trong ");
		panel_2.add(lblPhcTp);
		
		JLabel lblMNgunPhi = new JLabel("Mã nguồn phải tái sử dụng được ");
		panel_2.add(lblMNgunPhi);
		
		JLabel lblDCit = new JLabel("Dễ cài đặt ");
		panel_2.add(lblDCit);
		
		JLabel lblDSDng = new JLabel("Dễ sử dụng ");
		panel_2.add(lblDSDng);
		
		JLabel lblKhNngChuyn = new JLabel("Khả năng chuyển đổi ");
		panel_2.add(lblKhNngChuyn);
		
		JLabel lblKhNngD = new JLabel("Khả năng dễ thay đổi ");
		panel_2.add(lblKhNngD);
		
		JLabel lblSDngng = new JLabel("Sử dụng đồng thời");
		panel_2.add(lblSDngng);
		
		JLabel lblCCcTnh = new JLabel("Có các tính năng bảo mật đặc biệt");
		panel_2.add(lblCCcTnh);
		
		JLabel lblCungCpTruy = new JLabel("Cung cấp truy nhập trực tiếp tới các phần mềm của các hãng thứ ba");
		panel_2.add(lblCungCpTruy);
		
		JLabel lblYuCuPhng = new JLabel("Yêu cầu phương tiện đào tạo đặc biệt cho người sử dụng");
		panel_2.add(lblYuCuPhng);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new GridLayout(14, 1, 0, 0));
		
		JLabel lblTrngS = new JLabel("Trọng sô");
		panel_1.add(lblTrngS);
		
		JLabel label_14 = new JLabel("2");
		panel_1.add(label_14);
		
		JLabel label_15 = new JLabel("1");
		panel_1.add(label_15);
		
		JLabel label_16 = new JLabel("1");
		panel_1.add(label_16);
		
		JLabel label_17 = new JLabel("1");
		panel_1.add(label_17);
		
		JLabel label_18 = new JLabel("1");
		panel_1.add(label_18);
		
		JLabel label_19 = new JLabel("0,5");
		panel_1.add(label_19);
		
		JLabel label_21 = new JLabel("0,5");
		panel_1.add(label_21);
		
		JLabel label_22 = new JLabel("2");
		panel_1.add(label_22);
		
		JLabel label_23 = new JLabel("1");
		panel_1.add(label_23);
		
		JLabel label_24 = new JLabel("1");
		panel_1.add(label_24);
		
		JLabel label_25 = new JLabel("1");
		panel_1.add(label_25);
		
		JLabel label_26 = new JLabel("1");
		panel_1.add(label_26);
		
		JLabel label_20 = new JLabel("1");
		panel_1.add(label_20);
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new GridLayout(14, 1, 0, 0));
		
		JLabel lblGiTrXp = new JLabel("Giá trị xếp hạng");
		panel.add(lblGiTrXp);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel.add(textField_2);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		panel.add(textField_12);
		
		textField.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				if(textField.getText().equals("")) {
					object.getTfw().setGtHTPT(0);
				}else {
					object.getTfw().setGtHTPT(Integer.parseInt(textField.getText()));
				}
				
				notifyObserver(Command.ChangeTCF, null);
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				object.getTfw().setGtHTPT(Integer.parseInt(textField.getText()));
				notifyObserver(Command.ChangeTCF, null);
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		textField_1.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				if(textField_1.getText().equals("")) {
					object.getTfw().setGtDUTT(0);
				}else {
					object.getTfw().setGtDUTT(Integer.parseInt(textField_1.getText()));
				}
				
				notifyObserver(Command.ChangeTCF, null);
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				object.getTfw().setGtDUTT(Integer.parseInt(textField_1.getText()));
				notifyObserver(Command.ChangeTCF, null);
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		textField_2.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				if(textField_2.getText().equals("")) {
					object.getTfw().setGtHQSDTT(0);
				}else {
					object.getTfw().setGtHQSDTT(Integer.parseInt(textField_2.getText()));
				}
				
				notifyObserver(Command.ChangeTCF, null);
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				object.getTfw().setGtHQSDTT(Integer.parseInt(textField_2.getText()));
				notifyObserver(Command.ChangeTCF, null);
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		textField_3.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				if(textField_3.getText().equals("")) {
					object.getTfw().setGtDPTXL(0);
				}else {
					object.getTfw().setGtDPTXL(Integer.parseInt(textField_3.getText()));
				}
				
				notifyObserver(Command.ChangeTCF, null);
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				object.getTfw().setGtDPTXL(Integer.parseInt(textField_3.getText()));
				notifyObserver(Command.ChangeTCF, null);
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		textField_4.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				if(textField_4.getText().equals("")) {
					object.getTfw().setGtTSDMN(0);
				}else {
					object.getTfw().setGtTSDMN(Integer.parseInt(textField_4.getText()));
				}
				
				notifyObserver(Command.ChangeTCF, null);
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				object.getTfw().setGtTSDMN(Integer.parseInt(textField_4.getText()));
				notifyObserver(Command.ChangeTCF, null);
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	textField_5.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				if(textField_5.getText().equals("")) {
					object.getTfw().setGtDSD(0);
				}else {
					object.getTfw().setGtDSD(Integer.parseInt(textField_5.getText()));
				}
				
				notifyObserver(Command.ChangeTCF, null);
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				object.getTfw().setGtDSD(Integer.parseInt(textField_5.getText()));
				notifyObserver(Command.ChangeTCF, null);
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		textField_6.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				if(textField_6.getText().equals("")) {
					object.getTfw().setGtDCD(0);
				}else {
					object.getTfw().setGtDCD(Integer.parseInt(textField_6.getText()));
				}
				
				notifyObserver(Command.ChangeTCF, null);
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				object.getTfw().setGtDCD(Integer.parseInt(textField_6.getText()));
				notifyObserver(Command.ChangeTCF, null);
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		textField_7.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				if(textField_7.getText().equals("")) {
					object.getTfw().setGtKNCD(0);
				}else {
					object.getTfw().setGtKNCD(Integer.parseInt(textField_7.getText()));
				}
				
				notifyObserver(Command.ChangeTCF, null);
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				object.getTfw().setGtKNCD(Integer.parseInt(textField_7.getText()));
				notifyObserver(Command.ChangeTCF, null);
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		textField_8.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				if(textField_8.getText().equals("")) {
					object.getTfw().setGtKNDTD(0);
				}else {
					object.getTfw().setGtKNDTD(Integer.parseInt(textField_8.getText()));
				}
				
				notifyObserver(Command.ChangeTCF, null);
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				object.getTfw().setGtKNDTD(Integer.parseInt(textField_8.getText()));
				notifyObserver(Command.ChangeTCF, null);
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		textField_9.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				if(textField_9.getText().equals("")) {
					object.getTfw().setGtSDDT(0);
				}else {
					object.getTfw().setGtSDDT(Integer.parseInt(textField_9.getText()));
				}
				
				notifyObserver(Command.ChangeTCF, null);
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				object.getTfw().setGtSDDT(Integer.parseInt(textField_9.getText()));
				notifyObserver(Command.ChangeTCF, null);
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		textField_10.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				if(textField_10.getText().equals("")) {
					object.getTfw().setGtBMDB(0);
				}else {
					object.getTfw().setGtBMDB(Integer.parseInt(textField_10.getText()));
				}
				
				notifyObserver(Command.ChangeTCF, null);
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				object.getTfw().setGtBMDB(Integer.parseInt(textField_10.getText()));
				notifyObserver(Command.ChangeTCF, null);
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		textField_11.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				if(textField_11.getText().equals("")) {
					object.getTfw().setGtTN3P(0);
				}else {
					object.getTfw().setGtTN3P(Integer.parseInt(textField_11.getText()));
				}
				
				notifyObserver(Command.ChangeTCF, null);
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				object.getTfw().setGtTN3P(Integer.parseInt(textField_11.getText()));
				notifyObserver(Command.ChangeTCF, null);
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		textField_12.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				if(textField_12.getText().equals("")) {
					object.getTfw().setGtPTDTDB(0);
				}else {
					object.getTfw().setGtPTDTDB(Integer.parseInt(textField_12.getText()));
				}
				
				notifyObserver(Command.ChangeTCF, null);
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				object.getTfw().setGtPTDTDB(Integer.parseInt(textField_12.getText()));
				notifyObserver(Command.ChangeTCF, null);
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

}
