package abstractfactory.example.shapes;

public class RoundedRectangle implements Shape {
    @Override
    public void Draw() {
        System.out.println("Drawing rounded rectangle");
    }
}
