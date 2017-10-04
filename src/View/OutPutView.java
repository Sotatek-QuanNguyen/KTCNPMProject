package View;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OutPutView extends BaseView {
	private JLabel lGpm;
	private JLabel lLT;
	private JLabel lC;
	private JLabel lG;
	private JLabel lH;
	private JLabel lE;
	private JLabel lP;
	private JLabel lAUCP;
	private JLabel lEF;
	private JLabel lTCF;
	private JLabel lUUCP;
	private JLabel lTBF;
	private JLabel lTAW;

	@Override
	protected void setup() {
		// TODO Auto-generated method stub
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
		
		lTAW = new JLabel("0");
		panel.add(lTAW);
		
		lTBF = new JLabel("0");
		panel.add(lTBF);
		
		lUUCP = new JLabel("0");
		panel.add(lUUCP);
		
		lTCF = new JLabel("0");
		panel.add(lTCF);
		
		lEF = new JLabel("0");
		panel.add(lEF);
		
		lAUCP = new JLabel("0");
		panel.add(lAUCP);
		
		lP = new JLabel("0");
		panel.add(lP);
		
		lE = new JLabel("0");
		panel.add(lE);
		
		lH = new JLabel("0");
		panel.add(lH);
		
		lG = new JLabel("0");
		panel.add(lG);
		
		lC = new JLabel("0");
		panel.add(lC);
		
		lLT = new JLabel("0");
		panel.add(lLT);
		
		lGpm = new JLabel("0");
		panel.add(lGpm);
	}

	public JLabel getlGpm() {
		return lGpm;
	}

	public void setlGpm(JLabel lGpm) {
		this.lGpm = lGpm;
	}

	public JLabel getlLT() {
		return lLT;
	}

	public void setlLT(JLabel lLT) {
		this.lLT = lLT;
	}

	public JLabel getlC() {
		return lC;
	}

	public void setlC(JLabel lC) {
		this.lC = lC;
	}

	public JLabel getlG() {
		return lG;
	}

	public void setlG(JLabel lG) {
		this.lG = lG;
	}

	public JLabel getlH() {
		return lH;
	}

	public void setlH(JLabel lH) {
		this.lH = lH;
	}

	public Component getlE() {
		return lE;
	}

	public void setlE(JLabel lE) {
		this.lE = lE;
	}

	public Component getlP() {
		return lP;
	}

	public void setlP(JLabel lP) {
		this.lP = lP;
	}

	public Component getlAUCP() {
		return lAUCP;
	}

	public void setlAUCP(JLabel lAUCP) {
		this.lAUCP = lAUCP;
	}

	public JLabel getlEF() {
		return lEF;
	}

	public void setlEF(JLabel lEF) {
		this.lEF = lEF;
	}

	public JLabel getlTCF() {
		return lTCF;
	}

	public void setlTCF(JLabel lTCF) {
		this.lTCF = lTCF;
	}

	public JLabel getlUUCP() {
		return lUUCP;
	}

	public void setlUUCP(JLabel lUUCP) {
		this.lUUCP = lUUCP;
	}

	public JLabel getlTBF() {
		return lTBF;
	}

	public void setlTBF(JLabel lTBF) {
		this.lTBF = lTBF;
	}

	public JLabel getlTAW() {
		return lTAW;
	}

	public void setlTAW(JLabel lTAW) {
		this.lTAW = lTAW;
	}

}
