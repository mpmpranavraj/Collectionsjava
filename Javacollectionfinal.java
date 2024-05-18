import java.sql.DataTruncation;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Javacollectionfinal {
    public static void main(String[] args) {
        Map<Integer,String> names= new HashMap<>();
        Map<Integer,Integer> attendance= new HashMap<>();
        Queue<Integer> q = new LinkedList<>();

        names.put(2343033,"Pranav");
        attendance.put(2343033,86);
        q.offer(2343033);

        names.put(2343066,"Vineeth");
        attendance.put(2343066,88);
        q.offer(2343066);

        names.put(2343058,"Harsha");
        attendance.put(2343058,87);
        q.offer(2343058);

        System.out.println("attendance");
        while(!q.isEmpty()){
            int id = q.poll();
            String name = names.get(id);
            int attendancepercentage = attendance.get(id);
            System.out.println(" "+id+" "+name+" "+attendancepercentage);
            {


        }
    }
}
}
