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
While(end>=start) {
Mid = end+ (end-start)/2;
If(target==arr[mid])
	Return mid;
Else if(target>=arr[mid])
	Start=mid+1;
Else if(target<arr[mid])
	End = mid-1;
}

~~~
The binary search depends on the start and end index only.

