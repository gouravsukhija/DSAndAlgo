class IntersectionOfTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {

		if (nums1.length < nums2.length) {
			return intersection(nums2, nums1);
		}

		HashSet<Integer> set = new HashSet<Integer>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);

		for (int i = 0; i < nums2.length; i++) {
			// binary search on nums1

			boolean present = binarySearch(nums2[i], nums1);

			if (present)
				set.add(nums2[i]);
		}

		int[] array = new int[set.size()];
		int j = 0;
		for (Integer s : set)
			array[j++] = s;

		return array;
	}

	public boolean binarySearch(int target, int[] nums) {

		int start = 0;
		int end = nums.length - 1;
		int mid = 0;
		while (end >= start) {
			mid = start + (end - start) / 2;

			if (nums[mid] == target)
				return true;
			else if (nums[mid] >= target)
				end = mid - 1;
			else
				start = mid + 1;

		}

		return false;

	}

}