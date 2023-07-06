class Mul
{
    int a, b, c;

    Mul(int x, int y){
        a = x;
        b = y;
    }

    void multi(){
        c = a*b;
        System.out.println(a + " x " + b + " = " + c);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Mul obj = new Mul(10, 20);
        obj.multi();
    }
}
