package com.devjoao.paymentservice.model;

import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

@Getter
@Data
public class Payment implements Serializable {

    private Long id;
    private Long idUser;
    private Long idProduct;
    private String cardNumber;

}
