public class Queen extends Piece {

    public Queen(Position b){
        super(b);
    }

    @Override

    public boolean isLegalMove(Position b){
        if(!b.isOnBoard()) return false;

        if(a.getRow() == b.getRow() && a.getCol() == b.getCol()) return false;

        Rook tempRook = new Rook(this.a);
        Bishop temBishop = new Bishop(this.a);

        return tempRook.isLegalMove(b) || temBishop.isLegalMove(b);
        
    }
    
}
