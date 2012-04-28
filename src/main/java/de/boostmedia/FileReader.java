package de.boostmedia;
import java.io.*;
import java.util.Scanner;

public class FileReader {

private StringBuilder builder = null;
private Scanner scanner = null;

public FileReader(String fileName)throws IOException {
scanner = new Scanner(new File(fileName));
builder= new StringBuilder();
}

public String read() {

while (scanner.hasNext()) {
builder.append(scanner.next());
builder.append(" ");
 }
return builder.toString();
	}
}
