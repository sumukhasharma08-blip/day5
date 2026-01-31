class Animal {
    void Sound(){
        System.out.println("Hello ");
    }
}
class Mammal extends Animal{
    void name(){
        System.out.println("HI ");
    }
}
class Human extends Mammal{
    void print(){
        System.out.println("Sharma");
    }
}
class codetwo{
    public static void main(String[]args){
        Mammal ma = new Mammal();
        ma.name();
        ma.Sound();
        Human ha = new Human();
        ha.name();
        ha.print();
        ha.Sound();
    }
}
