package de.boostmedia;
import java.io.*;


/**
 * Hello world!
 *
 */
public class DataReaderClient2 {

private Reader reader = null;
private String fileName = "myfile.txt";

public DataReaderClient2(Reader r)throws IOException {
reader = r;
}

private String fetchData() {
return reader.read();
}

public static void main(String[] args) throws IOException{
Reader r = new FileReader2("myfile.txt");
DataReaderClient2 dataReader2 = new DataReaderClient2(r);
System.out.println("Got data: "+dataReader2.fetchData());
}

}
