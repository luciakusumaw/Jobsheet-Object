public class Lecturers13 {

    String idLecturer;
    String name;
    boolean activeStatus;
    int yearOfEntry;
    String expertiseCompetency;

    Lecturers13() {
    }
    Lecturers13(String idLecturer, String name, boolean activeStatus,
                int yearOfEntry, String expertiseCompetency) {

        this.idLecturer = idLecturer;
        this.name = name;
        this.activeStatus = activeStatus;
        this.yearOfEntry = yearOfEntry;
        this.expertiseCompetency = expertiseCompetency;
    }

    void showInformation() {
        System.out.println("ID Lecturer      : " + idLecturer);
        System.out.println("Name             : " + name);
        System.out.println("Active Status    : " + activeStatus);
        System.out.println("Year Of Entry    : " + yearOfEntry);
        System.out.println("Expertise Field  : " + expertiseCompetency);
        System.out.println("-----------------------------");
    }

    void setStatusActive(boolean status) {
        activeStatus = status;
    }

    int calculateTimeWork(int yearNow) {
        return yearNow - yearOfEntry;
    }

    void changeSkill(String skill) {
        expertiseCompetency = skill;
    }
}
