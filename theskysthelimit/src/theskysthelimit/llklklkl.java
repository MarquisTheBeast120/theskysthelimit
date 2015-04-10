package theskysthelimit;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.OverlayLayout;

import theskysthelimit.ez.DrawPanel;


public class llklklkl {
	public llklklkl(){
		bveudf();
			
		
	}
	
		
	
	
	public void bveudf(){
		
		//first page white background
		  JFrame e = new JFrame();
		
		  e.setSize(1000,900);
		  e.setVisible(true);
	
		  
		  JPanel v = new JPanel();
		  JPanel x = new JPanel();

		  	//front picture
		   JLabel imgLabel = new JLabel(new ImageIcon("./src/animal.jpg"));
		  //enter button
		  JButton B0 = new JButton("enter");
		  B0.addActionListener(new ActionListener(){
			  @Override
			  public void actionPerformed(ActionEvent q)
			  {
				  frame();
			  }
			 
  });  
		  //adding button and pic to jframe
	  e.add(v, BorderLayout.CENTER);
	  e.add(x, BorderLayout.SOUTH);
	  v.add(imgLabel, BorderLayout.WEST);
		  x.add(B0);
		  
	
	}
	
	
	public void frame(){
		//JFrame of second window
		  
		  JFrame w = new JFrame();
		  w.setSize(600,600);
		  w.setVisible(true);
		
		  //JPanel of second window
		  JPanel v = new JPanel();
		  JPanel p = new JPanel();
		  	  
		  //all of the buttons	
		 
		  JButton bpig= new JButton("Pig"); 
		 JButton bSquid = new JButton("Squid");
		 JButton bsnake = new JButton("Snake");
		 JButton bgiraffe = new JButton("Giraffe");
		 JButton bhippo = new JButton("Hippo");
		 JButton bbunny = new JButton("Bunny");
		 JButton bpenguin = new JButton("Penguin");
		 JButton bshark = new JButton("Shark");
		 JButton bzebra= new JButton("Zebra");
		 
		//button's actions 
		 
		 	
		  bpig.addActionListener(new ActionListener(){  
			  @Override
			  public void actionPerformed(ActionEvent e)
			  {
				  ez X = new ez();
				  DrawPanel drawPanel = X.new DrawPanel();
				  JFrame x = new JFrame();
				  x.getContentPane().add(BorderLayout.CENTER, drawPanel);
				  x.setSize(1700,1000);
				  x.setVisible(true); //pig
                        
			  }
			 
  });  		+
  
		  bSquid.addActionListener(new ActionListener(){  
				@Override
				public void actionPerformed(ActionEvent r)
				{
					   Squid X = new Squid();
					 theskysthelimit.Squid.DrawPanel drawPanel = X.new DrawPanel();
					  JFrame x = new JFrame();
					  x.getContentPane().add(BorderLayout.CENTER, drawPanel);
					  x.setSize(1700,1000);
					  x.setVisible(true); //squid	
			  }
   });		
		  bsnake.addActionListener(new ActionListener(){ 
		 		@Override
					public void actionPerformed(ActionEvent u)
					{
		 			 jsnake X = new jsnake();
		 			theskysthelimit.jsnake.DrawSnakePanel drawSnakePanel = X.new DrawSnakePanel();
					  JFrame x = new JFrame();
					  x.getContentPane().add(BorderLayout.CENTER, drawSnakePanel);
					  x.setSize(1700,1000);
					  x.setVisible(true); //snake
			  }
	});		
			 bgiraffe.addActionListener(new ActionListener(){   
					@Override
					public void actionPerformed(ActionEvent i)
					{
						 Giraffeeeeeeeee X = new Giraffeeeeeeeee();
						 theskysthelimit.Giraffeeeeeeeee.DrawPanel drawPanel = X.new DrawPanel();
						  JFrame x = new JFrame();
						  x.getContentPane().add(BorderLayout.CENTER, drawPanel);
						  x.setSize(1700,1000);
						  x.setVisible(true); //giraffe					
			  }
	});			
			 bhippo.addActionListener(new ActionListener(){   
					@Override
					public void actionPerformed(ActionEvent o)
					{
						 hippo X = new hippo();
						 theskysthelimit.hippo.DrawPanel drawPanel = X.new DrawPanel();
						  JFrame x = new JFrame();
						  x.getContentPane().add(BorderLayout.CENTER, drawPanel);
						  x.setSize(1700,1000);
						  x.setVisible(true); //hippo				
			   }
	 }); 		
			 bbunny.addActionListener(new ActionListener(){  
					@Override
					public void actionPerformed(ActionEvent p)
					{
						 habitat X = new habitat();
						 theskysthelimit.habitat.DrawPanel drawPanel = X.new DrawPanel();
						  JFrame x = new JFrame();
						  x.getContentPane().add(BorderLayout.CENTER, drawPanel);
						  x.setSize(1700,1000);
						  x.setVisible(true); //bunny					
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
						  x.setSize(1700,1000);
						  x.setVisible(true); //penguin
					}
	 }); 	
			 bshark.addActionListener(new ActionListener(){ 
					@Override
					public void actionPerformed(ActionEvent s)
					{
						 Shark X = new Shark();
						 theskysthelimit.Shark.DrawPanel drawPanel = X.new DrawPanel();
						  JFrame x = new JFrame();
						  x.getContentPane().add(BorderLayout.CENTER, drawPanel);
						  x.setSize(1700,1000);
						  x.setVisible(true); //shark				
					}
	 });
			 bzebra.addActionListener(new ActionListener(){ 
					@Override
					public void actionPerformed(ActionEvent d)
					{
						 Zebra X = new Zebra();
						 theskysthelimit.Zebra.DrawPanel drawPanel = X.new DrawPanel();
						  JFrame x = new JFrame();
						  x.getContentPane().add(BorderLayout.CENTER, drawPanel);
						  x.setSize(1700,1000);
						  x.setVisible(true); //zebra
					}
	  });
			 
			 
	     
	   //adds buttons onto jframe
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
	 

