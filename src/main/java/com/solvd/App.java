package com.solvd;

import com.solvd.Enum.Level;
import com.solvd.Enum.Subjects;
import com.solvd.Enum.Year;
import com.solvd.Persons.Assistant;
import com.solvd.Persons.Students;
import com.solvd.Persons.Teachers;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.commons.io.FileUtils;



import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.*;



public class App {

    private static final Logger log = Logger.getLogger(App.class);

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
        log.info(StringUtils.EMPTY);

        Level[] levels = Level.values();
        for (int i = 0; i < levels.length; i++) {
        }


        Teachers ba = new Teachers("Juan", "Perez", "20154798", levels[5], sub[5]);
        Teachers bb = new Teachers("Pedro", "Ramirez", "18546319", levels[4], sub[2]);
        Teachers bc = new Teachers("Rodrigo", "Malo", "25840323", levels[3], sub[3]);
        log.info(StringUtils.EMPTY);

        Assistant ca = new Assistant("Juana", "Molina", "15784987", levels[2], 1205);
        Assistant cb = new Assistant("Rosa", "Rodriguez", "92784555", levels[0], 1137);
        Assistant cc = new Assistant("Manuela", "Gonzalez", "19785143", levels[1], 1067);
        log.info(StringUtils.EMPTY);


        Internet I1 = new Internet("January");
        Internet I2 = new Internet("February");
        Internet I3 = new Internet("March");

        Whiteboard w1 = new Whiteboard("Whiteboard1");
        Whiteboard w2 = new Whiteboard("Whiteboard2");
        Whiteboard w3 = new Whiteboard("Whiteboard3");
        Whiteboard w4 = new Whiteboard("Whiteboard4");
        Whiteboard w5 = new Whiteboard("Whiteboard5");
        Whiteboard w6 = new Whiteboard("Whiteboard6");
        Whiteboard w7 = new Whiteboard("Whiteboard7");
        Whiteboard w8 = new Whiteboard("Whiteboard8");


        Desk d1 = new Desk("Desk1");
        Desk d2 = new Desk("Desk2");
        Desk d3 = new Desk("Desk3");
        Desk d4 = new Desk("Desk4");
        Desk d5 = new Desk("Desk5");
        Desk d6 = new Desk("Desk6");
        Desk d7 = new Desk("Desk7");
        Desk d8 = new Desk("Desk8");
        Desk d9 = new Desk("Desk9");

        log.info(Furniture.getCount());
        log.info(StringUtils.EMPTY);

        Books b1 = new Books("In Search of Lost Time");
        Books b2 = new Books("Ulysses");
        Books b3 = new Books("Don Quixote");
        Books b4 = new Books("One Hundred Years of Solitude");
        Books b5 = new Books("The Great Gatsby");
        Books b6 = new Books("Moby Dick");
        Books b7 = new Books("War and Peace");

        log.info(Books.getCount());
        log.info(StringUtils.EMPTY);

        ChalksAndMarkers c1 = new ChalksAndMarkers(2, 3);
        ChalksAndMarkers c2 = new ChalksAndMarkers(1, 4);
        ChalksAndMarkers c3 = new ChalksAndMarkers(5, 3);
        ChalksAndMarkers c4 = new ChalksAndMarkers(6, 2);
        ChalksAndMarkers c5 = new ChalksAndMarkers(3, 1);
        ChalksAndMarkers c6 = new ChalksAndMarkers(5, 5);
        ChalksAndMarkers c7 = new ChalksAndMarkers(4, 2);
        log.info(DidacticMaterials.getDmcount());
        log.info(StringUtils.EMPTY);

        //Linkedlist
        List<Students> students = new LinkedList<>();
        students.add(aa);
        students.add(ab);
        students.add(ac);

        students.forEach(students1 -> log.info(students1.getName()));
        log.info(StringUtils.EMPTY);

        List<Teachers> teachers = new LinkedList<>();
        teachers.add(ba);
        teachers.add(bb);
        teachers.add(bc);

        teachers.forEach(teachers1 -> log.info(teachers1.getName()));
        log.info(StringUtils.EMPTY);

        List<Assistant> assistants = new LinkedList<>();
        assistants.add(ca);
        assistants.add(cb);
        assistants.add(cc);


        assistants.forEach(assistants1 -> log.info(assistants1.getName()));
        log.info(StringUtils.EMPTY);


        Set<Teachers> Present = new HashSet<>();
        Present.add(ba);
        Present.add(bc);


        Present.forEach(Present1 -> log.info(Present1.yes()));
        log.info(StringUtils.EMPTY);

        List<Person> NotPresent = new ArrayList<>();
        NotPresent.add(bb);
        NotPresent.add(ca);

        NotPresent.forEach(NotPresent1 -> log.info(NotPresent1.no()));
        log.info(StringUtils.EMPTY);

        List<Person> Ill = new LinkedList<>();
        Ill.add(bb);
        Ill.add(cc);

        Ill.forEach(Ill1 -> log.info(Ill1.ill()));
        log.info(StringUtils.EMPTY);

        //ArrayList
        List<Furniture> Brk = new ArrayList<>();
        Brk.add(w1);
        Brk.add(d2);

        Brk.forEach(Brk1 -> log.info(Brk1.broken()));
        log.info(StringUtils.EMPTY);

        //Maps
        Map<Integer, Students> NS = new HashMap<>();
        NS.put(0, ad);
        NS.put(0, ae);

        NS.forEach((integer, students12) -> log.warn(NS.get(0).getName()));
        log.info(StringUtils.EMPTY);

        List<Internet> InP = new LinkedList<>();
        InP.add(I1);
        InP.add(I2);

        InP.forEach(InP1 -> log.info(InP1.P1()));
        log.info(StringUtils.EMPTY);

        List<Internet> InNP = new LinkedList<>();
        InNP.add(I3);

        InNP.forEach(InNP1 -> log.info(InNP1.N1()));
        log.info(StringUtils.EMPTY);



        URL url = new URL("https://www.ole.com.ar/");
        File file = new File("C:\\Users\\alegr\\IdeaProjects\\Diego Alegre\\Colegio\\log\\garbage.txt");
        FileUtils.copyURLToFile(url,file);
        String contents = FileUtils.readFileToString(file, StandardCharsets.UTF_8.name());
        int f;
        f = StringUtils.countMatches(FileUtils.readFileToString(file),"Maradona");
        File file1 = new File("C:\\Users\\alegr\\IdeaProjects\\Diego Alegre\\Colegio\\log\\ElDiego.txt");
        FileUtils.writeStringToFile(file1,"The name Maradona is "+f+" times on this page", "UTF-8");

        log.info("The name Maradona is " +f+" times on this page");







                File file2 = new File("nothing.txt");
                BufferedReader br;
                try {
                    java.io.FileReader fr = new java.io.FileReader(file2);
                    br = new BufferedReader(fr);

                    String line;

                    while ((line = br.readLine()) != null) {
                        log.info(line);
                    }
                } catch (FileNotFoundException e) {
                    log.error("File not found: " + file2.toString());

                }

                String s = FileUtils.getUserDirectoryPath();
                log.info(s);

            }
        }

