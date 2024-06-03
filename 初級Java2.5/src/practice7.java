import java.util.Vector;

public class practice7 extends MyFrame{
public void run() {
	Vector<Car> cars=new Vector<Car>();
	cars.add(new Car(50,70,1,0));
	cars.add(new Car(50,130,2,0));
	cars.add(new Car(50,200,3,0));
	cars.add(new Car(50,270,4,0));
	cars.add(new Car(50,340,5,0));
	for(int i = 0; i<20; i++) {
		clear();
		for(int j=0; j<cars.size(); j++) {
			cars.get(j).draw(this);
			cars.get(j).move();
		}
		sleep(0.1);
	}
}
}
