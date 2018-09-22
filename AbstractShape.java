
package hw4;

import api.Cell;
import api.Position;
import api.Shape;

/**
*@Author Andrei Baechle
*/

/**
 * Abstract superclass for implementations of the Shape interface.
 */
public abstract class AbstractShape implements Shape
{
	protected Cell[] cells;
	protected Position pos;

	
	protected AbstractShape(Position position, boolean magic, int size)
	{
		 pos = position;
		 cells = new Cell[size];
	}
	/**
	 * Returns a new array of Cell objects representing the blocks in this
	 *  shape along with their absolute positions.
	 */
	public Cell[] getCells() 
	{
		Cell[] copy = new Cell[cells.length];
		for (int i = 0; i < cells.length ; i++)
		{
			copy[i] = new Cell(cells[i]);
		}
		return copy;
	}
	
	protected void setCells(int i, Cell b)
	{
		cells[i] = b;
	}
	
	protected Cell getCells(int i)
	{
		return cells[i];
	}
	
  

  public Shape clone()
  {
    try
    {
      AbstractShape s = (AbstractShape) super.clone();

      s.pos = new Position(pos);
      s.cells = new Cell[cells.length];
      for(int i = 0; i < cells.length ; i++)
      {
      s.cells[i] = new Cell(cells[i]);
      }
      
      return s;
    }
    
    catch(CloneNotSupportedException e)
    {
   
      return null;
    }
  }
  /**
   * Shifts the position of this shape down (increasing the row)
   *  by one. No bounds checking is done.
   */
  public void shiftDown()
	{
		pos.setRow(pos.row() + 1);
		cells = this.getCells();
		
		
		for(int i = 0; i < cells.length ;  i++)
			{
				cells[i].setRow(cells[i].getRow() + 1);
			}
	}
  /**
   * Shifts the position of this shape left (decreasing the column)
   *  by one. No bounds checking is done.
   */
	public void shiftLeft()
	{
		pos.setCol(pos.col() - 1);
		cells = this.getCells();
		
		
		for(int i = 0; i < cells.length ;  i++)
			{
				cells[i].setCol(cells[i].getCol() - 1);
			}
	}
	/**
	 * Shifts the position of this shape right (increasing the column)
	 *  by one. No bounds checking is done.
	 */
	public void shiftRight()
	{
		pos.setCol(pos.col() + 1);
		cells = this.getCells();
		
		
		for(int i = 0; i < cells.length ;  i++)
			{
				cells[i].setCol(cells[i].getCol() + 1);
			}
	}
	
	public void transform() 
	{
	cells = this.getCells();
		
	  for (int i = 0; i < cells.length; i++)
	  {
		int col = cells[i].getCol()*(-1);
	    int row = cells[i].getRow();
		cells[i].setRow(pos.row()+col);
		cells[i].setCol(pos.col()+row);
	}
	}
	/**
	 * Cycles the blocks within the cells of this shape.
	 *  Each block is shifted forward to the next cell 
	 *  (in the original ordering of the cells). 
	 *  The last block wraps around to the first cell.
	 */
	public void cycle()
	{
	  cells = this.getCells();
	  for(int i = 0; i < cells.length ; i++)
	  {
		 if( i+1 < cells.length) {
			 Cell temp = new Cell(cells[i+1]);
			 cells[i+1].setBlock(cells[i].getBlock());
			 cells[i].setBlock(temp.getBlock());
		 }
		 else 
		 {
			 cells[0].setBlock(cells[cells.length].getBlock());
		 }
	  }
	}
}
