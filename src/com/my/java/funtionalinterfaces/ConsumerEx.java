package com.my.java.funtionalinterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import com.Java8.data.Student;
import com.Java8.data.StudentDataBase;

/**
 * @author GUR38846
 *
 */
public class ConsumerEx {
	static Consumer<Student> c4 = (studentObj)->System.out.println(studentObj.getGpa());
	static Consumer<Student> c1 = (studentObj)->System.out.println(studentObj);
	static Consumer<Student> c2 = (studentObj)->System.out.println(studentObj.getName());
	static Consumer<Student> c3 = (studentObj)->System.out.println(studentObj.getActivities());
	static BiConsumer<String, Double> biConsumer= (name, gpa)-> System.out.println(name +" : "+gpa);
	static BiConsumer<String, List<String>> biConsumer2= (gender, activities)-> System.out.println(gender +" : "+activities);
	static List<Student> stList = StudentDataBase.getAllStudents();
	
	public static void printStudents() {
		stList.forEach(c1);
	}
	
	public static void printStudentsNameAndActivities() {
		stList.forEach(c2.andThen(c3)); //consumer chaining can chain n number of consumer implementation
	}
	
	public static void printStudentsNameAndActivitiesUsingCondition() {
		System.out.println("******************************printStudentsNameAndActivitiesUsingCondition**********");
		stList.forEach((studentObj)-> {
			if(studentObj.getGradeLevel() >= 3 && studentObj.getGpa()>=3.9) {
				c2.andThen(c3).andThen(c4).accept(studentObj);  // code reusability no need to duplicate the code of to print name and activities 
				//System.out.println(studentObj.getName());
				//System.out.println(studentObj.getActivities());
			}
		});
	}
	
	public static void printNameAndGPA() {
		stList.forEach((s)-> {
			biConsumer2.accept(s.getGender(), s.getActivities());
			biConsumer.accept(s.getName(), s.getGpa());
//			biConsumer.andThen(biConsumer).accept(s.getName(), s.getGpa());
			});
	}
	public static void main(String[] args) {
		Consumer<String> con =(s1)-> System.out.println(s1.toUpperCase());
		con.accept("Prabha");
//		Students s = new Students("prabha",111, 80, "female", 10,Arrays.asList("swimming", "basketball","volleyball"));
//		System.out.println("printing value of java 17 records" + s.toString());
		printStudents();
		printStudentsNameAndActivities();
		printStudentsNameAndActivitiesUsingCondition();
		
		printNameAndGPA();
		
	}

}
