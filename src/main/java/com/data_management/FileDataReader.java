package com.data_management;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileDataReader  implements DataReader{
private String Dpath;


public FileDataReader(String Dpath){
    this.Dpath = Dpath;
}
    
public void readData(DataStorage dataStorage) throws IOException{
 File folder = new File(Dpath);
 File[] files = folder.listFiles();

    if(files!= null){
  for(File file: files){
    try(BufferedReader br = new BufferedReader(new FileReader(file))){
      String line;
    while((line = br.readLine())!= null){
        String[] parts = line.split(",");
        int patientID= Integer.parseInt(parts[0]);
        double measurementV = Double.parseDouble(parts[1]);
        String recordType = parts[2];
        Long timestamp = Long.parseLong(parts[3]);
        dataStorage.addPatientData(patientID, measurementV, recordType, timestamp);
        } 
     }catch(IOException e){
        System.out.println("Error occured: " +e.getMessage()); }
     }
   }
   
 }


}



