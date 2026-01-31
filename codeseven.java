abstract class Shape{
    abstract void draw();
    void message(){
        System.out.println("Drag");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Hello");
    }
}
class codeseven{
    public static void main(String[]args){
        Circle cl = new Circle();
        cl.draw();
        cl.message();
    }
}