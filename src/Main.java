import visitor.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import syntaxtree.*;
public class Main {
public static void main(String [] args) throws FileNotFoundException {
try {
	FileInputStream fin = new FileInputStream("testinput/T1.java");
	Node root = new QParJavaParser(fin).Goal();
	System.out.println("Program parsed successfully");
	root.accept(new GJNoArguDepthFirst());
}
catch (ParseException e) {
System.out.println(e.toString());
}
}
}