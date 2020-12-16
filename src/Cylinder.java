public class Cylinder extends Circle{
    int height = 10;

    // Method
    public Double volume() {
        Double volume = this.area() * this.height;
        return volume;
    }

    @Override
    public String toString() {
        return "This is the Circle: Radius: " + this.getRadius() + "; Color: " + this.getColor() + "; Height: " + this. height;
    }
}
