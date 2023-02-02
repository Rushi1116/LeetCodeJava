class Solution {
    public String interpret(String command) {
        String temp = "";
        String decode = "";
        for(int i = 0;i<command.length();i++ ){
            //System.out.println(temp);
            temp+=command.charAt(i);
            if(temp.equals("()")){ 
                decode+="o";
                temp="";
            }else if(temp.equals("(al)")){
                decode+="al";
                temp="";
            }else if(temp.equals("G")){
                decode+="G";
                temp="";
            }
        }
        return decode;
    }
}