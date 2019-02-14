package com.haibo.offer;

/**
 * Created by liuhaibo on 18/12/24.
 */
//题目：比较一个数组是否完全包含另一个；比如a{1，3，4，5，2}，b{4，5，2}顺序也要一样，如果b{3,2，4}就不行
public class nummore1 {
        public static int containAll(int A[], int[] B) {
            if (A.length < 1 || B.length < 1 || A.length < B.length) {
                return -1;
            }
            int first = B[0];
            for (int i = 0; i < A.length - B.length; i++ ) {
                while (i < A.length -B.length && A[i] != first) {
                    i++;
                }
                if (i ==  A.length-B.length) {
                    return -1;
                }

                int p = i;
                int q = 0;
                while (p < A.length && q < B.length) {
                    if (A[p] == B[q]) {
                        p++;
                        q++;
                    } else {
                        break;
                    }
                }
                if (p <= A.length && q == B.length) {
                    return i;
                }

            }
            return -1;
        }

        public static void main(String[] args) {
            int[] A = new int[6];
            A[0] = 1;
            A[1] = 5;
            A[2] = 4;
            A[3] = 7;
            A[4] = 3;

            int[] B = new int[]{ 4, 7,3};

            System.out.println(containAll(A, B));
        }

}
