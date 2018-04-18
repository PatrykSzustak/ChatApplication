package com.patryk.patryk.service;

import com.patryk.patryk.entity.PlayerEntity;
import com.patryk.patryk.model.Player;
import org.springframework.stereotype.Service;
import com.patryk.patryk.repositories.PlayerRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> findAll() {
        return toPlayerDto(playerRepository.findAll());
    }


    private PlayerEntity toEntity(Player player) {
        return new PlayerEntity(player.getName(), player.getSurname());
    }

    private Player toPlayerDto(PlayerEntity entity) {
        return new Player(entity.getId(), entity.getName(), entity.getSurname(), entity.getTeam().getName());
    }

    private List<Player> toPlayerDto(List<PlayerEntity> entities) {
        return entities.stream().map(this::toPlayerDto).collect(Collectors.toList());
    }



}
