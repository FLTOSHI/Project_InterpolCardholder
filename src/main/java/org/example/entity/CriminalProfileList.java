package org.example.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter

public class CriminalProfileList {
    private List <Profile> data;

    public CriminalProfileList() {
    }
}