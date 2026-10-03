import java.io.*;
import java.security.PublicKey;
import java.util.ArrayList;

public class Filehandler {                 //declare file name
            public static final String FILE_NAME ="students.save";
                 //
            public static void saveStudents(ArrayList<Student> studentList) {

            try {
                //save the file
                FileOutputStream filesave =new FileOutputStream(FILE_NAME);
                //read the object
                ObjectOutputStream save =new ObjectOutputStream(filesave);
                save.writeObject(studentList);  //save students in the file
                save.close();    //close object stream
                filesave.close();      //close file stream
                System.out.println("Students data saved Successfully");
            }catch (Exception e){
                System.out.println("Student data saved Failed");
                }
            }

            public static ArrayList<Student> loadStudents() {
                try {
                    //read the data from file
                    FileInputStream fileshow =new FileInputStream(FILE_NAME);
                    // read the object
                    ObjectInputStream show = new ObjectInputStream(fileshow);

                    //read the student from the file
                    ArrayList<Student> studentLists = (ArrayList<Student>) show.readObject();
                    show.close();       // close the object stream
                    fileshow.close();   //close the file stream
                    return studentLists;

                }catch (Exception e){
                    System.out.println("Error loading student data ");
                    return new ArrayList<>();
                }
            }
}





