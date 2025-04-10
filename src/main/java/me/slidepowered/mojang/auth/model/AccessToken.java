package me.slidepowered.mojang.auth.model;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "access_token", schema = "auth")
public class AccessToken extends PanacheEntity {
    public String token;
    public Long userId;
}
