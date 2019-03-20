package com.aitao.upload.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author: 局长
 * @date: 2019/2/22 23:10
 */
public interface UploadService {
    String upload(MultipartFile file);
}
