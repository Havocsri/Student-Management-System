import java.io.Serializable;

public class Student implements Serializable {

   // public class Student {
        //student details
        private int id;
        private String name;
        private int age;
        private String gender;
        private String departments;
        private double marks;

        //StudentManager student  =new Studentmanager;
        //System.out.println(student.id)  ,System.out.println(student.name) ,System.out.println(student.age) System.out.println(student.gender)
        //so we can create multiple object creating from input user therfore ,
        // we use constructor to cretae an object using runtime automatically


        //constructor  -->
        public Student(int id, String name, int age, String gender, String departments, double marks) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.departments = departments;
            this.marks = marks;
        }

        //getter for  id ,name.age,departments,marks
        public int getId() {
            return id;
        }

        public double getMarks() {
            return marks;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }

        public String getDepartments() {
            return departments;
        }

        public int getAge() {
            return age;
        }

        //setter for id ,name.age,departments,marks
        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public void setDepartments(String departments) {
            this.departments = departments;
        }

        public void setMarks(double marks) {
            this.marks = marks;
        }


        //print the student object
        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", gender='" + gender + '\'' +
                    ", departments='" + departments + '\'' +
                    ", marks=" + marks +
                    '}';
        }
    }
//}