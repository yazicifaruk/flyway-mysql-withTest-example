package com.athens.h2app;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name="homework")
public class HomeWork{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String user_name;
    private String text;

    @Enumerated(EnumType.STRING)
    private Status status;
    @Temporal(TemporalType.DATE)
    private Date dt;
    private Time tm;
    private LocalDateTime dateTime;

}
