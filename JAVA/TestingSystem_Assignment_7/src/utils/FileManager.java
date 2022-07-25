package utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

	public static boolean isFileExists(String pathFile) {
		File file = new File(pathFile);
		return file.exists();
	}
	public static void question1() {
		System.out.println(isFileExists("C:\\Java\\test.txt"));
	}
	
	public static void createNewFile(String pathFile) throws IOException {
		File file = new File(pathFile);
		if (file.exists()==true) {
			throw new IOException("Error! File Exist.");
		}else {
			file.createNewFile();
		}
	}
	
	public static void createNewFile(String path, String fileName) throws IOException {
		File file = new File(path+"\\"+fileName);
		if (file.exists()==true) {
			throw new IOException("Error! File Exist.");
		}else {
			file.createNewFile();
		}
	}
	
	

	public static void deleteFile(String pathFile) throws IOException {
		File file = new File(pathFile);
		if (file.exists()==false) {
			throw new IOException("Error! File Not Exist.");
		}else {
			file.delete();
		}
	}
	
	public static boolean isFolder(String pathFile) {
		File file = new File(pathFile);
		return file.isDirectory();
	}
	
	public static List<String> getAllFileName(String pathFile) throws IOException {
		ArrayList<String> ls = new ArrayList<>();
		if (isFolder(pathFile)==false) {
			throw new IOException("This not folder.");
		}else {
			File file = new File(pathFile);
			for (String fileName : file.list()) {
				ls.add(fileName);
			}
			
		}	
		return ls;
	}
	public static void question6() throws IOException {
		for (String i : getAllFileName("C:\\Java")) {
			System.out.println(i);
		}

	}
	
	public static void copyFile(String sourceFile, String distinationPath, String newName) throws IOException {
		File file = new File(sourceFile);
		File filed = new File(distinationPath+"\\"+newName);
		if (isFileExists(sourceFile) ==false) {
			throw new IOException("Error! Source File Not Exist.");
		}else if (isFileExists(distinationPath+"\\"+newName)==true) {
			throw new IOException("Error! newPath has File same name.");
		}else {
			Files.copy(file.toPath(), filed.toPath());
		}
		
	}
	public static void copyFile(String sourceFile, String newPath) throws IOException {
		File file = new File(sourceFile);
		File filed = new File(newPath);
		if (isFileExists(sourceFile) ==false) {
			throw new IOException("Error! Source File Not Exist.");
		}else if (isFileExists(newPath)==true) {
			throw new IOException("Error! newPath has File same name.");
		}else {
			Files.copy(file.toPath(), filed.toPath());
		}
		
	}
	
	public static void question7() throws IOException  {
		String sourceFile= "C:\\Java\\test.txt";
		String distinationPath= "C:\\Java1";
		String newName= "test1.txt";
		copyFile(sourceFile, distinationPath, newName);
	}
	
	public static void moveFile(String sourceFile, String destinationPath) throws IOException {
		if (isFileExists(sourceFile) ==false) {
			throw new IOException("Error! File Not Exist.");
		}else {
			File file = new File(sourceFile);
			String[] st = sourceFile.split("\\");
			File filed = new File(destinationPath+"\\"+st[st.length-1]);
			Files.move(file.toPath(), filed.toPath());
			file.delete();
		}
	}
	
	public static void question8() throws IOException  {
		String sourceFile= "C:\\Java\\test.txt";
		String distinationPath= "C:\\Java1";
		moveFile(sourceFile, distinationPath);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
