import java.util.ArrayList;

public class ClassLevel{
    private TextbookInventoryFolders tif;
    private String yearName;
    private Booklist classlevelBooklist;
    private ArrayList<Student> paidStudents;
    private ArrayList<Student> unpaidStudents;
    private ArrayList<Classes> classList;

    public ClassLevel(String yearName,TextbookInventoryFolders tif){
        this.yearName = yearName;
        this.tif = tif;
        classlevelBooklist = new Booklist(tif);
        paidStudents = new ArrayList<Student>;
        unpaidStudents = new ArrayList<Student>;
        classList = new ArrayList<Classes>;
    }

    public String getYearName(){
        return yearName;
    }

    public Booklist getClasslevelBooklist(){
        return classlevelBooklist;
    }

    public ArrayList<Student> getPaidStudents(){
        return paidStudents; 
    }

    public ArrayList<Student> getUnpaidStudents(){
        return unpaidStudents;
    }

    public ArrayList<Classes> getClassList(){
        return classList;
    }

    public void addClass(Classes newClass){
        classList.add(newClass);
    }

    public Classes findClass(char className){
        for(Classes c:classList){
            if(c.getClassName().equals(className)){
                return c;
            }
        }
    }

    public void deleteClass(char className){
       for(Classes c:classList){
            if(c.getClassName().equals(className)){
                classList.remove(c);
            }
        } 
    }

    public void listClasses(){
        for(Classes c:classList){
            System.out.println(yearName+" - "+c.getClassName())
        }
    }

    public void listPaidStudents(){
        for(Student s:paidStudents){
            System.out.println(s.getName())
        }
    }

    public void listUnpaidStudents(){
        for(Student s:unpaidStudents){
            System.out.println(s.getName())
        }
    }

    public void updatePaidStudents(){
        paidStudents.clear();
        for(Classes c:classList){
            for(Student s:c.getClassStudents()){
                if(s.hasPaidForLoanBooks()){
                    paidStudents.add(s);
                }    
            }
        }
    }

    public void updateUnpaidStudents(){
        unpaidStudents.clear();
        for(Classes c:classList){
           c.updateOutstandingList();
           unpaidStudents.addAll(c.getOutstandingList());
        }
    }
}