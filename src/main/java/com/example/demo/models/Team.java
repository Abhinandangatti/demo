package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Team {

    public static int counter = 0;
    @Id
    private int id = 0;
    private String name;

    public void setId(int id){
        this.id = id;
    }
}
