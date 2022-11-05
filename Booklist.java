import java.util.ArrayList;

public class Booklist{
    private ArrayList<TextbookFolder> booklist;
    private TextbookInventoryFolders tif;

    public Booklist(TextbookInventoryFolders tif){
        this.tif = tif;
        booklist = new ArrayList<TextbookFolder>;
    }

    public void addTextbook(TextbookFolder textbook){
        booklist.add(textbook);
    }

    public void removeTextbook(String textTitle){
        for(TextbookFolder text:booklist){
            if(text.getTitle().equals(textTitle)){
                booklist.remove(text);
            }//else book not found
        }
    }

    public ArrayList<TextbookFolder> getBooklist(){
        return booklist;
    }

    public void listTextbooks(){
        for(TextbookFolder text:booklist){
            System.out.println(text.getTitle())
        }
    }

    //These should be for students b/c each student will have different books. Maybe move to TIF? or use book codesto identify?
    public void updateLoanCondtion(TextbookFolder textbook){
        //input to change condition
    }

    public void updateReturnCondtion(TextbookFolder textbook){
        //input to change condition
    }
}