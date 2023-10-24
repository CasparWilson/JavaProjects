public class Main {
    public static void main(String[] args) {

        Game game = new Game();

        Position initialRook1Position = new Position(0, 0);

        Position newRook1Position = new Position(0, 8);

        Rook rook1 = new Rook();
        rook1.position = initialRook1Position;


        if (rook1.isValidMove(newRook1Position)) {
            System.out.println("valid move");
        } else {
            System.out.println("invalid move");
        }

        Position initialQueenPosition = new Position(0, 4);
        Position newQueenPosition = new Position(9, 5);

        Queen queen = new Queen();
        queen.position = initialQueenPosition;

        if (queen.isValidMove(newQueenPosition)){
            System.out.println("valid move");
        } else {
            System.out.println("invalid move");
        }
    }
}
