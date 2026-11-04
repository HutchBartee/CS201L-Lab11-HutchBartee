public class Elephant extends Animal{
    public Elephant(String name, String dateOfBirth){
        super(name,dateOfBirth);
    }

    @Override
    public String makeSound(){
        return "PFFFFFT";
    }

    public String toString(){
        String out = String.format("%-10s%-15s%-10s%8.0f  %-10s%-15s",name,"ELEPHANT",dateOfBirth,getAge(),sleep(),makeSound());
        return out;
    }
}