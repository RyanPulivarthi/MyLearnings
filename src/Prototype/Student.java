package Prototype;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private double psp;
    private String batchName;
    private double avgBatchPsp;
    public Student(){

    }
    public Student(Student student){
        this.setBatchName("sept22");
        this.avgBatchPsp=78.3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    @Override
    public Student clone() {
        /*Student stCopy=new Student();
        stCopy.batchName=this.batchName;
        stCopy.avgBatchPsp=this.avgBatchPsp;
        return stCopy;*/
        return new Student(this);
    }
}
