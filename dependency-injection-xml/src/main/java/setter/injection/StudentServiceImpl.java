package setter.injection;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    @Getter
    @Setter
    private StudentRepository studentRepository;

    public List<Student> findAllStudents(){
        return studentRepository.findAllStudents();
    }
}
