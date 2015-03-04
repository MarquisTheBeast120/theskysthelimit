package theskysthelimit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class llklklkl {
	public llklklkl(){
		

		
		
		frame();	
			
				
		}


	public void frame(){
		
		  JFrame w = new JFrame();
		  w.setSize(400,400);
		  w.setVisible(true);
		  w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  JPanel p = new JPanel();
		  JButton b1 = new JButton("pig"); 
		 JButton b2 = new JButton("cat");
		 JButton b3 = new JButton("dog");
		 JButton b4 = new JButton("cat");
		 JButton b5 = new JButton("cat");
		 JButton b6 = new JButton("cat");
		 JButton b7 = new JButton("cat");
		 JButton b8 = new JButton("cat");
		 JButton b9= new JButton("cat");
		 JButton b10 = new JButton("cat");
		 b3.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent t)
				{
					JOptionPane.showMessageDialog(null, "dog");
				}
			 });
		 b2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent r)
			{
				JOptionPane.showMessageDialog(null, "cat");
			}
		 });
		  b1.addActionListener(new ActionListener(){
			  @Override
			  public void actionPerformed(ActionEvent e)
			  {
				JOptionPane.showMessageDialog(null, "pig");
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
		  p.add(b10);
		  
		  
		  
		  }
	public static void main(String[] args)
	{
	new llklklkl();
	}
		  }
	 

