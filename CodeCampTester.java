import java.util.List;

// CodeCamp.java - CS314 Assignment 1 - Tester class

/*
 * Student information for assignment: 0
 * Name: Sebastian Fereda
 * email address: sfereda@gmail.com
 * UTEID: sf32529
 * Section 5-digit ID: 55030
 * Number of slip days used on this assignment:
 */

/*
 * sharedBirthdays Experiment
 * Experiment 1: 45.126669
 * Question 1: I'd expect it to be 50 people (maybe??); the 45.1 avg num
 *    of pairs in a group of 182 surprised me
 * Question 2: Percentage first exceeds 50% when there's 23 people
 * Question 3: It absolutely surprises me, it's as if there's a 50% chance that two
 *    people share a birthday in my Think Lab discussion
 * Question 4: My predicted answer anticipated a little more than twice the necessary
 *    amount of people to have a 50% chance of a shared birthday
 */

public class CodeCampTester {

    public static void main(String[] args) {
        final String NEW_LINE = System.getProperty("line.separator");

        // custom test 1, hamming distance
        int[] h1 = { 1 };
        int[] h2 = { 1 };
        int expected = 0;
        int actual = CodeCamp.hammingDistance(h1, h2);
        System.out.println("CUSTOM Test 1 hamming distance: expected value: " + expected
                + ", actual value: " + actual);
        if (expected == actual) {
            System.out.println(" passed test 1, hamming distance");
        } else {
            System.out.println(" ***** FAILED ***** test 1, hamming distance");
        }

        // custom test 2, hamming distance
        h1 = new int[] { };
        h2 = new int[] { };
        expected = 0;
        actual = CodeCamp.hammingDistance(h1, h2);
        System.out.println(NEW_LINE + "CUSTOM Test 2 hamming distance: expected value: " + expected
            + ", actual value: " + actual);
        if (expected == actual) {
            System.out.println(" passed test 2, hamming distance");
        } else {
            System.out.println(" ***** FAILED ***** test 2, hamming distance");
        }

        // custom test 3, isPermutation
        int[] a = { };
        int[] b = { };
        boolean expectedBool = true;
        boolean actualBool = CodeCamp.isPermutation(a, b);
        System.out.println(NEW_LINE + "CUSTOM Test 3 isPermutation: expected value: " + expectedBool
                + ", actual value: " + actualBool);
        if (expectedBool == actualBool) {
            System.out.println(" passed test 3, isPermutation");
        } else {
            System.out.println(" ***** FAILED ***** test 3, isPermutation");
        }

        // custom test 4, is Permutation
        b = new int[] { 0 };
        expectedBool = false;
        actualBool = CodeCamp.isPermutation(a, b);
        System.out.println(NEW_LINE + "CUSTOM Test 4 isPermutation: expected value: " + expectedBool
                + ", actual value: " + actualBool);
        if (expectedBool == actualBool) {
            System.out.println(" passed test 4, isPermutation");
        } else {
            System.out.println(" ***** FAILED ***** test 4, isPermutation");
        }

        // custom test 5, mostVowels
        String[] arrayOfStrings = { "", "" };
        int expectedResult = 0;
        int actualResult = CodeCamp.mostVowels(arrayOfStrings);
        System.out.println(NEW_LINE + "CUSTOM Test 5 mostVowels: expected result: " + expectedResult
                + ", actual result: " + actualResult);
        if (actualResult == expectedResult) {
            System.out.println(" passed test 5, mostVowels");
        } else {
            System.out.println(" ***** FAILED ***** test 5, mostVowels");
        }

        // custom test 6 mostVowels
        arrayOfStrings = new String[] { null, "" };
        expectedResult = 1;
        actualResult = CodeCamp.mostVowels(arrayOfStrings);
        System.out.println(NEW_LINE + "CUSTOM Test 6 mostVowels: expected result: " + expectedResult
                + ", actual result: " + actualResult);
        if (actualResult == expectedResult) {
            System.out.println(" passed test 6, mostVowels");
        } else {
            System.out.println(" ***** FAILED ***** test 6, mostVowels");
        }

        // custom test 7, sharedBirthdays
        int pairs = CodeCamp.sharedBirthdays(4, 1);
        System.out.println(NEW_LINE + "CUSTOM Test 7 shared birthdays: expected: 6, actual: " + pairs);
        int expectedShared = 6;
        if (pairs == expectedShared) {
            System.out.println(" passed test 7, shared birthdays");
        } else {
            System.out.println(" ***** FAILED ***** test 7, shared birthdays");
        }

        // custom test 8, sharedBirthdays
        pairs = CodeCamp.sharedBirthdays(2, 999999);
        System.out.println(NEW_LINE + "CUSTOM Test 8 shared birthdays: expected: 0 (really unlikely to be 1, actual: " + pairs);
        expectedShared = 0;
        if (pairs == expectedShared) {
            System.out.println(" passed test 8, shared birthdays");
        } else {
            System.out.println(" ***** FAILED ***** test 8, shared birthdays");
        }

        // custom test 9, queensAreASafe
        char[][] board = { { '.' } };
        expectedBool = true;
        actualBool = CodeCamp.queensAreSafe(board);
        System.out.println(NEW_LINE + "CUSTOM test 9 queensAreSafe: expected value: " + expectedBool
                + ", actual value: " + actualBool);
        if (expectedBool == actualBool) {
            System.out.println(" passed test 9, queensAreSafe");
        } else {
            System.out.println(" ***** FAILED ***** test 9, queensAreSafe");
        }

        // custom test 10, queensAreASafe
        board = new char[][] { { '.', '.', '.', '.' },
                { '.', '.', '.', '.' },
                { '.', '.', '.', '.' },
                { '.', '.', '.', '.' } };
        expectedBool = true;
        actualBool = CodeCamp.queensAreSafe(board);
        System.out.println(NEW_LINE + "CUSTOM Test 10 queensAreSafe: expected value: " + expectedBool
                + ", actual value: " + actualBool);
        if (expectedBool == actualBool) {
            System.out.println(" passed test 10, queensAreSafe");
        } else {
            System.out.println(" ***** FAILED ***** test 10, queensAreSafe");
        }

        // custom test 11, getValueOfMostValuablePlot
        int[][] city = { { 0 },
                { 9 },
                { -4 },
                { -1 },
                { -10 },
                { -15 } };

        expected = 9;
        actual = CodeCamp.getValueOfMostValuablePlot(city);
        System.out.println(NEW_LINE + "CUSTOM Test 11 getValueOfMostValuablePlot: expected value: "
                + expected + ", actual value: " + actual);
        if (expected == actual) {
            System.out.println(" passed test 11, getValueOfMostValuablePlot");
        } else {
            System.out.println(" ***** FAILED ***** test 11, getValueOfMostValuablePlot");
        }

        // custom test 12, getValueOfMostValuablePlot
        city = new int[][]{ { 100 } };
        expected = 100;
        actual = CodeCamp.getValueOfMostValuablePlot(city);
        System.out.println(NEW_LINE + "CUSTOM Test 12 getValueOfMostValuablePlot: expected value: "
                + expected + ", actual value: " + actual);
        if (expected == actual) {
            System.out.println(" passed test 12, getValueOfMostValuablePlot");
        } else {
            System.out.println(" ***** FAILED ***** test 12, getValueOfMostValuablePlot");
        }

        // sharedBirthdays experiment 1
        double averageNumOfPairs = CodeCampTester.sharedBirthdaysExperiment1();
        System.out.println(NEW_LINE + "EXPERIMENT 1 | average number of pairs: " + averageNumOfPairs);

        // sharedBirthday experiment 2
        int STARTING_PEOPLE = 2;
        int ENDING_PEOPLE = 100;
        int TOTAL_RUNS = 50_000;

        for (int people = STARTING_PEOPLE; people <= ENDING_PEOPLE; people++) {
            int totalPairs = sharedBirthdaysExperiment2(people);
            double percent = (double) totalPairs / TOTAL_RUNS;
            String formattedPercent = String.format("%.2f", percent);
            System.out.println("Num people: " + people
                + ", number of experiments with one or more shared birthday: "
                + totalPairs + ", percentage: " + formattedPercent);
        }

    } // end of main method

    private static double sharedBirthdaysExperiment1() {
        int sum = 0;
        int NUM_PEOPLE = 182;
        int CALENDAR = 365;
        int TOTAL_RUNS = 1_000_000;

        for (int i = 0; i < TOTAL_RUNS; i++) {
            sum += CodeCamp.sharedBirthdays(NUM_PEOPLE, CALENDAR);
        }
        return (double) sum / TOTAL_RUNS;
    }

    private static int sharedBirthdaysExperiment2(int numPeople) {
        int successes = 0;
        for (int experiment = 0; experiment < 50_000; experiment++) {
            int numOfPairs = CodeCamp.sharedBirthdays(numPeople, 365);
            if (numOfPairs > 0) {
                successes++;
            }
        }
        return successes;
    }

    /*
    SHAREDBIRTHDAY EXPERIMENT 2 TABLE
    Result: On average, you only need about 23 people in order to have a 50% chance of having a shared birthday
    *********
    Num people: 2, number of experiments with one or more shared birthday: 143, percentage: 0.00
    Num people: 3, number of experiments with one or more shared birthday: 383, percentage: 0.01
    Num people: 4, number of experiments with one or more shared birthday: 805, percentage: 0.02
    Num people: 5, number of experiments with one or more shared birthday: 1367, percentage: 0.03
    Num people: 6, number of experiments with one or more shared birthday: 1924, percentage: 0.04
    Num people: 7, number of experiments with one or more shared birthday: 2824, percentage: 0.06
    Num people: 8, number of experiments with one or more shared birthday: 3702, percentage: 0.07
    Num people: 9, number of experiments with one or more shared birthday: 4824, percentage: 0.10
    Num people: 10, number of experiments with one or more shared birthday: 5861, percentage: 0.12
    Num people: 11, number of experiments with one or more shared birthday: 7084, percentage: 0.14
    Num people: 12, number of experiments with one or more shared birthday: 8412, percentage: 0.17
    Num people: 13, number of experiments with one or more shared birthday: 9807, percentage: 0.20
    Num people: 14, number of experiments with one or more shared birthday: 11267, percentage: 0.23
    Num people: 15, number of experiments with one or more shared birthday: 12668, percentage: 0.25
    Num people: 16, number of experiments with one or more shared birthday: 14113, percentage: 0.28
    Num people: 17, number of experiments with one or more shared birthday: 15704, percentage: 0.31
    Num people: 18, number of experiments with one or more shared birthday: 17351, percentage: 0.35
    Num people: 19, number of experiments with one or more shared birthday: 18927, percentage: 0.38
    Num people: 20, number of experiments with one or more shared birthday: 20347, percentage: 0.41
    Num people: 21, number of experiments with one or more shared birthday: 22183, percentage: 0.44
    Num people: 22, number of experiments with one or more shared birthday: 23712, percentage: 0.47
    Num people: 23, number of experiments with one or more shared birthday: 25654, percentage: 0.51
    Num people: 24, number of experiments with one or more shared birthday: 27154, percentage: 0.54
    Num people: 25, number of experiments with one or more shared birthday: 28482, percentage: 0.57
    Num people: 26, number of experiments with one or more shared birthday: 29951, percentage: 0.60
    Num people: 27, number of experiments with one or more shared birthday: 31327, percentage: 0.63
    Num people: 28, number of experiments with one or more shared birthday: 32591, percentage: 0.65
    Num people: 29, number of experiments with one or more shared birthday: 34227, percentage: 0.68
    Num people: 30, number of experiments with one or more shared birthday: 35374, percentage: 0.71
    Num people: 31, number of experiments with one or more shared birthday: 36606, percentage: 0.73
    Num people: 32, number of experiments with one or more shared birthday: 37626, percentage: 0.75
    Num people: 33, number of experiments with one or more shared birthday: 38805, percentage: 0.78
    Num people: 34, number of experiments with one or more shared birthday: 39821, percentage: 0.80
    Num people: 35, number of experiments with one or more shared birthday: 40861, percentage: 0.82
    Num people: 36, number of experiments with one or more shared birthday: 41620, percentage: 0.83
    Num people: 37, number of experiments with one or more shared birthday: 42520, percentage: 0.85
    Num people: 38, number of experiments with one or more shared birthday: 43243, percentage: 0.86
    Num people: 39, number of experiments with one or more shared birthday: 44020, percentage: 0.88
    Num people: 40, number of experiments with one or more shared birthday: 44724, percentage: 0.89
    Num people: 41, number of experiments with one or more shared birthday: 45245, percentage: 0.90
    Num people: 42, number of experiments with one or more shared birthday: 45695, percentage: 0.91
    Num people: 43, number of experiments with one or more shared birthday: 46178, percentage: 0.92
    Num people: 44, number of experiments with one or more shared birthday: 46624, percentage: 0.93
    Num people: 45, number of experiments with one or more shared birthday: 46996, percentage: 0.94
    Num people: 46, number of experiments with one or more shared birthday: 47464, percentage: 0.95
    Num people: 47, number of experiments with one or more shared birthday: 47716, percentage: 0.95
    Num people: 48, number of experiments with one or more shared birthday: 47996, percentage: 0.96
    Num people: 49, number of experiments with one or more shared birthday: 48202, percentage: 0.96
    Num people: 50, number of experiments with one or more shared birthday: 48534, percentage: 0.97
    Num people: 51, number of experiments with one or more shared birthday: 48659, percentage: 0.97
    Num people: 52, number of experiments with one or more shared birthday: 48898, percentage: 0.98
    Num people: 53, number of experiments with one or more shared birthday: 49114, percentage: 0.98
    Num people: 54, number of experiments with one or more shared birthday: 49158, percentage: 0.98
    Num people: 55, number of experiments with one or more shared birthday: 49331, percentage: 0.99
    Num people: 56, number of experiments with one or more shared birthday: 49421, percentage: 0.99
    Num people: 57, number of experiments with one or more shared birthday: 49489, percentage: 0.99
    Num people: 58, number of experiments with one or more shared birthday: 49570, percentage: 0.99
    Num people: 59, number of experiments with one or more shared birthday: 49636, percentage: 0.99
    Num people: 60, number of experiments with one or more shared birthday: 49706, percentage: 0.99
    Num people: 61, number of experiments with one or more shared birthday: 49759, percentage: 1.00
    Num people: 62, number of experiments with one or more shared birthday: 49777, percentage: 1.00
    Num people: 63, number of experiments with one or more shared birthday: 49844, percentage: 1.00
    Num people: 64, number of experiments with one or more shared birthday: 49854, percentage: 1.00
    Num people: 65, number of experiments with one or more shared birthday: 49890, percentage: 1.00
    Num people: 66, number of experiments with one or more shared birthday: 49904, percentage: 1.00
    Num people: 67, number of experiments with one or more shared birthday: 49933, percentage: 1.00
    Num people: 68, number of experiments with one or more shared birthday: 49933, percentage: 1.00
    Num people: 69, number of experiments with one or more shared birthday: 49947, percentage: 1.00
    Num people: 70, number of experiments with one or more shared birthday: 49964, percentage: 1.00
    Num people: 71, number of experiments with one or more shared birthday: 49973, percentage: 1.00
    Num people: 72, number of experiments with one or more shared birthday: 49973, percentage: 1.00
    Num people: 73, number of experiments with one or more shared birthday: 49980, percentage: 1.00
    Num people: 74, number of experiments with one or more shared birthday: 49984, percentage: 1.00
    Num people: 75, number of experiments with one or more shared birthday: 49987, percentage: 1.00
    Num people: 76, number of experiments with one or more shared birthday: 49995, percentage: 1.00
    Num people: 77, number of experiments with one or more shared birthday: 49984, percentage: 1.00
    Num people: 78, number of experiments with one or more shared birthday: 49994, percentage: 1.00
    Num people: 79, number of experiments with one or more shared birthday: 49994, percentage: 1.00
    Num people: 80, number of experiments with one or more shared birthday: 49992, percentage: 1.00
    Num people: 81, number of experiments with one or more shared birthday: 49997, percentage: 1.00
    Num people: 82, number of experiments with one or more shared birthday: 50000, percentage: 1.00
    Num people: 83, number of experiments with one or more shared birthday: 49997, percentage: 1.00
    Num people: 84, number of experiments with one or more shared birthday: 49999, percentage: 1.00
    Num people: 85, number of experiments with one or more shared birthday: 49997, percentage: 1.00
    Num people: 86, number of experiments with one or more shared birthday: 50000, percentage: 1.00
    Num people: 87, number of experiments with one or more shared birthday: 49999, percentage: 1.00
    Num people: 88, number of experiments with one or more shared birthday: 50000, percentage: 1.00
    Num people: 89, number of experiments with one or more shared birthday: 50000, percentage: 1.00
    Num people: 90, number of experiments with one or more shared birthday: 50000, percentage: 1.00
    Num people: 91, number of experiments with one or more shared birthday: 50000, percentage: 1.00
    Num people: 92, number of experiments with one or more shared birthday: 50000, percentage: 1.00
    Num people: 93, number of experiments with one or more shared birthday: 50000, percentage: 1.00
    Num people: 94, number of experiments with one or more shared birthday: 50000, percentage: 1.00
    Num people: 95, number of experiments with one or more shared birthday: 50000, percentage: 1.00
    Num people: 96, number of experiments with one or more shared birthday: 50000, percentage: 1.00
    Num people: 97, number of experiments with one or more shared birthday: 50000, percentage: 1.00
    Num people: 98, number of experiments with one or more shared birthday: 50000, percentage: 1.00
    Num people: 99, number of experiments with one or more shared birthday: 50000, percentage: 1.00
    Num people: 100, number of experiments with one or more shared birthday: 50000, percentage: 1.00
    */

    // pre: list != null
    private static int[] intListToArray(List<Integer> list) {
        if (list == null) {
            throw new IllegalArgumentException("list parameter may not be null.");
        }
        int[] result = new int[list.size()];
        int arrayIndex = 0;
        for (int x : list) {
            result[arrayIndex++] = x;
        }
        return result;
    }
}