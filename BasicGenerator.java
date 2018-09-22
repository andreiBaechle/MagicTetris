
package hw4;

import java.util.Random;
import api.Generator;
import api.Position;
import api.Shape;

/**
*@Author Andrei Baechle
**/

/**
 * Generator for Shape objects in MagicTetris.  All six shapes
 * are equally likely, and the generated shape is magic with
 * 20% probability.
 */
public class BasicGenerator implements Generator
{
	private Random rand = new Random();
	private int num = rand.nextInt(99)+1;
	private int mgc = rand.nextInt(99)+1;
	private boolean magic;
	
	/**
	 * Returns a new Shape instance according to this generator's strategy.
	 */
  @Override
  public Shape getNext(int width)
  {
	  int mid = width / 2;
	  
	  if(mgc>100)
	  {
		  magic = false;
	  }
	  else
	  {
		  magic = true;
	  }
		  
	  
   
    if(num >= 84.6)
    {
    	num = rand.nextInt(99)+1;
       return new IShape(new Position(-2 , mid),magic);
       
    }
    if(num >= 68)
    {
    	num = rand.nextInt(99)+1;
    	return new JShape(new Position(-1, mid), magic);
    }
    if(num >= 51.4)
    {   num = rand.nextInt(99)+1;
    	return new LShape(new Position(-1, mid + 1), magic);
    }
    if(num >= 34.8)
    {
    	num = rand.nextInt(99)+1;
    	return new OShape(new Position(0, mid), magic);
    }
    if(num >= 18.2)
    {
    	num = rand.nextInt(99)+1;
    	return new TShape(new Position(0, mid), magic);
    }
    else
    {
    	num = rand.nextInt(99)+1;
    	return new SZShape(new Position(-1 , mid), magic);
    }
    
    
  
    	
  }
}
