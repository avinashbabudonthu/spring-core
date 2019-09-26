package dependency.inject.setter.injection;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {

	private Long id;
	private String name;
	private Date joiningDate;

}
