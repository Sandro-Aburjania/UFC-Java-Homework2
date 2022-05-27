public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        Rectangle l1 = new Rectangle();
        l1.setLength(15);

        Rectangle w1 = new Rectangle();
        w1.setWidth(8);

        System.out.println("Length is: " + l1.getLength());
        System.out.println("Width is: " + w1.getWidth());

        //აქ რა პრობლემაა, ვერ მივხვდი
        rect.area();
        rect.perimeter();
    }

}

class Rectangle{
    private double length;
    private double width;

    public void setLength(int l){
        length = l;
    }
    public void setWidth(int w){
        width = w;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }

    public void perimeter(double l1, double w1){
        double p =2 * (l1 + w1);
        System.out.println("Perimeter of Rectangle is: " + p);

    }
    public void area(double l1, double w1){
        double area = l1 * w1;
        System.out.println("Area of Rectangle is: " + area);
    }
}