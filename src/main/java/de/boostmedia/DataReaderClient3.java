package de.boostmedia;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: hamid
 * Date: 13.04.12
 * Time: 00:34
 * To change this template use File | Settings | File Templates.
 */
public class DataReaderClient3 {

                ;;;;    ;;;;;;;;;;;;;;
        private ApplicationContext ctx = null;
        private ReaderService service = null;
        public DataReaderClient3() {
            ctx = new ClassPathXmlApplicationContext("de/boostmedia/reader-beans.xml");

        }
        public String getData() {
            service = (ReaderService) ctx.getBean("readerService");
           return service.fetchData();
        }
        public static void main(String[] args) {
            DataReaderClient3 client = new DataReaderClient3();
            System.out.println("Data:"+client.getData());
        }
    }



