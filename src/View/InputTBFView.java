package View;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;

public class InputTBFView extends BaseView {
	private JTextField tT_easy;
	private JTextField tT_hard;
	private JTextField tB_easy;
	private JTextField tB_mornal;
	private JTextField tB_hard;
	private JTextField tM_easy;
	private JTextField tM_mornal;
	private JTextField tM_hard;

	@Override
	protected void setup() {
		// TODO Auto-generated method stub
setLayout(new GridLayout(3, 1, 0, 20));
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setToolTipText("");
		add(panel);
		panel.setLayout(new GridLayout(4, 4, 0, 0));
		
		JLabel label = new JLabel("Usecase loại B");
		panel.add(label);
		
		JLabel label_1 = new JLabel("Trọng số");
		panel.add(label_1);
		
		JLabel label_4 = new JLabel("Hệ số");
		panel.add(label_4);
		
		JLabel lblSTrngHp = new JLabel("Số lượng");
		panel.add(lblSTrngHp);
		
		JLabel label_8 = new JLabel("Đơn giản");
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("5");
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("1");
		panel.add(label_10);
		
		tB_easy = new JTextField();
		panel.add(tB_easy);
		
		JLabel label_11 = new JLabel("Trung bình");
		panel.add(label_11);
		
		JLabel label_12 = new JLabel("10");
		panel.add(label_12);
		
		JLabel label_13 = new JLabel("1");
		panel.add(label_13);
		
		tB_mornal = new JTextField();
		panel.add(tB_mornal);
		
		JLabel label_14 = new JLabel("Phức tạp");
		panel.add(label_14);
		
		JLabel label_15 = new JLabel("15");
		panel.add(label_15);
		
		JLabel label_16 = new JLabel("1");
		panel.add(label_16);
		
		tB_hard = new JTextField();
		panel.add(tB_hard);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setToolTipText("");
		add(panel_2);
		panel_2.setLayout(new GridLayout(4, 4, 0, 0));
		
		JLabel lblUsecaseLoiM = new JLabel("Usecase loại M");
		panel_2.add(lblUsecaseLoiM);
		
		JLabel label_18 = new JLabel("Trọng số");
		panel_2.add(label_18);
		
		JLabel label_19 = new JLabel("Hệ số");
		panel_2.add(label_19);
		
		JLabel lblSLng = new JLabel("Số lượng");
		panel_2.add(lblSLng);
		
		JLabel label_21 = new JLabel("Đơn giản");
		panel_2.add(label_21);
		
		JLabel label_22 = new JLabel("5");
		panel_2.add(label_22);
		
		JLabel label_23 = new JLabel("1");
		panel_2.add(label_23);
		
		tM_easy = new JTextField();
		panel_2.add(tM_easy);
		
		JLabel label_24 = new JLabel("Trung bình");
		panel_2.add(label_24);
		
		JLabel label_25 = new JLabel("10");
		panel_2.add(label_25);
		
		JLabel label_26 = new JLabel("1");
		panel_2.add(label_26);
		
		tM_mornal = new JTextField();
		panel_2.add(tM_mornal);
		
		JLabel label_27 = new JLabel("Phức tạp");
		panel_2.add(label_27);
		
		JLabel label_28 = new JLabel("15");
		panel_2.add(label_28);
		
		JLabel label_29 = new JLabel("1");
		panel_2.add(label_29);
		
		tM_hard = new JTextField();
		panel_2.add(tM_hard);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setToolTipText("");
		add(panel_1);
		panel_1.setLayout(new GridLayout(4, 4, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Usecase loại T");
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Trọng số");
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_5 = new JLabel("Hệ số");
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3 = new JLabel("Số lượng");
		panel_1.add(lblNewLabel_3);
		
		JLabel lblnGin = new JLabel("Đơn giản");
		panel_1.add(lblnGin);
		
		JLabel label_2 = new JLabel("5");
		panel_1.add(label_2);
		
		JLabel lblNewLabel_1 = new JLabel("1");
		panel_1.add(lblNewLabel_1);
		
		tT_easy = new JTextField();
		panel_1.add(tT_easy);
		
		JLabel lblTrungBnh = new JLabel("Trung bình");
		panel_1.add(lblTrungBnh);
		
		JLabel lblNewLabel_4 = new JLabel("10");
		panel_1.add(lblNewLabel_4);
		
		JLabel label_3 = new JLabel("1");
		panel_1.add(label_3);
		JTextField tT_mornal = new JTextField();
		panel_1.add(tT_mornal);
		
		JLabel lblPhcTp = new JLabel("Phức tạp");
		panel_1.add(lblPhcTp);
		
		JLabel label_5 = new JLabel("15");
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("1");
		panel_1.add(label_6);
		
		tT_hard = new JTextField();
		panel_1.add(tT_hard);
	}

}
