class Range{

    private final long[] array;
    private int lowIndex;
    private int highIndex;

    public Range(long[] array){
        this.array = array;
        this.lowIndex = 0;
        this.highIndex = array.length - 1;
    }
    public int size(){
        return highIndex - lowIndex + 1;
    }
    public int getMiddleValue(){
        return (highIndex + lowIndex) / 2;
    }
    public void discardRightPart(){
        highIndex = getMiddleValue() - 1;
    }
    public void discardLeftPart(){
        highIndex = getMiddleValue() + 1;
    }
}
public class BinarySearch {
    public static int binarySearch(long[] array,long target) {
        Range range = new Range(array);
        while(range.size() > 0){
            long middleValue = range.getMiddleValue();
            if(target == middleValue){
                return range.getMiddleValue();
            }else if(target > middleValue){
                range.discardLeftPart();
            }else{
                range.discardRightPart();
            }
        }
        return -1;
    }

}
