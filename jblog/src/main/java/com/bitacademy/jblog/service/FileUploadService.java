package com.bitacademy.jblog.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUploadService {
	private static final String SAVE_PATH = "/upload";
	
	// 저장 메서드
	public String store(MultipartFile mFile) {
		String saveFilename = "";
		
		try {
			String originalFilename = mFile.getOriginalFilename();
			String extName = originalFilename.substring(
					originalFilename.lastIndexOf("."),
					originalFilename.length()
					);
			Long size = mFile.getSize();
			// 저장할 파일명
			saveFilename = getSaveFilename(extName);
			System.out.println("원본 파일명:" + originalFilename);
			System.out.println("확장자:" + extName);
			System.out.println("저장파일명:" + saveFilename);
			
			// 멀티파트 파일 저장 -> 별도 메서드
			writeFile(mFile, saveFilename);
		}catch(IOException e) {
			throw new RuntimeException();
		}
		return saveFilename;
	}
	// 실제 파일 저장 메서드
	private void writeFile(MultipartFile mFile, String saveFilename) throws IOException {
		byte[] fileData = mFile.getBytes();
		
		FileOutputStream fos = new FileOutputStream(SAVE_PATH + "/" + saveFilename);
		fos.write(fileData);
		fos.close();
	}
	
	// 저장 이름 정하는 메서드
	public String getSaveFilename(String ext) {
		Calendar cal = Calendar.getInstance();
		return String.valueOf(cal.getTimeInMillis()) + ext.toLowerCase();
	}
}
