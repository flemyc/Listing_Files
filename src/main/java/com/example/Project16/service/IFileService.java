package com.example.Project16.service;


import com.example.Project16.model.FileModel;

import java.util.List;

public interface IFileService {

    List<FileModel> getAllFile(String dir);
}
