package com.tesseract.services.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.tesseract.services.TesseractService;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
@Service
public class TesseractServiceImpl implements TesseractService {

	@Override
	public String imageToText(MultipartFile file) {
		
		Tesseract tesseract = new Tesseract();
		//path of tessData folder where we downloaded tess4J
		tesseract.setDatapath("D:\\Tess4J\\tessdata");
		
		try {
			
			File imageFile = convertMultipartFileToFile(file); 
			String textContent = tesseract.doOCR(imageFile);
			System.out.println(textContent);
			return textContent;
		} catch (TesseractException e) {
			e.getMessage();
			return "Error while Reading Image";
			
		}
		
	}
	
	private File convertMultipartFileToFile(MultipartFile file) {
	    File convertedFile = new File(file.getOriginalFilename());
	    try (OutputStream os = new FileOutputStream(convertedFile)) {
	        os.write(file.getBytes());
	    } catch (IOException e) {
	        e.printStackTrace();
	        System.err.println("error in converting MultipartFile to file");
	    }
	    return convertedFile;
	}

}
