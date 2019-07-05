public class Game {
    Piece [][] board;
    // Constructor creates an empty board
    Game(){
        board = new Piece[8][8];
        System.out.println("test");
    }

        public static void main (String [] args) {

            Game game = new Game();
            //Piece piece = new Piece();
            Piece queen = new Queen();
            Piece rock  = new Rock();

            //setting the queens position:
            queen.position = new Position(4,4);
            //setting the new position after declared move
            Position nextPosition = new Position(5, 2);
            //check if nextMove is valid
            if(queen.isValidMove(nextPosition)){
                System.out.println("Yes, I can move there.");
            }
            else{
                System.out.println("Nope, can't do!");
            }

            //setting the rock position:
            rock.position = new Position(4,4);
            //setting the new position after declared move
            Position rockNextPosition = new Position(4, 10);
            //check if nextMove is valid
            if(rock.isValidMove(rockNextPosition)){
                System.out.println("Yes, I can move there.");
            }
            else{
                System.out.println("Nope, can't do!");
            }



    }

}
