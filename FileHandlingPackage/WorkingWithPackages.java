package FileHandlingPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class WorkingWithPackages implements Serializable{
    String fileName;

    public File file;
    
    FileWriter writer;
    FileReader reader;
    BufferedReader bufferReader;

    public WorkingWithPackages(){}

    WorkingWithPackages(String fileName){
        this.CreateFile(fileName);
    }
    
    public void CreateFile(String fileName){
        this.fileName = fileName;
        this.file = new File(this.fileName);
        
        try {
            writer  = new FileWriter(this.fileName);
            reader = new FileReader(this.fileName);
            bufferReader = new BufferedReader(this.reader);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void WriteFile(String stringLine){

        try {
            writer.write(stringLine);
            writer.close();
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }

    }

    public void ReadFile(){

        try {
            String line;

            while ((line = bufferReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferReader.close();

        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }

    }

    public boolean FileExists(){
        
        try {

            if(file.exists())
                 return true;
            else 
                return false;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
