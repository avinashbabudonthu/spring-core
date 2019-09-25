package setter.injection;

import java.util.Arrays;
import java.util.List;

import lombok.Setter;

public class StudentRepositoryImpl implements StudentRepository {

	@Setter
	private Student student;

	public List<Student> findAllStudents() {
		return Arrays.asList(student);
	}
}
