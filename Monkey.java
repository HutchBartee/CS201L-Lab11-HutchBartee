public class Monkey extends Animal{
    public Monkey(String name, String dateOfBirth){
        super(name,dateOfBirth);
    }

    @Override
    public String makeSound(){
        return "OO OO AH AHH";
    }

    public String toString(){
        String out = String.format("%-10s%-15s%-10s%8.0f  %-10s%-15s",name,"MONKEY",dateOfBirth,getAge(),sleep(),makeSound());
        return out;
    }
}