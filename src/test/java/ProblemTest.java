import onboard.Problem6;
import onboard.Problem7;
import onboard.Problem8;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ProblemTest {
    @Nested
    class Problem6Test{
        @Test
        void case1(){
            Integer[][] values = {{0, 1, 0, 1}, {1, 1, 1, 0}, {0, 0, 1, 1}};
            List<String> answer = List.of("B", "A", "B");
            assertThat(Problem6.solution(values)).isEqualTo(answer);
        }

        @Test
        void case2(){
            Integer[][] values = {{0, 0, 0, 1}, {0, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 0, 0}};
            List<String> answer = List.of("C", "A", "E", "D");
            assertThat(Problem6.solution(values)).isEqualTo(answer);
        }
    }

    @Nested
    class Problem7Test{
        @Test
        void case1(){
            List<String> values = List.of("ABCDE", "abcde", "01234", "FGHIJ", "fghij");
            String answer = "Aa0FfBb1GgCc2HhDd3IiEe4Jj";
            assertThat(Problem7.solution(values)).isEqualTo(answer);
        }

        @Test
        void case2(){
            List<String> values = List.of("AABCDD", "afzz", "09121", "a8EWg6", "P5h3kx");
            String answer = "Aa0aPAf985Bz1EhCz2W3D1gkD6x";
            assertThat(Problem7.solution(values)).isEqualTo(answer);
        }

        @Test
        void case3(){
            List<String> values = List.of("daslfjd", "615168", "afd5364asdf", "dddssaaa", "fdjlk3333");
            String answer = "d6adfa1fdds5ddjl15slf63skj86a3d4a3aa3s3df";
            assertThat(Problem7.solution(values)).isEqualTo(answer);
        }
    }

    @Nested
    class Problem8Test{
        @Test
        void case1(){
            Integer paperNumber = 3;
            Integer[][] locations = {{3, 7}, {15, 7}, {5, 2}};
            Integer answer = 260;
            assertThat(Problem8.solution(paperNumber, locations)).isEqualTo(answer);
        }

        @Test
        void case2(){
            Integer paperNumber = 4;
            Integer[][] locations = {{10, 35}, {13, 40}, {27, 11}, {31, 10}};
            Integer answer = 311;
            assertThat(Problem8.solution(paperNumber, locations)).isEqualTo(answer);
        }
    }
}
