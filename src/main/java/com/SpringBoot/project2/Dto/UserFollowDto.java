package com.SpringBoot.project2.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserFollowDto {
    private Long ufId;
    private Integer followingId;
    private Long followerId;
}
