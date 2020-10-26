package chap15.lecture.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
		// (key, value)쌍  (Entry)으로 저장
		// dictionary
		
		Map<Integer, String> map = new HashMap<>();
		
		// 추가입력
		map.put(100, "kim");
		map.put(30, "hong");
		map.put(22, "lee");
		map.put(11, "choi");
		map.put(200, "jin");
		
		System.out.println(map.size());
		//수정
		map.put(200, "park");
		System.out.println(map.size());
		
		//검색
		String v1 = map.get(100);
		System.out.println(v1);
		System.out.println(map.get(200));
		
		map.remove(200);
		System.out.println(map.size());
		
		//전체 탐색
		System.out.println("향상된 for/ keyset");
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			System.out.println(key + ";" + map.get(key));
		}
		
		System.out.println("향상된 for / entrySet");
		Set<Map.Entry<Integer, String>> entrys = map.entrySet();
		for (Map.Entry<Integer, String> entry : entrys) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
