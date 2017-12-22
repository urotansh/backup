
public class main12 {
	public static double calcTriangleArea(double bottom,double height){
		return (bottom*height)/2;
	}
	public static double calcCircleArea(double radius){
		return radius*radius*3.14;
	}
	public static void main(String[] args){
		double menseki=calcTriangleArea(10.0,5.0);
		System.out.println("三角形の底辺の長さが10.0、高さが5,0の場合、面積は"
		+menseki);
		double enmenseki=calcCircleArea(5.0);
		System.out.println("円の半径が5.0の場合、面積は"+enmenseki+"cm");
	}

}
