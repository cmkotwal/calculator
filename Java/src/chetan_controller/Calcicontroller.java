package chetan_controller;
import chetan_view.Calciview;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import chetan_model.Calcimodel;

public class Calcicontroller implements ActionListener {

	Calciview v;
	
	public Calcicontroller(Calciview v)
	{
		this.v=v;
	}
	public void actionPerformed(ActionEvent e) {
		Calcimodel m=new Calcimodel();
		
		String s1=v.t1.getText();
		String s2=v.t2.getText();
		
		if(e.getSource()==v.b1)
		{
		
			int a=Integer.parseInt(s1);
			int b=Integer.parseInt(s2);
			m.setFno(a);
			m.setSno(b);
			
			v.t3.setText(Integer.toString(m.addNo()));
		}
		
		if(e.getSource()==v.b2)
		{
		
			int a=Integer.parseInt(s1);
			int b=Integer.parseInt(s2);
			m.setFno(a);
			m.setSno(b);
			
			v.t3.setText(Integer.toString(m.subNo()));
		}
		
		if(e.getSource()==v.b3)
		{
		
			int a=Integer.parseInt(s1);
			int b=Integer.parseInt(s2);
			m.setFno(a);
			m.setSno(b);
			
			v.t3.setText(Integer.toString(m.multNo()));
		}
		
		if(e.getSource()==v.b4)
		{
		
			int a=Integer.parseInt(s1);
			int b=Integer.parseInt(s2);
			m.setFno(a);
			m.setSno(b);
			
			v.t3.setText(Integer.toString(m.divNo()));
		}
		
		if(e.getSource()==v.b5)
		{
			v.f1.dispose();
		}
		
		if(e.getSource()==v.b6)
		{
		
			v.t1.setText("");
			v.t2.setText("");
			v.t3.setText("");
		}
		
		
	}
	
	
}
