package com.jentech;

import java.io.*;
import java.util.Scanner;

public class FileExercise {
    public static void main(String[] args) {
        File createdFile = createFile("src/data.csv");
        writeToFile(createdFile,false);
        readFromFile(createdFile);

    }

    private static File createFile(String path){
        File file = new File(path);
        try {
            if(!file.exists()){
                file.createNewFile();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return file;
    }

    private static void writeToFile(File file, Boolean append){
        try {
            FileWriter fileWriter = new FileWriter(file,append);
            PrintWriter writer = new PrintWriter(fileWriter);
            writer.write("\"\"\"\n" +
                    "    id,first_name,last_name,email,gender\n" +
                    "    1,Fanchette,Williamson,fwilliamson0@github.com,F\n" +
                    "    2,Aleksandr,Matts,amatts1@webs.com,M\n" +
                    "    3,Maurie,Cordero,mcordero2@google.co.jp,M\n" +
                    "    4,Donnajean,Crowson,dcrowson3@google.com.hk,F\n" +
                    "    5,Ricardo,Gofton,rgofton4@nytimes.com,M\n" +
                    "    6,Gabie,Tregenna,gtregenna5@guardian.co.uk,F\n" +
                    "    7,Marjorie,Blumsom,mblumsom6@joomla.org,F\n" +
                    "    8,Lester,Huyghe,lhuyghe7@jugem.jp,M\n" +
                    "    9,Merrily,Stangoe,mstangoe8@tiny.cc,F\n" +
                    "    10,Reider,Karel,rkarel9@github.io,M\n" +
                    "    11,Dory,Jolliff,djolliffa@wufoo.com,F\n" +
                    "    12,Homerus,Averay,haverayb@skyrock.com,M\n" +
                    "    13,Alyda,Muglestone,amuglestonec@is.gd,F\n" +
                    "    14,Pinchas,Louca,ploucad@google.es,M\n" +
                    "    15,Cherin,Eltringham,celtringhame@parallels.com,F\n" +
                    "    16,Mufi,Rothert,mrothertf@dropbox.com,F\n" +
                    "    17,Jordana,Everex,jeverexg@ucla.edu,F\n" +
                    "    18,Belle,Rother,brotherh@auda.org.au,F\n" +
                    "    19,Clevie,Sifflett,csiffletti@furl.net,M\n" +
                    "    20,Gretchen,Abell,gabellj@1688.com,F\n" +
                    "\"\"\"");
            writer.flush();
            writer.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    private static void readFromFile(File file){
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
