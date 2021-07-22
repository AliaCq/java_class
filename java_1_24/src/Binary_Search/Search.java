package Binary_Search;

public class Search {
    public static int[] search(long[][] array,int rows,int columns,long target) {
        Range range = new Range(array,rows,columns);
        while(range.size() > 0 ){
            long middleValue = range.getMiddleValue();
            if(middleValue == target){
                return range.getMiddleIndex();
            }else if(middleValue > target){
                range.discardRightPart();
            }else{
                range.discardLeftPart();
            }
        }
        return new int[]{-1,-1};
    }
}
