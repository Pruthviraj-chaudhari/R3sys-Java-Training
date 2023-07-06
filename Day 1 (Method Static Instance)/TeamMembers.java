public class TeamMembers {
    static String teamName = "Peak Performers";

    String name;
    int age;
    long mob;

    

    void display(){
        System.out.println("Team Name: " + teamName);        
        System.out.println("Member Name: " + this.name);
        System.out.println("Age: " + this.age);        
        System.out.println("Mobile: " + this.mob);
    }
}
