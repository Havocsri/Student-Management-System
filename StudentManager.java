import java.util.ArrayList;


public class StudentManager {
    public ArrayList<Student> studentList = new ArrayList<>();

    public StudentManager() {
        studentList = Filehandler.loadStudents();
    }

               //new student add
    public void addStudent(Student newStudent) {
        for (int i = 0; i <studentList.size() ; i++) {
            Student tempStudent = studentList.get(i);
            if (tempStudent.getId() == newStudent.getId()) {    //if student id and user input id is same print
                System.out.println("Student already exists");
                return;
            }
              //student details is empty or not then add new student
        }
          studentList.add(newStudent);                        //System.out.println(studentlist.get(i).getId());
          Filehandler.saveStudents(studentList);
          System.out.println("Student added successfully");
     }

             //view all  students
    public void viewStudents() {
             //check the studentlist empty or not if is empty print the below
        if(studentList.isEmpty()){
            System.out.println("Student list is empty");
            return;
        }
             //if student list is there then print
        for (int i = 0; i<studentList.size() ; i++) {
//            System.out.println(studentList.get(i).getId());
//            System.out.println(studentList.get(i).getName());
//            System.out.println(studentList.get(i).getAge());              //number of print statement can we write so create an object to store
//            System.out.println(studentList.get(i).getGender());           //the details
//            System.out.println(studentList.get(i).getDepartments());
//            System.out.println(studentList.get(i).getMarks());
            Student currentstudent = studentList.get(i);
            System.out.println(currentstudent);
            Filehandler.saveStudents(studentList);
        }
    }
             //search the student with Id
    public void searchStudents(int searchID) {
                    // traverse the studentlist to search
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == searchID) {        //if user enter the id ==studenlist id equal
                Student currentstudent = studentList.get(i);     //create a temprory object to store studentlist and print
                System.out.println(currentstudent);
                return;                                          //if everthing going succefull then the vakues going to the searchstudent
            }
        }
        System.out.println("Student not found");
        Filehandler.saveStudents(studentList);
    }
             //update the studentlist
    public void updateStudent(
        int id,
        String name ,
        int age ,
        String gender ,
        String departments ,
        double marks){
                      //traverse the student list
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                Student currentstudent = studentList.get(i);
                currentstudent.setName(name);
                currentstudent.setAge(age);
                currentstudent.setGender(gender);
                currentstudent.setDepartments(departments);
                currentstudent.setMarks(marks);
                System.out.println("Student updated successfully");
                Filehandler.saveStudents(studentList);
                return;
            }
        }
        System.out.println("Student not found");

    }

            //delete from the student
    public void deleteStudent(int deleteId) {
        for (int i = 0; i <studentList.size(); i++) {
            if(studentList.get(i).getId()==deleteId){
                studentList.remove(i);
                System.out.println("Student deleted successfully");
                Filehandler.saveStudents(studentList);
                return;
            }
        }
        System.out.println("Student not deleted");

    }
}

