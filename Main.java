import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        String inputFile = "animals.txt";
        String errorFile = "error.txt";

        ArrayList<Animal> zoo = new ArrayList<>();

        Functions.processFile(inputFile, errorFile, zoo);
        Functions.printReport(zoo);
    }
}