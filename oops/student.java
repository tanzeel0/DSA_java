public class student{
    String name;
    int rno;
    double percent;
    final String school = "DPS";
    public int getrno(){
        return rno;
    }
    public int setrno(int roll){
        rno = roll;
        return rno;
    }
   /*  public student(int roll, String nam, double per){
        name = nam;
        rno = roll;
        percent = per;
        //this.school = school;
    }*/
}