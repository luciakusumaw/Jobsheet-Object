public class Student13 {
    String name;
    String nim;
    String kelas;
    double gpa;

    public Student13() {

    }

    public Student13(String nm, String nim, double ipk, String kls) {
        name = nm;
        this.nim = nim;
        this.gpa = ipk;
        kelas = kls;
    }

    void showInformation() {
        System.out.println("Name: " + name);
        System.out.println("NIM: " + nim);
        System.out.println("GPA: " + gpa);
        System.out.println("Class: " + kelas);
    }

    void changeClass(String newClass) {
        kelas = newClass;
    }

    void updateGpa(double newGPA) {
        gpa = newGPA;
        if (gpa<=0.0 && gpa>4.0) {
        System.out.println("GPA is invalid. Must be between 0.0 and 4.0"); 
        }
    }


    String performanceValue() {
        if (gpa >= 3.5) {
            return "Your Performance is Verry Good";
        } else if (gpa>=3.0) {
            return "Your Perormance is Good";
        } else if (gpa>=2.0) {
            return "Your Performance is Okay";
        } else {
            return "Your Performance is Bad";
        }

    }
}
