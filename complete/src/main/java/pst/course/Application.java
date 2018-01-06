package pst.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
//
//	@RequestMapping(path="/courses/{id}", method= RequestMethod.GET)
//	public String getCourse(){
//		return "Hello";
//	}
//
//	@RequestMapping(path="/clazz/{id}", method= RequestMethod.GET)
//	public String getClazz(){
//		return "";//select clazz.*, course.* from clazz, course where clazz.course_id = course.id
//	}
//
//	@RequestMapping(path="/courses/{id}", method= RequestMethod.DELETE)
//	public String deleteCourse(){
//		return "Hello";
//	}
//
//	@RequestMapping(path="/courses/{id}", method= RequestMethod.PATCH)
//	public String patchCourse(){
//		return "Hello";
//	}
//
//	@RequestMapping(path="/courses/{id}", method= RequestMethod.POST)
//	public String insertCourse(){
//		return "Hello";
//	}
}
