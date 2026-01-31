class Animal {
    Animal(){
        System.out.println("Cat ");
    }
}
class Cat extends Animal{
    public Cat(){
        super();
    }
    void Sound(){
        System.out.println("meow meow");
    }
}
class codefive{
    public static void main(String[]args){
        Cat ca = new Cat();
        ca.Sound();
    }
}