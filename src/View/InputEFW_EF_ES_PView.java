package View;

import Event.Command;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class InputEFW_EF_ES_PView extends BaseView {
	public InputEFW_EF_ES_PView() {
	}

    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField textField_9;
    private JTextField textField;
    private JTextField textField_4;
    private JTextField textField_10;
    private JTextField textField_11;
    private JTextField textField_12;
    private JTextField textField_13;
    private JTextField textField_14;
    private JTextField textField_15;

    @Override
    protected void setup() {
        setLayout(new GridLayout(2, 1, 0, 20));

        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        add(panel_2);
        panel_2.setLayout(new GridLayout(1, 4, 0, 0));

        JPanel panel_3 = new JPanel();
        panel_2.add(panel_3);
        panel_3.setLayout(new GridLayout(6, 1, 0, 0));

        JLabel lblnhGiCho = new JLabel("Đánh giá cho từng thành viên");
        panel_3.add(lblnhGiCho);

        JLabel lblCpDng = new JLabel("Có áp dụng qui trình phát triển phần mềm theo mẫu RUP ");
        panel_3.add(lblCpDng);

        JLabel lblCKinhNghim = new JLabel("Có kinh nghiệm về ứng dụng tương tự ");
        panel_3.add(lblCKinhNghim);

        JLabel lblCKinhNghim_1 = new JLabel("Có kinh nghiệm về hướng đối tượng ");
        panel_3.add(lblCKinhNghim_1);

        JLabel lblCKhNng = new JLabel("Có khả năng lãnh đạo Nhóm");
        panel_3.add(lblCKhNng);

        JLabel lblTnhChtNng = new JLabel("Tính chất năng động");
        panel_3.add(lblTnhChtNng);

        JPanel panel_6 = new JPanel();
        panel_2.add(panel_6);
        panel_6.setLayout(new GridLayout(6, 1, 0, 0));

        JLabel lblTrngS = new JLabel("Trọng số");
        panel_6.add(lblTrngS);

        JLabel label_17 = new JLabel("1,5");
        panel_6.add(label_17);

        JLabel label_18 = new JLabel("0,5");
        panel_6.add(label_18);

        JLabel label_19 = new JLabel("1");
        panel_6.add(label_19);

        JLabel label_20 = new JLabel("0,5");
        panel_6.add(label_20);

        JLabel label_21 = new JLabel("1");
        panel_6.add(label_21);

        JPanel panel_7 = new JPanel();
        panel_2.add(panel_7);
        panel_7.setLayout(new GridLayout(6, 1, 0, 0));

        JLabel lblGiTrXp = new JLabel("Giá trị xếp hạng");
        panel_7.add(lblGiTrXp);

        textField_5 = new JTextField();
        textField_5.setColumns(10);
        panel_7.add(textField_5);

        textField_6 = new JTextField();
        textField_6.setColumns(10);
        panel_7.add(textField_6);

        textField_7 = new JTextField();
        textField_7.setColumns(10);
        panel_7.add(textField_7);

        textField_8 = new JTextField();
        textField_8.setColumns(10);
        panel_7.add(textField_8);

        textField_9 = new JTextField();
        textField_9.setColumns(10);
        panel_7.add(textField_9);
        
        JPanel panel_8 = new JPanel();
        panel_2.add(panel_8);
        panel_8.setLayout(new GridLayout(6, 1, 0, 0));
        
        JLabel lblnnh = new JLabel("Độ ổn định kinh nghiệm");
        panel_8.add(lblnnh);
        
        textField = new JTextField();
        textField.setColumns(10);
        panel_8.add(textField);
        
        textField_4 = new JTextField();
        textField_4.setColumns(10);
        panel_8.add(textField_4);
        
        textField_10 = new JTextField();
        textField_10.setColumns(10);
        panel_8.add(textField_10);
        
        textField_11 = new JTextField();
        textField_11.setColumns(10);
        panel_8.add(textField_11);
        
        textField_12 = new JTextField();
        textField_12.setColumns(10);
        panel_8.add(textField_12);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        add(panel_1);
        panel_1.setLayout(new GridLayout(1, 4, 0, 0));

        JPanel panel_5 = new JPanel();
        panel_1.add(panel_5);
        panel_5.setLayout(new GridLayout(6, 1, 0, 0));

        JLabel lblNewLabel_1 = new JLabel("Đánh giá chung cho Dự án");
        panel_5.add(lblNewLabel_1);

        JLabel lblNewLabel = new JLabel("Độ ổn định của các yêu cầu");
        panel_5.add(lblNewLabel);

        JLabel lblSDngCc = new JLabel("Sử dụng các nhân viên làm bán thời gian");
        panel_5.add(lblSDngCc);

        JLabel lblDngNgnNg = new JLabel("Dùng ngôn ngữ lập trình loại khó");
        panel_5.add(lblDngNgnNg);

        JPanel panel_4 = new JPanel();
        panel_1.add(panel_4);
        panel_4.setLayout(new GridLayout(6, 1, 0, 0));

        JLabel lblTrngS_1 = new JLabel("Trọng số");
        panel_4.add(lblTrngS_1);

        JLabel label_5 = new JLabel("2");
        panel_4.add(label_5);

        JLabel label_6 = new JLabel("-1");
        panel_4.add(label_6);

        JLabel label_7 = new JLabel("-1");
        panel_4.add(label_7);

        JPanel panel = new JPanel();
        panel_1.add(panel);
        panel.setLayout(new GridLayout(6, 1, 0, 0));

        JLabel lblNewLabel_2 = new JLabel("Giá trị xếp hạng");
        panel.add(lblNewLabel_2);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        panel.add(textField_1);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        panel.add(textField_2);

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        panel.add(textField_3);
        
        JPanel panel_9 = new JPanel();
        panel_1.add(panel_9);
        panel_9.setLayout(new GridLayout(6, 1, 0, 0));
        
        JLabel lblnnh_1 = new JLabel("Độ ổn định kinh nghiệm");
        panel_9.add(lblnnh_1);
        
        textField_13 = new JTextField();
        textField_13.setColumns(10);
        panel_9.add(textField_13);
        
        textField_14 = new JTextField();
        textField_14.setColumns(10);
        panel_9.add(textField_14);
        
        textField_15 = new JTextField();
        textField_15.setColumns(10);
        panel_9.add(textField_15);
        
        textField_5.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void removeUpdate(DocumentEvent e) {
                // TODO Auto-generated method stub
                if (textField_5.getText().equals("")) {
                    object.getEf().setGtxhRUP(0);
                } else {
                    object.getEf().setGtxhRUP(Float.parseFloat(textField_5.getText()));
                }

                notifyObserver(Command.ChangeEF, null);
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                // TODO Auto-generated method stub
                object.getEf().setGtxhRUP(Float.parseFloat(textField_5.getText()));
                notifyObserver(Command.ChangeEF, null);
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
                if (textField_6.getText().equals("")) {
                    object.getEf().setGtxhUDTT(0);
                } else {
                    object.getEf().setGtxhUDTT(Float.parseFloat(textField_6.getText()));
                }

                notifyObserver(Command.ChangeEF, null);
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                // TODO Auto-generated method stub
                object.getEf().setGtxhUDTT(Float.parseFloat(textField_6.getText()));
                notifyObserver(Command.ChangeEF, null);
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
                if (textField_7.getText().equals("")) {
                    object.getEf().setGtxhHDT(0);
                } else {
                    object.getEf().setGtxhHDT(Float.parseFloat(textField_7.getText()));
                }

                notifyObserver(Command.ChangeEF, null);
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                // TODO Auto-generated method stub
                object.getEf().setGtxhHDT(Float.parseFloat(textField_7.getText()));
                notifyObserver(Command.ChangeEF, null);
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
                if (textField_8.getText().equals("")) {
                    object.getEf().setGtxhLDN(0);
                } else {
                    object.getEf().setGtxhLDN(Float.parseFloat(textField_8.getText()));
                }

                notifyObserver(Command.ChangeEF, null);
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                // TODO Auto-generated method stub
                object.getEf().setGtxhLDN(Float.parseFloat(textField_8.getText()));
                notifyObserver(Command.ChangeEF, null);
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
                if (textField_9.getText().equals("")) {
                    object.getEf().setGtxhTCND(0);
                } else {
                    object.getEf().setGtxhTCND(Float.parseFloat(textField_9.getText()));
                }

                notifyObserver(Command.ChangeEF, null);
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                // TODO Auto-generated method stub
                object.getEf().setGtxhTCND(Float.parseFloat(textField_9.getText()));
                notifyObserver(Command.ChangeEF, null);
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
                if (textField_1.getText().equals("")) {
                    object.getEf().setGtxhODYC(0);
                } else {
                    object.getEf().setGtxhODYC(Float.parseFloat(textField_1.getText()));
                }

                notifyObserver(Command.ChangeEF, null);
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                // TODO Auto-generated method stub
                object.getEf().setGtxhODYC(Float.parseFloat(textField_1.getText()));
                notifyObserver(Command.ChangeEF, null);
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
                if (textField_2.getText().equals("")) {
                    object.getEf().setGtxhNVBTG(0);
                } else {
                    object.getEf().setGtxhNVBTG(Float.parseFloat(textField_2.getText()));
                }

                notifyObserver(Command.ChangeEF, null);
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                // TODO Auto-generated method stub
                object.getEf().setGtxhNVBTG(Float.parseFloat(textField_2.getText()));
                notifyObserver(Command.ChangeEF, null);
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
                if (textField_3.getText().equals("")) {
                    object.getEf().setGtxhNNLTK(0);
                } else {
                    object.getEf().setGtxhNNLTK(Float.parseFloat(textField_3.getText()));
                }

                notifyObserver(Command.ChangeEF, null);
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                // TODO Auto-generated method stub
                object.getEf().setGtxhNNLTK(Float.parseFloat(textField_3.getText()));
                notifyObserver(Command.ChangeEF, null);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // TODO Auto-generated method stub

            }
        });
textField.getDocument().addDocumentListener(new DocumentListener() {

    @Override
    public void removeUpdate(DocumentEvent e) {
        // TODO Auto-generated method stub
        if (textField.getText().equals("")) {
            object.getEs().setGtxhRUP(0);
        } else {
            object.getEs().setGtxhRUP(Float.parseFloat(textField.getText()));
        }

        notifyObserver(Command.ChangeES, null);
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        // TODO Auto-generated method stub
        object.getEs().setGtxhRUP(Float.parseFloat(textField.getText()));
        notifyObserver(Command.ChangeES, null);
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
        if (textField_4.getText().equals("")) {
            object.getEs().setGtxhUDTT(0);
        } else {
            object.getEs().setGtxhUDTT(Float.parseFloat(textField_4.getText()));
        }

        notifyObserver(Command.ChangeES, null);
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        // TODO Auto-generated method stub
        object.getEs().setGtxhUDTT(Float.parseFloat(textField_4.getText()));
        notifyObserver(Command.ChangeES, null);
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
        if (textField_10.getText().equals("")) {
            object.getEs().setGtxhHDT(0);
        } else {
            object.getEs().setGtxhHDT(Float.parseFloat(textField_10.getText()));
        }

        notifyObserver(Command.ChangeES, null);
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        // TODO Auto-generated method stub
        object.getEs().setGtxhHDT(Float.parseFloat(textField_10.getText()));
        notifyObserver(Command.ChangeES, null);
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
        if (textField_11.getText().equals("")) {
            object.getEs().setGtxhLDN(0);
        } else {
            object.getEs().setGtxhLDN(Float.parseFloat(textField_11.getText()));
        }

        notifyObserver(Command.ChangeES, null);
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        // TODO Auto-generated method stub
        object.getEs().setGtxhLDN(Float.parseFloat(textField_11.getText()));
        notifyObserver(Command.ChangeES, null);
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
        if (textField_12.getText().equals("")) {
            object.getEs().setGtxhTCND(0);
        } else {
            object.getEs().setGtxhTCND(Float.parseFloat(textField_12.getText()));
        }

        notifyObserver(Command.ChangeES, null);
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        // TODO Auto-generated method stub
        object.getEs().setGtxhTCND(Float.parseFloat(textField_12.getText()));
        notifyObserver(Command.ChangeES, null);
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        // TODO Auto-generated method stub

    }
});


textField_13.getDocument().addDocumentListener(new DocumentListener() {

    @Override
    public void removeUpdate(DocumentEvent e) {
        // TODO Auto-generated method stub
        if (textField_13.getText().equals("")) {
            object.getEs().setGtxhODYC(0);
        } else {
            object.getEs().setGtxhODYC(Float.parseFloat(textField_13.getText()));
        }

        notifyObserver(Command.ChangeES, null);
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        // TODO Auto-generated method stub
        object.getEs().setGtxhODYC(Float.parseFloat(textField_13.getText()));
        notifyObserver(Command.ChangeES, null);
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        // TODO Auto-generated method stub

    }
});

textField_14.getDocument().addDocumentListener(new DocumentListener() {

    @Override
    public void removeUpdate(DocumentEvent e) {
        // TODO Auto-generated method stub
        if (textField_14.getText().equals("")) {
            object.getEs().setGtxhNVBTG(0);
        } else {
            object.getEs().setGtxhNVBTG(Float.parseFloat(textField_14.getText()));
        }

        notifyObserver(Command.ChangeES, null);
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        // TODO Auto-generated method stub
        object.getEs().setGtxhNVBTG(Float.parseFloat(textField_14.getText()));
        notifyObserver(Command.ChangeES, null);
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        // TODO Auto-generated method stub

    }
});


textField_15.getDocument().addDocumentListener(new DocumentListener() {

    @Override
    public void removeUpdate(DocumentEvent e) {
        // TODO Auto-generated method stub
        if (textField_15.getText().equals("")) {
            object.getEs().setGtxhNNLTK(0);
        } else {
            object.getEs().setGtxhNNLTK(Float.parseFloat(textField_15.getText()));
        }

        notifyObserver(Command.ChangeES, null);
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        // TODO Auto-generated method stub
        object.getEs().setGtxhNNLTK(Float.parseFloat(textField_15.getText()));
        notifyObserver(Command.ChangeES, null);
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        // TODO Auto-generated method stub

    }
});

    }

}
