package hw4;
import java.awt.Color;

import api.Block;
import api.Cell;
import api.Position;

/**
*@Author Andrei Baechle
**/

public class OShape extends AbstractShape {
	
	/**Constructs an OShape with the given position and magic state.
	 * 
	 * @param position
	 * @param magic
	 */
	public OShape(Position position, boolean magic)
	{
		super(position, magic, 4 );
		pos = position;
		cells = new Cell[4];
		cells[0] = new Cell(new Block(Color.YELLOW, magic), pos );
		
		 Position pos1 = new Position(pos.row(), pos.col() + 1);
		    cells[1] = new Cell(new Block(Color.YELLOW, false), pos1);
		    
		 Position pos2 = new Position(pos.row() + 1, pos.col());
		    cells[2] = new Cell(new Block(Color.YELLOW, false), pos2);
		    
		 Position pos3 = new Position(pos.row() + 1, pos.col() + 1);
		    cells[3] = new Cell(new Block(Color.YELLOW, false), pos3);
	}
	
    
	
	@Override
	public void transform()
	{
		
	}
	
}

