package com.hansomebo.generate.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TemplateEntity {

    private String templateName;

    private String pakageName;

    /*包含文件路径*/
    private String fileName;

}
