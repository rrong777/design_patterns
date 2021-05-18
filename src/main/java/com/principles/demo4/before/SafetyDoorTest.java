package com.principles.demo4.before;

public class SafetyDoorTest {
    public static void main(String[] args) {
        HeimaSafetyDoor door = new HeimaSafetyDoor();
        door.antiTheft();
        door.fireProof();
        door.waterProof();
        // 我现在还想扩展，扩展一个传智安全门，只有防盗和防水功能，没有防火功能。再去定义一个类，再去实现SafetyDoor接口，就意味着他被迫依赖于他不使用的方法。
        // 将安全门接口拆分，功能拆出来，后续我要什么功能实现即可。
    }
}
