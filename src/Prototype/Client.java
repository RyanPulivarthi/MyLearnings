package Prototype;

public class Client {
    public static void fillRegistry(StudentRegistry studentRegistry) {
        Student student=new Student();
        student.setAvgBatchPsp(87.45);
        student.setBatchName("sept22");

        studentRegistry.register("sept22",student);

        IntelligentStudent intelligentStudent=new IntelligentStudent();
        intelligentStudent.setBatchName("sept22Intelligent");
        intelligentStudent.setAvgBatchPsp(54.23);

        studentRegistry.register("sept22Intel",intelligentStudent);


    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry=new StudentRegistry();
        fillRegistry(studentRegistry);

        Student vipul=studentRegistry.get("sept22").clone();
        vipul.setName("Vipul");
        vipul.setAge(25);
        vipul.setPsp(87.3);

        Student intelligentStudent=studentRegistry.get("sept22Intel").clone();


        System.out.println("DEBUG");



    }
}
