import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    private static int N, M;
    private static int[][] office;
    private static ArrayList<CCTV> cctvList = new ArrayList<>();
    private static int minBlindSpot = Integer.MAX_VALUE;

    // 방향: 상, 우, 하, 좌
    private static int[] dr = {-1, 0, 1, 0};
    private static int[] dc = {0, 1, 0, -1};

    // 각 CCTV 번호별 가능한 방향
    private static int[][][] directions = {
            {}, // 0번 CCTV는 없음
            {{0}, {1}, {2}, {3}},                   // 1번 CCTV
            {{0, 2}, {1, 3}},                       // 2번 CCTV
            {{0, 1}, {1, 2}, {2, 3}, {3, 0}},       // 3번 CCTV
            {{0, 1, 2}, {1, 2, 3}, {2, 3, 0}, {3, 0, 1}}, // 4번 CCTV
            {{0, 1, 2, 3}}                          // 5번 CCTV
    };

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        office = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                office[i][j] = Integer.parseInt(st.nextToken());
                if (office[i][j] >= 1 && office[i][j] <= 5) {
                    cctvList.add(new CCTV(i, j, office[i][j]));
                }
            }
        }

        dfs(0, office);
        System.out.println(minBlindSpot);
    }

    private static void dfs(int depth, int[][] map) {
        // 모든 CCTV 처리 완료 시 사각지대 계산
        if (depth == cctvList.size()) {
            minBlindSpot = Math.min(minBlindSpot, countBlindSpots(map));
            return;
        }

        CCTV cctv = cctvList.get(depth);
        int x = cctv.row;
        int y = cctv.col;
        int type = cctv.type;

        // CCTV의 가능한 모든 방향 조합 시도
        for (int[] dirs : directions[type]) {
            int[][] newMap = copyMap(map); // 원본 맵 복사
            monitor(x, y, dirs, newMap);  // 감시 영역 표시
            dfs(depth + 1, newMap);       // 다음 CCTV로 이동
        }
    }

    private static void monitor(int x, int y, int[] dirs, int[][] map) {
        for (int dir : dirs) {
            int nx = x;
            int ny = y;

            // 현재 방향으로 감시 가능한 모든 영역 표시
            while (true) {
                nx += dr[dir];
                ny += dc[dir];

                if (!isInBounds(nx, ny) || map[nx][ny] == 6) {
                    break; // 범위를 벗어나거나 벽을 만나면 중단
                }
                if (map[nx][ny] == 0) {
                    map[nx][ny] = -1; // 감시 영역 표시
                }
            }
        }
    }

    private static int countBlindSpots(int[][] map) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int[][] copyMap(int[][] map) {
        int[][] newMap = new int[N][M];
        for (int i = 0; i < N; i++) {
            System.arraycopy(map[i], 0, newMap[i], 0, M);
        }
        return newMap;
    }

    private static boolean isInBounds(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < M;
    }

    private static class CCTV {
        int row, col, type;

        CCTV(int row, int col, int type) {
            this.row = row;
            this.col = col;
            this.type = type;
        }
    }
}
