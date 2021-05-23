package com.pattern.bridge;

/**
 * AVI视频文件，具体的实现化角色
 */
public class AVIFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("AVI视频文件：" + fileName);
    }
}
