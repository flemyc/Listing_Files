package com.example.Project16.controller;


import com.example.Project16.model.FileModel;
import com.example.Project16.service.IFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class FileDirController {

    @Autowired
    IFileService fileServiceRef;

    @RequestMapping("/queryparam")
    public List<FileModel> getAllFile(@RequestParam("dir") String dir){
        return fileServiceRef.getAllFile(dir);
    }

}
