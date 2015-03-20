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
		  w.setSize(600,600);
		  w.setVisible(true);
		  w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  //JPanel
		  JPanel v = new JPanel();
		  JPanel p = new JPanel();
		  	  
		  //all buttons	
		 
		  JButton bpig= new JButton("pig"); 
		 JButton bSquid = new JButton("Squid");
		 JButton bsnake = new JButton("snake");
		 JButton bgiraffe = new JButton("giraffe");
		 JButton bhippo = new JButton("hippo");
		 JButton bbunny = new JButton("bunny");
		 JButton bpenguin = new JButton("penguin");
		 JButton bshark = new JButton("shark");
		 JButton bzebra= new JButton("zebra");
		 
		//button's actions 
		 
  
		  bpig.addActionListener(new ActionListener(){  //done
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
		  bSquid.addActionListener(new ActionListener(){  //done
				@Override
				public void actionPerformed(ActionEvent r)
				{
					   Squid X = new Squid();
					 theskysthelimit.Squid.DrawPanel drawPanel = X.new DrawPanel();
					  JFrame x = new JFrame();
					  x.getContentPane().add(BorderLayout.CENTER, drawPanel);
					  x.setSize(800,800);
					  x.setVisible(true);				}
			 });		
		  bsnake.addActionListener(new ActionListener(){ //done
		 		@Override
					public void actionPerformed(ActionEvent u)
					{
		 			 jsnake X = new jsnake();
		 			theskysthelimit.jsnake.DrawSnakePanel drawSnakePanel = X.new DrawSnakePanel();
					  JFrame x = new JFrame();
					  x.getContentPane().add(BorderLayout.CENTER, drawSnakePanel);
					  x.setSize(800,800);
					  x.setVisible(true);					}
				 });
			 bgiraffe.addActionListener(new ActionListener(){   //done
					@Override
					public void actionPerformed(ActionEvent i)
					{
						 Giraffeeeeeeeee X = new Giraffeeeeeeeee();
						 theskysthelimit.Giraffeeeeeeeee.DrawPanel drawPanel = X.new DrawPanel();
						  JFrame x = new JFrame();
						  x.getContentPane().add(BorderLayout.CENTER, drawPanel);
						  x.setSize(800,800);
						  x.setVisible(true);					}
				 });
			 bhippo.addActionListener(new ActionListener(){   //done
					@Override
					public void actionPerformed(ActionEvent o)
					{
						 hippo X = new hippo();
						 theskysthelimit.hippo.DrawPanel drawPanel = X.new DrawPanel();
						  JFrame x = new JFrame();
						  x.getContentPane().add(BorderLayout.CENTER, drawPanel);
						  x.setSize(800,800);
						  x.setVisible(true);					}
				 });
			 bbunny.addActionListener(new ActionListener(){  //done
					@Override
					public void actionPerformed(ActionEvent p)
					{
						 habitat X = new habitat();
						 theskysthelimit.habitat.DrawPanel drawPanel = X.new DrawPanel();
						  JFrame x = new JFrame();
						  x.getContentPane().add(BorderLayout.CENTER, drawPanel);
						  x.setSize(800,800);
						  x.setVisible(true);					}
				 });
			 bpenguin.addActionListener(new ActionListener(){   //done
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
			 bshark.addActionListener(new ActionListener(){ //done
					@Override
					public void actionPerformed(ActionEvent s)
					{
						 Shark X = new Shark();
						 theskysthelimit.Shark.DrawPanel drawPanel = X.new DrawPanel();
						  JFrame x = new JFrame();
						  x.getContentPane().add(BorderLayout.CENTER, drawPanel);
						  x.setSize(800,800);
						  x.setVisible(true);					}
				 });
			 bzebra.addActionListener(new ActionListener(){ //done
					@Override
					public void actionPerformed(ActionEvent d)
					{
						 Zebra X = new Zebra();
						 theskysthelimit.Zebra.DrawPanel drawPanel = X.new DrawPanel();
						  JFrame x = new JFrame();
						  x.getContentPane().add(BorderLayout.CENTER, drawPanel);
						  x.setSize(800,800);
						  x.setVisible(true);					}
				 });
			 
			 
	     
	   
		  w.add(p);
		  p.add(bpig);
		  p.add(bSquid);
		  p.add(bsnake);
		  p.add(bgiraffe);
		  p.add(bhippo);
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
	 

