package setter.injection;

import java.util.List;

import lombok.Setter;

public class StudentServiceImpl implements StudentService {

	@Setter
	private StudentRepository studentRepository;

	public List<Student> findAllStudents() {
		return studentRepository.findAllStudents();
	}
}
