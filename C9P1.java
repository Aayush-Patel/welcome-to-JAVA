package Chapter9;

public class C9P1 {

	public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);

        Rectangle r2 = new Rectangle(3.5, 35.9);

        System.out.println("The width, height, area, and perimeter of rectangle one are "
                + r1.width + " , " + r1.height + " , " + r1.getArea() + " , " + r1.getPerimeter());


        System.out.println("The width, height, area, and perimeter of rectangle two are "
                + r2.width + " , " + r2.height + " , " + r2.getArea() + " , " + r2.getPerimeter());
    }

	

}
