package com.pattern.builder.demo2;



/**
 * 手机类
 */
public class Phone {
    // cpu
    private String cpu;
    // 屏幕
    private String screen;
    // 内存
    private String memory;
    // 主板
    private String mainBoard;
    // 私有构造方法,使用建造者模式，就不让外界直接使用phone的构造方法。
    // 构建一个静态的内部类，就是属于Phone的Builder
    private Phone(Builder builder) {
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainBoard = builder.mainBoard;
    }

    public static final class Builder{
        private String cpu;
        // 屏幕
        private String screen;
        // 内存
        private String memory;
        // 主板
        private String mainBoard;
        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }
        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }
        public Builder mainBoard(String mainBoard) {
            this.mainBoard = mainBoard;
            return this;
        }
        // 使用构建者创建phone对象
        public Phone build() {
            return new Phone(this);
        }
    }
}
