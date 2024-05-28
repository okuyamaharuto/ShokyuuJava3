
public class Car {
	int x,y,vx,vy;
	public Car(int x,int y,int vx) {
		this.x = x;
		this.y = y;
		this.vx = vx;
	}
	public void draw(MyFrame frame) {
		frame.fillOval(x,y,20,20);
		frame.fillOval(x+40,y,20,20);
		frame.fillRect(x-5,y-17,70,20);
		frame.fillRect(x+13,y-35,35,30);
	}
	public void move() {
		x+=vx;
	}
}
