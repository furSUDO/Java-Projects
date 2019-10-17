public class SouthAfricanIDVerification {
    public static String Validator(String input){
        String InputID = input;
        String valid = "0";
        if(InputID.length()==13){
            String number = String.valueOf(InputID);
            //////////Start of Part 1
            String EvenIndexOfID = "";//initializes String EvenIndexOfID
            for(int i = 0; i < number.length();i=i+2) {
                int j = Character.digit(number.charAt(i), 10);
                EvenIndexOfID+=j+" ";
            }//end of for loop to extract the odd digits from the ID Number
            String SAIDA = EvenIndexOfID.substring(0, 12);
            int TempA = 0;
            if(SAIDA.length() ==12){
                String str = SAIDA;
                String tempAA = "";    
                int sum = 0;
                for(int i = 0; i < str.length(); i++){  
                    char ch = str.charAt(i);   
                        if (Character.isDigit(ch)){
                            tempAA += ch; 
                        }else{ 
                            sum += Integer.parseInt(tempAA);  
                            tempAA = "0";  
                        }
                }//end of for statement that adds the values together
            TempA = sum + Integer.parseInt(tempAA);
            }//end of if that confims the length of SAIDA is 12 characters long
            //////////End of Part 1
            
            //////////Start of Part 2
            String OddIndexOfID ="";
            for(int i = 1; i < number.length();i=i+2) {
            int j = Character.digit(number.charAt(i), 10);
            OddIndexOfID+=j;
            }//end of for statement that gets the Odd index of the Input
            int TempB = Integer.parseInt(OddIndexOfID)*2;
            //////////End of Part 2
            
            //////////Start of Part 3
            int sumOfTempB = 0;
            String TempBB = Integer.toString(TempB);
            String TempBBB = String.valueOf(TempBB);
            for(int i=0;i<TempBBB.length();i++){
                int j = Character.digit(TempBBB.charAt(i), 10);
                sumOfTempB = sumOfTempB+j;
            }//end of for staement that adds the int over and over
            //////////End of Part 3
            
            //////////Start of Part 4
            int sumOfAnB = TempA+sumOfTempB;
            //////////End of Part 4
            
            //////////Start of Part 5
            String s = String.valueOf(sumOfAnB);
            char c = s.charAt(1);
            int num = c -'0';
            int toVerify = 10-num;
            //////////End of Part 5
            
            //////////Start of Part 6
            int Verified = toVerify-Integer.parseInt(InputID.substring(InputID.length() - 1));
            if(Verified == 0){
                valid = "1";
            }else{
                valid = "0";
            }
            //////////End of Part 6
        }//end of if statement that confirms that the entered text is 13 characters long
        return valid;
            
    }
}
