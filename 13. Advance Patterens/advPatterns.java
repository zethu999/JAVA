public class advPatterns {
    public static void hollowRectangle(int rows, int columns) {
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=columns; j++) {
                if(i==1 || j==1 || j==columns || i==rows) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void rotatedHalfPyramid(int rows, int columns) {
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=rows-i; j++) {
                System.out.print("  "); 
            }
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramid(int rows) {
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=rows-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void floydsTriangle(int rows) {
        int counter = 1;
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(counter++ + " ");
            }
            System.out.println();
        }
    }

    public static void zeroOneTrangle(int rows) {
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=i; j++) {
                if((i + j) % 2 == 0){
                    System.out.print(1+" ");
                }else {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int rows) {
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            for(int j=1; j<=(2*(rows-i)); j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=rows; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            for(int j=1; j<=(2*(rows-i)); j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void solidRhombus(int rows) {
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=(rows-i); j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void hollowRhombus(int rows) {
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=(rows-i); j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=rows; j++) {
                if(i == 1 || i == rows || j == 1 || j == rows) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void diamoond(int rows) {
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=(rows-i); j++) {
                System.out.print(" ");            
            }
            for(int j=1; j<=(2*i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=rows; i>=1; i--) {
            for(int j=1; j<=(rows-i); j++) {
                System.out.print(" ");            
            }
            for(int j=1; j<=(2*i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void numberPyramid(int rows) {
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=(rows-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void palindrome(int rows) {
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=(rows-i); j++) {
                System.out.print(" ");
            }
            int count = i;
            for(int j=1; j<=i; j++) {
                System.out.print(count--);
            }
            for(int j=2; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        hollowRectangle(10,10);
        System.out.println();
        rotatedHalfPyramid(10,10);
        System.out.println();
        invertedHalfPyramid(10);
        System.out.println();
        floydsTriangle(4);
        System.out.println();
        zeroOneTrangle(5);
        System.out.println();
        butterfly(4);
        System.out.println();
        solidRhombus(5);
        System.out.println();
        hollowRhombus(5);
        System.out.println();
        diamoond(5);
        System.out.println();
        numberPyramid(5);
        System.out.println();
        palindrome(5);
    }
}



// * * * * * * * * * *
// *                 *
// *                 *
// *                 *
// *                 *
// *                 *
// *                 *
// *                 *
// *                 *
// * * * * * * * * * *

//                   *
//                 * *
//               * * *
//             * * * *
//           * * * * *
//         * * * * * *
//       * * * * * * *
//     * * * * * * * *
//   * * * * * * * * *
// * * * * * * * * * *

// 1 2 3 4 5 6 7 8 9 10
// 1 2 3 4 5 6 7 8 9
// 1 2 3 4 5 6 7 8
// 1 2 3 4 5 6 7
// 1 2 3 4 5 6
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1

// 1
// 2 3
// 4 5 6
// 7 8 9 10

// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

// *             *
// * *         * *
// * * *     * * *
// * * * * * * * *
// * * * * * * * *
// * * *     * * *
// * *         * *
// *             *

//         * * * * *
//       * * * * *
//     * * * * *
//   * * * * *
// * * * * *

//         * * * * *
//       *       *
//     *       *
//   *       *
// * * * * *

//     *
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *

//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5

//     1
//    212
//   32123
//  4321234
// 543212345