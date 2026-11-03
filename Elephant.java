public abstract class Elephant extends Animal{
    public Elephant(String name, String dateOfBirth){
        super(name,dateOfBirth);
    }

    @Override
    public void makeSound(){
        System.out.println("PFFFFFT");
    }

    public String toString(){
        String out = "Details for an Elephant";
        return out;
    }
}