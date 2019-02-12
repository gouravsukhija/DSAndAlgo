### InterviewHacks
# 1.	String(bigString).indexOf(String str, int fromIndex)
# 2.	Anagrams problem (saving the string into integer array map, check below table).
    For saving use map[ch-‘a’] map would be a 26 character array
0	1	2	3	4	5	6	7	8	9
A	B	C	D	E	F	G	H	I	j

•	Save the characters of pattern in one array and increment the map by 1
•	Decrement the count for text in sliding window. And check for non-zero array. Add the index if zero array found.

