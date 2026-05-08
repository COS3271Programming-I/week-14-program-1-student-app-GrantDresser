public class Student extends Person {
    String major;
    String classRank;
    String studentEmail;

    // constructor
    public Student(String firstName, String lastName, String gender, int age,
                   double weight, double height, String ethnicGroup, String religion,
                   String major, String classRank, String studentEmail) {

        super(firstName, lastName, gender, age, weight, height, ethnicGroup, religion);

        this.major = major;
        this.classRank = classRank;
        this.studentEmail = studentEmail;
    }

    public void goToClass() {
        System.out.println(firstName + " is going to class.");
    }

    @Override
    public void eatSomething() {
        System.out.println(firstName + " is eating a packet of cheetos (flaming hot)");
    }

    @Override
    public void displaydata() {
        super.displaydata();

        System.out.println("\n--- Student Information ---");
        System.out.println("Major: " + major);
        System.out.println("Class Rank: " + classRank);
        System.out.println("Student Email: " + studentEmail);
    }
}