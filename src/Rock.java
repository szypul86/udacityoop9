public class Rock extends Piece{
    boolean isValidMove(Position newPosition) {
        // checking the parents version of isValidMove method.
        if (!super.isValidMove(newPosition)) {
            return false;
        }
        // checking the specific type of Piece isValidMove method.
        if(newPosition.column == this.position.column || newPosition.row == this.position.row){
            return true;
        }
        else {
            System.out.println("duuupa");
            return false;

        }
    }
}

