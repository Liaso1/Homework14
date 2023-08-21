public class Homework14 {
    public static void main(String[] args) {
        Homework14Person person1 = new Homework14Person("Will", "Smith", "New York", "2936729462846");
        Homework14Person person2 = new Homework14Person("Jackie", "Chan", "Shanghai", "12312412412");
        Homework14Person person3 = new Homework14Person("Sherlock", "Holmes", "London", "37742123513");

        System.out.println(person1.personInfo());
        System.out.println(person2.personInfo());
        System.out.println(person3.personInfo());
    }
}
