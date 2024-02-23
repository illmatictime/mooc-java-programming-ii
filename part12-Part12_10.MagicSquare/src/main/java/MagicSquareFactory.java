
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        System.out.println(square.sumsOfColumns());
        System.out.println(square.sumsOfRows());
        System.out.println(square.sumsOfDiagonals());
        // implement the creation of a magic square with the Siamese method algorithm
        // here
        int x = size / 2;
        int y = 0;
        int value = 1;
        square.placeValue(x, y, value);

        for (int i = 1; i < square.getHeight() * square.getWidth(); i++) {
            value += 1;

            int oldx = x;
            int oldy = y;

            if (y - 1 < 0) {
                y = square.getHeight() - 1;
            } else {
                y -= 1;
            }
            
            if (x + 1 > square.getWidth() - 1) {
                x = 0;
            } else {
                x += 1;
            }

            if (square.readValue(x, y) != 0) {
                x = oldx;
                y = oldy + 1;    
            } 
            square.placeValue(x, y, value);
        }
        return square;
    }

}
