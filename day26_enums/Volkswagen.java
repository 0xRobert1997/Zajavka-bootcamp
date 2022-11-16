package Zajavka.days.day26_enums;

public enum Volkswagen implements MyExampleInterface {

    PASSAT("white", 2020) {
        @Override
        public Volkswagen getifMissing() {
            return GOLF;
        }
    },
    GOLF("red", 1020) {
        @Override
        public Volkswagen getifMissing() {
            return ARTEON;
        }
    },
    ARTEON("green", 3040){
        @Override
        public Volkswagen getifMissing() {
            return GOLF;
        }
    },
    TIGUAN("blue", 2021){
        @Override
        public Volkswagen getifMissing() {
            return PASSAT;
        }
    },
    TUAREG("brown", 3020){
        @Override
        public Volkswagen getifMissing() {
            return TIGUAN;
        }
    };

    private String color;
    private int productionYear;

    Volkswagen(String color, int productionYear) {
        this.color = color;
        this.productionYear = productionYear;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }


    @Override
    public String doSomething() {
        return productionYear + "ohoho";
    }

    public static Volkswagen ofColor(String color) {
        for (Volkswagen value : values()) {
            if (color.equals(value.getColor())) {
                return value;
            }
        }
        throw new IllegalArgumentException("Color:" + color + "not found");
    }

    public abstract Volkswagen getifMissing();
}

