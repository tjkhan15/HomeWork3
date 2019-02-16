package studentinfodb;

public class StudentExtends extends StudentAbstract implements StudentInterface{

    public static double midtermExam;
    public static double finalExam;
    public double percent;

    public StudentExtends() {}

    public StudentExtends(String stuName, int stuID, int stuAge, String stuGender) {

        super(stuName, stuID, stuAge, stuGender);
    }


    public void gpaCal() {
        double total = (midtermExam + finalExam);
        this.percent = total*100/200;
        System.out.println ("Your Final Grade Percentage is: "+ percent + "%");
    }

    public boolean isPassing() {
        if (this.percent > 75)
            return true;
        else
            return false;
    }

}