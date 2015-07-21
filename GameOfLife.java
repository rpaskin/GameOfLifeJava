import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;
		
class GameOfLife implements ActionListener
{		
	JFrame frame = new JFrame("Porta100");
	JButton botao1 = new JButton("cavar as gerações");

	public static void main(String [] args)
	{								
		GameOfLife gui = new GameOfLife();
		gui.go();					
	}											
	public void go(){			
		Board board = new Board();

		Square square1 = new Square();
		Square square2 = new Square();					
		Square square3 = new Square();

		square1.setXY(0, 0);
		square1.setAlive(true);	

		square2.setXY(1, 0);
		square2.setAlive(true);	

		square3.setXY(2, 0);
		square3.setAlive(true);								

		MyDrawPanel drawPanel = new MyDrawPanel();
		frame.setSize(1920,1080);
		frame.setVisible(true);
		frame.getContentPane().add(BorderLayout.SOUTH,botao1);
		frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}			
	public 	void actionPerformed(ActionEvent e)
	{		
		frame.repaint();		
	}	

	class MyDrawPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{	
					

			g.fillRect(50,50,100,100);
			g.setColor(Color.YELLOW);
			g.fillRect(160,50,100,100);
			g.setColor(Color.YELLOW);

			g.fillRect(50,160,100,100);
			g.setColor(Color.YELLOW);
			g.fillRect(160,160,100,100);
			g.setColor(Color.YELLOW);

			g.fillRect(260,260,100,100);
			g.setColor(Color.YELLOW);
			g.fillRect(370,260,100,100);
			g.setColor(Color.YELLOW);

			g.fillRect(260,370,100,100);
			g.setColor(Color.YELLOW);
			g.fillRect(370,370,100,100);
			g.setColor(Color.YELLOW);
	
		}
	}
}
