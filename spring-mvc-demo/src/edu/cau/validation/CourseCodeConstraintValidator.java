package edu.cau.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator 
	implements  ConstraintValidator<CourseCode, String>{
	
	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode courseCode) {
		// TODO Auto-generated method stub
		this.coursePrefix = courseCode.value();
	}

	@Override
	public boolean isValid(String code, ConstraintValidatorContext constraint) {
		// TODO Auto-generated method stub
		boolean result;
		if(code == null) {
			result = true;
		}else {
			result = code.startsWith(coursePrefix);
		}
		return result;
	}

}
