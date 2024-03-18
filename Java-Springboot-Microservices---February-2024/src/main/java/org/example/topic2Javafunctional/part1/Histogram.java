package org.example.topic2Javafunctional.part1;

public class Histogram {
    private int[] grades;

    public Histogram(int[] grades) {
        this.grades = grades;
    }

    public void printHorizontal() {
        int[] histogram = createHistogram();

        for (int i = 0; i < histogram.length; i++) {
            int lowerBound = i * 10;
            int upperBound = (i * 10) + 9;
            System.out.printf("%2d - %2d: ", lowerBound, upperBound);
            for (int j = 0; j < histogram[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printVertical() {
        int[] histogram = createHistogram();
        int maxCount = findMaxCount(histogram);

        for (int i = maxCount; i > 0; i--) {
            for (int j = 0; j < histogram.length; j++) {
                if (histogram[j] >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < histogram.length; i++) {
            System.out.print((i * 10) + "-" + ((i * 10) + 9) + " ");
        }
        System.out.println();
    }

    private int[] createHistogram() {
        int[] histogram = new int[11];

        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];
            histogram[grade / 10]++;
        }

        return histogram;
    }

    private int findMaxCount(int[] histogram) {
        int maxCount = 0;
        for (int count : histogram) {
            if (count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }
}
