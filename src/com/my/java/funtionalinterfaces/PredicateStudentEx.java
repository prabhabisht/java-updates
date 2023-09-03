package com.my.java.funtionalinterfaces;

import java.util.List;
import java.util.function.Predicate;

import com.Java8.data.Student;
import com.Java8.data.StudentDataBase;

public class PredicateStudentEx {

	static Predicate<Student> p1 = (s)->s.getGradeLevel()>3;
	static Predicate<Student> p2 = (s)->s.getGpa()>=3.9;
	
	
	static List<Student> sList = StudentDataBase.getAllStudents();
	public static void filterStudentByGrade() {
		System.out.println("**********filterStudentByGrade********");
		sList.forEach((s)-> {
			if(p1.test(s))
			System.out.println(s);
		});
	}
	
	public static void filterStudentByGPA() {
		System.out.println("**********filterStudentByGPA********");
		sList.forEach((s)-> {
			if(p2.test(s))
			System.out.println(s);
		});
	}
	
	public static void filterStudents() {
		System.out.println("**********filterStudent********");
		sList.forEach((s)-> {
			if(p1.and(p2).negate().test(s)) {
			System.out.println(s);
			}else {
				System.out.println("hiiiii");	
			}
		});
	}
	public static void main(String[] args) {
		filterStudentByGrade();
		filterStudentByGPA();
		filterStudents();

	}

}
