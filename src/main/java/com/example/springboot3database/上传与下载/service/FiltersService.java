package com.example.springboot3database.上传与下载.service;

import com.example.springboot3database.上传与下载.domain.Filters;
import com.example.springboot3database.上传与下载.repostory.FiltersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.List;
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

    public List<Filters> findAll(){
        return filtersRepository.findAll();
    }


    public ResponseEntity<byte[]> findById(String id) {
        Filters a= (Filters) filtersRepository.findById(id);
        byte[] bytes = a.getFilter();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentDispositionFormData("attachment", id);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
     return ResponseEntity.ok().header("Content-Disposition", "attachment; filename=" + id).body(bytes);
    }
}
