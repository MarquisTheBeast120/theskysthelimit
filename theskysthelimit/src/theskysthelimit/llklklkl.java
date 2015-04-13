package theskysthelimit;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import theskysthelimit.ez.DrawPanel;


public class llklklkl { 
	public llklklkl(){ //allows access to this class
		bveudf(); //runs this method
	}
	
	public void bveudf(){ //contains our entire program within
		
		
		  JFrame e = new JFrame(); //first page white background
		
		  e.setSize(1000,900); 
		  e.setVisible(true); 
	
		  
		  JPanel v = new JPanel(); //picture layer
		  JPanel x = new JPanel(); //button layer

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
	  e.add(v, BorderLayout.CENTER); // places image in the middle of the frame
	  e.add(x, BorderLayout.SOUTH);  // places the button below the picture
	  v.add(imgLabel);  //brings up picture to be used
		  x.add(B0); // adds button to the frame
	}	  
	
	public void frame(){
		//JFrame of second window
		  
		  JFrame w = new JFrame(); //second page
		  w.setSize(600,600); //size of page
		  w.setVisible(true); // makes page 
		
		  //JPanel of second window
		  JPanel p = new JPanel();
		  	  
		  //all of the buttons and what they say
		 
		  JButton bpig= new JButton("Pig"); 
		 JButton bSquid = new JButton("Squid");
		 JButton bsnake = new JButton("Snake");
		 JButton bgiraffe = new JButton("Giraffe");
		 JButton bhippo = new JButton("Hippo");
		 JButton bbunny = new JButton("Bunny");
		 JButton bpenguin = new JButton("Penguin");
		 JButton bshark = new JButton("Shark");
		 JButton bzebra= new JButton("Zebra");
		 //adds buttons onto jframe of page 2
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
	
	
		 
		 
		//buttons' actions 
		  bpig.addActionListener(new ActionListener(){  //waits for button to be pressed
			  @Override
			  public void actionPerformed(ActionEvent e) // starts the series of commands below
			  {
				  ez X = new ez();//creates variable
				  DrawPanel drawPanel = X.new DrawPanel();//puts animal in a draw pannel
				  JFrame x = new JFrame();//creates new jframe for animal
				  x.getContentPane().add(BorderLayout.CENTER, drawPanel);// draws picture in the middle of the jframe
				  x.setSize(1700,1000);//sets size of the window
				  x.setVisible(true); //allows you to see the pig
                        
			  }
	});

		  bSquid.addActionListener(new ActionListener(){  //waits for button to be pressed
				@Override
				public void actionPerformed(ActionEvent r)
				{
					   Squid X = new Squid();//creates variable
					 theskysthelimit.Squid.DrawPanel drawPanel = X.new DrawPanel();//puts animal in a draw pannel
					  JFrame x = new JFrame();//creates new jframe for animal
					  x.getContentPane().add(BorderLayout.CENTER, drawPanel);// draws picture in the middle of the jframe
					  x.setSize(1700,1000);//sets size of the window
					  x.setVisible(true); //allows you to see the squid	
			  }
   });		
		  bsnake.addActionListener(new ActionListener(){ //waits for button to be pressed
		 		@Override
					public void actionPerformed(ActionEvent u)
					{
		 			 jsnake X = new jsnake();//creates variable
		 			theskysthelimit.jsnake.DrawSnakePanel drawSnakePanel = X.new DrawSnakePanel();//puts animal in a draw pannel
					  JFrame x = new JFrame();//creates new jframe for animal
					  x.getContentPane().add(BorderLayout.CENTER, drawSnakePanel);// draws picture in the middle of the jframe
					  x.setSize(1700,1000);//sets size of the window
					  x.setVisible(true); //allows you to see the snake
			  }
	});		
			 bgiraffe.addActionListener(new ActionListener(){   //waits for button to be pressed
					@Override
					public void actionPerformed(ActionEvent i)
					{
						 Giraffeeeeeeeee X = new Giraffeeeeeeeee();//creates variable
						 theskysthelimit.Giraffeeeeeeeee.DrawPanel drawPanel = X.new DrawPanel();//puts animal in a draw pannel
						  JFrame x = new JFrame();//creates new jframe for animal
						  x.getContentPane().add(BorderLayout.CENTER, drawPanel);// draws picture in the middle of the jframe
						  x.setSize(1700,1000);//sets size of the window
						  x.setVisible(true); //allows you to see the giraffe					
			  }
	});			
			 bhippo.addActionListener(new ActionListener(){   //waits for button to be pressed
					@Override
					public void actionPerformed(ActionEvent o)
					{
						 hippo X = new hippo();//creates variable
						 theskysthelimit.hippo.DrawPanel drawPanel = X.new DrawPanel();//puts animal in a draw pannel
						  JFrame x = new JFrame();//creates new jframe for animal
						  x.getContentPane().add(BorderLayout.CENTER, drawPanel);// draws picture in the middle of the jframe
						  x.setSize(1700,1000);//sets size of the window
						  x.setVisible(true); //allows you to see the hippo				
			   }
	 }); 		
			 bbunny.addActionListener(new ActionListener(){  //waits for button to be pressed
					@Override
					public void actionPerformed(ActionEvent p)
					{
						 habitat X = new habitat();//creates variable
						 theskysthelimit.habitat.DrawPanel drawPanel = X.new DrawPanel();//puts animal in a draw pannel
						  JFrame x = new JFrame();//creates new jframe for animal
						  x.getContentPane().add(BorderLayout.CENTER, drawPanel);// draws picture in the middle of the jframe
						  x.setSize(1700,1000);//sets size of the window
						  x.setVisible(true); //allows you to see the bunny					
				}
	 });		
			 bpenguin.addActionListener(new ActionListener(){   //waits for button to be pressed
					@Override
					public void actionPerformed(ActionEvent a)
					{
						jPenguin X = new jPenguin();//creates variable
						  theskysthelimit.jPenguin.DrawPanel drawPanel = X.new DrawPanel();//puts animal in a draw pannel
						  JFrame x = new JFrame();//creates new jframe for animal
						  x.getContentPane().add(BorderLayout.CENTER, drawPanel);// draws picture in the middle of the jframe
						  x.setSize(1700,1000);//sets size of the window
						  x.setVisible(true); //allows you to see the penguin
					}
	 }); 	
			 bshark.addActionListener(new ActionListener(){ //waits for button to be pressed
					@Override
					public void actionPerformed(ActionEvent s)
					{
						 Shark X = new Shark();//creates variable
						 theskysthelimit.Shark.DrawPanel drawPanel = X.new DrawPanel();//puts animal in a draw pannel
						  JFrame x = new JFrame();//creates new jframe for animal
						  x.getContentPane().add(BorderLayout.CENTER, drawPanel);// draws picture in the middle of the jframe
						  x.setSize(1700,1000);//sets size of the window
						  x.setVisible(true); //allows you to see the shark				
					}
	 });
			 bzebra.addActionListener(new ActionListener(){ //waits for button to be pressed
					@Override
					public void actionPerformed(ActionEvent d)
					{
						 Zebra X = new Zebra();//creates variable
						 theskysthelimit.Zebra.DrawPanel drawPanel = X.new DrawPanel();//puts animal in a draw pannel
						  JFrame x = new JFrame();//creates new jframe for animal
						  x.getContentPane().add(BorderLayout.CENTER, drawPanel);// draws picture in the middle of the jframe
						  x.setSize(1700,1000);//sets size of the window
						  x.setVisible(true); // allows you to see the zebra
					}
	  });}
			 
	     
	  
	public static void main(String[] args) //starts here
	{
	new llklklkl(); //creates object 
	}
		  }
	
