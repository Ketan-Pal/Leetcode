class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<List<String>> dp = new ArrayList<>();
        for(int i=0; i<s.length(); i++) dp.add(new ArrayList<>());

        for(int i=0; i<s.length(); i++){
            for(String word: wordDict){
                if(i < word.length()-1) continue;
                
                if(i == word.length()-1 || !dp.get(i-word.length()).isEmpty()){
                    if(s.substring(i-word.length()+1, i+1).equals(word)){
                        if(i >= word.length() && !dp.get(i-word.length()).isEmpty()){
                            List<String> wordList = dp.get(i-word.length());
                            for(String oldWord: wordList){
                                String newWord = oldWord + " " + word;
                                dp.get(i).add(newWord);
                            }
                        } else {
                            dp.get(i).add(word);
                        }
                    }
                }
            }
        }

        return dp.get(s.length()-1);
    }
}