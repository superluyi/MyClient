package Character;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ClientCrtl aStart = new ClientCrtl();
		aStart.start();
	}
}

class ClientCrtl{
	public void start() {
		
		//HashMapClient aHashMapClient = new HashMapClient();		                                                                                //HashMapClient用于存储IP地址和字符的映射表
		//aHashMapClient.characterMap();                                                                                                                                      //初始化存储字符映射表
		//aHashMapClient.ipMap();                                                                                                                                                     //初始化存储字符映射表
		/*测试hashmap
		System.out.println(aHashMapClient.getCharacterValue('e'));
		System.out.println(aHashMapClient.getIpValue(6));*/
		
		SequenceClient aSequenceClient = new SequenceClient();                                                                                     //初始化序列对象，用于处理和序列转化相关的功能
		                                                                                                                                                                                                       //aSequenceClient用于所有SequenceClient类
		/*
		 * 测试stringToCharArray函数，实现将String转化为字符数组，将String分开	    
		char[] charArray = aSequenceClient.stringToCharArray("nihao");
		for(int i = 0; i < charArray.length; i++){
			System.out.println(charArray[i]);
		}*/
		
		/*
		 * 测试charArrayToIntArray方法，实现将字符数组转化为整形数组，将每一个字符对应到相应存储的数字代码
		char[] charArray = new char[]{'e','s',' '};		
	    int[] intArray = aSequenceClient.charArrayToIntArray(charArray, aHashMapClient);                                  //需要将HashMapClient的对象传入。
		for(int i = 0; i < intArray.length; i++){
			System.out.println(intArray[i]);
		}*/			
		
		/*
		 * 测试intArrayToBinaryArray函数，实现将int型数组转为二进制数组，并在中间插入控制位"-1“。每个用”-1“隔离的二进制数代表一个字符所用的IP位。
		int[] intArray = new int[]{6,5,1,8};
		String[] strArray = aSequenceClient.intArrayToBinaryArray(intArray);
		for(int i = 0; i < strArray.length; i++){
			System.out.println(strArray[i]);
		}*/
		
		/*
		 * 测试binaryArrayToIpArray，实现二进制数对应的ip地址的数组。得到数组后返回主函数，以此调用socket程序。
		String[] binaryArray = {"110","1000","-1","11110000","-1"};
		ArrayList<String> ipList = 	aSequenceClient.binaryArrayToIpArray(binaryArray, aHashMapClient);
		for(int i = 0; i < ipList.size(); i++){
			System.out.println(ipList.get(i));
		}*/
		String[] binaryArray = {"110","-1","11110000","-1","101","-2"};
		ArrayList<String> ipList = 	aSequenceClient.binaryArrayToIpArray(binaryArray, aHashMapClient);
		for(int i = 0; i < ipList.size(); i++){
			System.out.println(ipList.get(i));
		}
		ClientSocket aClientSocket = new ClientSocket();
		/*
		 * 测试clientSocket方法。实现发送一个套接字。		
		String dip = "172.20.143.84";
		int dport = 9000;
		String sip = "172.20.143.30";
		int sport = 8000;
		aClientSocket.clientSocket(dip, dport, sip, sport);		*/
		/*
		String info = "e";
		char[] charArray = aSequenceClient.stringToCharArray(info);
		int[] intArray = aSequenceClient.charArrayToIntArray(charArray, aHashMapClient);
		String[] binaryArray = aSequenceClient.intArrayToBinaryArray(intArray);
		ArrayList<String> aList = aSequenceClient.binaryArrayToIpArray(binaryArray, aHashMapClient);
		for(int i = 0; i < aList.size(); i++){
			System.out.println(aList.get(i));
		}
		String dip = "172.20.143.84";
		int dport = 9000;
		//String sip = "172.20.143.30";
		int sport = 8000;
		for(int i = 0; i < aList.size(); i++){
			aClientSocket.clientSocket(dip, dport, aList.get(1), sport);
		}		*/
	}
}
