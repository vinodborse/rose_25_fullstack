package com.skillio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.skillio.service.BatchService;

@RestController
public class BatchController {
	@Autowired
	BatchService bs;

}
