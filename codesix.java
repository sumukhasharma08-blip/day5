class Animal {
    void sound(){
        System.out.println("Every animals make different sound ");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog bark like bow bow ");
    }
}
class codesix
{
    public static void main(String[]args){
        Dog d = new Dog();
        d.bark();
    }
}
