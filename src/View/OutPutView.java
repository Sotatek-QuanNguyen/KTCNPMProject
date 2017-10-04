package View;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OutPutView extends BaseView {
	public OutPutView() {
		setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new GridLayout(16, 1, 0, 0));
		
		JLabel lblimActortaw = new JLabel("TAW");
		panel_1.add(lblimActortaw);
		
		JLabel lblTbf = new JLabel("TBF");
		panel_1.add(lblTbf);
		
		JLabel lblUucp = new JLabel("UUCP");
		panel_1.add(lblUucp);
		
		JLabel lblTcf = new JLabel("TCF");
		panel_1.add(lblTcf);
		
		JLabel lblEf = new JLabel("EF");
		panel_1.add(lblEf);
		
		JLabel lblAucp = new JLabel("AUCP");
		panel_1.add(lblAucp);
		
		JLabel lblP = new JLabel("P");
		panel_1.add(lblP);
		
		JLabel lblE = new JLabel("E");
		panel_1.add(lblE);
		
		JLabel lblH = new JLabel("H");
		panel_1.add(lblH);
		
		JLabel lblG = new JLabel("G");
		panel_1.add(lblG);
		
		JLabel lblC = new JLabel("C");
		panel_1.add(lblC);
		
		JLabel lblLt = new JLabel("LT");
		panel_1.add(lblLt);
		
		JLabel lblNewLabel = new JLabel("Gpm");
		panel_1.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new GridLayout(16, 1, 0, 0));
		
		JLabel label_12 = new JLabel("0");
		panel.add(label_12);
		
		JLabel label_13 = new JLabel("0");
		panel.add(label_13);
		
		JLabel label_14 = new JLabel("0");
		panel.add(label_14);
		
		JLabel label_15 = new JLabel("0");
		panel.add(label_15);
		
		JLabel label_16 = new JLabel("0");
		panel.add(label_16);
		
		JLabel label_17 = new JLabel("0");
		panel.add(label_17);
		
		JLabel label_18 = new JLabel("0");
		panel.add(label_18);
		
		JLabel label_19 = new JLabel("0");
		panel.add(label_19);
		
		JLabel label_20 = new JLabel("0");
		panel.add(label_20);
		
		JLabel label_21 = new JLabel("0");
		panel.add(label_21);
		
		JLabel label_22 = new JLabel("0");
		panel.add(label_22);
		
		JLabel label_23 = new JLabel("0");
		panel.add(label_23);
		
		JLabel label_24 = new JLabel("0");
		panel.add(label_24);
	}

	@Override
	protected void setup() {
		// TODO Auto-generated method stub
		
	}

}
