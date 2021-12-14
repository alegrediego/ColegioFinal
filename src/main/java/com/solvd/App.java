package com.solvd;

import org.apache.log4j.Logger;


import java.io.*;
import java.util.*;
import java.util.function.BiConsumer;


public class App {

    private static Logger Logjava = Logger.getLogger(App.class);

    public static void main(String[] args) throws IOException {

        Year[] levelyear = Year.values();
        for (int i = 0; i < levelyear.length; i++) {

        }

        Subjects.subjects[] sub = Subjects.subjects.values();
        for (int i = 0; i < sub.length; i++) {

        }


        Students aa = new Students("Diego", "Alegre", "33241378", levelyear[6], sub[0]);
        Students ab = new Students("Nicolas", "Costurie", "45794147", levelyear[5], sub[2]);
        Students ac = new Students("Romina", "Alegre", "30187946", levelyear[4], sub[1]);
        Students ad = new Students("Camila", "Kusnier", "39487124", levelyear[3], sub[3]);
        Students ae = new Students("Rosenda", "Yedro", "6137173", levelyear[0], sub[4]);

        Level[] levels = Level.values();
        for (int i = 0; i < levels.length; i++) {
        }


        Teachers ba = new Teachers("Juan", "Perez", "20154798", levels[5]);
        Teachers bb = new Teachers("Pedro", "Ramirez", "18546319", levels[4]);
        Teachers bc = new Teachers("Rodrigo", "Malo", "25840323", levels[3]);


        Assistant ca = new Assistant("Juana", "Molina", "15784987", levels[2]);
        Assistant cb = new Assistant("Rosa", "Rodriguez", "92784555", levels[0]);
        Assistant cc = new Assistant("Manuela", "Gonzalez", "19785143", levels[1]);



        Whiteboard w1 = new Whiteboard("Whiteboard1");

        Desk d1 = new Desk("Desk2");

        //Linkedlist
        List<Students> students = new LinkedList<>();
        students.add(aa);
        students.add(ab);
        students.add(ac);

        students.forEach(students1 -> Logjava.info(students1.getName()));


        List<Teachers> teachers = new LinkedList<>();
        teachers.add(ba);
        teachers.add(bb);
        teachers.add(bc);

        teachers.forEach(teachers1 -> Logjava.info(teachers1.getName()));

        List<Assistant> assistants = new LinkedList<>();
        assistants.add(ca);
        assistants.add(cb);
        assistants.add(cc);


        assistants.forEach(assistants1 -> Logjava.info(assistants1.getName()));



        Set<Teachers> Present = new HashSet<>();
        Present.add(ba);
        Present.add(bc);


        Present.forEach(Present1 -> Logjava.info(Present1.yes()));


        List<Person> NotPresent = new ArrayList<>();
        NotPresent.add(bb);
        NotPresent.add(ca);

        NotPresent.forEach(NotPresent1 -> Logjava.info(NotPresent1.no()));

        //ArrayList
        List<Furniture> Brk = new ArrayList<>();
        Brk.add(w1);
        Brk.add(d1);

        Brk.forEach(Brk1 -> Logjava.info(Brk1.broken()));

        //Maps
        Map<Integer, Students> NS = new HashMap<>();
        NS.put(0, ad);
        NS.put(0, ae);


        NS.forEach((integer, students12) -> Logjava.warn(NS.get(0).getName()));

        File file = new File("nothing.txt");
        BufferedReader br = null;
        try {
            java.io.FileReader fr = new java.io.FileReader(file);
            br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            Logjava.error("File not found: " + file.toString());

        }

    }
}