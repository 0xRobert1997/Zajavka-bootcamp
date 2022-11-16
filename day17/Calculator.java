package Zajavka.days.day17;

public class Calculator {

// this mówi żeby program odwołał się do pola obiektu a nie argumentu

    // przypisanie podanego argumentu do pola obiektu
//    public Calculator(String name) {
//         this.model = model;
//    }

    public String name;
    public Calculator(String name) {

        this.name = name;
    }

//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (obj instanceof Calculator) {
//            return false;
//        }
//        Calculator calculator = (Calculator) obj;
//        return calculator.name.equals(this.name);
//        // this jest tu niepotrzebne ale zwiększa czytelność
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Calculator that = (Calculator) o;

        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
