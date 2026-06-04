package constructor;

public class Date {
    private int dd,mm,yyyy;
    public Date(){
        System.out.println("-----Default constructor.Date-------");
        dd= 1;
        mm=6;
        yyyy=1950;
        System.out.println("dd/mm/yy :"+dd+"/"+mm+"/"+yyyy);
    }
    public Date(int dd,int mm,int yyyy){
        this.dd =dd;
        this.mm=mm;
        this.yyyy=yyyy;
        System.out.println("dd/mm/yy :"+dd+"/"+mm+"/"+yyyy);
    }
}
