import java.util.*;
import java.awt.*;
class Board
{
	ArrayList<Square> squares = new ArrayList<Square>();

	public void addSquare(Square square)
	{
		squares.add(square);
	}
	void drawBoard(Graphics g){
		for(Square square : squares)
		{
			g.fillRect(square.getX()*150,square.getY()*150,150,150);
			g.setColor(Color.BLACK);
		}
	}
}