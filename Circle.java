public class Circle {

    private double radius;

    public Circle(double radius){
        this.radius =radius;
    }

    public double getRadius(){
        return radius;
    }

    public double area(){
        double area;
        area = Math.PI  * (radius * radius);
        return area;
    }

    public double perimeter(){
        double perimeter;
        perimeter = Math.PI * 2 * radius;
        return perimeter;

    }





}
