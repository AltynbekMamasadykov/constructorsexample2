package com.company;

public class Course {
    private String name;
    private int number;
    private String instructor;
    private String beginDate;



    public Course(){
        System.out.println("Hello from default constructor");
    }

    public Course(String name){
        this.name = name;
        System.out.println("only course name assigned");
    }

    public Course(String name,int number,String instructor,String beginDate){
        this.name = name;
        this.number = number;
        this.instructor = instructor;
        this.beginDate = beginDate;
        System.out.println("all fields of course assigned");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void getCourseInfo(){
        System.out.println("course name: "+getName());
        System.out.println("course number: "+getNumber());
        System.out.println("course instructor: "+getInstructor());
        System.out.println("course begin date: "+getBeginDate());
    }
}
