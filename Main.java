import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
            //enter input from user
            Scanner input= new Scanner(System.in);
            //int age=input.nextInt();

             StudentManager object = new StudentManager();

        while(true){
                   //Display to choose the menu
            System.out.println("=======STUDENT MANAGEMENT SYSTEM=======");
            System.out.println("1. add Student");
            System.out.println("2. view Student");
            System.out.println("3. search Student");
            System.out.println("4. update Student");
            System.out.println("5. delete Student");
            System.out.println("6. exit");

            System.out.println("Enter your choice:");
            int choice = input.nextInt();
                  // work depends on user choice
            switch(choice){
                  //add student
                case 1:
                    System.out.println("Enter Student ID:");
                    int studentID=input.nextInt();
                        input.nextLine();

                    System.out.println("Enter studentName:");
                    String studentName=input.nextLine();

                    System.out.println("Enter studentAge");
                    int studentAge=input.nextInt();
                        input.nextLine();

                    System.out.println("Enter studentGender:");
                    String studentGender=input.nextLine();

                    System.out.println("Enter studentDepartment:");
                    String studentDepartments=input.nextLine();


                    System.out.println("Enter studentMark");
                    Double studentMark=input.nextDouble();
                        input.nextLine();


                    Student newStudent = new Student(
                            studentID,
                            studentName,
                            studentAge,
                            studentGender,
                            studentDepartments,
                            studentMark);

                    object.addStudent(newStudent);

                    break;

                     //view student
                case 2:
                    object.viewStudents();
                    break;

                     //search student
                case 3:
                    System.out.println("Enter Student ID:");
                    int searchID=input.nextInt();
                    object.searchStudents(searchID);
                    break;

                     //update student
                case 4:
                    //search the id ,is it there then update yours
                      System.out.println("Enter Student ID:");
                      int updateId=input.nextInt();
                         input.nextLine();

                      System.out.println("Enter New Name:");
                      String newName=input.nextLine();

                      System.out.println("Enter New Department:");
                      String newDepartment=input.nextLine();

                      System.out.println("Enter New Age:");
                      int newAge=input.nextInt();
                      input.nextLine();

                      System.out.println("ENter New Gender");
                      String newGender=input.nextLine();

                      System.out.println("Enter New Mark:");
                      Double newMark=input.nextDouble();
                      input.nextLine();

                      object.updateStudent(updateId,
                              newName,
                              newAge,
                              newGender,
                              newDepartment,
                              newMark);

                      break;

                //delete student
                 case 5:
                    System.out.println("Enter Student ID:");
                    int deleteId=input.nextInt();
                    object.deleteStudent(deleteId);
                    break;

                // exit
                case 6:

                    System.out.println("Exit");
                    return;


                //incase user choose diffrent values then display
                default:
                    System.out.println("Invalid choice");
                    //input.close();
                    break;

            }
            //input.close();
        }
        //input.close();
    }

}