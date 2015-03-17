package theskysthelimit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;

import theskysthelimit.ez.DrawPanel;


public class llklklkl {
	public llklklkl(){
		bveudf();
			
		
	}
	
		
	
	
	public void bveudf(){
		
		  JFrame e = new JFrame();
		  e.setSize(600,600);
		  e.setVisible(true);
		  e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  
		  JPanel v = new JPanel();
		   JLabel m = new JLabel("Click here to enter the zoo"); 
		  
		  JButton B0 = new JButton("enter");
		  B0.addActionListener(new ActionListener(){
			  @Override
			  public void actionPerformed(ActionEvent q)
			  {
				  frame();
			  }
			 
  });  
		  e.add(v);
		  v.add(m);
		  v.add(B0);
	}
	
	
	public void frame(){
		//JFrame
		  
		  JFrame w = new JFrame();
		  w.setSize(400,400);
		  w.setVisible(true);
		  w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  //JPanel
		  JPanel v = new JPanel();
		  JPanel p = new JPanel();
		  	  
		  //all buttons	
		 
		  JButton b1 = new JButton("pig"); 
		 JButton b2 = new JButton("cat");
		 JButton b3 = new JButton("snake");
		 JButton b4 = new JButton("giraffe");
		 JButton b5 = new JButton("fish");
		 JButton b6 = new JButton("bunny");
		 JButton b7 = new JButton("penguin");
		 JButton b8 = new JButton("shark");
		 JButton b9= new JButton("zebra");
		 
		//button's actions 
		 
  
		  b1.addActionListener(new ActionListener(){
			  @Override
			  public void actionPerformed(ActionEvent e)
			  {
				  ez X = new ez();
				  DrawPanel drawPanel = X.new DrawPanel();
				  
			  }
			 
  });  
		  b2.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent r)
				{
					JOptionPane.showMessageDialog(null, "cat");
				}
			 });		
		  b3.addActionListener(new ActionListener(){
		 		@Override
					public void actionPerformed(ActionEvent u)
					{
						JOptionPane.showMessageDialog(null, "snake");
					}
				 });
			 b4.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent i)
					{
						JOptionPane.showMessageDialog(null, "giraffe");
					}
				 });
			 b5.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent o)
					{
						JOptionPane.showMessageDialog(null, "fish");
					}
				 });
			 b6.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent p)
					{
						JOptionPane.showMessageDialog(null, "bunny");
					}
				 });
			 b7.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent a)
					{
						JOptionPane.showMessageDialog(null, "penguin");
					}
				 });
			 b8.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent s)
					{
						JOptionPane.showMessageDialog(null, "shark");
					}
				 });
			 b9.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent d)
					{
						JOptionPane.showMessageDialog(null, "ze-BRA!");
					}
				 });
			 
			 
	     
	   
		  w.add(p);
		  p.add(b1);
		  p.add(b2);
		  p.add(b3);
		  p.add(b4);
		  p.add(b5);
		  p.add(b6);
		  p.add(b7);
		  p.add(b8);
		  p.add(b9);
		  
		  
		  
		  
		  }
	
	
	
	public static void main(String[] args)
	{
	new llklklkl();
	}
		  }
	 

