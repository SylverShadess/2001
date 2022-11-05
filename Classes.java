import java.util.ArrayList;

public class Classes{
    private char className;
    private ClassLevel classlevel;
    private ArrayList<Student> classStudents;
    private ArrayList<Student> outstandingList;

    public Classes(char className,ClassLevel classlevel){
        this.className = className;
        this.classlevel = classlevel;
        classStudents = new ArrayList<Student>;
        outstandingList = new ArrayList<Student>;
    }

    public char getClassName(){
        return className;
    }

    public ClassLevel getClassLevel(){
        return classlevel;
    }

    public ArrayList<Student> getClassStudents(){
        return classStudents;
    }

    public ArrayList<Student> getOutstandingList(){
        return outstandingList;
    }

    public void listStudents(){
        for(Student s:classStudents){
            System.out.println(s.getName())
        }
    }

    public void addStudent(Student student){
        classStudents.add(student);
    }

    public void changeStudentDetails(Student student){
        student.updateInfo();
    }

    public Student findStudent(String stuName){
        for(Student s:classStudents){
            if(s.getName().equals(stuName)){
                return s;
            }//else student not found
        }
    }

    public void updateOutstandingList(){
        outstandingList.clear();
        for(Student s:classStudents){
            if(s.getMoneyOwed() > 0){
                outstandingList.add(s);
            }
        }
    }

    public void listOutstanding(){
        for(Student s:outstandingList){
            System.out.println(s.getName())
        }
    }
}