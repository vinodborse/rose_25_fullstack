package com.skillio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillio.repository.BatchRepository;

@Service
public class BatchService {
	@Autowired
	BatchRepository br;

}
