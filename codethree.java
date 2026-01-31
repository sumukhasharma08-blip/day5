class Animal {
    void Sound(){
        System.out.println("Hello ");
    }
}
class Cat extends Animal{
    void print(){
        System.out.println("HI ");
    }
}
class Dog extends Animal{
    void name(){
        System.out.println("Jack");
    }
}
class codethree{
    public static void main(String[]args){
        Cat c = new Cat();
        c.Sound();
        c.print();
        Dog d = new Dog();
        d.Sound();
        d.name();
    }
}