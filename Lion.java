import java.text.SimpleDateFormat; // Ashkan Aryan on stackoverflow
import java.util.*;

public abstract class Lion extends Animal{
    public Lion(String name, String dateOfBirth){
        super(name,dateOfBirth);
    }

    @Override
    public void makeSound(){
        System.out.println("ROAR");
    }

    public void sleep(){
        SimpleDateFormat dF = new SimpleDateFormat("HH:mm:ss");
        String time = dF.format(new Date());
        String[] splitTime = time.split(":");
        int currentHour = Integer.parseInt(splitTime[0]);
        if(((currentHour > 3) && (currentHour < 17))
            || (currentHour > 19) && (currentHour < 22)){
            System.out.println("sleeping");
        }
        else{
            System.out.println("awake");
        }
    }

    public String toString(){
        String out = "Details for a Lion";
        return out;
    }
}