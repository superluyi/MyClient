package Character;

import java.util.ArrayList;

public class SequenceClient extends HashMapClient {

	public char[] stringToCharArray(String str) {
		
		char[] charArray = str.toCharArray();
		return charArray;
	}
	
	public int[] charArrayToIntArray(char[] charArray, HashMapClient aHashMapClient) {
		
		int[] intArray = new int[charArray.length];
		for(int i = 0; i < charArray.length; i++){
			intArray[i] = aHashMapClient.getCharacterValue(charArray[i]);
		}
		return intArray;
	}
	
	public String[] intArrayToBinaryArray(int[] intArray) {
		
		int intArray_Length = intArray.length;
		String[] binaryArray = new String[intArray_Length * 2 ];
		for(int i = 0; i < intArray_Length; i++){
			binaryArray[2*i] = Integer.toBinaryString(intArray[i]);
		}
		for(int i = 1; i < binaryArray.length - 1; ){
			binaryArray [i] = "-1";
			i += 2;
		}
		binaryArray[binaryArray.length - 1] = "-2";
		return binaryArray;
	}
	
	public ArrayList<String> binaryArrayToIpArray(String[] binaryArray, HashMapClient aHashMapClient) {
		
		ArrayList<String> ipList = new ArrayList<String>();
		for(int i = 0; i < binaryArray.length; i++){
			if(binaryArray[i] != "-1" && binaryArray[i] != "-2"){
				String strTemp = binaryArray[i];
				int NumberOfFlag = 0;
				for(int j = 0; j < strTemp.length(); j++){
					if(strTemp.charAt(j) == '1')
						NumberOfFlag++;
				}				
				int chaZhi = 10 - strTemp.length();
				for(int k = strTemp.length() -1; k >= 0; k--){
					if (strTemp.charAt(k) == '1') {						
						ipList.add(aHashMapClient.getIpValue(k + chaZhi));
					}
				}				
			}else if(binaryArray[i] == "-1"){
				ipList.add(aHashMapClient.getIpValue(-1));
			}else if (binaryArray[i] == "-2") {
				ipList.add(aHashMapClient.getIpValue(-2));
			}else {
				System.out.println("Fail IP!");
			}			
		}		
		return ipList; 
	}
	
}
