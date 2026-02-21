public class CourseMain {

    public static void main(String[] args) {

        Course13 c1 = new Course13();
        c1.kodeCourse = "IF102";
        c1.name = "Data Structures";
        c1.credits = 3;
        c1.numberOfHours = 4;

        Course13 c2 = new Course13("IF202", "Database Systems", 3, 3);

        // Call methods
        c1.showInformation();
        c1.updateSKS(4);
        c1.addHour(2);
        c1.reduceHours(3);

        c2.showInformation();
        c2.updateSKS(2);
        c2.addHour(1);
        c2.reduceHours(5);
    }
}
