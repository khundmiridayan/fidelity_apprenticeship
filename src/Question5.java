public class Question5 {

    public double calculateArea(double side){
        return side * side;
    }
    public double calculateArea(double length, double width){
        return length * width;
    }

    public double calculateArea(float radius){
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Question5 q = new Question5();

        double squareArea = q.calculateArea(5.0);
        System.out.println(squareArea);

        double rectangleArea = q.calculateArea(4.0,6.0);
        System.out.println(rectangleArea);

        double circleArea = q.calculateArea(4.0);
        System.out.println(circleArea);

    }
}
