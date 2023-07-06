import java.util.Scanner;

public class Area {
    
    public static void areaCircle(int r){
        float area = (float)(Math.PI * r * r);
        System.out.println("Area of Circle with radius "+ r + " is "+ area);
    }
    
    public static void areaSquare(int side){
        int area = side*side;
        System.out.println("Area of Square is "+ area);
    }

    public static void areaRectangle(int l, int b){
        int area = l*b;
        System.out.println("Area of Rectangle is "+ area);
    }

    public static void areaTriangle(int b, int h){
        double area = (1/2)*b*h;
        System.out.println("Area of Triangle is "+ area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("*********MENU********");
        System.out.println("1. Area of Circle");
        System.out.println("2. Area of Square");        
        System.out.println("3. Area of Rectangle");
        System.out.println("4. Area of Triangle");

        System.out.println("Enter Your Choice: ");
        byte choice = sc.nextByte();

        char conti = 'N';
        do{
            switch (choice) {
                case 1: areaCircle(10);
                    break;
            
                default:
                    break;
            }
        }while(conti == 'Y');
    }
}
