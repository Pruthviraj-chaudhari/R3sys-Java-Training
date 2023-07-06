public class Input {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);        
        int b = Integer.parseInt(args[1]);
        float c = Float.parseFloat(args[2]);
        float d = Float.parseFloat(args[3]);

        System.out.println("Integer Addition (a+b): "+ (a+b));
        System.out.println("Float Subtraction (c-d): "+ (c-d));
    }
}

// Run
// javac Input.java
// java Input 10 20 8.5 5.5