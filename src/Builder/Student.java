package Builder;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String universityName;
    private String batch;
    private long id;
    private int gradYear;
    private String phoneNumber;

    private Student(Builder builder){
        if(builder.getGradYear()>2022){
            throw new IllegalArgumentException("Grad year can't be grater than 2022");
        }
        this.age=builder.getAge();
        this.name=builder.getName();
        this.batch=builder.getBatch();
        this.id=builder.getId();
    }
    static class Builder {
        private String name;
        private int age;
        private double psp;
        private String universityName;
        private String batch;
        private long id;
        private int gradYear;
        private String phoneNumber;

        private Builder() {
        }

        public String getName() {
            return name;
        }

        public Student build() {
            return new Student(this);
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public void setBatch(String batch) {
            this.batch = batch;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }
    public static Builder getBuilder() {
        return new Builder();
    }
}
