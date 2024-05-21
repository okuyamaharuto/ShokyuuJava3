
public class RectIf extends MyFrame {
	public void run() {
		int x=20;
		int y = 120;
	    setColor(0,128,0);
		int i;
		for(i=0 ; i<10 ; i++) {
			fillRect(x,50,10,y);
			fillRect(x,300-x,10,x);
			x+=20;
			y-=10;
			}

		}
	}

