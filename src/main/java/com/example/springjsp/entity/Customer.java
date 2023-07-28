package com.example.springjsp.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author Fachrul Hidayat
 * @date 27/07/2023
 */
@Entity
@Data
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer Id;

    @Column(name = "Nik")
    private Integer nik;

    @Column(name = "Nama")
    private String nama;
    @Column(name = "Alamat")
    private String alamat;
    @Column(name = "Kota")
    private String kota;
    @Column(name = "Provinsi")
    private String provinsi;
    @Column(name = "Tgl_Regis")
    private LocalDateTime tglRegistrasi;
    @Column(name = "Status")
    private String status;
}
