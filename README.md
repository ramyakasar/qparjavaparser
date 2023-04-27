# qparjavaparser
Use this project to check if a java program conforms to qpar Java grammar or not.

The grammar html is given here.
http://www.cse.iitm.ac.in/~krishna/cs6235/qparjava.html

Place your java file in testinput folder.
And change the name of the file in Main class (in the default package) in the line 
`````
InputStream in = new FileInputStream(new File("testinput/T1.java"));
`````

When you run Main, if the code conforms to qparjava grammar, it prints "Program parsed successfully" else an error message will be displayed.
