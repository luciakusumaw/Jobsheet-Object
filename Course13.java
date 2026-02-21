public class Course13 {

    String kodeCourse;
    String name;
    int credits;
    int numberOfHours;

    Course13() {
    }

    Course13(String kodeCourse, String name, int credits, int numberOfHours) {
        this.kodeCourse = kodeCourse;
        this.name = name;
        this.credits = credits;
        this.numberOfHours = numberOfHours;
    }

    void showInformation() {
        System.out.println("Course Code : " + kodeCourse);
        System.out.println("Course Name : " + name);
        System.out.println("Credits     : " + credits);
        System.out.println("Hours/Week  : " + numberOfHours);
        System.out.println("---------------------------");
    }

    void updateSKS(int sksNew) {
        credits = sksNew;
        System.out.println("Credits updated to " + credits);
    }

    void addHour(int hours) {
        numberOfHours += hours;
        System.out.println("Hours added. Total hours: " + numberOfHours);
    }

    void reduceHours(int hours) {
        if (numberOfHours >= hours) {
            numberOfHours -= hours;
            System.out.println("Hours reduced. Remaining hours: " + numberOfHours);
        } else {
            System.out.println("Cannot reduce hours. Not enough hours.");
        }
    }
}
