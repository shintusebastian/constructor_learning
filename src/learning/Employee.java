package learning;
//this program is best to learn overloading in Java

//double hourlyRate;
//        double bonus;
//        int hourWorked;
//        int overTimeHours;
public class Employee {
    int empId;
    String name;

    public double calWages(double hourlyRate, int hourWorked) {
        return hourlyRate * hourWorked;

    }

    public double calWages(double hourlyRate, int hourWorked, int overtimeHours) {
        return calWages(hourlyRate, hourWorked) + (overtimeHours * (1.5 * hourlyRate));
    }
//the below problem is written in a different way above
//    public double calWages(double hourlyRate, int hourWorked, int overtimeHours) {
//        return hourlyRate * hourWorked + overtimeHours * (1.5 * hourlyRate);
//    }


    public double calWages(double hourlyRate, int hourWorked, int overtimeHours, double bonus) {
        return hourlyRate * hourWorked + overtimeHours * (1.5 * hourlyRate) + bonus;
    }
    //this can also be written as
    //public double calWages(double hourlyRate, int hourWorked, int overtimeHours, double bonus)
    /*return calWages(hourlyRate,hourWorked,overtimeHours)+bonus;
     *
     * */
}

