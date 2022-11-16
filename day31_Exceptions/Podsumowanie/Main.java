package Zajavka.days.day31_Exceptions.Podsumowanie;

public class Main {

    public static void main(String[] args) {
        Driver andrzej = new Driver(19);
        Driver ryszard = new Driver(16);


        drive(ryszard, 17);
        drive(andrzej, 20);
    }

    private static void drive(Driver driver, int age) {
        try {
            driver.setAge(age);
        } catch (DriverTooYoungException | DriverTooLittleExperienceException e) {
            System.out.println(e.getMessage());
        } catch (DrivingException | NullPointerException e) {
            System.out.println("Driving | null: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(".");
        }
    }
}
