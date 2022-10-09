package trains;

import java.util.List;

public class TrainService {
    private TrainRepository trainRepository;

    public TrainService(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public Train buyTicketForTrain(String destination, int amount){
        List<Train> trains=trainRepository.getTrainsByDestination(destination);
        Train train;
        long id=0;
        for(int i=0; i<trains.size();i++){
            train=trains.get(i);
            if(train.getMaxCapacity()>=train.getNumberOfPassengers()+amount){
                id=train.getId();
                trainRepository.updateNumberOfPassengersById(id, amount);
                return trainRepository.findById(id);
            }
        }
        throw new IllegalStateException("Cannot buy ticket for train to: "+destination);
    }
}
