import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>(); //문자열,숫자 로 해시저장 

        for (String name : participant) {  //participant를 돌면서, 
            map.put(name, map.getOrDefault(name, 0) + 1); //이름, 이름으로된 해시가 없으면 0+1 = 1 이고 아니면 +1
        }

        for (String name : completion) { //합격자를 돌면서, 
            map.put(name, map.get(name) - 1); //이름, 그이름의 숫자를 찾아 -1해서 넣어줌 
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) { //map의 모든 키를 반환 하고 map객체로 받아주는건가.. 
            if (entry.getValue() > 0) { //value를 돌려봤덛니 0 이상이다. = 다 빼지 못하고 남아있다. 
                return entry.getKey(); // entry.getKey로 이름을 반환
            }
        }

        return null; 
    }
}
