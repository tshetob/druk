
/** -------------- CheckIntPosition.java -------------- **/

package Calculator;

/* Value comparator class for a given array */
public class CheckIntPosition
{
  private int[] inputArray;
  private int higherCount;
  private int lowerCount;

  public CheckIntPosition(){
    this(new int[0]);
  }
  
  public CheckIntPosition(int[] input)
  {
    this.inputArray = input;
  }
  
  /*
   * For a given integer (value), set counts 
   * that are higher or lower than said value
   */  
  private void initCount(int value){
    int higherCount_ = 0, lowerCount_ = 0;
    for (int i : inputArray){
    	if (i > value)
          higherCount_++;
      else if (i < value)
          lowerCount_++;
    }
    setCountHigherThan(higherCount_);
    setCountLowerThan(lowerCount_);
  }
          
  private void setCountHigherThan(int count) {
    higherCount = count;
  }  
          
  private void setCountLowerThan(int count) {
    lowerCount = count;
  } 
  
  public void updateInputArray(int[] input){
  	inputArray = input;
  }
  
  /* Returns String results for given integer (value) and new Integer arrays (input) */
  public String getResults(int value, int[] input){
    updateInputArray(input);
    return getResults(value);
  }
  
  /* Returns String results for given Integer (value) */
  public String getResults(int value){
  	initCount(value);
    return "above: "+ higherCount +", below: "+ lowerCount;
  }
}