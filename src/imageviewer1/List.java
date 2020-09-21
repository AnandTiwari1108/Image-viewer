/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageviewer1;

import java.util.*;
import java.awt.*;
import java.io.*;


/**
 *
 * @author Mihir
 */
public class List {
    
    public void Img() {
    
    File f = new File(getClass().getResource("imageviewer1/images").getFile());
    
    LinkedList<File> files = new LinkedList<>();
    
    files.addAll((Collection<? extends File>) f);
    
    
    }
}

class Demo
{
    public static void main(String args[])
    {
        List l = new List();
        l.Img();
    }
}
