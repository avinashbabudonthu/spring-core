package setter.injection;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	private Long id;
	private String name;
	private Date dateOfBirth;
	private Date joiningDate;
	private Double grade;
}