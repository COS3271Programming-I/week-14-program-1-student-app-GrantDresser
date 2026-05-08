public class Person {
    String firstName;
    String lastName;
    String gender;
    int age;
    double weight;
    double height;
    String ethnicGroup;
    String religion;

    // constructor
    public Person(String firstName, String lastName, String gender, int age,
                  double weight, double height, String ethnicGroup, String religion) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.ethnicGroup = ethnicGroup;
        this.religion = religion;
    }

    // method to display data
    public void displaydata() {
        System.out.println("\n--- Person Information ---");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight + " lbs");
        System.out.println("Height: " + height + " inches");
        System.out.println("Ethnic Group: " + ethnicGroup);
        System.out.println("Religion: " + religion);
    }

    // method that student overrides
    public void eatSomething() {
        System.out.println(firstName + " is eating a regular meal.");
    }
}