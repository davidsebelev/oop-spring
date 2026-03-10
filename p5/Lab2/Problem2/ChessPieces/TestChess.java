public class TestChess {
    public static void main(String[] args) {

        Rook rook = new Rook(new Position(0, 0));
        System.out.println("Rook (0,0) -> (0,5): " + rook.isLegalMove(new Position(0, 5)));
        System.out.println("Rook (0,0) -> (3,3): " + rook.isLegalMove(new Position(3, 3))); 

      
        Bishop bishop = new Bishop(new Position(2, 2));
        System.out.println("Bishop (2,2) -> (5,5): " + bishop.isLegalMove(new Position(5, 5)));
        System.out.println("Bishop (2,2) -> (2,5): " + bishop.isLegalMove(new Position(2, 5))); 


        Knight knight = new Knight(new Position(4, 4));
        System.out.println("Knight (4,4) -> (6,5): " + knight.isLegalMove(new Position(6, 5)));
        System.out.println("Knight (4,4) -> (5,5): " + knight.isLegalMove(new Position(5, 5))); 


        King king = new King(new Position(3, 3));
        System.out.println("King (3,3) -> (4,4): " + king.isLegalMove(new Position(4, 4)));
        System.out.println("King (3,3) -> (5,5): " + king.isLegalMove(new Position(5, 5))); 

   
        Queen queen = new Queen(new Position(1, 1));
        System.out.println("Queen (1,1) -> (1,7): " + queen.isLegalMove(new Position(1, 7)));
        System.out.println("Queen (1,1) -> (6,6): " + queen.isLegalMove(new Position(6, 6)));
        System.out.println("Queen (1,1) -> (2,4): " + queen.isLegalMove(new Position(2, 4))); 

  
        Pawn pawn = new Pawn(new Position(1, 3));
        System.out.println("Pawn (1,3) -> (2,3): " + pawn.isLegalMove(new Position(2, 3)));
        System.out.println("Pawn (1,3) -> (3,3): " + pawn.isLegalMove(new Position(3, 3))); 
    }
}