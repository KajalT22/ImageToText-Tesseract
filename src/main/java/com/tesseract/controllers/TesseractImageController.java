package com.tesseract.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.tesseract.services.TesseractService;

@RestController
public class TesseractImageController {
	
	@Autowired
	private TesseractService tesseractService;
	
	@PostMapping("/image-to-text")
	public ResponseEntity<String> getImageText(@RequestParam("file") MultipartFile file) {
		if (file.isEmpty()) {
            return ResponseEntity.badRequest().body("Please select a file to upload");
        }
		
		 String textContent = tesseractService.imageToText(file);
		 return ResponseEntity.ok(textContent);
	}

}
