public class Fan {
    final int SLOW = 1, MEDIUM = 2, FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";


    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on) {
            return "Tốc độ của quạt: " + speed + ", màu sắc: " + color + ", bán kính: " + radius + ", fan is on";
        } else {
            return "Màu sắc: " + color + ", bán kính " + radius + ", fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(3,true,10,"Yellow");
        Fan fan2 = new Fan(2,false,5,"blue");
        System.out.println("Fan1: " + fan1.toString());
        System.out.println("Fan2: " + fan2.toString());
    }
}

