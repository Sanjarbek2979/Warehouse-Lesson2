package com.example.task01.projection;

import com.example.task01.entity.Attachment;
import com.example.task01.entity.Client;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

/**
 * @author Sanjarbek Allayev, пт 17:45. 11.03.2022
 */
@Projection(name = "attachmentProjection", types = Attachment.class)
public interface AttachmentProjection {

    Integer getId();

    @Value("#{target.name}")
    String getName();

    @Value("#{target.contentType}")
    String getContentType();

    @Value("#{target.size}")
    long getSize();

}
