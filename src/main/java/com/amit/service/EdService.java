package com.amit.service;

import java.util.List;

import com.amit.binding.Entries;

public interface EdService {
	
	public String eligibilityCheck(Integer caseNo);
	
	public List<Entries> getAllData();

}
