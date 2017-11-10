package com.sda.planer.planer.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Room {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private int capaccity;




}
