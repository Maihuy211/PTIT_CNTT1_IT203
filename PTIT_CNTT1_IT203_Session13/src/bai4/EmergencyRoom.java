package bai4;

import java.util.LinkedList;

public class EmergencyRoom {
     LinkedList<String> queue = new LinkedList<>();
     public void patientCheckIn(String name){
         queue.add(name);
     }
     public void emergencyCheckIn(String name){
         queue.addFirst(name);
     }
     public void treatPatient(){
         String name = queue.removeFirst();
         if(queue.isEmpty()){
             System.out.println("Đang khám: " + name);
         }else{
             System.out.println("Đang khám " + name);
         }
     }

    public static void main(String[] args) {
        EmergencyRoom er = new EmergencyRoom();
        er.patientCheckIn("A");
        er.patientCheckIn("B");
        er.emergencyCheckIn("C");

        er.treatPatient();
        er.treatPatient();
        er.treatPatient();
    }
}
