package circle;

/**
 * @author Karan Nahar
 *
 */

// TODO Complete the code

public class Circle extends GraphicObject {

    // No use of encapsulation
    public double centerX, centerY; // Center coordinates
    public double radius; // Radius of the circle
    public int windowNumber; // Associated window number

    /**
     *
     */
    public Circle() {
        this.centerX = 0;
        this.centerY = 0;
        this.radius = 1;
    }

    // Overloaded constructor
    public Circle(double centerX, double centerY, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    // Overridden method from GraphicObject
    @Override
    void draw() {
        System.out.println("Drawing a Circle...");
    }

    // Overloaded method in Circle
    // Not overridden as it does follow the signature in GraphicObject
    public void draw(int color) {
        System.out.println("Drawing a Circle in color: " + color + "...");
    }

    public double circumference() {
        return 2.0 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public boolean overlaps(Circle other) {
        return ((centerX - other.centerX) * (centerX - other.centerX)
                + (centerY - other.centerY) * (centerY - other.centerY)) < ((radius + other.radius)
                        * (radius + other.radius));
    }

    @Override
    void moveTo(int newX, int newY) {
        this.centerX = newX;
        this.centerY = newY;
    }

    // TODO To complete
    /**
     * @return the Circle with this EXACT format Circle: centerX = ... centerY = ... radius = ...
     */
    @Override
    public String toString() {
        return "Circle: centerX = " + centerX + ", centerY = " + centerY + ", radius = " + radius;
    }

    // TODO To complete
    // TODO Be sure that you understand the difference between equals and ==
    /**
     * @return true if this and obj have the same values for
     * centerX, centerY and radius
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Circle other = (Circle) obj;
        return this.centerX == other.centerX && this.centerY == other.centerY && this.radius == other.radius;
    }

    // TODO To complete
    /**
     * @return an exact copy of the Circle that is a new instance 
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
