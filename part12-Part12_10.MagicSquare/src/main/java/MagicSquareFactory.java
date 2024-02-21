
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        // square.sumsOfDiagonals();
        System.out.println(square.sumsOfColumns());
        System.out.println(square.sumsOfRows());
        System.out.println(square.sumsOfDiagonals());
        // implement the creation of a magic square with the Siamese method algorithm
        // here
        return square;
    }

}
