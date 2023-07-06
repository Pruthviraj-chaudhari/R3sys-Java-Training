public class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    Person(Person obj){
        this.name = obj.name;
        this.age = obj.age;
    }

    void displayPerson(){
        System.out.println("Name: "+ this.name);
        System.out.println("Age: " + this.age);
    }
}
