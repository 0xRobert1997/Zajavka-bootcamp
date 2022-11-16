package Zajavka.days.day20_Initblock_Overridin.initBlocks;

public class Cabriolet extends Car{
    // blok inicjalizacyjny
    {
        this.company = "Audi";
        printDuringInitBlock();
    }
    private String company = "Mercedes";
    private String model;
    public Cabriolet(String productionYear, String company, String model) {
        super(productionYear);
        System.out.println(Cabriolet.class + " Constructor called");
        this.company = company;
        this.model = model;
    }

    public Cabriolet(String productionYear, String model) {
        super(productionYear);
        this.model = model;
    }

    private void printDuringInitBlock () {
        System.out.println("I'm printing during init block" + Cabriolet.class);
    }

    @Override
    public String toString() {
        return "Cabriolet{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
