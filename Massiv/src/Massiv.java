public class Massiv {
    public enum Nabor{
        Cat,
        Dogg,
        Bird,
        Cheetah,
        Tiger;

        String  horse;

        @Override
        public String toString(){
            return horse;
        }
    }

    public static void main(String arg[]) {

        Nabor an = Nabor.Cat;
        if (an == Nabor.Cat)
            System.out.println("Кот");
        System.out.println("an.name()=" + an.name() + " an.toString()=" + an.toString() + " an.ordinal()=" + an.ordinal());

        String[] mass = {" Cats ", " Dogs ", " Birds ", " Tigers ", " Cheetahs "};

        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i]);
        }
        System.out.println();

        int t = mass.length;
        String temp;

        for (int i = 0; i < t / 2; i++) {
            temp = mass[t - i - 1];
            mass[t - i - 1] = mass[i];
            mass[i] = temp;
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i]);
        }
        System.out.println();

        int f = mass.length;
        String mop;

        if (mass.length < 2)
            return;

        int border = (f + 1) / 2;

        for (int i = 0; i < f / 2; i++) {
            mop = mass[i];
            mass[i] = mass[border + i];
            mass[border + i] = mop;

            for (i = 0; i < mass.length; i++) {
                System.out.print(mass[i]);
            }
        }
    }
}
