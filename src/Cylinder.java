public class Cylinder extends Circle {
    private double height =2.0;

    public Cylinder(){
    }

    public Cylinder(double height,double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public double getAreaCylinder(){
        return Math.PI*this.height*super.getRadius();
    }

    @Override
    public String toString(){
        return "A Cylinder have"
                +" "
                +"radius = "
                +" "
                +super.getRadius()
                +" "
                +"and"
                +" "
                +"color"
                +" "
                +super.getColor()
                +" "
                +"and"
                +" "
                +"height = "
                +this.height
                +","
                +"have Area = "
                +getAreaCylinder();

    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(15,10,"black");
        System.out.println(cylinder);
    }


}
