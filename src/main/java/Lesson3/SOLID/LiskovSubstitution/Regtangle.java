package Lesson3.SOLID.LiskovSubstitution;
//краще для обох класів використовувати спільний інтерфейс а не наслідувати один клас від одного!
public class Regtangle implements Figura{
    int hidth;
    int width;

    public int geHiidth() {
        return hidth;
    }

    public int getWidth() {
        return width;
    }


    public void setHidth(int hidth) {
        this.hidth = hidth;
    }


    public void setWidth(int width) {
        this.width = width;
    }

   public int  square(int hidth, int width){
        int square = hidth* width;
        return square;
   };

}
