package de.boostmedia;

/**
 * Created with IntelliJ IDEA.
 * User: hamid
 * Date: 13.04.12
 * Time: 00:42
 * To change this template use File | Settings | File Templates.
 */
public class ReaderService {


    private Reader reader = null;

    public ReaderService(Reader reader) {
        this.reader = reader;
    }

    public String fetchData() {
        return reader.read();
    }

}
