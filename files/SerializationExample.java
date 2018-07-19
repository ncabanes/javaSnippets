// SerializationExample.java
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

import java.io.Serializable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

class City implements Serializable {
    
    protected String id;
    protected String name;
    
    public City(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public void display() {
        System.out.println(id + ": " + name);
    }
}


public class SerializationExample  {
    public static void main( String[] args ) 
            throws FileNotFoundException, IOException {
 
        File file = new File("Cities.dat");
        FileOutputStream outputfile = 
            new FileOutputStream(file);
        ObjectOutputStream fileOfObjects = 
            new ObjectOutputStream(outputfile);
        
        City c = new City("A", "Alicante");
        fileOfObjects.writeObject(c);
        
        c = new City("Gr", "Granada");
        fileOfObjects.writeObject(c);
        
        fileOfObjects.close();
    }
}

