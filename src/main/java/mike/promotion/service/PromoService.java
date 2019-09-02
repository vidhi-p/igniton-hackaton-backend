package mike.promotion.service;

import mike.promotion.domain.GetPromoOfferResponse;
import mike.promotion.domain.Promotion;
import mike.promotion.repository.PromoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class PromoService  {
    private static final Logger log = LoggerFactory.getLogger(PromoService.class);

    @Autowired
    private PromoRepository promoRepository;

    public GetPromoOfferResponse isPromoOffered(String promoOfferUniqueId){
        GetPromoOfferResponse promoOfferResponse = new GetPromoOfferResponse();
        if(promoRepository.findById(promoOfferUniqueId).orElse(null) != null){
            promoOfferResponse.setPromoOffered(true);
        } else {
            promoOfferResponse.setPromoOffered(false);
        }
        return promoOfferResponse;
    }

    public Promotion addPromoOffer(Promotion promotion){
        return promoRepository.save(promotion);
    }

    public Promotion updatePromoOffer(Promotion promotion){
        return promoRepository.findById(promotion.getPromoOfferUniqueId()).orElseThrow(()-> new IllegalArgumentException("NO OFFER FOUND"));
    }
}
