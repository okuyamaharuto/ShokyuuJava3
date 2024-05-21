
public class RectIf extends MyFrame {
	public void run() {
		int x=20;
		int y =0;
	    setColor(0,128,0);
		int i;
		for(i=0 ; i<10 ; i++) {
			fillRect(y,y,x,x);
			y=y+x;
			x*=1.4;
			}

		}
	}

