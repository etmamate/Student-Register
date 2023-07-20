import java.util.ArrayList;

public class ListStudents {
    ArrayList<Students> list_of_Students;
    int maxStu = 5;

    public ListStudents() {
        this.list_of_Students = new ArrayList<>(5);
    }

    void receiveStu(Students newStudent) {
        if (list_of_Students.size() != 5) {
            list_of_Students.add(newStudent);
        } else {
            System.out.println("|||||||||||||||||||||||||||||||||||");
            System.out.println("Maximum Number of Students reached ");
            System.out.println("|||||||||||||||||||||||||||||||||||");
        }
    }

    void listAllStudents() {
        System.out.println("\nList of students: ");
        for (Students listALL : list_of_Students) {
            listALL.ListAll();
        }
    }

    void listStudentsApproved() {
        System.out.println("\nApproved Students: ");
        for (Students approved_Students : list_of_Students) {
            approved_Students.Approved();
        }
    }

    void listDisapproved() {
        System.out.println("\n Disapproved Students: ");
        for (Students disapproved_Students : list_of_Students) {
            disapproved_Students.Disapproved();
        }
    }
}
