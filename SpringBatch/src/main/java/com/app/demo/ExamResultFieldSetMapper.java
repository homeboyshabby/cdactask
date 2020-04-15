package com.app.demo;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.app.demo.model.ExamResult;

public class ExamResultFieldSetMapper implements FieldSetMapper<ExamResult> {

	@Override
	public ExamResult mapFieldSet(FieldSet arg0) throws BindException {
		ExamResult examResult = new ExamResult();
		examResult.setStudentName(arg0.readString(0));
		examResult.setDob(arg0.readString(1));
		examResult.setPercentage(arg0.readDouble(2));
		return examResult;
	}

}
