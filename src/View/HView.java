package View;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JTextField;

public class HView extends BaseView{
	private JTextField fMucLuong;
	private JTextField fSoCanBo;


	@Override
	protected void setup() {
		// TODO Auto-generated method stub
	setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEADING);
		add(panel);
		
		JLabel lblNewLabel = new JLabel("Mức Lương/tháng(đồng)");
		panel.add(lblNewLabel);
		
		fMucLuong = new JTextField();
		panel.add(fMucLuong);
		fMucLuong.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEADING);
		add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Số lượng cán bộ");
		panel_1.add(lblNewLabel_1);
		
		fSoCanBo = new JTextField();
		panel_1.add(fSoCanBo);
		fSoCanBo.setColumns(10);
	}

}
