public class GraduateStudent extends Student{

    //costruttori
    public GraduateStudent(){

    }
    public GraduateStudent(String name){
        super(name);
    }

    public void computeCourseGrade(){
        int total = 0;
        for(int i = 0; i < getNumOfTest(); i++){
            total += getTest(i);
        }
        if(total/getNumOfTest() >= 80){
            setCourseGrade("Pass");
        }
        else{
            setCourseGrade("No Pass");
        }
    }
    
}
