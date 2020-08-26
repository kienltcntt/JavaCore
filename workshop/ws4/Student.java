package pkgStudent;

public class Student {
   String id,name;double mark;

    public Student() {
    }

    public Student(String id, String name,double mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMark() {
        return mark;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
    
    @Override
    public String toString() {
        String s = "" + id + ", " + name + ", " + mark + "";
        return(s);
    }
}