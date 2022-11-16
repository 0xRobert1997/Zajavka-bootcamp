package Zajavka.days.day21_Get_Set_Abstract.GettersSetters;

public class Car {

    private String company;
    private String model;
    private int productionYear;


    // gettery
    public String getCompany() {
        return this.company;
    }

    // jeśli model będzie null'em to daje default a jesli nie to tym czym podamy
    // zabezpieczenie gdybyśmy potem wywoływali metodę na nullu to będzie błąd
    public String getModel() {
        return this.model == null ? "default" : this.model;
    }

    public int getProductionYear() {
        return this.productionYear;
    }


    // settery

    public void setCompany(String company) {
        if ("brak".equals(company)) {
            System.out.println("No way mate! kekw");
            return;
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public Car(String company, String model, int productionYear) {
        this.company = company;
        this.model = model;
        this.productionYear = productionYear;
    }
}
