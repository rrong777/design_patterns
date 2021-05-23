package com.pattern.bridge;

/**
 * 具体的抽象化角色（具体的抽象化角色） Mac操作系统
 */
public class Mac extends OpratingSystem{
    // 父类提供了一个有参构造器，没有提供无参的，子类必须提供一个有参的构造器去初始化父类有参的构造器。
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
