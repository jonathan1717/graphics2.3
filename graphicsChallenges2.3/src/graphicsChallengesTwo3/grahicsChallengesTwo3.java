package graphicsChallengesTwo3;
import java.awt.*;
import java.util.Scanner;

import javax.swing.*;
public class grahicsChallengesTwo3 extends Canvas 
	{
static int counter1;
static int counter2; 
static int counter3; 


	private static final long	serialVersionUID	= 1L;

    	public static void main(String[] args) 
    		{
    		
	        grahicsChallengesTwo3 canvas = new grahicsChallengesTwo3();
	        JFrame frame = new JFrame();
	        frame.setSize(1000, 1000);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null);
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
 
    	public void paint(Graphics graphics) 
    		{
    			for (int i = 0;i<255;i++);
    						{
    							counter1++;
    						}
    						for (int i = 0;i<255;i++);
        						{
        							counter2++;
        						}
        						for (int i = 0;i<255;i++);
            						{
            							counter3++;
            						}
    			
    		 for (int i = 0; i<255; i++)
    						 {
    							 graphics.setColor(Color.red);
    	    					 
    							 graphics.setColor(new Color(i,counter2,counter3));
    	    					 try
									{
										Thread.sleep(10);
									} catch (InterruptedException e)
									{
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
    							 graphics.fillRect(300,300,500,500);
    						 }
    		 for (int j = 0; j<255; j++)
				 {
					 graphics.setColor(Color.red);
					 
					 graphics.setColor(new Color(counter1,j,counter3));
					 try
						{
							Thread.sleep(10);
						} catch (InterruptedException e)
						{
							
							e.printStackTrace();
						}
					 graphics.fillRect(300,300,500,500);
				 }
    		 for (int d = 0; d<255; d++)
				 {
					 graphics.setColor(Color.red);
					 
					 graphics.setColor(new Color(counter1,counter2,d));
					 try
						{
							Thread.sleep(0);
						} catch (InterruptedException e)
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					 graphics.fillRect(300,300,500,500);
				 }
    		}
    	
    	
    }