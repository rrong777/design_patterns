package com.principles.demo4.after;

public class SafetyDoorTest {
    public static void main(String[] args) {
        // 创建黑马安全门对象
        HeimaSafetyDoor door = new HeimaSafetyDoor();
        // 调用功能
        door.antiTheft();
        door.fireProof();
        door.waterProof();

        System.out.println("=========================");
        // 现在我再定义一个传智安全门，只有防火防盗功能，只需要实现对应接口即可。这就不会违反接口隔离原则了。
        ItCastSafetyDoor itCastSafetyDoor = new ItCastSafetyDoor();
        itCastSafetyDoor.antiTheft();
        itCastSafetyDoor.fireProof();
    }
}
