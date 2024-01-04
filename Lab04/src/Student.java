public class Student {
    public String name;
    public double fScore, mScore;
    
    public void showGrade() {
        String grade;
        double s = (mScore * 0.4) + (fScore * 0.4) + 20;
        if (s >= 80) {
            grade = "A";
        } else if (70 <= s & s < 80) {
            grade = "B";
        } else if (60 <= s & s < 70) {
            grade = "C";
        } else if (50 <= s & s < 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Your grade is "+ grade + ".");
    }
}
