class Square{
	private int x;
	private int y;
	private boolean alive;

	void setXY(int a, int b){
		x = a;
		y = b;
	}

	int getX(){
		return this.x;
	}

	int getY(){
		return this.y;
	}

	void setAlive(boolean aliveOrDead){
		alive = aliveOrDead;
	}

	boolean alive(){
		return alive;
	}
	int nearSquares(Board board){
		int countNears = 0;

		for(int i = x-1; i <= x + 1; i++){
			for(int j = y-1; j <= y +1; j++){
				if(board.hasSquare(i,j)){
					countNears++;
				}
			}
		}
		return countNears-1;

		// if(board.hasSquare(x-1, y) || board.hasSquare(x, y-1) || board.hasSquare(x-1, y-1) || board.hasSquare(x+1, y) || board.hasSquare(x, y+1) || board.hasSquare(x+1, y+1) || board.hasSquare(x+1, y-1) || board.hasSquare(x-1, y+1))
	}
}