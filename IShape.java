package hw4;

import java.awt.Color;

import api.Block;
import api.Cell;
import api.Position;

/**
*@Author Andrei Baechle
**/

public class IShape extends AbstractShape {
	

	/**
	 * Constructs an IShape with the given position and magic state.
	 */
	public IShape(Position position, boolean magic)
	{
		super(position, magic, 3 );
		pos = position;
		cells = new Cell[3];
		cells[0] = new Cell(new Block(Color.CYAN, magic), pos );
		
		 Position pos1 = new Position(pos.row() + 1, pos.col());
		    cells[1] = new Cell(new Block(Color.CYAN, false), pos1);
		    
		 Position pos2 = new Position(pos.row() + 2, pos.col());
		    cells[2] = new Cell(new Block(Color.CYAN, false), pos2);
	}
	
}
