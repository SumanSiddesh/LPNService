package com.manh.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.manh.entity.LPN;


@Component
public class CustCommandLineRunner implements CommandLineRunner {

	private static final Logger logger 
			= LoggerFactory.getLogger(CustCommandLineRunner.class);
	
	@Autowired
	private LPNDAOServiceImpl lpndaoServiceImpl;
	
	@Override
	public void run(String... args) throws Exception {
		
		logger.info(".....Inserting LPN records into DB.....");
		
		lpndaoServiceImpl.insert(new LPN("TEST1", "ITEM01", new Date(), new Date() ));
		lpndaoServiceImpl.insert(new LPN("TEST2", "ITEM02", new Date(), new Date() ));
		lpndaoServiceImpl.insert(new LPN("TEST3", "ITEM03", new Date(), new Date() ));
		lpndaoServiceImpl.insert(new LPN("TEST4", "ITEM04", new Date(), new Date() ));
		lpndaoServiceImpl.insert(new LPN("TEST5", "ITEM05", new Date(), new Date() ));
		lpndaoServiceImpl.insert(new LPN("TEST6", "ITEM06", new Date(), new Date() ));
		lpndaoServiceImpl.insert(new LPN("TEST7", "ITEM07", new Date(), new Date() ));
		
		logger.info("......Done with Inserting LPN records into DB.....");
	}

}
