package Zajavka.days.day21_Get_Set_Abstract.klasyAbstrakcyjne;

public class Cat extends Animal{
// klasa cat musi mieć abstrakcyjne metody
    // alt enter gdy kursor jest na klasie Cat i tworzymy
    private String name;

    public Cat(String name, String color){
        super(color);
        this.name = name;
    }


    @Override
    String gimmeVoice() { return "Cat meow"; }
}
