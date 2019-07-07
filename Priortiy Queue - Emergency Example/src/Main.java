import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    
    public static void main(String[] args) {
        
        /*
            Patients will go to the front of the queue according to their complaints in the Emergency Department (PriorityQueue).
        
            Appendicitis ----> Highest priority (Priority = 3)
            Burn         ----> Medium Priority  (Priority = 2)
            Headache     ----> Lowest priority  (Priority = 1)
        */
        
        Queue<Patient> emergency = new PriorityQueue<Patient>();
    
        emergency.offer(new Patient("Jonhattan", "Burn"));
        emergency.offer(new Patient("Angelina", "Headache"));
        emergency.offer(new Patient("Carlos", "Appendicitis"));
        emergency.offer(new Patient("Maria", "Burn"));
        emergency.offer(new Patient("Tony", "Burn"));
        emergency.offer(new Patient("Martin", "Appendicitis"));
        
        int i = 1;
        
        while(emergency.isEmpty() != true) {
            
            System.out.println("******************************************");
            System.out.println(i + ". Line");
            System.out.println(emergency.poll());
            i++;
        }
    }
}
