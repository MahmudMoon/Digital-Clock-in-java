import java.applet.Applet;
import java.awt.*;
import java.lang.Thread;
import java.util.Date;

//<applet code=AppleT.class height = 500 width = 800></applet>

public class AppleT extends Applet
{
	
	public void paint(Graphics g)
	{
	  
		while(true)
		{
		Date D = new Date();
		String S = D.toString();
		char s[] = new char[20];
		for(int i= 0;i<19;i++)
		{
			s[i] = S.charAt(i);
		}
		int h1 = (int)s[11]-48;
		
		switch(h1)
		{
			case 0:
			{
			g.drawLine(100,100, 150, 100);//1
			g.drawLine(100,110, 100, 160);//2
			g.drawLine(100,170, 100, 220);//3
			g.drawLine(100,230, 150, 230);//4
			g.drawLine(150,110,150,160);//5
			g.drawLine(150,170,150,220);//6
			g.setColor(Color.WHITE);
			g.drawLine(105,165,145,165);//7
			g.setColor(Color.BLACK);
			break;
			} 
			case 1:
			{
			g.setColor(Color.WHITE);
			g.drawLine(105,165,145,165);//7
			g.drawLine(100,100, 150, 100);//1
			g.drawLine(100,110, 100, 160);//2
			g.drawLine(100,170, 100, 220);//3
			g.drawLine(100,230, 150, 230);//4
		    g.setColor(Color.BLACK);
				
			g.drawLine(150,110,150,160);//5
			g.drawLine(150,170,150,220);//6
             break;			
			}
			case 2:
			{
			
			g.setColor(Color.WHITE);
			g.drawLine(100,110, 100, 160);//2
			g.drawLine(150,170,150,220);//6
			g.setColor(Color.BLACK);
			g.drawLine(100,100, 150, 100);
			g.drawLine(100,170, 100, 220);
			g.drawLine(100,230, 150, 230);
			g.drawLine(150,110,150,160);
			
			g.drawLine(105,165,145,165);
			break;
			}
			case 3:
			{
			g.setColor(Color.WHITE);
			g.drawLine(100,110, 100, 160);
			g.drawLine(100,170, 100, 220);
			g.setColor(Color.BLACK);
			g.drawLine(100,230, 150, 230);
			g.drawLine(150,110,150,160);
			g.drawLine(150,170,150,220);
			g.drawLine(105,165,145,165);
			g.drawLine(100,100, 150, 100);
			break;
			}
			case 4:
			{
			g.setColor(Color.WHITE);	
			g.drawLine(100,100, 150, 100);
			g.drawLine(100,170, 100, 220);
			g.drawLine(100,230, 150, 230);
			g.setColor(Color.BLACK);
			g.drawLine(150,110,150,160);
			g.drawLine(150,170,150,220);
			g.drawLine(105,165,145,165);
			g.drawLine(100,110, 100, 160);
			break;
			}
			
			case 5:
			{
			g.drawLine(100,100, 150, 100);
			g.drawLine(100,110, 100, 160);
	       
			g.drawLine(100,230, 150, 230);
			
			g.drawLine(150,170,150,220);
			g.drawLine(105,165,145,165);
			g.setColor(Color.WHITE);
			g.drawLine(100,170, 100, 220);
			g.drawLine(150,110,150,160);
			g.setColor(Color.BLACK);
			break;
			}
			case 6:
			{
			g.drawLine(100,100, 150, 100);
			g.drawLine(100,110, 100, 160);
	        g.drawLine(100,170, 100, 220);
			g.drawLine(100,230, 150, 230);
			g.drawLine(150,170,150,220);
			g.drawLine(105,165,145,165);
			g.setColor(Color.WHITE);
			g.drawLine(150,110,150,160);
			g.setColor(Color.BLACK);
			break;
			}
			case 7:
			{
			g.setColor(Color.WHITE);
			g.drawLine(100,110, 100, 160);
	        g.drawLine(100,170, 100, 220);
			g.drawLine(100,230, 150, 230);
			g.drawLine(105,165,145,165);
			g.setColor(Color.BLACK);
			g.drawLine(150,110,150,160);
			g.drawLine(150,170,150,220);
			g.drawLine(100,100, 150, 100);
			
			break;
			}
			case 8:
			{
			g.drawLine(100,100, 150, 100);
			g.drawLine(100,110, 100, 160);
	        g.drawLine(100,170, 100, 220);
			g.drawLine(100,230, 150, 230);
			g.drawLine(150,110,150,160);
			g.drawLine(150,170,150,220);
			g.drawLine(105,165,145,165);
			break;
			}
			case 9:
			{
			g.drawLine(100,100, 150, 100);
			g.drawLine(100,110, 100, 160);
	      
			g.drawLine(100,230, 150, 230);
			g.drawLine(150,110,150,160);
			g.drawLine(150,170,150,220);
			g.drawLine(105,165,145,165);
			g.setColor(Color.WHITE);
			g.drawLine(100,170, 100, 220);
			g.setColor(Color.BLACK);
			break;
			}
			
			
		}
		int h2 = (int)s[12]-48;
		
		switch(h2)
		{
			case 0:
			{
			g.drawLine(170,100, 220, 100);//1
			g.drawLine(170,110, 170, 160);//2
			g.drawLine(170,170, 170, 220);//3
			g.drawLine(170,230, 220, 230);//4
			g.drawLine(220,110,220,160);//5
			g.drawLine(220,170,220,220);//6
			g.setColor(Color.WHITE);
			g.drawLine(175,165,215,165);//7
			g.setColor(Color.BLACK);
			break;
			} 
			case 1:
			{
			
			g.drawLine(220,110,220,160);//5
			g.drawLine(220,170,220,220);//6
			g.setColor(Color.WHITE);
			g.drawLine(170,100, 220, 100);//1
			g.drawLine(170,110, 170, 160);//2
			g.drawLine(170,170, 170, 220);//3
			g.drawLine(170,230, 220, 230);//4
			g.drawLine(175,165,215,165);//7
			g.setColor(Color.BLACK);
             break;			
			}
			case 2:
			{
		    g.setColor(Color.WHITE);
			g.drawLine(170,110, 170, 160);//2
			g.drawLine(220,170,220,220);//6
			g.setColor(Color.BLACK);
			g.drawLine(220,110,220,160);//5
			g.drawLine(170,100, 220, 100);//1
			
			g.drawLine(170,170, 170, 220);//3
			g.drawLine(170,230, 220, 230);//4
			g.drawLine(175,165,215,165);//7
			
			break;
			}
			case 3:
			{
			g.setColor(Color.WHITE);
			g.drawLine(170,110, 170, 160);//2
			g.drawLine(170,170, 170, 220);//3
			g.setColor(Color.BLACK);
			g.drawLine(170,100, 220, 100);//1
			g.drawLine(170,230, 220, 230);//4
			g.drawLine(220,110,220,160);//5
			g.drawLine(220,170,220,220);//6
			g.drawLine(175,165,215,165);//7
			break;
			}
			case 4:
			{
				g.setColor(Color.WHITE);
			g.drawLine(170,100, 220, 100);//1
			
			g.drawLine(170,170, 170, 220);//3
			g.drawLine(170,230, 220, 230);//4
			g.setColor(Color.BLACK);
			g.drawLine(220,110,220,160);//5
			g.drawLine(220,170,220,220);//6
			g.drawLine(175,165,215,165);//7
			g.drawLine(170,110, 170, 160);//2
			break;
			}
			
			case 5:
			{
		    g.drawLine(170,100, 220, 100);//1
			g.drawLine(170,110, 170, 160);//2
			g.drawLine(170,230, 220, 230);//4
			g.drawLine(220,170,220,220);//6
			g.drawLine(175,165,215,165);//7
			g.setColor(Color.WHITE);
			g.drawLine(170,170, 170, 220);//3
			g.drawLine(220,110,220,160);//5
			g.setColor(Color.BLACK);
			break;
			}
			case 6:
			{
			g.drawLine(170,100, 220, 100);//1
			g.drawLine(170,110, 170, 160);//2
			g.drawLine(170,170, 170, 220);//3
			g.drawLine(170,230, 220, 230);//4
			g.drawLine(220,170,220,220);//6
			g.drawLine(175,165,215,165);//7
			g.setColor(Color.WHITE);
			g.drawLine(220,110,220,160);//5
			g.setColor(Color.BLACK);
			break;
			}
			case 7:
			{
			g.setColor(Color.WHITE);
			 g.drawLine(170,110, 170, 160);//2
			g.drawLine(170,170, 170, 220);//3
			g.drawLine(175,165,215,165);//7
			g.drawLine(170,230, 220, 230);//4
			g.setColor(Color.BLACK);
			g.drawLine(220,110,220,160);//5
			g.drawLine(220,170,220,220);//6
			 g.drawLine(170,100, 220, 100);//1
			
			break;
			}
			case 8:
			{
			g.drawLine(170,100, 220, 100);//1
			g.drawLine(170,110, 170, 160);//2
			g.drawLine(170,170, 170, 220);//3
			g.drawLine(170,230, 220, 230);//4
			g.drawLine(220,110,220,160);//5
			g.drawLine(220,170,220,220);//6
			g.drawLine(175,165,215,165);//7
			break;
			}
			case 9:
			{
			g.drawLine(170,100, 220, 100);//1
			g.drawLine(170,110, 170, 160);//2
		
			g.drawLine(170,230, 220, 230);//4
			g.drawLine(220,110,220,160);//5
			g.drawLine(220,170,220,220);//6
			g.drawLine(175,165,215,165);//7
			g.setColor(Color.WHITE);
			g.drawLine(170,170, 170, 220);//3
			g.setColor(Color.BLACK);
			break;
			}
			
			
		}
		
		
		g.drawLine(260,130,260,140);
		g.drawLine(260,190,260,200);////FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF
		
		int m1 = (int)s[14]-48;
		switch(m1)
		{
			case 0:
			{
			g.drawLine(300,100, 350, 100);//1
			g.drawLine(300,110, 300, 160);//2
			g.drawLine(300,170, 300, 220);//3
			g.drawLine(300,230, 350, 230);//4
			g.drawLine(350,110,350,160);//5
			g.drawLine(350,170,350,220);//6
			g.setColor(Color.WHITE);
			g.drawLine(305,165,345,165);//7
			g.setColor(Color.BLACK);
			break;
			} 
			case 1:
			{
			
			g.drawLine(350,110,350,160);//5
			g.drawLine(350,170,350,220);//6
			g.setColor(Color.WHITE);
			g.drawLine(300,100, 350, 100);//1
			g.drawLine(300,110, 300, 160);//2
			g.drawLine(300,170, 300, 220);//3
			g.drawLine(300,230, 350, 230);//4
			g.drawLine(305,165,345,165);//7
			g.setColor(Color.BLACK);
             break;			
			}
			case 2:
			{
			g.drawLine(300,100, 350, 100);//1
			
			g.drawLine(300,170, 300, 220);//3
			g.drawLine(300,230, 350, 230);//4
			g.drawLine(350,110,350,160);//5
			g.drawLine(305,165,345,165);//7
			g.setColor(Color.WHITE);
			g.drawLine(350,170,350,220);//6
			g.drawLine(300,110, 300, 160);//2
			g.setColor(Color.BLACK);
			
			
			break;
			}
			case 3:
			{
			g.setColor(Color.WHITE);
			g.drawLine(300,110, 300, 160);//2
			g.drawLine(300,170, 300, 220);//3
			g.setColor(Color.BLACK);
			g.drawLine(300,230, 350, 230);//4
			g.drawLine(350,110,350,160);//5
			g.drawLine(350,170,350,220);//6
			g.drawLine(305,165,345,165);//7
			g.drawLine(300,100, 350, 100);//1
			break;
			}
			case 4:
			{
			g.setColor(Color.WHITE);
			g.drawLine(300,100, 350, 100);//1
			g.drawLine(300,170, 300, 220);//3
			g.drawLine(300,230, 350, 230);//4
			g.setColor(Color.BLACK);
			g.drawLine(350,110,350,160);//5
			g.drawLine(350,170,350,220);//6
			g.drawLine(305,165,345,165);//7
			g.drawLine(300,110, 300, 160);//2
			break;
			}
			
			case 5:
			{
			g.drawLine(300,100, 350, 100);//1
			g.drawLine(300,110, 300, 160);//2
			g.drawLine(350,170,350,220);//6
			g.drawLine(305,165,345,165);//7
			g.drawLine(300,230, 350, 230);//4
			g.setColor(Color.WHITE);
			g.drawLine(350,110,350,160);//5
			g.drawLine(300,170, 300, 220);//3
			g.setColor(Color.BLACK);
			
			break;
			}
			case 6:
			{
			g.drawLine(300,100, 350, 100);//1
			g.drawLine(300,110, 300, 160);//2
			g.drawLine(300,170, 300, 220);//3
			g.drawLine(300,230, 350, 230);//4
			
			g.drawLine(350,170,350,220);//6
			g.drawLine(305,165,345,165);//7
			g.setColor(Color.WHITE);
			g.drawLine(350,110,350,160);//5
			g.setColor(Color.BLACK);
			break;
			}
			case 7:
			{
				g.setColor(Color.WHITE);
			g.drawLine(305,165,345,165);//7
			g.drawLine(300,110, 300, 160);//2
			g.drawLine(300,170, 300, 220);//3
			g.drawLine(300,230, 350, 230);//4
			g.setColor(Color.BLACK);
			g.drawLine(350,110,350,160);//5
			g.drawLine(350,170,350,220);//6
			g.drawLine(300,100, 350, 100);//1
			
			break;
			}
			case 8:
			{
			g.drawLine(300,100, 350, 100);//1
			g.drawLine(300,110, 300, 160);//2
			g.drawLine(300,170, 300, 220);//3
			g.drawLine(300,230, 350, 230);//4
			g.drawLine(350,110,350,160);//5
			g.drawLine(350,170,350,220);//6
			g.drawLine(305,165,345,165);//7
			break;
			}
			case 9:
			{
			g.drawLine(300,100, 350, 100);//1
			g.drawLine(300,110, 300, 160);//2
			
			g.drawLine(300,230, 350, 230);//4
			g.drawLine(350,110,350,160);//5
			g.drawLine(350,170,350,220);//6
			g.drawLine(305,165,345,165);//7
			g.setColor(Color.WHITE);
			g.drawLine(300,170, 300, 220);//3
			g.setColor(Color.BLACK);
			break;
			}
		}
		
		int m2 = (int)s[15]-48;
		switch(m2)
		{
			case 0:
			{
			g.drawLine(370,100, 420, 100);//1
			g.drawLine(370,110, 370, 160);//2
			g.drawLine(370,170, 370, 220);//3
			g.drawLine(370,230, 420, 230);//4
			g.drawLine(420,110,420,160);//5
			g.drawLine(420,170,420,220);//6
			g.setColor(Color.WHITE);
			g.drawLine(375,165,415,165);//7
			g.setColor(Color.BLACK);
			
			break;
			} 
			case 1:
			{
			g.setColor(Color.WHITE);
			g.drawLine(370,100, 420, 100);//1
			g.drawLine(370,110, 370, 160);//2
			g.drawLine(370,170, 370, 220);//3
			g.drawLine(370,230, 420, 230);//4
			g.drawLine(375,165,415,165);//7
			g.setColor(Color.BLACK);
			g.drawLine(420,110,420,160);//5
			g.drawLine(420,170,420,220);//6
			
             break;			
			}
			case 2:
			{
			g.drawLine(370,100, 420, 100);//1
			g.drawLine(375,165,415,165);//7
			g.drawLine(370,170, 370, 220);//3
			g.drawLine(370,230, 420, 230);//4
			g.drawLine(420,110,420,160);//5
			g.setColor(Color.WHITE);
			g.drawLine(420,170,420,220);//6
			g.drawLine(370,110, 370, 160);//2
			g.setColor(Color.BLACK);
			
			break;
			}
			case 3:
			{
			g.setColor(Color.WHITE);
			g.drawLine(370,110, 370, 160);//2
			g.drawLine(370,170, 370, 220);//3
			g.setColor(Color.BLACK);
			g.drawLine(370,100, 420, 100);//1
			g.drawLine(370,230, 420, 230);//4
			g.drawLine(420,110,420,160);//5
			g.drawLine(420,170,420,220);//6
			g.drawLine(375,165,415,165);//7
			break;
			}
			case 4:
			{
			g.setColor(Color.WHITE);
			g.drawLine(370,100, 420, 100);//1
			g.drawLine(370,170, 370, 220);//3
			g.drawLine(370,230, 420, 230);//4
			g.setColor(Color.BLACK);
			g.drawLine(370,110, 370, 160);//2
			g.drawLine(420,110,420,160);//5
			g.drawLine(420,170,420,220);//6
			g.drawLine(375,165,415,165);//7
			break;
			}
			
			case 5:
			{
		    g.drawLine(370,100, 420, 100);//1
			g.drawLine(370,110, 370, 160);//2
			g.drawLine(370,230, 420, 230);//4
			g.drawLine(420,170,420,220);//6
			g.drawLine(375,165,415,165);//7
			g.setColor(Color.WHITE);
			g.drawLine(370,170, 370, 220);//3
			g.drawLine(420,110,420,160);//5
			g.setColor(Color.BLACK);
			break;
			}
			case 6:
			{
			g.drawLine(370,100, 420, 100);//1
			g.drawLine(370,110, 370, 160);//2
			g.drawLine(370,170, 370, 220);//3
			g.drawLine(370,230, 420, 230);//4
			
			g.drawLine(420,170,420,220);//6
			g.drawLine(375,165,415,165);//7
			g.setColor(Color.WHITE);
			g.drawLine(420,110,420,160);//5
			g.setColor(Color.BLACK);
			break;
			}
			case 7:
			{
		    g.setColor(Color.WHITE);
			g.drawLine(370,110, 370, 160);//2
			g.drawLine(370,170, 370, 220);//3
			g.drawLine(370,230, 420, 230);//4
			g.drawLine(375,165,415,165);//7
			g.setColor(Color.BLACK);
			g.drawLine(420,110,420,160);//5
			g.drawLine(420,170,420,220);//6
			g.drawLine(370,100, 420, 100);//1
			
			break;
			}
			case 8:
			{
			g.drawLine(370,100, 420, 100);//1
			g.drawLine(370,110, 370, 160);//2
			g.drawLine(370,170, 370, 220);//3
			g.drawLine(370,230, 420, 230);//4
			g.drawLine(420,110,420,160);//5
			g.drawLine(420,170,420,220);//6
			g.drawLine(375,165,415,165);//7
			break;
			}
			case 9:
			{
			g.drawLine(370,100, 420, 100);//1
			g.drawLine(370,110, 370, 160);//2
			
			g.drawLine(370,230, 420, 230);//4
			g.drawLine(420,110,420,160);//5
			g.drawLine(420,170,420,220);//6
			g.drawLine(375,165,415,165);//7
			g.setColor(Color.WHITE);
			g.drawLine(370,170, 370, 220);//3
			g.setColor(Color.BLACK);
			break;
			}
		}
		
			
		    g.drawLine(460,130,460,140);
	     	g.drawLine(460,190,460,200);////FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF
		
		int s1 = (int)s[17]-48;
		switch(s1)
		{
			case 0:
			{
			g.drawLine(500,100, 550, 100);//1
			g.drawLine(500,110, 500, 160);//2
			g.drawLine(500,170, 500, 220);//3
			g.drawLine(500,230, 550, 230);//4
			g.drawLine(550,110,550,160);//5
			g.drawLine(550,170,550,220);//6
			g.setColor(Color.WHITE);
			g.drawLine(505,165,545,165);//7
			g.setColor(Color.BLACK);
			break;
			} 
			case 1:
			{
			
			g.drawLine(550,110,550,160);//5
			g.drawLine(550,170,550,220);//6
			g.setColor(Color.WHITE);
			g.drawLine(500,100, 550, 100);//1
			g.drawLine(500,110, 500, 160);//2
			g.drawLine(500,170, 500, 220);//3
			g.drawLine(500,230, 550, 230);//4
			g.drawLine(505,165,545,165);//7
			g.setColor(Color.BLACK);
             break;			
			}
			case 2:
			{
			g.drawLine(500,100, 550, 100);//1
			
			g.drawLine(500,170, 500, 220);//3
			g.drawLine(500,230, 550, 230);//4
			g.drawLine(550,110,550,160);//5
			g.drawLine(505,165,545,165);//7
			g.setColor(Color.WHITE);
			g.drawLine(550,170,550,220);//6
			g.drawLine(500,110, 500, 160);//2
			g.setColor(Color.BLACK);
			
			
			break;
			}
			case 3:
			{
			g.setColor(Color.WHITE);
			g.drawLine(500,110, 500, 160);//2
			g.drawLine(500,170, 500, 220);//3
			g.setColor(Color.BLACK);
			g.drawLine(500,230, 550, 230);//4
			g.drawLine(550,110,550,160);//5
			g.drawLine(550,170,550,220);//6
			g.drawLine(505,165,545,165);//7
			g.drawLine(500,100, 550, 100);//1
			break;
			}
			case 4:
			{
			g.setColor(Color.WHITE);
			g.drawLine(500,100, 550, 100);//1
			g.drawLine(500,170, 500, 220);//3
			g.drawLine(500,230, 550, 230);//4
			g.setColor(Color.BLACK);
			g.drawLine(550,110,550,160);//5
			g.drawLine(550,170,550,220);//6
			g.drawLine(505,165,545,165);//7
			g.drawLine(500,110, 500, 160);//2
			break;
			}
			
			case 5:
			{
			g.drawLine(500,100, 550, 100);//1
			g.drawLine(500,110, 500, 160);//2
			g.drawLine(550,170,550,220);//6
			g.drawLine(505,165,545,165);//7
			g.drawLine(500,230, 550, 230);//4
			g.setColor(Color.WHITE);
			g.drawLine(550,110,550,160);//5
			g.drawLine(500,170, 500, 220);//3
			g.setColor(Color.BLACK);
			
			break;
			}
			case 6:
			{
			g.drawLine(500,100, 550, 100);//1
			g.drawLine(500,110, 500, 160);//2
			g.drawLine(500,170, 500, 220);//3
			g.drawLine(500,230, 550, 230);//4
			
			g.drawLine(550,170,550,220);//6
			g.drawLine(505,165,545,165);//7
			g.setColor(Color.WHITE);
			g.drawLine(550,110,550,160);//5
			g.setColor(Color.BLACK);
			break;
			}
			case 7:
			{
				g.setColor(Color.WHITE);
			g.drawLine(505,165,545,165);//7
			g.drawLine(500,110, 500, 160);//2
			g.drawLine(500,170, 500, 220);//3
			g.drawLine(500,230, 550, 230);//4
			g.setColor(Color.BLACK);
			g.drawLine(550,110,550,160);//5
			g.drawLine(550,170,550,220);//6
			g.drawLine(500,100, 550, 100);//1
			
			break;
			}
			case 8:
			{
			g.drawLine(300,100, 350, 100);//1
			g.drawLine(300,110, 300, 160);//2
			g.drawLine(300,170, 300, 220);//3
			g.drawLine(300,230, 350, 230);//4
			g.drawLine(350,110,350,160);//5
			g.drawLine(350,170,350,220);//6
			g.drawLine(305,165,345,165);//7
			break;
			}
			case 9:
			{
			g.drawLine(500,100, 550, 100);//1
			g.drawLine(500,110, 500, 160);//2
			
			g.drawLine(500,230, 550, 230);//4
			g.drawLine(550,110,550,160);//5
			g.drawLine(550,170,550,220);//6
			g.drawLine(505,165,545,165);//7
			g.setColor(Color.WHITE);
			g.drawLine(500,170, 500, 220);//3
			g.setColor(Color.BLACK);
			break;
			}
			
		}
		
		int s2 = (int)s[18]-48;
		
		switch(s2)
		{
			
			case 0:
			{
			g.drawLine(570,100, 620, 100);//1
			g.drawLine(570,110, 570, 160);//2
			g.drawLine(570,170, 570, 220);//3
			g.drawLine(570,230, 620, 230);//4
			g.drawLine(620,110,620,160);//5
			g.drawLine(620,170,620,220);//6
			g.setColor(Color.WHITE);
			g.drawLine(575,165,615,165);//7
			g.setColor(Color.BLACK);
			
			break;
			} 
			case 1:
			{
			g.setColor(Color.WHITE);
			g.drawLine(570,100, 620, 100);//1
			g.drawLine(570,110, 570, 160);//2
			g.drawLine(570,170, 570, 220);//3
			g.drawLine(570,230, 620, 230);//4
			g.drawLine(575,165,615,165);//7
			g.setColor(Color.BLACK);
			g.drawLine(620,110,620,160);//5
			g.drawLine(620,170,620,220);//6
			
             break;			
			}
			case 2:
			{
			g.drawLine(570,100, 620, 100);//1
			g.drawLine(575,165,615,165);//7
			g.drawLine(570,170, 570, 220);//3
			g.drawLine(570,230, 620, 230);//4
			g.drawLine(620,110,620,160);//5
			g.setColor(Color.WHITE);
			g.drawLine(620,170,620,220);//6
			g.drawLine(570,110, 570, 160);//2
			g.setColor(Color.BLACK);
			
			break;
			}
			case 3:
			{
			g.setColor(Color.WHITE);
			g.drawLine(570,110, 570, 160);//2
			g.drawLine(570,170, 570, 220);//3
			g.setColor(Color.BLACK);
			g.drawLine(570,100, 620, 100);//1
			g.drawLine(570,230, 620, 230);//4
			g.drawLine(620,110,620,160);//5
			g.drawLine(620,170,620,220);//6
			g.drawLine(575,165,615,165);//7
			break;
			}
			case 4:
			{
			g.setColor(Color.WHITE);
			g.drawLine(570,100, 620, 100);//1
			g.drawLine(570,170, 670, 220);//3
			g.drawLine(570,230, 620, 230);//4
			g.setColor(Color.BLACK);
			g.drawLine(570,110, 570, 160);//2
			g.drawLine(620,110,620,160);//5
			g.drawLine(620,170,620,220);//6
			g.drawLine(575,165,615,165);//7
			break;
			}
			
			case 5:
			{
		    g.drawLine(570,100, 620, 100);//1
			g.drawLine(570,110, 570, 160);//2
			g.drawLine(570,230, 620, 230);//4
			g.drawLine(620,170,620,220);//6
			g.drawLine(575,165,615,165);//7
			g.setColor(Color.WHITE);
			g.drawLine(570,170, 670, 220);//3
			g.drawLine(620,110,620,160);//5
			g.setColor(Color.BLACK);
			break;
			}
			case 6:
			{
			g.drawLine(570,100, 620, 100);//1
			g.drawLine(570,110, 570, 160);//2
			g.drawLine(570,170, 570, 220);//3
			g.drawLine(570,230, 620, 230);//4
			
			g.drawLine(620,170,620,220);//6
			g.drawLine(575,165,615,165);//7
			g.setColor(Color.WHITE);
			g.drawLine(620,110,620,160);//5
			g.setColor(Color.BLACK);
			break;
			}
			case 7:
			{
		    g.setColor(Color.WHITE);
			g.drawLine(570,110, 570, 160);//2
			g.drawLine(570,170, 570, 220);//3
			g.drawLine(570,230, 620, 230);//4
			g.drawLine(575,165,615,165);//7
			g.setColor(Color.BLACK);
			g.drawLine(620,110,620,160);//5
			g.drawLine(620,170,620,220);//6
			g.drawLine(570,100, 620, 100);//1
			
			break;
			}
			case 8:
			{
			g.drawLine(570,100, 620, 100);//1
			g.drawLine(570,110, 570, 160);//2
			g.drawLine(570,170, 570, 220);//3
			g.drawLine(570,230, 620, 230);//4
			g.drawLine(620,110,620,160);//5
			g.drawLine(620,170,620,220);//6
			g.drawLine(575,165,615,165);//7
			break;
			}
			case 9:
			{
			g.drawLine(570,100, 620, 100);//1
			g.drawLine(570,110, 570, 160);//2
			
			g.drawLine(570,230, 620, 230);//4
			g.drawLine(620,110,620,160);//5
			g.drawLine(620,170,620,220);//6
			g.drawLine(575,165,615,165);//7
			g.setColor(Color.WHITE);
			g.drawLine(570,170, 570, 220);//3
			g.setColor(Color.BLACK);
			break;
			}
		}

		Thread t = new Thread();
		
		try
		{
		t.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Error Occured");
		}
		Dimension d = new Dimension();
		
		
		}
	  
	}
	
	
}