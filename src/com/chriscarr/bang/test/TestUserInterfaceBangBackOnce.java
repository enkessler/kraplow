package com.chriscarr.bang.test;

import java.util.List;

import com.chriscarr.bang.InPlay;
import com.chriscarr.bang.Player;
import com.chriscarr.bang.userinterface.UserInterface;

public class TestUserInterfaceBangBackOnce extends TestUserInterface implements
		UserInterface {

	@Override
	public int askDiscard(Player player) {
		// TODO Auto-generated method stub
		return 0;
	}

	boolean banged = false;
	@Override
	public int respondBang(Player player) {
		if(!banged){
			banged = true;
			return 0;
		} else {
			return -1;
		}
	}

	@Override
	public int chooseGeneralStoreCard(Player generalPlayer,
			List<Object> generalStoreCards) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int askPlayer(Player player, List<String> otherPlayers) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int askOthersCard(Player player, InPlay inPlay, boolean hasHand) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Object> chooseTwoDiscardForLife(Player sidKetchum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int askPlay(Player player) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean chooseDiscard(Player player) {
		// TODO Auto-generated method stub
		return false;
	}
	public void printInfo(String info){
		//do nothing
	}

	@Override
	public boolean chooseFromPlayer(Player player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int chooseDrawCard(Player player, List<Object> cards) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int chooseCardToPutBack(Player player, List<Object> cards) {
		// TODO Auto-generated method stub
		return 0;
	}
}