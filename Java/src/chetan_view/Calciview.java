package chetan_view;
import javax.swing.*;
import chetan_controller.Calcicontroller;
public class Calciview {
	
	public JFrame f1;
	public JLabel l1,l2,l3;
	public JTextField t1,t2,t3;
	public JButton b1,b2,b3,b4,b5,b6;
	
	public Calciview()
	{
		f1=new JFrame("Calculator");
		f1.setLayout(null);
		
		l1=new JLabel("FirstNo");
		l1.setBounds(20,20,80,30);
		f1.add(l1);
		
		t1=new JTextField();
		t1.setBounds(120,20,80,30);
		f1.add(t1);
		
		l2=new JLabel("SecondNo");
		l2.setBounds(20,60,80,30);
		f1.add(l2);
		
		t2=new JTextField();
		t2.setBounds(120,60,80,30);
		f1.add(t2);
		
		l3=new JLabel("Result");
		l3.setBounds(20,100,80,30);
		f1.add(l3);
		
		t3=new JTextField();
		t3.setBounds(120,100,80,30);
		f1.add(t3);
		
		b1=new JButton("Add");
		b1.addActionListener(new Calcicontroller(this));
		b1.setBounds(20,140,60,30);
		f1.add(b1);
		
		b2=new JButton("Sub");
		b2.addActionListener(new Calcicontroller(this));
		b2.setBounds(100,140,60,30);
		f1.add(b2);
		
		b3=new JButton("Mult");
		b3.addActionListener(new Calcicontroller(this));
		b3.setBounds(180,140,60,30);
		f1.add(b3);
		
		b4=new JButton("Div");
		b4.addActionListener(new Calcicontroller(this));
		b4.setBounds(260,140,60,30);
		f1.add(b4);
		
		b5=new JButton("Cancel");
		b5.addActionListener(new Calcicontroller(this));
		b5.setBounds(60,200,80,30);
		f1.add(b5);
		
		b6=new JButton("Reset");
		b6.addActionListener(new Calcicontroller(this));
		b6.setBounds(200,200,80,30);
		f1.add(b6);
		
		f1.setSize(400,300);
		f1.setVisible(true);
	}

}
