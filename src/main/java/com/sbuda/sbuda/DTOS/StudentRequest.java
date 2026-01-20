package com.sbuda.sbuda.DTOS;

import com.sbuda.sbuda.models.Program;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentRequest {

    private String name;
    private String email;
    private Integer age;
    private Integer programId;
}
