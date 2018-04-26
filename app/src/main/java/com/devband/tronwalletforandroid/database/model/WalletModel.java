package com.devband.tronwalletforandroid.database.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(tableName = "wallet")
public class WalletModel {

    @PrimaryKey
    private int id;

    private String name;

    private String wallet;

    private boolean imported;

    private Date created;

    private Date updated;
}
