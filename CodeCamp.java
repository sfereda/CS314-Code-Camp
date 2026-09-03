//  CodeCamp.java - CS314 Assignment 1

/*  Student information for assignment:
 *
 *  Replace <NAME> with your name.
 *
 *  On my honor, Sebastian Fereda, this programming assignment is my own work
 *  and I have not provided this code to any other student.
 *
 *  Name: Sebastian Fereda
 *  email address: sfereda@gmail.com
 *  UTEID: sf32529
 *  Section 5 digit ID: 55030
 *  Number of slip days used on this assignment: 0
 */

public class CodeCamp {

    /**
     * Determine the Hamming distance between two arrays of ints.
     * Neither the parameter <tt>aData</tt> or
     * <tt>bData</tt> are altered as a result of this method.<br>
     * @param aData != null, aData.length == bData.length
     * @param bData != null
     * @return the Hamming Distance between the two arrays of ints.
     */
    public static int hammingDistance(int[] aData, int[] bData) {
        // check preconditions
        if (aData == null || bData == null || aData.length != bData.length) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "hammingDistance. neither parameter may equal null, arrays" +
                    " must be equal length.");
        }
        int diffCount = 0;
        for (int i = 0; i < aData.length; i++){
            if(aData[i] != bData[i]){
                diffCount++;
            }
        }
        return diffCount;
    }


    /**
     * Determine if one array of ints is a permutation of another.
     * Neither the parameter <tt>aData</tt> or
     * the parameter <tt>bData</tt> are altered as a result of this method.<br>
     * @param aData != null
     * @param bData != null
     * @return <tt>true</tt> if aData is a permutation of bData,
     * <tt>false</tt> otherwise
     *
     */
    public static boolean isPermutation(int[] aData, int[] bData) {
        // check preconditions
        if (aData == null || bData == null) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "isPermutation. neither parameter may equal null.");
        }
        if(aData.length != bData.length) {
            return false;
        }
        // sort data to "align" matches
        mySort(aData);
        mySort(bData);

        // directly compare the two sorted arrays
        for(int i = 0; i < aData.length; i++){
            if(aData[i] != bData[i]){
                return false;
            }
        }
        return true;
    }

    // selection sort for the isPermutation method which helps
    // with direct comparison of values
    private static void mySort(int[] originalArray) {
        for (int i = 0; i < originalArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < originalArray.length; j++) {
                if (originalArray[j] < originalArray[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = originalArray[minIndex];
            originalArray[minIndex] = originalArray[i];
            originalArray[i] = temp;
        }
    }

    /**
     * Determine the index of the String that
     * has the largest number of vowels.
     * Vowels are defined as <tt>'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o',
     * 'U', and 'u'</tt>.
     * The parameter <tt>arrayOfStrings</tt> is not altered as a result of this method.
     * <p>pre: <tt>arrayOfStrings != null</tt>, <tt>arrayOfStrings.length > 0</tt>,
     * there is an least 1 non null element in arrayOfStrings.
     * <p>post: return the index of the non-null element in arrayOfStrings that has the
     * largest number of characters that are vowels.
     * If there is a tie return the index closest to zero.
     * The empty String, "", has zero vowels.
     * It is possible for the maximum number of vowels to be 0.<br>
     * @param arrayOfStrings the array to check
     * @return the index of the non-null element in arrayOfStrings that has
     * the largest number of vowels.
     */
    public static int mostVowels(String[] arrayOfStrings) {
        // check preconditions
        if (arrayOfStrings == null || arrayOfStrings.length == 0
                || !atLeastOneNonNull(arrayOfStrings)) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "mostVowels. parameter may not equal null and must contain " +
                    "at least one none null value.");
        }

        // create an array of valid characters that we are looking to
        // "spot" and keep a count of
        char[] vowels = {'a','A','e','E','i','I','o','O','u','U'};

        int maxVowelCount = -1;
        int maxVowelInd = 0;

        // go through the array of strings, looking at each string element one at a time
        for(int strIndex = 0; strIndex < arrayOfStrings.length; strIndex++){
            int totalVowel = 0;
            // check that there is a valid string in the current index
            if(arrayOfStrings[strIndex] != null) {
                // go through each letter of the current String
                for (int let = 0; let < arrayOfStrings[strIndex].length(); let++) {
                    for (char vowel : vowels) {
                        if (arrayOfStrings[strIndex].charAt(let) == vowel) {
                            totalVowel++;
                        }
                    }
                }
                // if there are more vowels in current string than the previous max one,
                // change the max vowel count and update the max index to access later
                if (totalVowel > maxVowelCount) {
                    maxVowelInd = strIndex;
                    maxVowelCount = totalVowel;
                }
            }
        }
        return maxVowelInd;
    }



    /**
     * Perform an experiment simulating the birthday problem.
     * Pick random birthdays for the given number of people.
     * Return the number of pairs of people that share the
     * same birthday.<br>
     * @param numPeople The number of people in the experiment.
     * This value must be > 0
     * @param numDaysInYear The number of days in the year for this experiement.
     * This value must be > 0
     * @return The number of pairs of people that share a birthday
     * after running the simulation.
     */
    public static int sharedBirthdays(int numPeople, int numDaysInYear) {
        // check preconditions
        if (numPeople <= 0 || numDaysInYear <= 0) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "sharedBirthdays. both parameters must be greater than 0. " +
                    "numPeople: " + numPeople +
                    ", numDaysInYear: " + numDaysInYear);
        }
        int[] bDayList = new int[numPeople];
        for (int i = 0; i < numPeople; i++){
            bDayList[i] = (int) (Math.random() * numDaysInYear);
        }
        int countPairs = 0;
        for(int currPerson = 0; currPerson < numPeople; currPerson++){
            for(int nextPerson = currPerson + 1; nextPerson < numPeople; nextPerson++){
                if(bDayList[nextPerson] == bDayList[currPerson]){
                    countPairs++;
                }
            }
        }
        return countPairs;
    }


    /**
     * Determine if the chess board represented by board is a safe set up.
     * <p>pre: board != null, board.length > 0, board is a square matrix.
     * (In other words all rows in board have board.length columns.),
     * all elements of board == 'q' or '.'. 'q's represent queens, '.'s
     * represent open spaces.<br>
     * <p>post: return true if the configuration of board is safe,
     * that is no queen can attack any other queen on the board.
     * false otherwise.
     * the parameter <tt>board</tt> is not altered as a result of
     * this method.<br>
     * @param board the chessboard
     * @return true if the configuration of board is safe,
     * that is no queen can attack any other queen on the board.
     * false otherwise.
     */
    public static boolean queensAreSafe(char[][] board) {
        char[] validChars = {'q', '.'};
        // check preconditions
        if (board == null || board.length == 0 || !isSquare(board)
                || !onlyContains(board, validChars)) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "queensAreSafe. The board may not be null, must be square, " +
                    "and may only contain 'q's and '.'s");
        }

        int boardSize = board.length;

        // find the current queen
        for (int currRow = 0; currRow < boardSize; currRow++) {
            for (int currCol = 0; currCol < boardSize; currCol++) {
                // if queen is found, look in all directions for another queen
                if (board[currRow][currCol] == 'q') {
                    // check current row for another queen
                    for (int scanCol = 0; scanCol < boardSize; scanCol++) {
                        if (board[currRow][scanCol] == 'q' && scanCol != currCol) {
                            return false;
                        }
                    }
                    // check current column for another queen
                    for (int scanRow = 0; scanRow < boardSize; scanRow++) {
                        if (board[scanRow][currCol] == 'q' && scanRow != currRow) {
                            return false;
                        }
                    }
                    // check upper left diagonal
                    int scan_x_axis = currCol - 1;
                    int scan_y_axis = currRow - 1;
                    while (scan_y_axis >= 0 && scan_x_axis >= 0) {
                        if (board[scan_y_axis][scan_x_axis] == 'q') {
                            return false;
                        }
                        scan_x_axis--;
                        scan_y_axis--;
                    }

                    // check upper right diagonal
                    scan_x_axis = currCol + 1;
                    scan_y_axis = currRow - 1;
                    while (scan_y_axis >= 0 && scan_x_axis < boardSize) {
                        if (board[scan_y_axis][scan_x_axis] == 'q') {
                            return false;
                        }
                        scan_x_axis++;
                        scan_y_axis--;
                    }

                    // check lower left diagonal
                    scan_x_axis = currCol - 1;
                    scan_y_axis = currRow + 1;
                    while (scan_y_axis < boardSize && scan_x_axis >= 0) {
                        if (board[scan_y_axis][scan_x_axis] == 'q') {
                            return false;
                        }
                        scan_x_axis--;
                        scan_y_axis++;
                    }

                    // check lower right diagonal
                    scan_x_axis = currCol + 1;
                    scan_y_axis = currRow + 1;
                    while (scan_y_axis < boardSize && scan_x_axis < boardSize) {
                        if (board[scan_y_axis][scan_x_axis] == 'q') {
                            return false;
                        }
                        scan_x_axis++;
                        scan_y_axis++;
                    }
                }
            }
        }
        return true;
    }


    /**
     * Given a 2D array of ints return the value of the
     * most valuable contiguous sub rectangle in the 2D array.
     * The sub rectangle must be at least 1 by 1.
     * <p>pre: <tt>mat != null, mat.length > 0, mat[0].length > 0,
     * mat</tt> is a rectangular matrix.
     * <p>post: return the value of the most valuable contiguous sub rectangle
     * in <tt>city</tt>.<br>
     * @param city The 2D array of ints representing the value of
     * each block in a portion of a city.
     * @return return the value of the most valuable contiguous sub rectangle
     * in <tt>city</tt>.
     */
    public static int getValueOfMostValuablePlot(int[][] city) {
        // check preconditions
        if (city == null || city.length == 0 || city[0].length == 0
                || !isRectangular(city) ) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "getValueOfMostValuablePlot. The parameter may not be null," +
                    " must value at least one row and at least" +
                    " one column, and must be rectangular.");
        }

        int max = Integer.MIN_VALUE;
        int rows = city.length;
        int cols = city[0].length;

        for (int topLeftRow = 0; topLeftRow < rows; topLeftRow++) {
            for (int topLeftCol = 0; topLeftCol < cols; topLeftCol++) {
                for (int bottomRightRow = topLeftRow; bottomRightRow < rows; bottomRightRow++) {
                    for (int bottomRightCol = topLeftCol; bottomRightCol < cols; bottomRightCol++) {
                        int sum = 0;
                        for (int currRow = topLeftRow; currRow <= bottomRightRow; currRow++) {
                            for (int currCol = topLeftCol; currCol <= bottomRightCol; currCol++) {
                                sum += city[currRow][currCol];
                            }
                        }
                        if (sum > max) {
                            max = sum;
                        }
                    }
                }
            }
        }
        return max;
    }

    /*
     * pre: arrayOfStrings != null
     * post: return true if at least one element in arrayOfStrings is
     * not null, otherwise return false.
     */
    private static boolean atLeastOneNonNull(String[] arrayOfStrings) {
        // check precondition
        if (arrayOfStrings == null) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "atLeastOneNonNull. parameter may not equal null.");
        }
        boolean foundNonNull = false;
        int i = 0;
        while( !foundNonNull && i < arrayOfStrings.length ) {
            foundNonNull = arrayOfStrings[i] != null;
            i++;
        }
        return foundNonNull;
    }


    /*
     * pre: mat != null
     * post: return true if mat is a square matrix, false otherwise
     */
    private static boolean isSquare(char[][] mat) {
        if (mat == null) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "isSquare. Parameter may not be null.");
        }
        final int NUM_ROWS = mat.length;
        int row = 0;
        boolean isSquare = true;
        while (isSquare && row < NUM_ROWS) {
            isSquare = ( mat[row] != null) && (mat[row].length == NUM_ROWS);
            row++;
        }
        return isSquare;
    }


    /*
     * pre: mat != null, valid != null
     * post: return true if all elements in mat are one of the
     * characters in valid
     */
    private static boolean onlyContains(char[][] mat, char[] valid) {
        // check preconditions
        if (mat == null || valid == null) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "onlyContains. Parameters may not be null.");
        }
        String validChars = new String(valid);
        int row = 0;
        boolean onlyContainsValidChars = true;
        while (onlyContainsValidChars && row < mat.length) {
            int col = 0;
            while(onlyContainsValidChars && col < mat[row].length) {
                int indexOfChar = validChars.indexOf(mat[row][col]);
                onlyContainsValidChars = indexOfChar != -1;
                col++;
            }
            row++;
        }
        return onlyContainsValidChars;
    }


    /*
     * pre: mat != null, mat.length > 0
     * post: return true if mat is rectangular
     */
    private static boolean isRectangular(int[][] mat) {
        // check preconditions
        if (mat == null || mat.length == 0) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "isRectangular. Parameter may not be null and must contain" +
                    " at least one row.");
        }
        boolean correct = mat[0] != null;
        int row = 0;
        while(correct && row < mat.length) {
            correct = (mat[row] != null)
                    && (mat[row].length == mat[0].length);
            row++;
        }
        return correct;
    }

    // make constructor private so no instances of CodeCamp can not be created
    private CodeCamp() {

    }
}