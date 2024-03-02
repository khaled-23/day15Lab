public class Triangle extends Shape{
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return (height*base)/2;
    }

    @Override
    public double calculateCircumference() {
        double hypotenuse = Math.sqrt(height*height+base*base);
        return hypotenuse+height+base;
    }

    @Override
    public String getType() {
        return "Triangle";
    }
}
