/**
 * Runtime:51ms
 */
// class Palindrome {
//     public boolean isPalindrome(int x) {
//        boolean r = true;
//         String noReve = Integer.toString(x);
//         String reve = "";
//         for(int i = noReve.length()-1;i>=0;i--){
//              reve += noReve.charAt(i);
//         }
//         for(int j = 0;j<noReve.length();j++){
//               char a = noReve.charAt(j);
//               char b = reve.charAt(j);
//               if(a!=b){
//                   r = false;
//                   break;
//               }
//         }
//         return r;
//     }
// }
/**
 * Runtime: 121ms
 */
class Palindrome {
    public boolean isPalindrome(int x) {
            char ch;
        if(x < 0){
            return false;
        }else{
            String str = Integer.toString(x);
            System.out.println(str);
            String reverse = "";
            for(int i = 0;i<str.length();i++){
                ch = str.charAt(i);
                reverse = ch+reverse;
            }
            if(str.equals(reverse)){
                return true;
            }else{
                return false; 
            }

        }

    }
}
