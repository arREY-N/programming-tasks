package practiceCodes.examCodes;

public class Main extends Animal {
    public static void main(String[] args) {
        Animal animal = new Animal();

        System.out.println(name);
        howl(name);
        // System.out.println(age);
        System.out.println(animal.getAge());
        animal.setAge(20);
        System.out.println(animal.getAge());
    }   
    
    private static void howl(String name){
        System.out.println("The " + name + " is howling");
    }
}
