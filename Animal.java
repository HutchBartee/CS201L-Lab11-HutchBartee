import java.text.SimpleDateFormat;
import java.util.*; // Ashkan Aryan on stackoverflow

public abstract class Animal{
    protected String name;
    protected String dateOfBirth;

    // default constructor
    public Animal(){
        this.name = "Unkown";
        this.dateOfBirth = "1970-01-01";
    }

    // overloaded constructor
    public Animal(String name, String DOB){
        this.name = name;
        this.dateOfBirth = DOB;
    }

    // getters + setters
    public String getName(){return name;}
    public String getDateOfBirth(){return dateOfBirth;}

    public void setName(String name){this.name = name;}
    public void setDateOfBirth(String dateOfBirth){this.dateOfBirth = dateOfBirth;}

    // get current date and calculate age
    public double getAge(){
        String[] splitDOB = dateOfBirth.split("-");
        String currentDate = new Date().toString();
        String[] splitCurrentDate = currentDate.split("-");
        double animalAge = Integer.parseInt(splitDOB[0]) - Integer.parseInt(splitCurrentDate[0]);
        if(Integer.parseInt(splitDOB[1]) <= Integer.parseInt(splitCurrentDate[1])){
            if(Integer.parseInt(splitDOB[2]) < Integer.parseInt(splitCurrentDate[2])){
                animalAge -= 1;
            }
        }
        return animalAge;
    }

    public abstract void makeSound();

    public void sleep(){
        SimpleDateFormat dF = new SimpleDateFormat("HH:mm:ss");
        String time = dF.format(new Date());
        String[] splitTime = time.split(":");
        int currentHour = Integer.parseInt(splitTime[0]);
        if((currentHour < 5) || (currentHour > 22)){
            System.out.println("sleeping");
        }
        else{
            System.out.println("awake");
        }
    }

    @Override
    public abstract String toString();
}