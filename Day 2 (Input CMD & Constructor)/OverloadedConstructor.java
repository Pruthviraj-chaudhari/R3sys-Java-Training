class Multi
{
    int a, b, c;
    float x, y, z;

    Multi(int x, int y){
        a = x;
        b = y;
    }

    Multi(float m, float n){
        x = m;
        y = n;
    }

    void multiply(){
        c = a * b;
        if(!(c==0))
            System.out.println(a + " x " + b + " = " + c);

        z = x * y;
        if(!(z==0))
            System.out.println(x + " x " + y + " = " + z);
    }

    public void accept() {
    }

    public void display() {
    }

}


public class OverloadedConstructor {
    public static void main(String[] args) {
        Multi obj1 = new Multi(10, 20);
        obj1.multiply();

        Multi obj2 = new Multi(5.5f, 4.3f);
        obj2.multiply();
    }
}
