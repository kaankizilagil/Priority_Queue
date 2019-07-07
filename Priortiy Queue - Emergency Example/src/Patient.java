
public class Patient implements Comparable<Patient> {
    
    private String name;
    private String complaint;
    private int priority;
    
    public Patient(String name, String complaint) {
        
        this.name = name;
        this.complaint = complaint;
        
        if(complaint.equals("Appendicitis")) {
            
            this.priority = 3;
        }
        
        else if(complaint.equals("Burn")) {
            
            this.priority = 2;
        }
        
        else {
            
            this.priority = 1;
        }
    }

    @Override
    public String toString() {
         
        String information = " Patient Name : " + name +
                             " \n Complaint : " + complaint +
                             " \n Priority : " + priority;
        
        return information;
    }

    @Override
    public int compareTo(Patient patient) {
        
        if(this.priority > patient.priority) {
            
            return -1;
        }
        
        else if (this.priority < patient.priority) {
            
            return 1;
        }
        
        else {
            
            return 0;
        }
    }
}
