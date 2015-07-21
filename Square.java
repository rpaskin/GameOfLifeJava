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
}