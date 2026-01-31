interface Payment{
    void pay();
}
class Upi implements Payment{
    public void pay(){
        System.out.println("Paying");
    }
}
class codeeight{
    public static void main(String[]args){
        Upi Gpay = new Upi();
        Gpay.pay();
    }
}