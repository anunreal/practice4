public class Dog {
    private String name;
    private String breed;
    private int age;

    Dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public int getAge(){
        return age;
    }

    void bark(){
        System.out.println("gav");
    }
    void eat(String food){
        System.out.println("the dog by name " + name + " eat " + food + ".");
    }
}
