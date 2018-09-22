package hw4;

import java.awt.Color;

import api.Block;
import api.Cell;
import api.Position;

/**
*@Author Andrei Baechle
**/

public class LShape extends AbstractShape
{
	/**
	 * Constructs an LShape with the given position and magic state.
	 */
		public LShape(Position position, boolean magic)
		{
			super(position, magic, 4 );
			pos = position;
			cells = new Cell[4];
			cells[0] = new Cell(new Block(Color.ORANGE, magic), pos );
			
			 Position pos3 = new Position(pos.row() + 1, pos.col());
			    cells[3] = new Cell(new Block(Color.ORANGE, false), pos3);
			    
			 Position pos2 = new Position(pos.row() + 1, pos.col() - 1 );
			    cells[2] = new Cell(new Block(Color.ORANGE, false), pos2);
			    
			 Position pos1 = new Position(pos.row() + 1, pos.col() -2 );
			    cells[1] = new Cell(new Block(Color.ORANGE, false), pos1);
			    
	}
		
}