package com.lockedme.src;

import java.io.File;
import java.util.Scanner;

public class LockedMeServices {
    //String directoryPath=System.getProperty("user.dir")+"\\com\\lockedme\\resources\\filesholder";


 void displayAllFilesInAscOrder(String directoryPath) {
        File file = new File(directoryPath);
        File[] filesSet = file.listFiles();
        for (File file2 : filesSet) {
            System.out.println(file2.getName());
        }

 }

 public void performOperation(String directoryPath)
{
    System.out.println("1.Add a file from directory");
    System.out.println("2.Delete a file from directory");
    System.out.println("3.Search for a file from a directory");
    System.out.println("4.Navigate Back");
    System.out.println("****************************************************");
    System.out.println("Enter you choice");
    Scanner sc=new Scanner(System.in);
    int operationChoice=sc.nextInt();
    String fileName="";

 switch (operationChoice)
 {
     case 1:
         System.out.println("Enter file name");
         fileName=sc.next();
         addFile(fileName,directoryPath);
         break;
     case 2:
         System.out.println("Enter file name");
         fileName=sc.next();
         deleteFile(fileName,directoryPath);
         break;
     case 3:
         System.out.println("Enter file name");
         fileName=sc.next();
         searchFile(fileName,directoryPath);
         break;
     case 4:LockedMeUserOperations.main(null);
     break;
     default:System.out.println("Please select valid choice");
 }

}

void addFile(String file,String directoryPath)
{
    //File DirectoryFile=new File(directoryPath);
    File f=new File(directoryPath+file);
    try {
        f.createNewFile();
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }

}

void deleteFile(String file,String directoryPath)
{
    File DirectoryFile=new File(directoryPath);
    File[] files=DirectoryFile.listFiles();
    boolean isFileFound=false;
    for(File file2:files)
    {
        if(file.equals(file2.getName()))
        {
            isFileFound=true;
            if(file2.delete())
            {
                System.out.println("File got Deleted");
            }
            else
            {
              System.out.println("File not got deleted");
            }
        }
    }
    if(!isFileFound)
    {
        System.out.println("File Not Found");
    }

}

boolean searchFile(String file,String directoryPath)
{
    File DirectoryFile=new File(directoryPath);
    File[] files=DirectoryFile.listFiles();
    boolean fileExists=false;
    for(File file2:files)
    {
        if(file.equals(file2.getName()))
        {
            fileExists=true;
        }
    }
    if(fileExists==true)
    {
        System.out.println("File exist in the directory");
    }
    else
    {
        System.out.println("File exist in the directory");
    }
    return fileExists;
}

void closeApplication()
{
    Runtime.getRuntime().exit(0);
}




}
