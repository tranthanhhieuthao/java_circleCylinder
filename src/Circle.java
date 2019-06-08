public class Circle {
    private double radius = 2.0;
    private String color = "blue";

    public Circle(){
    }

    public Circle(double radius,String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return this.radius;
    }

    public String getColor(){
        return this.color;
    }

    public void setRadius(double radius){
        this.radius =radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString(){
        return "A Circle have"
                +" "
                +"radius = "
                +" "
                +radius
                +" "
                +"and"
                +" "
                +"color"
                +" "
                +color
                +" "
                +","
                +"have Area = "
                +" "
                +getArea()
                +" "
                +" have perimeter = "
                +" "
                +perimeter();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(15,"yellow");
        System.out.println(circle);
    }
}
