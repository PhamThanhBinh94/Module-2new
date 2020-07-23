//package demo;
//
//public class Student implements java.lang.Comparable<Student> {
//    private int id;
//    private String name;
//    private int age;
//    private String address;
//
////    public Student() {
////    }
//
//    public Student(int id, String name, int age, String address) {
//        super();
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.address = address;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    @Override
//    public String toString() {
//        return "Student@id=" + id + ",name=" + name
//                + ",age=" + age + ",address=" + address;
//    }
//
//    @Override
//    public int compareTo(Student student) {
//        // sort student's name by ASC
//        if (this.getName().compareTo(student.getName()) != 0)
//             return this.getName().compareTo(student.getName());
//        else
//            return this.getAge().compareTo(student());
//    }
//}
