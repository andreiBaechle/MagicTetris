package hw4;
import java.awt.Color;

import api.Block;
import api.Cell;
import api.Position;

/**
*@Author Andrei Baechle
**/

public class TShape extends AbstractShape
{
/**
 * Constructs a TShape with the given position and magic state.	
 */
	public TShape(Position position, boolean magic)
	{
		super(position, magic, 4 );
		pos = position;
		cells = new Cell[4];
		cells[0] = new Cell(new Block(Color.MAGENTA, magic), pos );
		
		 Position pos1 = new Position(pos.row() +1, pos.col() -1);
		    cells[1] = new Cell(new Block(Color.MAGENTA, false), pos1);
		    
		 Position pos2 = new Position(pos.row() +1, pos.col());
		    cells[2] = new Cell(new Block(Color.MAGENTA, false), pos2);
		    
		 Position pos3 = new Position(pos.row() +1 , pos.col() +1);
		    cells[3] = new Cell(new Block(Color.MAGENTA, false), pos3);
	}
	
	public void transform() 
	{
	cells = this.getCells();
	
		int i;
		int row = 0;
		int col = 0;
		
	  for (i = 0; i < cells.length; i++)
		   
		col = cells[i].getCol()*(-1);
	    row = cells[i].getRow();
		cells[i].setRow(pos.row()+col);
		cells[i].setCol(pos.col()+row);
	}

}

	
	
	
