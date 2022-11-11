
package com.mycompany.java__part.six.FileDemo;

import java.io.File;


public class FileDemo__Class124 {
    public static void main(String[] args) {
        File dir = new File("parson");
        dir.mkdir(); // file create
        String ss = dir.getAbsolutePath();// to see the path of the file
        System.out.println(ss);
        
        
    }
}
