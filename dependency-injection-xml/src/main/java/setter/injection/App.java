package setter.injection;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@Slf4j
public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("setter.injection/setter-injection.xml");
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        List<Student> studentsList = studentService.findAllStudents();
        log.info("students-list={}",studentsList);
    }
}
