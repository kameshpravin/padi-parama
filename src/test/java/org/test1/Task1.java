package org.test1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Task1 {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		File f = new File("C:\\Users\\91812\\eclipse-workspace\\Vikash\\target\\vikas.json");

		ObjectMapper o = new ObjectMapper();
		Address a = new Address("chennai", "Tamil Nadu");
		ArrayList<String> a1 = new ArrayList();
		a1.add("java");
		a1.add("python");
		Root root = new Root("Kamesh", 25, false, a, a1);
		o.writeValue(f, root);
		
		System.out.println("sucess");
	}

}
