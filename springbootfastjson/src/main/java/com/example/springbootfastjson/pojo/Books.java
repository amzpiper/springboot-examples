package com.example.springbootfastjson.pojo;

import lombok.Data;
import java.util.Date;

@Data
public class Books {
    private Integer id;
    private String name;
    private String author;
    private Date publicationDate;
}
