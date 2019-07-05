public class Queen extends Piece {
    boolean isValidMove(Position newPosition){
        // checking the parents version of isValidMove method.
        if(!super.isValidMove(newPosition)){
            return false;
        }
        // checking the specific type of Piece isValidMove method.
        if((Math.abs(newPosition.column - this.position.column) == Math.abs(newPosition.row - this.position.row)) ||
                (newPosition.column == this.position.column || newPosition.row == this.position.row)){
            return true;
        }
        else{
            return false;
        }
    }
}
