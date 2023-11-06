package com.book.helper;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class Helper {
//	/home/jigyasa_yadav/Documents/sts/Book_rest/src/main/resources/static
	public final String UPLOAD_DIR = "/home/jigyasa_yadav/Documents/sts/Book_rest/src/main/resources/static/image";

//
	public boolean uploadfile(MultipartFile multipart) {
		boolean f = false;
		try {
//			InputStream is= multipart.getInputStream();
//			byte data[]= new byte[is.available()];
//			is.read(data);
//			FileOutputStream fos=new FileOutputStream(UPLOAD_DIR+"/"+multipart.getOriginalFilename());
//			fos.write(data);
//			fos.close();
//			fos.flush();
			Files.copy(multipart.getInputStream(),
					Paths.get(UPLOAD_DIR + File.pathSeparator + multipart.getOriginalFilename()),
					StandardCopyOption.REPLACE_EXISTING);
			f = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

}
