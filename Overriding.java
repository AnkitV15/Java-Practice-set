class Vehicle {

    void startEngine(){
        
    }    
}

class Car extends Vehicle {

    @Override
    void startEngine(){
        System.out.println("HmmmHmmmHmmmHmmmHmmmHmmmHmmmHmmmHmmmHmmmHmmmHmmmHmmmHmmmHmmmHmmm !!! !!! !!! !!! !!! !!!");
    }
}

class Bike extends Vehicle {

    @Override
    void startEngine(){
        System.out.println("bhmmmbhmmmbhmmmbhmmmbhmmmbhmmmbhmmmbhmmmbhmmmbhmmmbhmmmbhmmm !!! !!! !!! !!! !!!");
    }
}


public class Overriding {
    public static void main(String[] args) {
        Vehicle car1 = new Car();
        Vehicle bike1 = new Bike();

        car1.startEngine();
        bike1.startEngine();
    }
}
