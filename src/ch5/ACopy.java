package ch5;
//использование переменной length для копирования массивов
public class ACopy {
    public static void main(String[] args) {
        int nums1[] = new int[10];
        int nums2[] = new int[10];

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = i;
        }

        //копировать массив nums1 в массив nums2
        if(nums2.length >= nums1.length) {
            for (int i = 0; i < nums2.length; i++) {
                nums2[i] = nums1[i];
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i] + " ");
        }
    }
}
