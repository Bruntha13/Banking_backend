package com.dxc.service;

import java.util.List;

import com.dxc.model.Application;
import com.dxc.exception.ApplExistsException;

public interface ApplService {

	Application apply(Application appl) throws ApplExistsException;
	List<Application> getAllApplicationById(int applid);
	void updateApplicationById(Application appl);
    void deleteApplicationById(int applid);
	
}
