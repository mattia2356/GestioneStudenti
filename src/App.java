public class App {
    public static void main(String[] args) throws Exception {
        //Student[] roster = new Student[40];

        GraduateStudent gs = new GraduateStudent("matteo");
        GraduateStudent gs1 = new GraduateStudent("Luca");

        UndergraduateStudent ugs = new UndergraduateStudent("Giorgio");
        UndergraduateStudent ugs1 = new UndergraduateStudent("Franco");

        Gestione st = new Gestione();
        st.aggiungiStudente(gs, 0);
        st.aggiungiStudente(gs1, 1);
        st.aggiungiStudente(ugs, 3);
        st.aggiungiStudente(ugs1, 4);
        gs.computeCourseGrade();
        gs.setTestScore(1, 80);gs.setTestScore(2, 82);gs.setTestScore(3, 45);
        gs1.setTestScore(1, 76);gs1.setTestScore(2, 14);gs1.setTestScore(3, 68);
        ugs.setTestScore(1, 45);ugs.setTestScore(2, 95);ugs.setTestScore(3, 74);
        ugs1.setTestScore(1, 35);ugs1.setTestScore(2, 100);ugs1.setTestScore(3, 34);
        System.out.println("Aggiunti: ");
        System.out.println(st.toString());
        System.out.println("eliminati: ");
        st.eliminaStudente(3);
        st.eliminaStudente(4);
        System.out.println(st.toString());
    }
}