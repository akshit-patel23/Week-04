package reflection.intermidate.retrieve;

public class Book {
    private String authorName;
    @Author(name = "Aditya")
    public void author1(String authorName){
        this.authorName=authorName;

    }
    @Author(name = "Dev")
    public void author2(String authorName){
        this.authorName=authorName;

    }
}
