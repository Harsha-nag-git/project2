package com.SpringBoot.project2.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FollowDto {
    private Integer ufId;
    private Integer followingId;
    private Integer userId;
}
