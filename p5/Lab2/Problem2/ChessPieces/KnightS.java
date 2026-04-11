public class KnightS extends Piece {

    public KnightS(Position a){
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b){
        if(!b.isOnBoard()) return false;

        if(a.getRow() == b.getRow() && a.getCol() == b.getCol()) return false;

        int dx = Math.abs(a.getRow() - b.getRow());
        int dy = Math.abs(a.getCol() - b.getCol());

        return ((dx == 2 && dy == 1) || (dx == 1 && dy == 2));

    }
    
}
