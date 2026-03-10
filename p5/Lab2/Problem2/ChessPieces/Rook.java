public class Rook extends Piece{

    public Rook(Position pos){super(pos);}

    @Override
    public boolean isLegalMove(Position b){
        if(!b.isOnBoard()) return false;

        if(a.getRow() == b.getRow() && a.getCol() == b.getCol()) return false;

        return(a.getRow() == b.getRow() || a.getCol() == b.getCol());
    }
}
