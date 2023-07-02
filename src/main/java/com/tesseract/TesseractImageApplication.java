package com.tesseract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesseractImageApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesseractImageApplication.class, args);
		
//		Tesseract tesseract = new Tesseract();
//		//path of tessData folder where we downloaded tess4J
//		tesseract.setDatapath("D:\\Tess4J\\tessdata");
//		
//		try {
//			String textContent = tesseract.doOCR(new File("D:\\tesseract_testing_images\\testocr.png"));
//			System.out.println(textContent);
//		} catch (TesseractException e) {
//			e.getMessage();
//			
//		}
	}

}
