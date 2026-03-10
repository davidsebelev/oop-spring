public class Pawn extends Piece {
    public Pawn(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.isOnBoard()) return false;

        int dx = b.getRow() - a.getRow(); 
        int dy = b.getCol() - a.getCol();
        
        return (dx == 1 && dy == 0);
    }
}