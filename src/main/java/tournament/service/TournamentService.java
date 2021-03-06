package tournament.service;

import tournament.model.Tournament;
import tournament.model.User;

import java.util.Set;

public interface TournamentService {

    Set<Tournament> findAllBy();
    Set<Tournament> findAllByIsStartedIsFalse();
    Tournament findOneById(Long id);
    Boolean isStarted(Tournament tournament);
    Tournament create(Long userId, Integer maxPop, String Name);
    void start(Long id);
}
