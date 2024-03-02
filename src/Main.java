public class Main {
    public static void main(String[] args) {

        Triangle t = new Triangle(10,15);
        System.out.println("the height of "+t.getType()+" is: "+t.getHeight()
        +"\nthe base of "+t.getType()+ " is: "+t.getBase());
        display(t);
        System.out.println("---------------------------");
        Rectangle r = new Rectangle(12,5);
        System.out.println("the height of "+r.getType()+" is: "+r.getHeight()
        +"\nthe width of "+r.getType()+ " is: "+r.getWidth());
        display(r);
        System.out.println("---------------------------");
        Circle c = new Circle(9);
        System.out.println("the radius of "+c.getType()+" is: "+c.getRadius());
        display(c);


    }
    public static void display(Shape s){
        System.out.println("area of "+s.getType()+ " is: "+ s.calculateArea());
        System.out.printf("circumference of "+s.getType()+" is: "+"%.2f",s.calculateCircumference());
        System.out.println();
    }
}