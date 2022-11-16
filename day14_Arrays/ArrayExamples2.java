package Zajavka.days.day14_Arrays;

public class ArrayExamples2 {
    public static void main(String[] args) {

        ArrayExamples2 arrayExamples = new ArrayExamples2();
        arrayExamples.arraysExample2();
    }

        private void arraysExample2() {
            double[] array = new double[]{1.0, 2.5, 3.72, 3.0, 9.34, 1.29, 2.55, 1.23894};

            double total = 0;
            //pętla for each
            for (double element : array) {
                total += element;
            }
            System.out.println("Total: " + total);

            //szuka najwiekszej wartosci w tablicy
            double maximum = array[0];
            for (int i = 0; i < array.length; i++){
                if (array[i] > maximum) {
                    maximum = array[i];
                }
            }
            System.out.println("Maximum: " + maximum);
        }
    }


