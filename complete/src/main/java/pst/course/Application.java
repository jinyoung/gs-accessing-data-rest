package pst.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);

		CourseRepository courseRepository = applicationContext.getBean(CourseRepository.class);
		Course course = new Course();
		course.setTitle("data structure");
		course.setDuration(5);
		course.setMaxEnrollment(1000);
		course.setMinEnrollment(50);
		course.setUnitPrice(100.0);

		courseRepository.save(course);


		ClazzRepository clazzRepository = applicationContext.getBean(ClazzRepository.class);
		Clazz clazz = new Clazz();
		clazz.setCourse(course);
		clazz.setStates("OPEN");

		clazzRepository.save(clazz);

		course = courseRepository.findOne(1L);
		List<Clazz> clazzList = course.getClazzes();
		System.out.print(clazzList.size());

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
