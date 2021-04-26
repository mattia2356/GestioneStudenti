public class UndergraduateStudent extends Student{

    //costruttori
    public UndergraduateStudent(){

    }
    public UndergraduateStudent(String name){
        super(name);
    }

    public void computeCourseGrade(){
        int total = 0;
        for(int i = 0; i < getNumOfTest(); i++){
            total += getTest(i);
        }
        if(total/getNumOfTest() >= 70){
            setCourseGrade("Pass");
        }
        else{
            setCourseGrade("No Pass");
        }
    }
    
}
