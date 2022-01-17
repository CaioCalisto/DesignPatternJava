package abstractfactory.example.shapes;

public class RoundedSquare implements Shape{
    @Override
    public void Draw() {
        System.out.println("Drawing rounded square");
    }
}
