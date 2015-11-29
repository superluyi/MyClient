package Character;

import java.util.HashMap;

public class HashMapClient {
	
    HashMap<Character, Integer>  clientCharaterMap  = new HashMap<Character, Integer>();
	HashMap<Integer, String> ipCharaterMap = new HashMap<Integer, String>();
	
		public void characterMap() {
			
			clientCharaterMap.put('e', 2);
			clientCharaterMap.put('a', 4);
			clientCharaterMap.put('r', 8);
			clientCharaterMap.put('i', 16);
			clientCharaterMap.put('o', 32);
			clientCharaterMap.put('t', 64);
			clientCharaterMap.put('n', 128);
			clientCharaterMap.put('s', 6);
			clientCharaterMap.put('l', 10);
			clientCharaterMap.put('c', 18);
			clientCharaterMap.put('u', 34);
			clientCharaterMap.put('d', 66);
			clientCharaterMap.put('p', 130);
			clientCharaterMap.put('m', 12);
			clientCharaterMap.put('h', 20);
			clientCharaterMap.put('g', 36);
			clientCharaterMap.put('b', 68);
			clientCharaterMap.put('f', 132);
			clientCharaterMap.put('y', 24);
			clientCharaterMap.put('w', 40);
			clientCharaterMap.put('k', 72);
			clientCharaterMap.put('v', 136);
			clientCharaterMap.put('x', 48);
			clientCharaterMap.put('z', 80);
			clientCharaterMap.put('j', 144);
			clientCharaterMap.put('q', 96);
			clientCharaterMap.put('.', 3);
			clientCharaterMap.put(',', 5);
			clientCharaterMap.put(' ', 1);
			clientCharaterMap.put(':', 33);
			clientCharaterMap.put('!', 17);
			clientCharaterMap.put('?', 9);    
		}
		
		public int getCharacterValue(char key_ch) {
			
			return clientCharaterMap.get(key_ch);	
		}
		
		public void ipMap() {
			
			ipCharaterMap.put(0, "172.20.143.30");
			ipCharaterMap.put(1, "172.20.143.31");
			ipCharaterMap.put(2, "172.20.143.32");
			ipCharaterMap.put(3, "172.20.143.33");
			ipCharaterMap.put(4, "172.20.143.34");
			ipCharaterMap.put(5, "172.20.143.35");
			ipCharaterMap.put(6, "172.20.143.36");
			ipCharaterMap.put(7, "172.20.143.37");
			ipCharaterMap.put(8, "172.20.143.38");
			ipCharaterMap.put(9, "172.20.143.39");
			ipCharaterMap.put(-1, "172.20.143.29");
			ipCharaterMap.put(-2, "172.20.143.28");
		}
		
		public String getIpValue(int key_ip) {
			
			return ipCharaterMap.get(key_ip);

		}
		
}
