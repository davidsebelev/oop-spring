public class Bishop extends Piece {

    public Bishop(Position pos){
        super(pos);
    }

    @Override

    public boolean isLegalMove(Position b){
        if(!b.isOnBoard()) return false;

        if(a.getRow() == b.getRow() && a.getCol() == b.getCol()) return false;

        boolean onMainDiagonal = a.getRow() + a.getCol() ==  b.getRow() + b.getCol();
        boolean onAntiDiagonal = a.getRow() - a.getCol() ==  b.getRow() - b.getCol();

        return onMainDiagonal || onAntiDiagonal;

    }
    
}
