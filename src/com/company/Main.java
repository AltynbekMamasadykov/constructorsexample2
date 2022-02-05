package com.company;

public class Main {

    public static void main(String[] args) {
	Course course = new Course("Java5",1,"Muhamed Allanov","04.01.2022");
//    course.getCourseInfo();
	Course course1 = new Course("English",2,"Nezka","04.01.2022");
//    course1.getCourseInfo();
	Course course2 = new Course("Soft Skills",3,"Muna","04.01.2022");
//    course2.getCourseInfo();

    Course[] coursesOfAsanbai = {course,course1,course2};
    Course[] coursesofJohn ={course1};

    Student student1 = new Student("Asanbai","Ortosaev",coursesOfAsanbai,18);
    student1.getStudentInfo();
    Student student2 = new Student("John","Doe",coursesofJohn,20);
    student2.getStudentInfo();


    }
}
