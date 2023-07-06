class Mul
{
    int a,b,c;
    void accept(){
        a = 5;
        b = 4;
    }

    void multi(){
        c = a*b;
        System.out.println("Multiplication is "+c);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Mul obj = new Mul();  // <--- Default Constructor
        obj.accept();
        obj.multi();
    }
}
