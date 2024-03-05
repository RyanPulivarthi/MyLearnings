package Builder;

import javafx.util.Builder;

public class Client {
    public static void main(String[] args) {
        /*Student.Builder builder=Student.Builder.getBuilder();
        builder.setName("Ryan");
        builder.setAge(22);
        builder.setPsp(40.6);
        builder.setGradYear(2021);
        builder.setBatch("August");*/
        //Student student=new Student(builder);

        Student student1=Student.getBuilder()
                        .setName("Ryan")
                        .setAge(26)
                        .setPsp(96.7)
                        .setGradYear(2021).build();

      //  Student studen=new Student(builder1);
        if(student1 instanceof Student)
            System.out.println("it is instance of student");
        else if(student1 instanceof Builder)
            System.out.println("It is instanceo of builder");
        else
            System.out.println("this is default");
        System.out.println("DEBUG");
    }
}
