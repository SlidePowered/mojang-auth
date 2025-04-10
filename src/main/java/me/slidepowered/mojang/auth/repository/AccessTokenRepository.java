package me.slidepowered.mojang.auth.repository;

import io.quarkus.hibernate.reactive.panache.PanacheRepository;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import me.slidepowered.mojang.auth.model.AccessToken;

@ApplicationScoped
public class AccessTokenRepository implements PanacheRepository<AccessToken> {
    public Uni<AccessToken> findByName(String token){
        return find("token", token).firstResult();
    }
}
