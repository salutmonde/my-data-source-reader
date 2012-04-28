package de.boostmedia;
import java.io.*;

/**
 * Hello world!         sonntaga
 *                             mmmm
 */
public class DataReaderClient {

private FileReader fileReader = null;
private String fileName = "myfile.txt";

public DataReaderClient()throws IOException {
fileReader = new FileReader(fileName);
}

private String fetchData() {
return fileReader.read();
}

public static void main(String[] args) throws IOException{
DataReaderClient dataReader = new DataReaderClient();
System.out.println("Got data: "+dataReader.fetchData());
}

}
