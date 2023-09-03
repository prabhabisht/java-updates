package com.my.java.funtionalinterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

import com.Java8.data.Student;
import com.Java8.data.StudentDataBase;

public class FuntionStudentEx {

	static Function<List<Student>, HashMap<String, Double>> studentFunc = (studentsList-> {
		HashMap<String, Double> stGradeMap= new HashMap<String, Double>();
		studentsList.forEach(student-> {
			//filter student by using predicate 
			if(PredicateStudentEx.p1.test(student))
			stGradeMap.put(student.getName(), student.getGpa());
		});
		return stGradeMap;
	});
	
	
	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunc =((stList, stPredicate) -> {
		HashMap<String, Double> stGradeMap= new HashMap<String, Double>();
		stList.forEach(student ->{
			if(stPredicate.test(student))
				stGradeMap.put(student.getName(), student.getGpa());
		});
		return stGradeMap;
	});
	
	public static void main(String[] args) {
		System.out.println(studentFunc.apply(StudentDataBase.getAllStudents()));
		
		System.out.println(biFunc.apply(StudentDataBase.getAllStudents(), PredicateStudentEx.p2));
	}

}
