package ru.aaaTurbo.interfaces;

import ru.aaaTurbo.exceptions.NoMoreHealingsException;

public interface Healable {

    void heal() throws NoMoreHealingsException;
}
