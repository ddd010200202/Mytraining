package tw.Ting.training;


import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.GatheringByteChannel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
	

public class Myabacus extends JFrame {
	private  String[] name = {"1","2","3","+","4","5","6","-","7","8","9","*","C","0","=","/"};
	//123+456-789*c0=/
	//0123456789012345
	private JPanel jp;
	private	JTextField JF;
	private JButton JB1;
	private JButton JB2;
	private JButton JB3;
	private JButton JB4;
	private JButton JB5;
	private JButton JB6;
	private JButton JB7;
	private JButton JB8;
	private JButton JB9;
	private JButton JB10;
	private JButton JB11;
	private JButton JB12;
	private JButton JB13;
	private JButton JB14;
	private JButton JB15;
	private JButton JB16;
	private JButton JB17;
	private String opString="";
	int sum=0;
	public Myabacus() {

		jp = new JPanel();
		
		setContentPane(jp);
		jp.setLayout(new GridBagLayout());
		
		JF = new JTextField();
		JF.setText("");
		JF.setEditable(true);
		GridBagConstraints gbc1 = new GridBagConstraints();
		gbc1.gridx = 0;
		gbc1.gridy = 0;
//		gbc1.gridheight = 60;
		gbc1.gridwidth = GridBagConstraints.REMAINDER;
		gbc1.ipady = 1;
		gbc1.fill = GridBagConstraints.HORIZONTAL;
//		gbc1.anchor = GridBagConstraints.CENTER;
		jp.add(JF,gbc1);
	    
		JB1 = new JButton(name[0]);
		GridBagConstraints gbc2 = new GridBagConstraints();
		gbc2.gridx = 0;
		gbc2.gridy = 1;
//		gbc2.gridheight = 60;
//		gbc2.gridwidth = 60;
		JB2 = new JButton(name[1]);
		GridBagConstraints gbc3 = new GridBagConstraints();
		gbc3.gridx = 1;
		gbc3.gridy = 1;
		JB3 = new JButton(name[2]);
		GridBagConstraints gbc4 = new GridBagConstraints();
		gbc4.gridx = 2;
		gbc4.gridy = 1;
		JB4 = new JButton(name[3]);
		GridBagConstraints gbc5 = new GridBagConstraints();
		gbc5.gridx = 3;
		gbc5.gridy = 1;
		JB5 = new JButton(name[4]);
		GridBagConstraints gbc6 = new GridBagConstraints();
		gbc6.gridx = 0;
		gbc6.gridy = 2;
		JB6 = new JButton(name[5]);
		GridBagConstraints gbc7 = new GridBagConstraints();
		gbc7.gridx = 1;
		gbc7.gridy = 2;
		JB7 = new JButton(name[6]);
		GridBagConstraints gbc8 = new GridBagConstraints();
		gbc8.gridx = 2;
		gbc8.gridy = 2;
		JB8 = new JButton(name[7]);
		GridBagConstraints gbc9 = new GridBagConstraints();
		gbc9.gridx = 3;
		gbc9.gridy = 2;
		JB9 = new JButton(name[8]);
		GridBagConstraints gbc10 = new GridBagConstraints();
		gbc10.gridx = 0;
		gbc10.gridy = 3;
		JB10 = new JButton(name[9]);
		GridBagConstraints gbc11 = new GridBagConstraints();
		gbc11.gridx = 1;
		gbc11.gridy = 3;
		JB11 = new JButton(name[10]);
		GridBagConstraints gbc12 = new GridBagConstraints();
		gbc12.gridx = 2;
		gbc12.gridy = 3;
		JB12 = new JButton(name[11]);
		GridBagConstraints gbc13 = new GridBagConstraints();
		gbc13.gridx = 3;
		gbc13.gridy = 3;
		JB13 = new JButton(name[12]);
		GridBagConstraints gbc14 = new GridBagConstraints();
		gbc14.gridx = 0;
		gbc14.gridy = 4;
		JB14 = new JButton(name[13]);
		GridBagConstraints gbc15 = new GridBagConstraints();
		gbc15.gridx = 1;
		gbc15.gridy = 4;
		JB15 = new JButton(name[14]);
		GridBagConstraints gbc16 = new GridBagConstraints();
		gbc16.gridx = 2;
		gbc16.gridy = 4;
		JB16 = new JButton(name[15]);
		GridBagConstraints gbc17 = new GridBagConstraints();
		gbc17.gridx = 3;
		gbc17.gridy = 4;
		//123+456-789*c0=/
		//0123456789012345
		//1234567890123456
		JB1.addActionListener(buttonListener(JB1.getText()));
		JB2.addActionListener(buttonListener(JB2.getText()));
		JB3.addActionListener(buttonListener(JB3.getText()));
		JB4.addActionListener(optButtonListener(JB4.getText()));
		JB5.addActionListener(buttonListener(JB5.getText()));
		JB6.addActionListener(buttonListener(JB6.getText()));
		JB7.addActionListener(buttonListener(JB7.getText()));
		JB8.addActionListener(optButtonListener(JB8.getText()));
		JB9.addActionListener(buttonListener(JB9.getText()));
		JB10.addActionListener(buttonListener(JB10.getText()));
		JB11.addActionListener(buttonListener(JB11.getText()));
		JB12.addActionListener(optButtonListener(JB12.getText()));
		JB13.addActionListener(clearButtonListener());
		JB14.addActionListener(buttonListener(JB14.getText()));
		JB15.addActionListener(optButtonListener(JB15.getText()));
		JB16.addActionListener(optButtonListener(JB16.getText()));


		jp.add(JB1,gbc2);jp.add(JB2,gbc3);jp.add(JB3,gbc4);jp.add(JB4,gbc5);jp.add(JB5,gbc6);
		jp.add(JB6,gbc7);jp.add(JB7,gbc8);jp.add(JB8,gbc9);jp.add(JB9,gbc10);jp.add(JB10,gbc11);
		jp.add(JB11,gbc12);jp.add(JB12,gbc13);jp.add(JB13,gbc14);jp.add(JB14,gbc15);jp.add(JB15,gbc16);
		jp.add(JB16,gbc17);
	    
	    
		

	}
	public void MyJframe() {
				setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 300,300);
		setResizable(false);
		setVisible(true);
	}
	public ActionListener buttonListener (String Text) {  //數字監聽
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JF.setText(JF.getText()+Text);
				
			}
		};
	}
	
	 
    public ActionListener clearButtonListener(){//清除鍵的監聽器
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JF.setText("");
            }
        };
    }
    private void ops(){  //計算方法
        switch (opString) { // opstring =+-*/
            case "+": //當按下+
                if (JF.getText() != "") { //如果輸入的值(String)不等於空
                    sum += Integer.parseInt(JF.getText()); //sum = 值(String)轉值(int)
                }
                else  sum +=0;
                JF.setText(sum+"");//字串+int 變字串
                opString="";	
                break;
            case "-":
                if (JF.getText() != "") {
                    sum -= Integer.parseInt(JF.getText());
                }
                else sum -=0;
                JF.setText(sum+" ");   
                opString="";
                break;
            case "*":
                if (JF.getText() != "") { 
                    sum *= Integer.parseInt(JF.getText());
                }
              else sum *=0;
                JF.setText(sum+"");
                opString="";
                break;
            case "/":
                if (JF.getText() != "") {
                    sum /= Integer.parseInt(JF.getText())!=0?Integer.parseInt(JF.getText()):1;
                }
                else sum /= 1;
                JF.setText(sum+"");
                opString="";
                break;
        }
    }

	//加減乘除及等於號的監聽器
    public ActionListener optButtonListener(String op){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (op!="="){
                    ops();
                    opString=op;
                    if (JF.getText() != "") { 
                        sum = Integer.parseInt(JF.getText());
                        JF.setText("");
                    }
                    else sum=0;
                }
                else {
                    ops();
                }
            }
        };
    }
	
	public static void main(String[] args) {
		new Myabacus().MyJframe();;

	}

}

