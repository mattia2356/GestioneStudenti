public class Gestione {

    public Student[] students;

    public Gestione() {

        students = new Student[20];
    }

    public Gestione(int numStudenti) {
        students = new Student[numStudenti];
    }

    public Gestione(Gestione s) {
        for (int i = 0; i < students.length; i++) {
            students[i] = s.students[i];
        }
    }

    public void setStudent(Gestione[] student) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    //Add
    public void aggiungiStudente(Student s, int i) {
            if (students[i]==null) {
                students[i] = s;
            }
    }

    //Delete
    public void eliminaStudente(int i) {

        if (i >= 0 && i < students.length) {
            students[i] = null;
        }
        students[students.length - i] = null;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                s += "Studenti : " + students[i].toString() + "\n";
            }
        }
        return s;
    }
}