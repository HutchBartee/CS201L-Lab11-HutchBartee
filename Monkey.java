public abstract class Monkey extends Animal{
    public Monkey(String name, String dateOfBirth){
        super(name,dateOfBirth);
    }

    @Override
    public void makeSound(){
        System.out.println("OO OO AH AHH");
    }

    public String toString(){
        String out = "Details for a Monkey";
        return out;
    }
}