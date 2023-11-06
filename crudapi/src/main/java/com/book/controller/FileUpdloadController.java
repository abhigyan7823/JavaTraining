package com.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.book.helper.Helper;

@RestController
public class FileUpdloadController {
	@Autowired

	private Helper helper;

	@PostMapping("/upload-file")
	public ResponseEntity<String> uploadfile(@RequestParam("file") MultipartFile file) {
//	System.out.println(file.getOriginalFilename());
//	System.out.println(file.isEmpty());
//	System.out.println(file.getName());
//	System.out.println(file.getSize());
//		
		try {
			// validation for empty file
			if (file.isEmpty()) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("request must have a file");

			}
			// validation for image .jpeg formatted file
			if (!file.getContentType().equals("image/jpeg")) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("request must be a jpeg file");

			}

			boolean f = helper.uploadfile(file);
			if (f) {
				return ResponseEntity.ok("Successfully uploaded ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("someeething missing");
	}
}
