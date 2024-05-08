class student {
    private String name;
    private int rollno;
    private String classname;
    private float percentage;

    student(String name, int rollno, String classname, float percentage) {
        this.name = name;
        this.rollno = rollno;
        this.classname = classname;
        this.percentage = percentage;

    }

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;

    }

    public String getClassname() {
        return classname;
    }

    public float getPercentage() {
        return percentage;
    }
}

public class launch {
    public static void main(String[] args) {
        student std = new student("Balvant", 22105077, "Bsc 2nd year", 65);
        System.out.println("Name:" + std.getName());
        System.out.println("Roll no.:" + std.getRollno());
        System.out.println("Name:" + std.getClassname());
        System.out.println("Name:" + std.getPercentage());

    }

}
