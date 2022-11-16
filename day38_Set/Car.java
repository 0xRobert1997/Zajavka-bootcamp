package Zajavka.days.day38_Set;

public class Car {

private String company;
private String model;
private int productionYear;

    public Car(String company, String model, int productionYear) {
        this.company = company;
        this.model = model;
        this.productionYear = productionYear;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (getProductionYear() != car.getProductionYear()) return false;
        if (!getCompany().equals(car.getCompany())) return false;
        return getModel().equals(car.getModel());
    }

    @Override
    public int hashCode() {
        int result = getCompany().hashCode();
        result = 31 * result + getModel().hashCode();
        result = 31 * result + getProductionYear();
        return result;
    }
}
