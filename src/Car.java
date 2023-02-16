public class Car {
    String carColor;
    double carPrice;

    public Car(String carColor, double carPrice) {
        this.carColor = carColor;
        this.carPrice = carPrice;
    }

    double calculateCarPrice(){
return carPrice;
    }
}
class Sedan extends Car{

    Sedan(String carColor, double carPrice){
        super(carColor,carPrice);

    }
int length;

    double calculateCarPrice(int length){
        if(length>20){
            carPrice=carPrice-(carPrice*.05);
        }else{
            carPrice=carPrice-(carPrice*.10);
        }
        return carPrice;
    }
}
class Truck extends Car{
    Truck(String carColor, double carPrice){
        super(carColor,carPrice);


    }
    int weight;
    double calculateCarPrice(int weight){
if(weight>2000){
    carPrice=carPrice-(carPrice*.10);
}else{
    carPrice=carPrice-(carPrice*.20);
}
return carPrice;
    }
}
class CarTester{
    public static void main(String[] args) {
        Truck t=new Truck("blue",100000);
        System.out.println(t.calculateCarPrice(2002));
        Sedan s=new Sedan("Black",50000);
        System.out.println(s.calculateCarPrice(22));
    }
}
