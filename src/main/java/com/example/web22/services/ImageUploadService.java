package com.example.web22.services;

import com.example.web22.ImageUploadDO;

import java.util.List;

public interface ImageUploadService {
    //图
    public void addImage(ImageUploadDO img);
    public List<ImageUploadDO> list();
}
