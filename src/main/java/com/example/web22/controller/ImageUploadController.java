package com.example.web22.controller;

import com.example.web22.ImageUploadDO;
import com.example.web22.services.ImageUploadService;
import com.example.web22.utils.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/imgs")
@CrossOrigin
public class ImageUploadController {
    @Autowired
    private ImageUploadService imageUploadService;
    @PostMapping(value = "/upload")
    public Map<String, Object> materialPictureAndText(HttpServletRequest request,
                                                      @RequestParam(value = "imgTitle", required = false) String imgTitle,
                                                      @RequestParam(value = "imgText", required = false) String imgText,
                                                      @RequestParam(value = "file", required = false) MultipartFile file) {
        System.out.println("imgTitle"+imgTitle+","+imgText);
        HashMap<String, Object> resultMap = new HashMap<>();
        if (file.isEmpty()) {
            resultMap.put("msg", "请上传图片");
            resultMap.put("state","-1");
            return resultMap;
        } else {
            String fileName = file.getOriginalFilename();  // 文件名
            String suffixName = fileName.substring(fileName.lastIndexOf("."));
            String filePath = "/Users/nico/Downloads/upload";//这个path就是你要存在服务器上的
            fileName = UUID.randomUUID() + suffixName; // 新文件名
            File dest = new File(filePath + fileName);
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs();
            }
            try {
                file.transferTo(dest);
            } catch (IOException e) {
                e.printStackTrace();
            }
            resultMap.put("state","0");
            resultMap.put("msg","上传成功");
            String url = request.getScheme()+"://"+request.getServerName()+":"+
                    request.getServerPort()+"/uploads/"+fileName;

            resultMap.put("url",url);
            ImageUploadDO imageUploadDO = new ImageUploadDO();
            imageUploadDO.setId(0);
            imageUploadDO.setImgText(imgText);
            imageUploadDO.setImgTitle(imgTitle);
            imageUploadDO.setImgUrl(url);
            //存入数据库中对应的表
            imageUploadService.addImage(imageUploadDO);
            return resultMap;
        }
    }
    //图片列表
    @GetMapping("/list")
    public ResultMsg listImage(){
        List<ImageUploadDO> list = imageUploadService.list();
        if(list.size()>0){
            return new ResultMsg(0,"图片列表显示成功",list);
        }else{
            return new ResultMsg(-1,"图片列表显示失败",list);
        }
    }



}
