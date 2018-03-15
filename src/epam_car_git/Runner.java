
package epam_car_git;

import java.util.LinkedList;

public class Runner {

    public static void main(String[] args) {
        LinkedList<Car> carArray = new LinkedList<>();https://github.com/ViktorTimoshchenko/Epam_training.git
        carArray.add(new Car(1, "Ford", "Focus", 2000, "red", 20000.0, "AA0001BP"));
        carArray.add(new Car(2, "Mercedes", "Vito", 2010, "white", 40000.0, "AA0002BP"));
        carArray.add(new Car(3, "Ford", "Focus", 2004, "blue", 20000.0, "AA0003BP"));
        carArray.add(new Car(4, "Audi", "TT", 2005, "green", 20000.0, "AA0004BP"));
        carArray.add(new Car(5, "Volvo", "sx80", 2006, "black", 20000.0, "AA0005BP"));
        carArray.add(new Car(6, "Volga", "2100", 2007, "red", 20000.0, "AA0006BP"));
        carArray.add(new Car(7, "Zaz", "zaz", 2008, "red", 20000.0, "AA0007BP"));
        carArray.add(new Car(8, "Ford", "Fiesta", 2009, "red", 20000.0, "AA0008BP"));
        carArray.add(new Car(9, "Ford", "GT", 2017, "red", 20000.0, "AA0009BP"));
        
        CarStatistics<Car> start = new CarStatistics<>();
        //LinkedList<Car> carArray_SortetByManufacturer = start.selectByManufacturer("Ford", carArray);
        //LinkedList<Car> carArray_SortetByModelYear = start.selectByModelAndYears("Focus", 16, carArray);
        LinkedList<Car> carArray_SortetByYearPrice = start.selectByYearAndPrice(2000, 2000, carArray);
//        for (Car car : carArray_SortetByManufacturer) {
//            System.out.println(car);
//        }
//        for (Car car : carArray_SortetByModelYear) {
//            System.out.println(car);
//        }
        for (Car car : carArray_SortetByYearPrice) {
            System.out.println(car);
        }
    }
    
}
