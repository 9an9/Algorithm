/*
 * 4. 모든 아나그램 찾기
 * S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
 * 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
 * 입력
 * 첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
 * S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.
 * 출력
 * S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.
 * 예시 입력 1
 * bacaAacba
 * abc
 * 예시 출력 1
 * 3
 */
package src.hash;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Hash4 {
    public int solution(String str1, String str2) throws IOException {
        int answer= 0;

        Map<Character, Integer> tmap = new HashMap<>();
        Map<Character, Integer> smap = new HashMap<>();

        for(char i : str2.toCharArray()) {
            tmap.put(i, tmap.getOrDefault(i,0)+1);
        }

        for(int i=0; i<str2.length()-1; i++) {
            smap.put(str1.charAt(i), smap.getOrDefault(str1.charAt(i),0)+1);
        }
        int lt=0;
        for(int rt = str2.length()-1; rt<str1.length(); rt++) {
            smap.put(str1.charAt(rt), smap.getOrDefault(str1.charAt(rt),0)+1);
            if(smap.equals(tmap)) {
                answer++;
            }
            smap.put(str1.charAt(lt),smap.get(str1.charAt(lt))-1);
            if(smap.get(str1.charAt(lt))==0) {
                smap.remove(str1.charAt(lt));
            }
            lt++;
        }


        return answer;
    }

    public static void main(String[] args) throws IOException {
        Hash4 m = new Hash4();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str1 = bf.readLine();
        String str2 = bf.readLine();

        System.out.println(m.solution(str1,str2));
    }
}
