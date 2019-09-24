package setter.injection;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {

    @Getter
    @Setter
    private Student student;

    public List<Student> findAllStudents(){
        return Arrays.asList(student);
    }
}
