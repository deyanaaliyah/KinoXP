package mikroblod.kinoxp.demo.repository;

import mikroblod.kinoxp.demo.model.Seats;

import java.util.List;

public interface ISeatsRepository {
        void create(Seats seats);
        Seats read(int id);
        List<Seats> readAll();
}