/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package a.json;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author ekaterina
 */
public class Json {

    public static void main(String[] args) throws FileNotFoundException, NullPointerException, IOException, NotTextFileException {
       
        JsonTest test = new JsonTest();
//        test.testTextFormat();
//        test.testFailTextFormat();
//        test.testNullPointer();
//        test.testFailNullPointer();
//        test.testFileNotFound();
//        test.testFailFileNotFound();
        test.testReadJson();
        test.testFailReadJson();
    }
}
