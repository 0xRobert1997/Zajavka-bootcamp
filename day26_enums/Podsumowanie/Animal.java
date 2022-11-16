package Zajavka.days.day26_enums.Podsumowanie;



public enum Animal implements Voicable{
    //enum może tylko implementować interface'y
    // jak damy abstrakcyjną metodę w enumie to każdy enum musi ją zaimplementować

    REINDEER("How how "){
        @Override
        public String sing() {
            return "we are singing";
        }
    },
    SHARK("Shhhr "){
        @Override
        public String sing() {
            return "we are singing";
        }
    },
    CROCODILE("Cwap "){
        @Override
        public String sing() {
            return "we are singing";
        }
    },
    FROG("Rybyt "){
        @Override
        public String sing() {
            return "we are singing";
        }
    },
    GIRAFFE("<eating_leaves> "){
        @Override
        public String sing() {
            return "we are singing";
        }
    };

    private final String message;

    private Animal(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String makeVoice() {
        return this.message;
    }

    public abstract String sing();
}
