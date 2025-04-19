package com.sbi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class APIController {
	
	final Set<Model> storeNameList = new HashSet<Model>();
	final Map<Integer,String> dataMap = new HashMap<Integer,String>();
	
	static {
		Model model = new Model();
		model.setName("Paavana Chintalapalli");
		model.setMail("paavana@gmail.com");
	}
	
	@PostMapping("/insert")
	public ResponseEntity<Object> insertData(@RequestBody Model name){
	System.out.println("insert Data starts");
	storeNameList.add(name);
	int size = storeNameList.size();
	System.out.println("store Name List::::"+storeNameList.toString());
	System.out.println("insert Data Ends");
	return new ResponseEntity<Object>("insertion success   "+size,HttpStatus.CREATED) ;	
	}
	
	@GetMapping("/getData")
	public ResponseEntity<Object> getData(){
		System.out.println("Get store Name List::::"+storeNameList);
		return new ResponseEntity<Object>(storeNameList.toString(),HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Object> updateData(Model name){
		storeNameList.add(name);
		return new ResponseEntity<Object>("Updation done",HttpStatus.CONTINUE);
	}
	
	

}
