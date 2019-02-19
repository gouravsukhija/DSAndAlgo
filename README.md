### InterviewHacks
# 1.	String(bigString).indexOf(String str, int fromIndex)
# 2.	Anagrams problem (saving the string into integer array map, check below table).
    For saving use map[ch-‘a’] map would be a 26 character array
0	1	2	3	4	5	6	7	8	9
A	B	C	D	E	F	G	H	I	j

•	Save the characters of pattern in one array and increment the map by 1

•	Decrement the count for text in sliding window. And check for non-zero array. Add the index if zero array found.

# 3.	Converting ch=’2’ to number 2 (ch-‘0’).

# 4.	Binary search:
~~~
  public boolean binarySearch(int target, int[] nums ){
        
        int start=0;
        int end = nums.length-1;
        int mid=0;
         while(end>=start)
            {
                mid=start+(end-start)/2;
             
                if(nums[mid]==target)
                    return true;
                else if(nums[mid]>=target)
                    end=mid-1;
                else
                    start=mid+1;

            } 
        
        return false;
              
        }       
    
~~~
The binary search depends on the start and end index only.

# 5. Median of two sorted array
	if you want to make the nums1 length always remain greater

	~~~

	 if(nums1.length<nums2.length){
           return  intersection(nums2,nums1);
        }
	~~~

	split both the arrays in equal parts so that sum is equal

# 6. Set to array

~~~
 int j = 0;
		for (Integer s: set)
			array[j++] = s;
~~~

# 7. Search insert position in a sorted array

We need to perform a normal binary search and return mid. And at last just need to check following

```
 if(nums[mid]>target)
            return mid;
        else if(nums[mid]<target)
            return mid+1;

```
# 8. Dynamic programming tip

create an array to store results

# 9. Print array

```
System.out.println(Arrays.toString(dp));

```
# 10. BinarySearch available api

```
  int i = Arrays.binarySearch(dp, 0, len, num);
            if (i < 0) {
                i = -(i + 1);
            }
```

And then we can use the i to insert it 
