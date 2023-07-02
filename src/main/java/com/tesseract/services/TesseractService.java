package com.tesseract.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


public interface TesseractService {
	
	String imageToText(MultipartFile file);

}
