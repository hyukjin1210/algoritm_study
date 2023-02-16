package programmers.Lv_0;

import java.util.Arrays;
import java.util.HashMap;

public class Marathon {
    /*
    문제 설명
    수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

    마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
    완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

    제한사항
    마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
    completion의 길이는 participant의 길이보다 1 작습니다.
    참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
    참가자 중에는 동명이인이 있을 수 있습니다.

    입출력 예
    participant	completion	return
    ["leo", "kiki", "eden"]	["eden", "kiki"]	"leo"
    ["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
    ["mislav", "stanko", "mislav", "ana"]	["stanko", "ana", "mislav"]	"mislav"

    입출력 예 설명
    예제 #1
    "leo"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

    예제 #2
    "vinko"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

    예제 #3
    "mislav"는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.
     */
    public String solution1(String[] participant, String[] completion) {    //Sort/Loop 를 이용한 풀이
        String answer = "";
//        1.두 배열을 정렬한다.
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i = 0;
//        2.두 배열이 다를 때까지 찾는다.
        for (; i < completion.length; i++) {    //
            if (!participant[i].equals(completion[i])) {
                break;
            }
        }
//        3.여기까지 왔다면, 마지막 주자가 완주하지 못한 선수다.
        return participant[i];
    }

    public String solution2(String[] participant, String[] completion) {    //Hash를 이용한 풀이
        String answer = "";
//        1.Hash map 을 만든다 participant
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant)
            map.put(player, map.getOrDefault(player, 0) + 1);

//        2.Hash map 을 뺀다 completion
        for (String player : completion)
            map.put(player, map.get(player) - 1);

//        3.value가 0이 아닌 마지막 주자를 찾는다.
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer = key;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Marathon run = new Marathon();
        String[] part = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] comp = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(run.solution2(part, comp));
    }
}
