/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.json;

import java.io.FileNotFoundException;
import java.io.IOException;
import junit.framework.Assert;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author ekaterina
 */
public class JsonTest {
//3. Написать метод, считывающий файл JSON (имя файла передается через аргумент)
//и определяющий корректность расставленных скобок {{}} 
//[] возвращает 0, если все правильно, или позицию проблемы (начиная с 1)
//Метод должен бросать исключения
//NullPointer если передали пустое имя файла
//Исключение, если файл не найден,
//Исключение, если файл не текстовый (проверка на буквы, цифры, знаки препинания)
    @Test
    public void testTextFormat() throws NullPointerException, IOException, FileNotFoundException, NotTextFileException {
        
        JsonForTest json = new JsonForTest();
        assertEquals(json.readJson("/Users/ekaterina/Downloads/transport.json"), 0);
        
    }
    
    @Test
    public void testFailTextFormat() throws NullPointerException, IOException, FileNotFoundException, NotTextFileException {
        
        JsonForTest json = new JsonForTest();
        try {
            json.readJson("/Users/ekaterina/Downloads/IMG_20240408_173717.jpg");
        }
        catch(NotTextFileException e) {
            Assert.fail("Метод не прошел проверку");
        }
        
    }
  
    @Test
    public void testNullPointer() throws NullPointerException, IOException, FileNotFoundException, NotTextFileException {

        JsonForTest json = new JsonForTest();
        assertEquals(json.readJson("/Users/ekaterina/Downloads/transport.json"), 0); 
        
    }
    
    @Test 
    public void testFailNullPointer() throws IOException, FileNotFoundException, NotTextFileException {

        JsonForTest json = new JsonForTest();
        try {
            json.readJson(null);
        }
        catch(NullPointerException e) {
            Assert.fail("Метод не прошел проверку");
        }
        
    }
    
    @Test
    public void testFileNotFound() throws NullPointerException, IOException, FileNotFoundException, NotTextFileException {

        JsonForTest json = new JsonForTest();
        assertEquals(json.readJson("/Users/ekaterina/Downloads/transport.json"), 0); 
        
    }
    
    @Test 
    public void testFailFileNotFound() throws IOException, FileNotFoundException, NotTextFileException {

        JsonForTest json = new JsonForTest();
        try {
            json.readJson("NotFoundFile.txt");
        }
        catch(FileNotFoundException e) {
            Assert.fail("Метод не прошел проверку");
        }
    }
    
    @Test
    public void testReadJson() throws NullPointerException, IOException, FileNotFoundException, NotTextFileException {
                
        JsonForTest json = new JsonForTest();
        assertEquals(json.readJson("/Users/ekaterina/Downloads/transport.json"), 0);
        
    }
    
    @Test
    public void testFailReadJson() throws NullPointerException, IOException, FileNotFoundException, NotTextFileException {
                
        JsonForTest json = new JsonForTest();
        if(json.readJson("/Users/ekaterina/Downloads/transport.json") != 0) {
            Assert.fail("Метод не прошел проверку");
        }
        
    }
    
    
}
