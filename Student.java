public class Student{
    private boolean activeStatus;
    private String name;
    private int age;
    private ClassLevel classlevel;
    private Classes studentClass;
    private String address;
    private String parentNumber;
    private String parentEmail;
    private boolean paid; 
    private double moneyOwed;
    private Booklist booklist;

    public Student(String name,int age,ClassLevel classlevel,Classes studentClass, String address, String parentNum, String parentEmail){
        activeStatus = true;
        this.name = name;
        this.age = age;
        this.classlevel = classlevel;
        this.studentClass = studentClass;
        this.address = address;
        this.parentNumber = parentNum;
        this.parentEmail = parentEmail;
    }

    public boolean getActiveStatus(){
        return activeStatus;
    }
    
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public ClassLevel getClassLevel(){
        return classlevel;
    }

    public Classes getClass(){
        return studentClass;
    }

    public String getAddress(){
        return address;
    }

    public String getParentNumber(){
        return parentNumber;
    }

    public String getParentEmail(){
        return parentEmail;
    }

    public boolean hasPaidForLoanBooks(){
        return paid;
    }

    public double getMoneyOwed(){
        return moneyOwed;
    }

    public Booklist getBooklist(){
        return booklist;
    }

    public void updateInfo(){
        //take input to change info except class and classlevel
        //leave input space blank to make no change
    }

    public void changeClass(ClassLevel newClassLevel,Clasess newCLass){
        classlevel = newClassLevel;
        studentClass = newCLass;
    }

    public void changeActiveStatus(){
        activeStatus = !(activeStatus);
    }

    // public void payRepairFee(){}

    // public double calcRepairCost(){}

    // public void payLoanFee(){}


}