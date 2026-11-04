import java.text.SimpleDateFormat; // Ashkan Aryan on stackoverflow
import java.util.*;

public class Lion extends Animal{
    public Lion(String name, String dateOfBirth){
        super(name,dateOfBirth);
    }

    @Override
    public String makeSound(){
        return "ROAR";
    }

    public String sleep(){
        SimpleDateFormat dF = new SimpleDateFormat("HH:mm:ss");
        String time = dF.format(new Date());
        String[] splitTime = time.split(":");
        int currentHour = Integer.parseInt(splitTime[0]);
        if(((currentHour > 3) && (currentHour < 17))
            || (currentHour > 19) && (currentHour < 22)){
            return "sleeping";
        }
        else{
            return "awake";
        }
    }

    public String toString(){
        String out = String.format("%-10s%-15s%-10s%8.0f  %-10s%-15s",name,"LION",dateOfBirth,getAge(),sleep(),makeSound());
        return out;
    }
}