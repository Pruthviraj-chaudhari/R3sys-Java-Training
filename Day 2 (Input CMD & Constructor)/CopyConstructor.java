class R3sys
{
    String a,b;

    R3sys(String x, String y){
        a = x;
        b = y;
    }

    R3sys(R3sys obj1, R3sys obj2){
        a = obj1.a + " " + obj2.a;
        b = obj1.b + " " + obj2.b;
    }

    R3sys(College obj1, College obj2){
        a = obj1.a + " " + obj2.a;
        b = obj1.b + " " + obj2.b;
    }

    void print(){
        System.out.println("String A: "+ a);
        System.out.println("String B: "+ b);
    }
}

class College
{
    String a,b;

    College(String x, String y){
        a = x;
        b = y;
    }
}

public class CopyConstructor {
    public static void main(String[] args) {

        R3sys obj1 = new R3sys("RCPIT", "Maharashtra");
        R3sys obj2 = new R3sys("Shirpur", "India");

        College c1 = new College("RCPIT", "Maharashtra");
        College c2 = new College("Shirpur", "India");


        R3sys obj3 = new R3sys(c1, c2);

        obj3.print();
    }
}
