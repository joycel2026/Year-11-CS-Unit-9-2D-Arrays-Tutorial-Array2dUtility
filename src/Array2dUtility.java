
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    static void print(int[][] array){
        for(int i=0;i<array.length;i++){
            String values = "";
            for(int j=0;j<array[i].length;j++){
                values = values+array[i][j]+" ";
            }
            System.out.println(values);
        }
    }
    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    static int sum(int[][] array){
        int results=0;
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
               results = results+array[i][j];
            }
        }
        return results;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    static double average(int[][] array){
        int sum = sum(array);
        int length = array.length;
        int spots = length*length;
        return (double) sum /spots;
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    static int minimum(int[][] array){
        int minimum = array[0][0];
        for (int i=0; i<array.length;i++){
            for(int j=0; j<array[i].length;j++){
                if (array[i][j]<minimum){
                    minimum=array[i][j];
                }
            }
        }
        return minimum;
    }
    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    static int maximum(int[][] array){
        int maximum = array[0][0];
        for (int i=0; i<array.length;i++){
            for(int j=0; j<array[i].length;j++){
                if (array[i][j]>maximum){
                    maximum=array[i][j];
                }
            }
        }
        return maximum;
    }
    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    static int evenCountStandard(int[][] array){
        int result = 0;
        for (int i=0; i<array.length;i++){
            for(int j=0; j<array[i].length;j++){
                if ((array[i][j]%2)==0){
                    result++;
                }
            }
        }
        return result;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    static int evenCountEnhanced(int[][] array){
        int result = 0;
        for(int[] row:array){
            for(int number:row){
                if (number%2==0){
                    result++;
                }
            }
        }
        return result;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    static boolean allPositive(int[][] array){
        boolean result = true;
        for (int i=0; i<array.length;i++){
            for(int j=0; j<array[i].length;j++){
                if ((array[i][j])<0){
                    result = false;
                }
            }
        }
        return result;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    static int[] rowSums(int[][] array){
        int[] sum = new int[array.length];
        int index = 0;
        for (int[] row : array){
            int rowSum = 0;
            for (int number:row){
                rowSum = rowSum+number;
            }
            sum[index]=rowSum;
            index++;
        }
        return sum;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    static int[] colSums(int[][] array){
        int[] sum = new int[array.length];
        for (int i = 0; i<array.length;i++){
            for (int j = 0; j<array[i].length; j++){
                sum[j]=sum[j]+array[i][j];
            }
        }
        return sum;
    }
}
