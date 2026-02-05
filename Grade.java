public class GradeReporter {
    
    public void executeGradeReport(double score) {
        if (!validateScore(score)) {
            System.out.println("Invalid Score");
            return;
        }
        
        char letterGrade = calculateLetterGrade(score);
        displayPerformanceMessage(letterGrade);
    }
    
    public boolean validateScore(double score) {
        if (score >= 0 && score <= 100) {
            return true;
        } else {
            return false;
        }
    }
    
    public char calculateLetterGrade(double score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    
    public void displayPerformanceMessage(char grade) {
        if (grade == 'A') {
            System.out.println("Excellent work!");
        } else if (grade == 'B') {
            System.out.println("Great job!");
        } else if (grade == 'C') {
            System.out.println("Good effort!");
        } else if (grade == 'D') {
            System.out.println("You passed!");
        } else if (grade == 'F') {
            System.out.println("You did not pass.");
        }
    }
    
    public static void main(String[] args) {
        GradeReporter reporter = new GradeReporter();
        
        reporter.executeGradeReport(10);
        reporter.executeGradeReport(23);
        reporter.executeGradeReport(122);
    }
}