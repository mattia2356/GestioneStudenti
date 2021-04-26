public class Student {
    //Attributi
    private String name;
    private int test[];
    private String CourseGrade;
    private final static int NUM_OF_TEST = 3;

    //Costruttori
    public Student(){
        this("no name");
    }   

    public Student(String name){
        setName(name);
        test = new int[NUM_OF_TEST];
    }
    public Student(Student st){
        setCourseGrade(st.getCourseGrade());
        setName(st.getName());
        setTestScore(st.getNumOfTest(), st.getTestScore(st.getNumOfTest()));
    }

    //Setter && Getter
    public void setCourseGrade(String courseGrade) {
        CourseGrade = courseGrade;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static int getNumOfTest() {
        return NUM_OF_TEST;
    }
    public String getCourseGrade() {
        return CourseGrade;
    }
    public String getName() {
        return name;
    }

    public int getTestScore(int testNumber){
        return test[testNumber-1];
    }

    public void setTestScore(int testNumber, int testScore){
        test[testNumber-1] = testScore;
    }

    public int getTest(int i) {
            return test[i];
        
    }

    public void computeCourseGrade(){
        //Non fa niente, ci sarà l'ovverride.
    }

    public boolean equals(Student st){
        return(getCourseGrade().equals(st.getCourseGrade()) && 
                getName().equals(st.getName()) && getNumOfTest()==st.getNumOfTest() && 
                getTestScore(getNumOfTest())==st.getTestScore(st.getNumOfTest()));
    }

//toString
public String toString(){
    String s = "| NOME: "+getName()+" | COURSE GRADE: "+getCourseGrade()+" | N TEST: "+getNumOfTest()+" | RISULTATI TESTS:";
    for (int i = 0; i < test.length; i++) {
        s += "\n| "+(i+1)+": "+getTestScore(i+1);
    }
    return s;
}

}
