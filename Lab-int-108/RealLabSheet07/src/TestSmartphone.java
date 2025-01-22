public class TestSmartphone {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();

        System.out.println("ตั้งค่าคุณสมบัติเบื้องต้นของสมาร์ทโฟน...");
        phone.setBrand("SmartMobile"); 
        phone.setModel("W100");
        phone.setStorageCapacity(256); 

 
        System.out.println("\nแสดงข้อมูลสมาร์ทโฟน...");
        phone.displayDetails();


        System.out.println("\nเพิ่มความจุหน่วยความจำ 100 GB...");
        phone.increaseStorage(100); 


        System.out.println("\nพยายามเพิ่มความจุหน่วยความจำ 200 GB...");
        phone.increaseStorage(200); 


        System.out.println("\nพยายามเพิ่มความจุหน่วยความจำ -50 GB...");
        phone.increaseStorage(-50); 


        System.out.println("\nคำนวณพื้นหน่วยความจำที่เหลือ โดยใช้ไปแล้ว 120 GB...");
        int remainingStorage = phone.getRemainingStorage(120);
        if (remainingStorage != -1) {
            System.out.println("พื้นที่คงเหลือ: " + remainingStorage + " GB");
        }


        System.out.println("\nคำนวณพื้นหน่วยความจำที่เหลือ โดยใช้ไปแล้ว 500 GB...");
        phone.getRemainingStorage(500); 

 
        System.out.println("\nตั้งค่าแบรนด์และรุ่นด้วยค่าที่ไม่ถูกต้อง...");
        phone.setBrand("S"); 
        phone.setModel("A"); 


        System.out.println("\nตั้งค่าความจุหน่วยความจำที่ไม่ถูกต้อง...");
        phone.setStorageCapacity(600); 


        System.out.println("\nข้อมูลสมาร์ทโฟนสุดท้าย.");
        phone.displayDetails();
    }
}