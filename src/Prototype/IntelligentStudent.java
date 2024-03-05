package Prototype;

public class IntelligentStudent extends Student{
    private int iq;
    public IntelligentStudent(){}
    public IntelligentStudent(IntelligentStudent intelligentStudent){
        super(intelligentStudent);
        this.iq=intelligentStudent.iq;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
    public IntelligentStudent clone(){
        /*IntelligentStudent intelligentStudent=new IntelligentStudent();
        intelligentStudent.setAvgBatchPsp(this.getAvgBatchPsp());
        intelligentStudent.setBatchName(this.getBatchName());
        return intelligentStudent;*/
        return new IntelligentStudent(this);
    }
}
