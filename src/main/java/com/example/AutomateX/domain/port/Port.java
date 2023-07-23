package com.example.AutomateX.domain.port;


import com.example.AutomateX.domain.operator.Operator;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
public class Port {

    @Id @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Operator> operators = new ArrayList<>();

    public Port(String name) {
        this.name = name;
    }

    public Port() {}
}