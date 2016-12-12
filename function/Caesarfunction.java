package function;

public class Caesarfunction {
    public char[] Capital = {'A', 'B', 'C', 'D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    public char[] Small = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public StringBuilder replace(String str, int amount){
        amount %= 26;
        StringBuilder String = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 26; j++) {
                
                if(str.charAt(i) == ' '){
                   break;
                }
                else if (str.charAt(i) == Capital[j]) {
                    if(j+amount >= 26){                   
                        String.setCharAt(i, Capital[j+amount-26]);
                    }
                    else{
                        String.setCharAt(i, Capital[j+amount]);
                    }
                    break;
                }
                else if (str.charAt(i) == Small[j]) {
                    if(j+amount >= 26){                   
                        String.setCharAt(i, Small[j+amount-26]);
                    }
                    else{
                        String.setCharAt(i, Small[j+amount]);
                    }
                    break;    
                }
                
            }
        }
        return String;
    }
}