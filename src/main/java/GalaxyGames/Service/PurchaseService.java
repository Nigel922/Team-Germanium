package GalaxyGames.Service;

import GalaxyGames.Model.Purchase;
import GalaxyGames.Repository.PurchaseRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class PurchaseService {

    PurchaseRepo purchaseRepo;

    @Autowired
    public PurchaseService(PurchaseRepo purchaseRepo){
        this.purchaseRepo = purchaseRepo;
    }

    public Purchase getPurchaseById(int id){
        return purchaseRepo.findOrderById(id);
    }


}
