public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20, 5);
        Rectangle square = new Square(10);
        System.out.println("Rectangle: ");
        rectangle.area();
        rectangle.perimeter();
        System.out.println();
        System.out.println("Square: ");
        square.area();
        square.perimeter();
    }
}