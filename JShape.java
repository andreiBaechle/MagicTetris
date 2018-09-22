package hw4;

import java.awt.Color;

import api.Block;
import api.Cell;
import api.Position;

/**
*@Author Andrei Baechle
**/

public class JShape extends AbstractShape
{
	/**
	 * Constructs a JShape with the given position and magic state.
	 */
		public JShape(Position position, boolean magic)
		{
			super(position, magic, 4 );
			pos = position;
			cells = new Cell[4];
			
			 Position pos1 = new Position(pos.row(), pos.col() -1 );
			    cells[0] = new Cell(new Block(Color.BLUE, false), pos1);
			    
			 Position pos2 = new Position(pos.row() + 1, pos.col() - 1 );
			    cells[1] = new Cell(new Block(Color.BLUE, false), pos2);
			    
			 Position pos3 = new Position(pos.row() + 1, pos.col());
			    cells[2] = new Cell(new Block(Color.BLUE, false), pos3);
			    
			 Position pos4 = new Position(pos.row() + 1, pos.col() + 1);
			    cells[3] = new Cell(new Block(Color.BLUE, false), pos4);
			    
	}
	
}


