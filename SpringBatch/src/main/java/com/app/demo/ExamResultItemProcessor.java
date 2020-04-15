package com.app.demo;

import org.springframework.batch.item.ItemProcessor;

import com.app.demo.model.ExamResult;

public class ExamResultItemProcessor implements ItemProcessor<ExamResult, ExamResult> {

	@Override
	public ExamResult process(ExamResult arg0) throws Exception {
		// TODO Auto-generated method stub
		if(arg0.getPercentage() < 60)
		{
			return null;
		}
		return arg0;
	}

}
