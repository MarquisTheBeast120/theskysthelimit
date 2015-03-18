package theskysthelimit;

import java.awt.BorderLayout;
import java.awt.Graphics;
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
		 
		  JButton bpig= new JButton("pig"); 
		 JButton bcat = new JButton("cat");
		 JButton bsnake = new JButton("snake");
		 JButton bgiraffe = new JButton("giraffe");
		 JButton bfish = new JButton("fish");
		 JButton bbunny = new JButton("bunny");
		 JButton bpenguin = new JButton("penguin");
		 JButton bshark = new JButton("shark");
		 JButton bzebra= new JButton("zebra");
		 
		//button's actions 
		 
  
		  bpig.addActionListener(new ActionListener(){
			  @Override
			  public void actionPerformed(ActionEvent e)
			  {
				  ez X = new ez();
				  DrawPanel drawPanel = X.new DrawPanel();
				  JFrame x = new JFrame();
				  x.getContentPane().add(BorderLayout.CENTER, drawPanel);
				  x.setSize(800,800);
				  x.setVisible(true);
                        
			  }
			 
  });  
		  bcat.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent r)
				{
					JOptionPane.showMessageDialog(null, "cat");
				}
			 });		
		  bsnake.addActionListener(new ActionListener(){
		 		@Override
					public void actionPerformed(ActionEvent u)
					{
						JOptionPane.showMessageDialog(null, "snake");
					}
				 });
			 bgiraffe.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent i)
					{
						JOptionPane.showMessageDialog(null, "giraffe");
					}
				 });
			 bfish.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent o)
					{
						JOptionPane.showMessageDialog(null, "fish");
					}
				 });
			 bbunny.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent p)
					{
						JOptionPane.showMessageDialog(null, "bunny");
					}
				 });
			 bpenguin.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent a)
					{
						jPenguin X = new jPenguin();
						  theskysthelimit.jPenguin.DrawPanel drawPanel = X.new DrawPanel();
						  JFrame x = new JFrame();
						  x.getContentPane().add(BorderLayout.CENTER, drawPanel);
						  x.setSize(800,800);
						  x.setVisible(true);
					}
				 });
			 bshark.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent s)
					{
						JOptionPane.showMessageDialog(null, "shark");
					}
				 });
			 bzebra.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent d)
					{
						JOptionPane.showMessageDialog(null, "ze-BRA!");
					}
				 });
			 
			 
	     
	   
		  w.add(p);
		  p.add(bpig);
		  p.add(bcat);
		  p.add(bsnake);
		  p.add(bgiraffe);
		  p.add(bfish);
		  p.add(bbunny);
		  p.add(bpenguin);
		  p.add(bshark);
		  p.add(bzebra);
		  
		  
		  
		  
		  }
	
	
	
	public static void main(String[] args)
	{
	new llklklkl();
	}
		  }
	 

