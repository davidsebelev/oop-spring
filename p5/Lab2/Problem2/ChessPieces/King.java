public class King extends Piece {
    public King(Position position){
        super(position);
    }

    @Override 

    public boolean isLegalMove(Position b){
        if(!b.isOnBoard()) return false;

        if(a.getRow() == b.getRow() && a.getCol() == b.getCol()) return false;

        boolean firstCheck = Math.abs(a.getRow() - b.getRow()) <=1;
        boolean secondCheck = Math.abs(a.getCol() - b.getCol()) <=1 ;

        return firstCheck && secondCheck;
    }
    
}