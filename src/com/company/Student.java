package com.company;

public class Student {
    private String name;
    private String surname;
    private Course[] courses;
    private int age;

    public Student(){
        System.out.println("Hello from default constructor");
    }

    public Student(String name,String surname,Course[] courses,int age){
        this.name = name;
        this.surname = surname;
        this.courses = courses;
        this.age = age;
        System.out.println("all fields of student assigned");
    }

    public void setName(){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setAge(int age) {
        if(age<0){
            System.out.println("age should be positive");
        }else{
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void getStudentInfo(){
        System.out.println("student name: "+getName());
        System.out.println("student surname: "+getSurname());
        System.out.println("student age: "+getAge());

        for (Course course:getCourses()) {
            course.getCourseInfo();
        }
    }


}
