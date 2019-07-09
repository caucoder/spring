package org.caucoder;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        try {
            // create object mapper
            ObjectMapper mapper = new ObjectMapper();

            // read JSON file and map/covert to Java POJO
            // data/sample-lite.json
            Student student = mapper.readValue(new File("data/sample-lite.json"), Student.class);
            // print fisrt name and last name
            System.out.println("firstName: " + student.getFirstName());
            System.out.println("lastName: " + student.getLastName());
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
