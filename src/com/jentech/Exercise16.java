package com.jentech;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise16 {
    public static void main(String[] args) {
        String data = """
                id,first_name,last_name,email,gender
                1,Fanchette,Williamson,fwilliamson0@github.com,F
                2,Aleksandr,Matts,amatts1@webs.com,M
                3,Maurie,Cordero,mcordero2@google.co.jp,M
                4,Donnajean,Crowson,dcrowson3@google.com.hk,F
                5,Ricardo,Gofton,rgofton4@nytimes.com,M
                6,Gabie,Tregenna,gtregenna5@guardian.co.uk,F
                7,Marjorie,Blumsom,mblumsom6@joomla.org,F
                8,Lester,Huyghe,lhuyghe7@jugem.jp,M
                9,Merrily,Stangoe,mstangoe8@tiny.cc,F
                10,Reider,Karel,rkarel9@github.io,M
                11,Dory,Jolliff,djolliffa@wufoo.com,F
                12,Homerus,Averay,haverayb@skyrock.com,M
                13,Alyda,Muglestone,amuglestonec@is.gd,F
                14,Pinchas,Louca,ploucad@google.es,M
                15,Cherin,Eltringham,celtringhame@parallels.com,F
                16,Mufi,Rothert,mrothertf@dropbox.com,F
                17,Jordana,Everex,jeverexg@ucla.edu,F
                18,Belle,Rother,brotherh@auda.org.au,F
                19,Clevie,Sifflett,csiffletti@furl.net,M
                20,Gretchen,Abell,gabellj@1688.com,F
                """;

        try {

            // Provide the file path where the data.csv file should be created
            String filePath = "src/data.csv";

            // Create a new BufferedWriter with FileWriter to write to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));

            // Write the data string to the file
            writer.write(data);

            // Close the writer to release resources
            writer.close();

            System.out.println("Data written to the file successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
