/*
 * 7. 좌표 정렬
 * N개의 평면상의 좌표(x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하세요.
 * 정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.
 * 입력
 * 첫째 줄에 좌표의 개수인 N(3<=N<=100,000)이 주어집니다.
 * 두 번째 줄부터 N개의 좌표가 x, y 순으로 주어집니다. x, y값은 양수만 입력됩니다.
 * 출력
 * N개의 좌표를 정렬하여 출력하세요.
 * 예시 입력 1
 * 5
 * 2 7
 * 1 3
 * 1 2
 * 2 5
 * 3 6
 * 예시 출력 1
 * 1 2
 * 1 3
 * 2 5
 * 2 7
 * 3 6
 */
package src.sortingSearching;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class SortingSearching7 {
    public void solution(int n, Map<Integer, List<Integer>> map) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = map.keySet().stream().sorted().collect(Collectors.toList());

        for(int i=0; i<map.size(); i++) {
            if(map.get(list.get(i)).size()>1) {
                map.get(list.get(i)).sort(Comparator.naturalOrder());
                for(int j : map.get(list.get(i))) {
                    bw.write(list.get(i) + " ");
                    bw.write(j + "\n");
                }
            }else {
                bw.write(list.get(i) + " ");
                bw.write( map.get(list.get(i)).get(0) + "\n");
            }
        }

        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        SortingSearching7 m = new SortingSearching7();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            String str = bf.readLine();
            int a = Integer.parseInt(str.split(" ")[0]);
            int b = Integer.parseInt(str.split(" ")[1]);
            map.putIfAbsent(a, new ArrayList<>());
            map.get(a).add(b);
        }

        m.solution(n, map);

    }

}

/*
class Point implements Comparable<Point>{
    public int x, y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public int compareTo(Point o){
        if(this.x==o.x) return this.y-o.y;
        else return this.x-o.x;
    }
}

class Main {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        ArrayList<Point> arr=new ArrayList<>();
        for(int i=0; i<n; i++){
            int x=kb.nextInt();
            int y=kb.nextInt();
            arr.add(new Point(x, y));
        }
        Collections.sort(arr);
        for(Point o : arr) System.out.println(o.x+" "+o.y);
    }
}
*/

