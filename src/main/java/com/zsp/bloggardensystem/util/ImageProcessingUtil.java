package com.zsp.bloggardensystem.util;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.Region;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;

import java.io.FileInputStream;

/**
 * @praogram: com.zsp.bloggardensystem.util
 * @author: 朱升鹏
 * @date: 2020/4/26
 * @description: 图片处理工具类
 **/
public class ImageProcessingUtil {

    public static String uploadImg(FileInputStream file,String accessKey,String secretKey,String bucket) throws QiniuException {
        // 构造一个带指定Zone对象的配置类
        Configuration cfg = new Configuration(Region.region2());
        // 其他参数参考类注释
        UploadManager uploadManager = new UploadManager(cfg);

        try {
            Auth auth = Auth.create(accessKey, secretKey);
            // 生成上传凭证，然后准备上传
            String upToken = auth.uploadToken(bucket);

            Response response = uploadManager.put(file, null, upToken, null, null);

            // 解析上传成功的结果
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);

            String fileName = putRet.key;
            return fileName;
        } catch (Exception e) {
            throw e;
        }
    }

    public static void deleteImg(String pictureCatalog,String accessKey,String secretKey,String bucket) {
        Auth auth = Auth.create(accessKey, secretKey);
        Configuration config = new Configuration(Region.region2());
        BucketManager bucketMgr = new BucketManager(auth, config);
        try {
            String[] log = pictureCatalog.split("::");
            for (String l : log) {
                bucketMgr.delete(bucket, l);
            }
        } catch (QiniuException e) {
            e.printStackTrace();
        }
    }
}
