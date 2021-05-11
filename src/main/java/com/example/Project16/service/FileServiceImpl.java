package com.example.Project16.service;

import com.example.Project16.model.FileModel;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;


@Service
public class FileServiceImpl implements IFileService {

    @Override
    public List<FileModel> getAllFile(String dir) {
        List<FileModel> fileList = new ArrayList<FileModel>();

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(dir))) {

            for (Path path : stream) {
//                System.out.println(path.getFileName().toFile());
                FileModel fileModel = new FileModel();
                fileModel.setDir(path.getFileName().toFile().getName());
                fileList.add(fileModel);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileList;
    }
}
