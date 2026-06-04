package Student;

public class Student {
    private int rollno;
    private String name;
    private double percentage;
    static  String clg = "Mit Adt";
    public Student (){
        rollno=0;
        name="";
        percentage=0;
    }
    public Student (int rollno, String name, double percentage){
        this.rollno=rollno;
        this.name=name;
        this.percentage=percentage;
    }
    public double getPercentage() {
        return percentage;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void atoString(){
        System.out.print("Rollno: "+rollno);
        System.out.print(" Name: "+name);
        System.out.print(" Percentage: "+percentage);
        System.out.println("clg name :"+clg);
    }
}
