import java.util.Scanner;

/**
 * Created by Админ on 17.02.2017.
 */
public class Room {
    private double length;
    private double width;
    private double high;
    private int windows;



    public Room(double len, double wid, double hi, int wind)
    {
        this.length = len;
        this.width = wid;
        this.high = hi;
        this.windows = wind;
    }

    public void passport()
    {
        System.out.print("Length: ");
        System.out.println(length);
        System.out.print("Width: ");
        System.out.println(width);
        System.out.print("High: ");
        System.out.println(high);
    }

    public double square (){
        double sq = length*width;
        return sq;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double len = input.nextDouble();
        double wid = input.nextDouble();
        double hi = input.nextDouble();
        int wind = input.nextInt();
        Room room = new Room(len,wid,hi,wind);
        room.passport();
        System.out.println(room.square());

    }
}
