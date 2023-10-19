package com.xworkz.plastoreapp.application;

import lombok.*;

@Builder
@Setter
@Getter
@NoArgsConstructor   //to create default constructor
@AllArgsConstructor  // to crate parameterised constructor
public class Application
{
    private int appId;
    private String appName;
    private int sizeInMb;
    private String companyName;
    private double version;
    private String releasedDate;
    private String appType;


}
