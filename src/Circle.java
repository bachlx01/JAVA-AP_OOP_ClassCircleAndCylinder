public class Circle {
    private int radius = 10;
    private String color = "green";

    // Getter
    public int getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // Setter
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Method
    public Double area() {
        Double area = this.radius * this.radius * Math.PI;
        return area;
    }

    public Double perimeter() {
        Double perimeter = this.radius * 2 * Math.PI;
        return perimeter;
    }

    @Override
    public String toString() {
        return "This is the Circle: Radius: " + this.radius + "; Color: " + this.color;
    }
}
