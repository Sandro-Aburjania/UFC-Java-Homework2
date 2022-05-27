package Assigment4.Java;

public class Main {
    public static void main(String[] args) {
        Rectangle p1 = new Rectangle();
        p1.setPerimeter(20);

        Rectangle p2 = new Rectangle();
        p2.setPerimeterSecond(30);

        System.out.println(p1.getPerimeterOne());
        System.out.println(p2.getPerimeterTwo());


        p1 = p2;

        // ">-სთან" აქვს პრობლემა, ვერ გავიგე რატომ.
        /*
        if(p1 > p2){
            System.out.println("1");
        } else if(p1 < p2){
            System.out.println("-1");
        }else{
            System.out.println("0");
        }
         */
    }
}

class Rectangle{
    private int perimeterOne;
    private int perimeterTwo;

    public void setPerimeter(int pFirst){
        perimeterOne = pFirst;

    }
    public void setPerimeterSecond(int pSecond){
        perimeterTwo = pSecond;
    }
    public int getPerimeterOne(){
        return perimeterOne;
    }
    public int getPerimeterTwo(){
        return perimeterTwo;
    }
}