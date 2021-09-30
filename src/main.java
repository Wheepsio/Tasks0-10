public class main {
    public static void main(String[] args)
    {
        System.out.println("");
        System.out.println("Первая задача");
        System.out.println(convert(5));
        System.out.println("");
        System.out.println("Вторая задача");
        System.out.println(points(13,12));
        System.out.println("");
        System.out.println("Третья задача");
        System.out.println(footballPoints(3,4,2));
        System.out.println(footballPoints(5,0,2));
        System.out.println(footballPoints(0,0,1));
        System.out.println("");
        System.out.println("Четвертая задача");
        System.out.println(devisibleByFive(-55));
        System.out.println("");
        System.out.println("Пятая задача");
        System.out.println(and(true,false));
        System.out.println("");
        System.out.println("Шестая задача");
        System.out.println(howManyWalls(54,1,43));
        System.out.println(howManyWalls(46,5,4));
        System.out.println(howManyWalls(100,4,5));
        System.out.println(howManyWalls(10,15,12));
        System.out.println(howManyWalls(41,3,6));
        System.out.println("");
        System.out.println("Седьмая задача");
        System.out.println(squared(5));
        System.out.println("");
        System.out.println("Восьмая задача");
        System.out.println(profitableGamble((float) 0.9,1,2));
        System.out.println("");
        System.out.println("Девятая задача");
        System.out.println(frames(10,1));
        System.out.println("");
        System.out.println("Десятая задача");
        System.out.println(mod(5,2));
        System.out.println(mod(218,5));
        System.out.println(mod(6,3));
    }
    //3 задача
    public static int footballPoints (int x,int y, int z){
        return (x*3+y);
    }
    //1 задача
    public static int convert(int x) {
        return x*60;
    }
    //2 задача
    public static int points(int x, int y) {
        return x * 2 + y * 3;
    }
    //4 задача
    public static boolean devisibleByFive(int x){
        return (x%5==0);
        }
    //5 задача
    public static boolean and(boolean x,boolean y){
        return x&&y;
    }
    //6 задача
    public static int howManyWalls(int n,int w,int h){
        return n/(w*h);}
    //7 задача
    public static int squared(int x) {
        return x * x;
    }
    //8 задача
    public static boolean profitableGamble(float x,int y,int z){
        return (x*y-z)>0;
        }
    //9 задача
    public static int frames(int x,int y){
        return x*60*y;
    }

    //10 задача
    public static int mod(int ch1,int ch2){
        return ch1-(ch1/ch2)*ch2;
    }


    }
