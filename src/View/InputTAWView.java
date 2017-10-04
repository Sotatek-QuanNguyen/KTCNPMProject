package View;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class InputTAWView extends BaseView{
	public InputTAWView() {
	}
	private JTextField f_easy;
	private JTextField f_normal;
	private JTextField f_hard;
	public JTextField getF_easy() {
		return f_easy;
	}

	public void setF_easy(JTextField f_easy) {
		this.f_easy = f_easy;
	}

	public JTextField getF_normal() {
		return f_normal;
	}

	public void setF_normal(JTextField f_normal) {
		this.f_normal = f_normal;
	}

	public JTextField getF_hard() {
		return f_hard;
	}

	public void setF_hard(JTextField f_hard) {
		this.f_hard = f_hard;
	}

	@Override
	protected void setup() {
		// TODO Auto-generated method stub
setLayout(new GridLayout(3, 1, 0, 20));
		
		JPanel panel_easy = new JPanel();
		panel_easy.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		add(panel_easy);
		panel_easy.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel_easy.add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Tác nhân đơn giản");
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Trọng số : 1");
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEADING);
		panel_easy.add(panel_1);
		
		JLabel lblSLngTc = new JLabel("Số Lượng Tác Nhân:");
		panel_1.add(lblSLngTc);
		
		f_easy = new JTextField();
		panel_1.add(f_easy);
		f_easy.setColumns(10);
		
		JPanel panel_normal = new JPanel();
		panel_normal.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		add(panel_normal);
		panel_normal.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_normal.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblTcNhnTrung = new JLabel("Tác nhân trung bình");
		panel_2.add(lblTcNhnTrung);
		
		JLabel lblTrngS_1 = new JLabel("Trọng số : 2");
		panel_2.add(lblTrngS_1);
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_3.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEADING);
		panel_normal.add(panel_3);
		
		JLabel label_2 = new JLabel("Số Lượng Tác Nhân:");
		panel_3.add(label_2);
		
		f_normal = new JTextField();
		f_normal.setColumns(10);
		panel_3.add(f_normal);
		
		JPanel panel_hard = new JPanel();
		panel_hard.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		add(panel_hard);
		panel_hard.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_hard.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblTcNhnPhc = new JLabel("Tác nhân phức tạp");
		panel_4.add(lblTcNhnPhc);
		
		JLabel lblTrngS = new JLabel("Trọng số : 3");
		panel_4.add(lblTrngS);
		
		JPanel panel_5 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_5.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEADING);
		panel_hard.add(panel_5);
		
		JLabel label_5 = new JLabel("Số Lượng Tác Nhân:");
		panel_5.add(label_5);
		
		f_hard = new JTextField();
		f_hard.setColumns(10);
		panel_5.add(f_hard);
	}

}
