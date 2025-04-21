class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] a = new int[nums1.length+nums2.length];
        for(int i = 0;i<nums1.length;i++){
            a[i] = nums1[i];
        }
        for(int i = 0; i<nums2.length;i++){
            int j = nums1.length;
            a[j+i] = nums2[i];
            j++;

        }
        Arrays.sort(a);
      double c =0;
        if(a.length%2==0){
            int b = a.length/2;
            double d = a[b-1]+a[b];
            c = d/2;
        }else{
            int b = a.length/2;
            c = a[b];
        }
        return c;
    }
}