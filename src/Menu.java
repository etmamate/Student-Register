import java.util.Scanner;

public class Menu {
    Scanner scn = new Scanner(System.in);
    String name;
    int option;
    float media;
    Students save_students = new Students();
    ListStudents list_Students = new ListStudents();

    String menu = """
            1- Regiter a student
            2- List
            3- Approved
            4- Disapproved
            0- Exit
            """;

    public void meuMenu() {
        do {
            System.out.println(menu);
            option = scn.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Insert a student name: ");
                    name = scn.next();
                    System.out.println("Insira as duas notas");
                    System.out.println("Nota 1:");
                    float n1 = scn.nextFloat();
                    System.out.println("Nota 2:");
                    float n2 = scn.nextFloat();
                    media = (n1 + n2) / 2;

                    save_students = new Students(name, media);
                    list_Students.receiveStu(save_students);

                    break;
                case 2:
                    list_Students.listAllStudents();
                    break;
                case 3:
                    list_Students.listStudentsApproved();
                    break;
                case 4:
                    list_Students.listDisapproved();
                    break;
            }

        } while (option != 0);
    }

}
