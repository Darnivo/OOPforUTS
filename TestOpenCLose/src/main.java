public class main {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();
        
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(7);

        System.out.println("Rectangle area: " + calculator.calculateArea(rectangle));
        System.out.println("Circle area: " + calculator.calculateArea(circle));
    }
}