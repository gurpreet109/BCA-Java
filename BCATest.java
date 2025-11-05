class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}

class BCAStudent extends Student {
    int projectScore;

    BCAStudent(String name, int rollNo, int projectScore) {
        super(name, rollNo);
        this.projectScore = projectScore;
    }

    @Override
    void displayInfo() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Project Score: " + projectScore);
    }
}

public class BCATest {
    public static void main(String[] args) {
        try {
            BCAStudent[] GurpreetKaur_data = {
                new BCAStudent("Aman", 1, 85),
                new BCAStudent("Simran", 2, 90),
                new BCAStudent("Karan", 3, 88)
            };

            for (BCAStudent s : GurpreetKaur_data) {
                s.displayInfo();
            }

            // Demonstrate exception handling
            System.out.println("\nAccessing invalid index:");
            System.out.println(GurpreetKaur_data[5].name); // Will throw exception

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
