package Zajavka.days.day59_memberInnerClass;

import java.util.List;

public class IBlockOfFlats  {

    private List<BlockOfFlats.Flat> flats;

    public IBlockOfFlats() {
    }


    public List<BlockOfFlats.Flat> getFlats() {
        return flats;
    }


    public String getString() {
        return null;
    }

    private class AmazingFlat implements Flat {

        @Override
        public String getString() {
            return "Amazing String";
        }
    }

    private interface Flat {
         String getString();

    }

}
