package date.injection;

import java.util.Date;

import lombok.Data;

@Data
public class Employee {

	private Long id;
	private String name;
	private Date joiningDate;
}
