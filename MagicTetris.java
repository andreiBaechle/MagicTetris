
package hw4;

/**
*@Author Andrei Baechle
**/

import java.util.ArrayList;
import java.util.List;

import api.AbstractGame;
import api.Position;

/**
 * MagicTetris implementation.
 */
public class MagicTetris extends AbstractGame
{
  /**
   * Constructs a game with the given width (columns) and height (rows).
   * This game will use a new instance of BasicGenerator to 
   * generate new shapes.
   * @param width
   *   width of the game grid (number of columns)
   * @param height
   *   height of the game grid (number of rows)
   */
  public MagicTetris(int width, int height)
  {
    super(width, height, new BasicGenerator());
  }
/**
 * Returns a list of locations for all cells that form part of a collapsible set.
 *  This list may contain duplicates.
 */
  @Override
  public List<Position> determinePositionsToCollapse()
  {
	  List<Position> positions = new ArrayList<>();
    return positions;
  }

  /**
   * Returns the current score.
   */
  @Override
  public int determineScore()
  {
    return 0;
  }

}
