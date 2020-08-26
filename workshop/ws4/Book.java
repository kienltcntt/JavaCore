package pkgBook;
    

public class Book {
   String title;int pages;double cost,NewCost;boolean fiction;

    public Book() {
    }

    public Book(String title, int pages, double cost, boolean fiction) {
        this.title = title;
        this.pages = pages;
        this.cost = cost;
        this.fiction = fiction;
    }

    public String getTitle() {
        return title.toUpperCase();
    }

    public int getPages() {
        return pages;
    }

    public double getCost() {
        return cost;
    }
    public double getNewCost() {       
        return NewCost=this.cost*1.1;
    }
    

    public boolean getFiction() {
        return fiction;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setFiction(boolean fiction) {
        this.fiction = fiction;
    }
    
    @Override
    public String toString() {
        String s = title + "  " + pages + "  " + cost + "  " + fiction;
        return(s);
    }
}