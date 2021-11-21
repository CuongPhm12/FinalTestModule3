package service.card;

import model.Card;
import service.IService;

import java.util.List;

public class CardService implements IService<Card> {
    @Override
    public void insert(Card card) {

    }

    @Override
    public Card findById(int id) {
        return null;
    }

    @Override
    public boolean update(Card card) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<Card> findAll() {
        return null;
    }
}
