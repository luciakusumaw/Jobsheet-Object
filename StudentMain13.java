public class StudentMain13 {
    public static void main(String[] args) {
        Student13 mhs1 = new Student13();
        mhs1.name = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.gpa = 3.55;

        mhs1.showInformation();
        mhs1.changeClass("SI 2K");
        mhs1.updateGpa(3.60);
        mhs1.showInformation();

    }
}
