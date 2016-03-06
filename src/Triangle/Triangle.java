package Triangle;

/** Main Class */
public class Triangle extends GeometricObject {
	
	/** No-Arg Constrictor
	 * Test an Instance: Default Trianlge */

	public static void main(String[] args) {
		// Test Instance
		Triangle myTriangle = new Triangle(3.0,4.0,5.0);
        
        System.out.println("The Area Is:"   + myTriangle.getArea());
		System.out.println("The Perimeter Is:" + myTriangle.getPerimeter());
		System.out.println("The Side Lengths are: " + myTriangle.toString());
		}
	

	/** Encapsulated Private Attributes */
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	
	public Triangle(){ 	
	}
	
	/** Constructor: Get Triangle
	 * Parameters are the 3 sides */
	
	public Triangle(double side1, double side2, double side3){ 
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	/**accessors: Get Side1 */
	public double getSide1(){
		return side1;
	}
	
	/** accessors: Set Side 1 */
	public void setSide1(double side1) {
		this.side1 = side1;
	}

	/** accessors: Get Side 2 */
	public double getSide2(){
		return side2;
	}
	
	/** accessors: Set Side 2 */
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	
	/** accessors: Get Side 3 */
	public double getSide3(){
		return side3;
	}
	
	/** accessors: Set Side 3 */
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	/** Method Gets Perimeter by using formula */
	public double getPerimeter(){
		
		return (side1 + side2 + side3);
	}
	
	/** Method: Gets Area by using formula calling getPerimeter */
	public double getArea() {
	    double hP = getPerimeter() / 2;
	    return (Math.sqrt(hP * ((hP - side1) * (hP - side2) * (hP - side3))));
	}
	
	/** Method: Tells us what the side lengths are */
	public String toString() {
		return ('\n'+ "Triangle Side 1 =  " + side1 + '\n' + "Triangle Side 2 =  " + side2 + '\n'+ "Triangle Side 3 =  " + side3); 
	}
/** End Main Class */	
}

