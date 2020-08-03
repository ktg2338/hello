package ClassEx;

public class Pointtest {
	public static void main(String[] args) {
		Point p1 = new Point(0,0);
		Point p2 = new Point(3,4);
		
		double dis = Point.distance(p1, p2);
		System.out.printf("�� �� A%s, B%s ������ �Ÿ� : %.2f",p1.toStr(), p2.toStr(), dis);
	}
}

class Point{
	int x;
	int y;
	Point(int _x, int _y){
		x=_x;
		y=_y;
	}
	String toStr() {
		return String.format("(%d, %d)", x,y);
	}
	static double distance(Point p, Point q) {
		double dX = p.x-q.x;
		double dY = p.y-q.y;
		return Math.sqrt((dX*dX)+(dY*dY));
	}
}