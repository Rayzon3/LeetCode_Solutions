import java.util.Arrays;
import java.util.PriorityQueue;

class courseScheduleIII {

    public static int scheduleCourse(int[][] courses) {
        //sorting based on duration
        Arrays.sort(courses, (a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int time = 0;

        for(int[] course : courses){
            if(course[0] <= course[1]){
                if(course[0] + time <= course[1]){
                    pq.offer(course[0]);
                    time += course[0];
                }
                else{
                    if(pq.peek() > course[0]){
                        time -= pq.poll();
                        time += course[0];
                        pq.offer(course[0]);
                    }
                }
            }
        }

        return pq.size();
    }
    public static void main(String[] args) {
        int[][] courses = {{100,200},{200,1300},{1000,1250},{2000,3200}};
        System.out.println(scheduleCourse(courses));
    }
}
