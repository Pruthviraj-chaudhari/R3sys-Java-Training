public class PersonExe {
    public static void main(String[] args) {

        Person p1 = new Person("Pruthviraj Chaudhari", 20);
        Person p2 = new Person(p1);

        p1.displayPerson();
        p2.displayPerson();
    }
}

