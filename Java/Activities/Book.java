package activities;

public abstract class Book {

    String title;

    abstract void setTitle(String title);

    String getTitle(){
        return this.title;
    }
}
