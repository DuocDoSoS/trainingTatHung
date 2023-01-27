package com.example.demoHungTat.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "khoa", schema = "db_test")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KhoaEntity {
    @Id
    @Column(name = "ma_khoa")
    private String maKhoa;

    @Column(name = "ten_khoa")
    private String tenKhoa;

}
