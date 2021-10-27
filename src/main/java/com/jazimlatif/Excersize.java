package com.jazimlatif;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Excersize {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data.txt");
        try {
            boolean created = file.createNewFile();
            System.out.println(created);
        } catch (Exception e) {
            System.out.println("sorry, file could not be created!");
        }
        try {
            FileWriter fileWriter = new FileWriter("data.txt", false);
            fileWriter.write("id,first_name,last_name,email,gender\n" +
                    "1,Fanchette,Williamson,fwilliamson0@github.com,F\n" +
                    "2,Aleksandr,Matts,amatts1@webs.com,M\n" +
                    "3,Maurie,Cordero,mcordero2@google.co.jp,M\n" +
                    "4,Donnajean,Crowson,dcrowson3@google.com.hk,F\n" +
                    "5,Ricardo,Gofton,rgofton4@nytimes.com,M\n" +
                    "6,Gabie,Tregenna,gtregenna5@guardian.co.uk,F\n" +
                    "7,Marjorie,Blumsom,mblumsom6@joomla.org,F\n" +
                    "8,Lester,Huyghe,lhuyghe7@jugem.jp,M\n" +
                    "9,Merrily,Stangoe,mstangoe8@tiny.cc,F\n" +
                    "10,Reider,Karel,rkarel9@github.io,M\n" +
                    "11,Dory,Jolliff,djolliffa@wufoo.com,F\n" +
                    "12,Homerus,Averay,haverayb@skyrock.com,M\n" +
                    "13,Alyda,Muglestone,amuglestonec@is.gd,F\n" +
                    "14,Pinchas,Louca,ploucad@google.es,M\n" +
                    "15,Cherin,Eltringham,celtringhame@parallels.com,F\n" +
                    "16,Mufi,Rothert,mrothertf@dropbox.com,F\n" +
                    "17,Jordana,Everex,jeverexg@ucla.edu,F\n" +
                    "18,Belle,Rother,brotherh@auda.org.au,F\n" +
                    "19,Clevie,Sifflett,csiffletti@furl.net,M\n" +
                    "20,Gretchen,Abell,gabellj@1688.com,F");
            fileWriter.close();
            Scanner scanner = new Scanner(file);
            ArrayList<Person> people = new ArrayList<>();
            while (scanner.hasNextLine()) {

                    String line = scanner.nextLine();
                    String[] mod = line.split(",");
                    Person newPerson = new Person(mod[0], mod[1], mod[2], mod[3], mod[4]+"\n");
                    people.add(newPerson);

            }
        System.out.println(people);
    } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

