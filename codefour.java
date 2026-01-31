class Animal {
    void Sound(){
        System.out.println("Hello ");
    }
}
class Dog extends Animal{
    @Override
    void Sound(){
        System.out.println("HI");
    }
}
class codefour{
    public static void main(String[]args){
        Dog d = new Dog();
        d.Sound();
    }
}