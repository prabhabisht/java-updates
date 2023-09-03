package com.my.java.funtionalinterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.Java8.data.Student;
import com.Java8.data.StudentDataBase;

public class PredicateAndConsumerEx {

	
	Predicate<Student> p1 = (s)-> s.getGradeLevel()>=3;
	Predicate<Student> p2 = (s)-> s.getGpa()>=3.9;
	
	BiPredicate<Integer, Double> biPredicate = (grade, gpa) -> grade>=3 && gpa>=3.9;
	
	BiConsumer<String,List<String>> biConsumer = (name, activities)->  System.out.println(name +" : "+ activities);
	
	
	Consumer<Student> c1 = (student -> {
		if(p1.and(p2).test(student)) {
			biConsumer.accept(student.getName(), student.getActivities());
		}
	});
	
	Consumer<Student> c2 = (student -> {
		if(biPredicate.test(student.getGradeLevel(), student.getGpa())) {
			biConsumer.accept(student.getName(), student.getActivities());
		}
	});
	
	public void printNameAndActivity(List<Student> stList) {
		// c1 and c2 logic is same accept c1 is using predicate nd c2 is using bipredicate. so the output will be same
		
		stList.forEach(c1);
		stList.forEach(c2);
	}
	
	
	public static void main(String[] args) {
		List<Student> stList = StudentDataBase.getAllStudents();
		
		new PredicateAndConsumerEx().printNameAndActivity(stList);

	}

}
