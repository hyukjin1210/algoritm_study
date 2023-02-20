import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    /*
    windows에서 지원하는 지뢰 찾기 게임을 한번쯤은 해 보았을 것이다.
    특히 르탄이는 지뢰찾기의 매니아로 알려져 있다. 지뢰 찾기
    map은 N*N의 정사각형 모양으로 각 칸에는 숫자가 들어가 있거나 지뢰가 들어가 있다.
    빈 칸에는 숫자 0이 들어있다고 생각하자.

    map의 어떤 칸에 적혀 있는 숫자는, 그 칸과 인접해 있는 여덟 개의 칸 중에서 지뢰가 들어 있는 칸이 몇 개인지를 나타내 준다.
    물론 인접한 칸이 map 내부에 있는 경우에 대해서만 생각하면 된다. 예제를 보면 더 잘 이해할 수 있을 것이다.

    이번 문제는 조금 업그레이드 된 지뢰 찾기로, 한 칸에 한 개의 지뢰가 있는 것이 아니고,
    한 칸에 여러 개(1 이상 9 이하)의 지뢰가 묻혀 있는 게임이다. 따라서 map의 어떤 칸에 적혀 있는 숫자는,
    그 칸과 인접해 있는 여덟 개의 칸들에 들어 있는 지뢰의 총 개수가 된다.

    이미 windows 지뢰찾기 같은 것을 마스터한 르탄이는, map에서 지뢰에 대한 정보만이 주어졌을 때,
    르탄이는 map을 완성하고 싶다고 한다. N과 지뢰의 위치가 주어졌을 때,
    르탄이를 도와서 지뢰 찾기 map을 완성하는 프로그램을 작성하시오.

    (단, 1 ≤ N ≤ 1,000 이며, 배열의 각 요소에는 지뢰 찾기 map에 대한 정보가 주어지는데
    '.' 또는 숫자로 이루어진 문자열이 들어온다. '.'는 지뢰가 없는 것이고 숫자는 지뢰가 있는 경우로 그 칸의 지뢰의 개수이다.
    한 줄은 N개의 문자로 이루어져 있다.)
     */
    static int[] x = {1, -1, 0, 0, 1, 1, -1, -1};
    static int[] y = {0, 0, 1, -1, 1, -1, 1, -1};
    static char [][] boom;
    static char [][] map;
    static boolean flag = false;
    public char[][] solution(int N, char[][] ary) {


        char[][] answer = new char[N][N];
        return answer;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 5;  //가로세로의 길이
        n = Integer.parseInt(br.readLine());
        Main method = new Main();

        boom = new char[n][n];
        map = new char[n][n];

//        지뢰위치
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                boom[i][j] = str.charAt(j);
            }
        }
//        현재위치
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
//                지뢰 개수
                int cnt = 0;
//                열린곳이면서
                if(map[i][j] == '.') {
//                    폭탄이라면 > 지뢰를 모두 열어
                }

            }
        }

        char[][] chars = {{'1', '.', '.', '.', '.'},
                {'.', '.', '3', '.', '.'},
                {'.', '.', '.', '.', '.'},
                {'.', '4', '.', '.', '.'},
                {'.', '.', '.', '9', '.'}};
        System.out.println(Arrays.deepToString(method.solution(n, chars)));
    }
}
/*
필요한 것
1. 현재 위치에서 주변을 탐색하는 함수
2. 지뢰는 '*'로 표시 , 지뢰의 개수가 10이상이면 'M'으로 표시
'.' 또는 숫자로만 이루어진 문자열
'.'은 지뢰가 없는 것이고 , 숫자는 지뢰가 있는 것이며 해당칸의 지뢰개수이다.

현재위치

지뢰의 위치
boom
 */