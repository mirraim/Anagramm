package Anagram;

public class Anagram {
    private String reportedText;

    public Anagram(String reportedText) {
        this.reportedText = reportedText;
    }

    public void setReportedText(String reportedText) {
        this.reportedText = reportedText;
    }

    private String makeAnagram() {
        String [] words = reportedText.split(" ");
        StringBuilder reversedText = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String reversedWord = reverseWord(words[i]);
            words[i] = reversedWord;
            reversedText.append(words[i]);
            if (i != words.length - 1){
               reversedText.append(" ");
            }
        }
        return reversedText.toString();
    }

    private String reverseWord(String word){
        char[] symbols = word.toCharArray();
        int leftIndex = 0;
        int rightIndex = symbols.length-1;
        while (leftIndex < rightIndex){
            if(Character.isLetter(symbols[leftIndex]) && Character.isLetter(symbols[rightIndex])){
                char buffer = symbols[leftIndex];
                symbols[leftIndex] = symbols[rightIndex];
                symbols[rightIndex]  = buffer;
                leftIndex++;
                rightIndex--;
            }
            else if (!Character.isLetter(symbols[leftIndex])){
                leftIndex++;
            }
            else if (!Character.isLetter(symbols[rightIndex])){
                rightIndex--;
            }
        }
        return new String(symbols);
    }

    @Override
    public String toString() {
        return makeAnagram();
    }
}
