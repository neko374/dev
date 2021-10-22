package com.example.web22.services.impl;

import com.example.web22.ImageUploadDO;
import com.example.web22.ImageUploadDOExample;
import com.example.web22.dao.ImageUploadDOMapper;
import com.example.web22.services.ImageUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageUploadServiceImpl implements ImageUploadService {
    @Autowired(required = false)
    private ImageUploadDOMapper imageUploadDOMapper;
    @Override
    public void addImage(ImageUploadDO img) {

    }

    @Override
    public List<ImageUploadDO> list() {
        ImageUploadDOExample imageUploadDOExample = new ImageUploadDOExample();
        return imageUploadDOMapper.selectByExample(imageUploadDOExample);
    }
}
