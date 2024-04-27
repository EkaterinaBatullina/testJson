/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.json;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Stack;

/**
 *
 * @author ekaterina
 */
public class JsonForTest {
    
    public int readJson(String file) throws NullPointerException, FileNotFoundException, IOException, NotTextFileException {
    
        int result = 0, currentResult = 0;
        InputStream json = new FileInputStream(file);
        int b;
        Stack<Character> stack = new Stack<>();
        while ((b = json.read()) != -1) {
            currentResult++;
            if ((b >= 'A' && b <= 'z') || 
            (b >= '0' && b <= '9') || 
            (b == '"' || b == ':' || b == ',' || b == '[' || b == ']' || b == '{' || b == '}' || b == '%'
            || b == ' ' || b == '\n' || b == '.' || b == '|' || b == '&' || b == '/' || b == '?' || b == '=')) {
                if (b == '{' || b == '[') {
                    stack.add((char) b);
                }
                else if (b == '}' || b == ']') {
                    if (stack.isEmpty()) {
                        result = currentResult;
                        break;
                    }
                    char last = stack.pop();
                    if ((last == '{' && b ==']') || (last == '[' && b =='}')) {
                        result = currentResult;
                        break;
                    }
                }
            }
            else {
                System.out.println(currentResult);
                System.out.println(b);
                System.out.println((char)b);
                throw new NotTextFileException("Файл не текстовый");
            }
        }
        return result;
    }
}
