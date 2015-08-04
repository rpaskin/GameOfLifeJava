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
			g.fillRect(square.getX()*151,square.getY()*151,150,150);
			g.setColor(Color.BLACK);
		}
	}

	boolean hasSquare(int x,int y){
		for(Square square : squares){
			if(square.alive() && square.getX() == x && square.getY() == y){
				return true;
			}
		}
		return false;
	}
}