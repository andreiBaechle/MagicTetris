package hw4;

import java.awt.Color;

import api.Block;
import api.Cell;
import api.Position;

/**
*@Author Andrei Baechle
**/

public class SZShape extends AbstractShape
{
	/**
	 * Constructs an SZShape with the given position and magic state.
	 */
	private boolean flag=true,mag;
	public SZShape(Position position, boolean magic)
	{
		super(position, magic, 4 );
			pos = position;
			cells = new Cell[4];
			mag=magic;
			cells[0] = new Cell(new Block(Color.GREEN, magic), pos );
			
			 Position pos1 = new Position(pos.row() + 1, pos.col());
			    cells[1] = new Cell(new Block(Color.GREEN, false), pos1);
			    
			 Position pos2 = new Position(pos.row() + 1, pos.col() + 1);
			    cells[2] = new Cell(new Block(Color.GREEN, false), pos2);
			    
			 Position pos3 = new Position(pos.row() + 2, pos.col() + 1);
			    cells[3] = new Cell(new Block(Color.GREEN, false), pos3);
		}
	
	/**
	 * Cycles the blocks within the cells of this shape. Each block is shifted
	 *  forward to the next cell (in the original ordering of the cells). The 
	 *  last block wraps around to the first cell.
	 */
	@Override
	public void transform()
	{
		if(flag)
		{
		pos = new Position(pos.row(), pos.col() +1 );
		cells[0] = new Cell(new Block(Color.RED, false), pos );
		
		 Position pos1 = new Position(pos.row() + 1, pos.col() + 1 );
		    cells[1] = new Cell(new Block(Color.RED, false), pos1);
		    
		 Position pos2 = new Position(pos.row() + 1, pos.col());
		    cells[2] = new Cell(new Block(Color.RED, false), pos2);
		    
		 Position pos3 = new Position(pos.row() + 2, pos.col());
		    cells[3] = new Cell(new Block(Color.RED, false), pos3);
	
		flag=false;
		}
		else
		{	
			cells = new Cell[4];
			cells[0] = new Cell(new Block(Color.GREEN, mag), pos );
			
			 Position pos1 = new Position(pos.row() + 1, pos.col());
			    cells[1] = new Cell(new Block(Color.GREEN, false), pos1);
			    
			 Position pos2 = new Position(pos.row() + 1, pos.col() + 1);
			    cells[2] = new Cell(new Block(Color.GREEN, false), pos2);
			    
			 Position pos3 = new Position(pos.row() + 2, pos.col() + 1);
			    cells[3] = new Cell(new Block(Color.GREEN, false), pos3);
			    flag=true;
		}
		
	}
}

	
