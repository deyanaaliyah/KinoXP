package mikroblod.kinoxp.demo.repository;

import mikroblod.kinoxp.demo.model.Seat;

import java.util.List;

public interface ISeatsRepository {
        void create(Seat seat);
        Seat read(int id);
        List<Seat> readAll();
}