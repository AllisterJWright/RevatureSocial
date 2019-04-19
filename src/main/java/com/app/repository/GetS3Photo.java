package com.app.repository;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.SdkClientException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;

public class GetS3Photo {

   public static String getImage(InputStream i) throws IOException {
        String clientRegion = "us-east-1";
        String bucketName = "bsocial-0304-cuekt";
        String timestamp = new Timestamp(System.currentTimeMillis()).toString();

        try {
            AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
                    .withRegion(clientRegion)
                    .build();
        
            
            ObjectMetadata metadata = new ObjectMetadata();
            metadata.setContentType("image/jpg");
            metadata.addUserMetadata("x-amz-meta-title", "HEADER");
            
            // Upload a file as a new object with ContentType and title specified.
            PutObjectRequest request = new PutObjectRequest(bucketName, timestamp, i, metadata);
            
            s3Client.putObject(request);
        }
        catch(AmazonServiceException e) {
            // The call was transmitted successfully, but Amazon S3 couldn't process 
            // it, so it returned an error response.
            e.printStackTrace();
        }
        catch(SdkClientException e) {
            // Amazon S3 couldn't be contacted for a response, or the client
            // couldn't parse the response from Amazon S3.
            e.printStackTrace();
        }
        
        String amazonPrefix = "https://s3." + clientRegion + ".amazonaws.com/" + bucketName + "/";
        return amazonPrefix + timestamp;
    }
}