package com.example.mp3player_13_7;

public interface ItemOnClicker {
    void onClick(int position,Songs song);
    void pause();
    void delete(Songs song);
}
