package com.kodilla.rps;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RPSTestSuite {

    private Player player = mock(Player.class);
    private ComputerPlayer computerPlayer = mock(ComputerPlayer.class);
    private Score score = new Score(player,computerPlayer,1);

    @Test
    public void playerOne() {


        when(player.makeMove()).thenReturn("2");
        when(computerPlayer.makeMove()).thenReturn("1");

        int result = score.play().getPlayer1Points();

        Assert.assertEquals(1, result);
    }

    @Test
    public  void playerTwo() {

        when(player.makeMove()).thenReturn("1");
        when(computerPlayer.makeMove()).thenReturn("2");

        int result = score.play().getPlayer1Points();

        Assert.assertEquals(0, result);
    }

    @Test
    public  void playerThree() {

        when(player.makeMove()).thenReturn("x");
        when(computerPlayer.makeMove()).thenReturn("2");

        int result = score.play().getPlayer1Points();

        Assert.assertEquals(0, result);
    }
}