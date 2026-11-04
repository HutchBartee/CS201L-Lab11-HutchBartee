import java.io.*;
import java.util.*;

public class Functions{
    public static void processFile(String filename, String errorLog, ArrayList<Animal> zoo){
        try(
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            PrintWriter errWriter = new PrintWriter(new FileWriter(errorLog));
        ){
            String line;
            reader.readLine();
            while((line = reader.readLine()) != null){
                try{
                    String[] tokens = line.split(",");
                    processAnimal(line, tokens[0], tokens[1], tokens[2], zoo, errorLog);
                }
                catch(Exception e){
                    errWriter.println("Error - " + line);
                }
            }
        }
        catch(Exception e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void processAnimal(String line, String species, String name, String dateOfBirth, ArrayList<Animal> zoo, String errorLog){
        try(PrintWriter errWriter = new PrintWriter(new FileWriter(errorLog))){
            if(species.equalsIgnoreCase("LION")){
                Animal i = new Lion(name, dateOfBirth);
                zoo.add(i);
            }
            else if(species.equalsIgnoreCase("ELEPHANT")){
                Animal i = new Elephant(name, dateOfBirth);
                zoo.add(i);
            }
            else if(species.equalsIgnoreCase("MONKEY")){
                Animal i = new Monkey(name, dateOfBirth);
                zoo.add(i);
            }
            else{
                errWriter.println("Invalid animal type - " + line);
            }
        }
        catch(Exception e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void printReport(ArrayList<Animal> zoo){
        System.out.printf("%-10s%-15s%-10s  %-5s%-10s%-15s\n","NAME", "SPECIES","DATE OF BIRTH","AGE ","SLEEP","SOUND");
        for(Animal a : zoo){
            System.out.println(a.toString());
        }
    }
}