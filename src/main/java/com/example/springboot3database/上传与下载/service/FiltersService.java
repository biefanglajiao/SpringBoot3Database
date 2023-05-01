package com.example.springboot3database.上传与下载.service;

import com.example.springboot3database.上传与下载.domain.Filters;
import com.example.springboot3database.上传与下载.repostory.FiltersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.UUID;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/5/1 9:55
 **/
@Service
public class FiltersService {
    @Autowired
    private FiltersRepository filtersRepository;
    @Autowired
    private Filters filters;



    public boolean save(Filters filters, MultipartFile[] upfile){



        for (MultipartFile multipartFile : upfile) {
            InputStream file =null;
            byte[] finalBytes =null;
            try {
                file = multipartFile.getInputStream();
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                byte[] bytes = new byte[1024];
                int temp;
                while ((temp = file.read(bytes)) != -1) {
                    outputStream.write(bytes, 0, temp);
                }
                finalBytes = outputStream.toByteArray();
                String filename = multipartFile.getOriginalFilename();
                filename= UUID.randomUUID()+"_"+filename;
                filters.setId(filename);
                filters.setFilter(finalBytes);
                filtersRepository.save(filters);
                if (filters.getId()==null){
                    return false;
                }



            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
 return true;
    }





}
