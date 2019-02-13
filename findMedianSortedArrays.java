class Solution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

		if (nums1.length > nums2.length) {
			return findMedianSortedArrays(nums2, nums1);
		}

		int m = nums1.length;
		int n = nums2.length;

		int start = 0;
		int end = m;

		while (end >= start) {
			int partitionX = start + (end - start) / 2;
			int partitionY = (m + n + 1) / 2 - partitionX;
			int maxXLeft, minXRight, maxYLeft, minYRight;

			maxXLeft = partitionX == 0 ? Integer.MIN_VALUE : nums1[partitionX - 1];
			minXRight = partitionX == m ? Integer.MAX_VALUE : nums1[partitionX];

			maxYLeft = partitionY == 0 ? Integer.MIN_VALUE : nums2[partitionY - 1];
			minYRight = partitionY == n ? Integer.MAX_VALUE : nums2[partitionY];

			if (maxXLeft <= minYRight && maxYLeft <= minXRight) {
				if ((m + n) % 2 == 0) {
					return (double) (Math.max(maxXLeft, maxYLeft) + Math.min(minXRight, minYRight)) / 2;
				} else {

					return (double) Math.max(maxXLeft, maxYLeft);
				}

			} else if (maxXLeft > minYRight) {
				end = partitionX - 1;
			} else
				start = partitionX + 1;
		}

		return 0.0;

	}
}