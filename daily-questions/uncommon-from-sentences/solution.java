class Solution {
    public String[] uncommonFromSentences(String A, String B) {

        Map<String, Integer> count = new HashMap();
        for (String word : A.split(" ")) count.put(
            word,
            count.getOrDefault(word, 0) + 1
        );
        for (String word : B.split(" ")) count.put(
            word,
            count.getOrDefault(word, 0) + 1
        );

        List<String> ans = new LinkedList();
        for (String word : count.keySet()) if (count.get(word) == 1) ans.add(
            word
        );

        return ans.toArray(new String[ans.size()]);



    }
}


/**

https://leetcode.com/problems/uncommon-words-from-two-sentences/description/?envType=daily-question&envId=2024-09-17 


1. Split the string array into individual items: String [] arr1 = s1.split(" ");
2. Add both string arrays into one array sentence: String [] arr = arr
3. Parse through the sentence array and create a counter for each item
4. Create a linked list called Result to contain the one-offs: List<String> Result = new LinkedList();
5. If an item is only recorded once add them to a Result variable 
5. Output Result

*******************************

Javascript solution

    var arr = A.concat(' ',B).split(' ')
    var objArr = {}
    var ans = []
    for(let word of arr){
        objArr[word] = (objArr[word] || 0) + 1
    }

    for(let o in objArr){
        if(objArr[o] == 1) ans.push(o)
    }
    return ans

*************************************

Python solution

class Solution:
    def uncommonFromSentences(self, A: str, B: str) -> List[str]:
        from collections import defaultdict

        count = defaultdict(int)

        # Count occurrences of words in sentence A
        for word in A.split():
            count[word] += 1

        # Count occurrences of words in sentence B
        for word in B.split():
            count[word] += 1

        # Collect words that appear exactly once
        return [word for word in count if count[word] == 1]

 **/


