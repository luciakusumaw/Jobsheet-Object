public class LecturersMain {

    public static void main(String[] args) {

        
        Lecturers13 d1 = new Lecturers13();
        d1.idLecturer = "L001";
        d1.name = "Dr. Ahmad";
        d1.activeStatus = true;
        d1.yearOfEntry = 2015;
        d1.expertiseCompetency = "Artificial Intelligence";

        Lecturers13 d2 = new Lecturers13(
                "L002",
                "Dr. Budi",
                true,
                2018,
                "Database Systems"
        );

        // Call methods
        d1.showInformation();
        System.out.println("Work Duration: " + d1.calculateTimeWork(2025) + " years");

        d2.showInformation();
        d2.setStatusActive(false);
        d2.changeSkill("Data Science");

        d2.showInformation();
        System.out.println("Work Duration: " + d2.calculateTimeWork(2025) + " years");
    }
}
