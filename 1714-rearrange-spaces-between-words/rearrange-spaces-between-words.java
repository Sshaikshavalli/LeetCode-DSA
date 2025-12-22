class Solution {
    public String reorderSpaces(String text) {
     int spacecount=0;
     for(char c:text.toCharArray()){
        if(c==' ')
        spacecount++;
     }
        
        String[] words=text.trim().split("\\s+");
        if(words.length==1){
        return words[0]+" ".repeat(spacecount);
     }
     int spacebetween=spacecount/(words.length-1);
     int extraspaces=spacecount%(words.length-1);
     StringBuilder result=new StringBuilder();
     String gap=" ".repeat(spacebetween);
     for(int i=0;i<words.length;i++){
        result.append(words[i]);
        if(i<words.length-1){
     result.append(gap);
        }
     }   
            result.append(" ".repeat(extraspaces));
            return result.toString();
    }
}