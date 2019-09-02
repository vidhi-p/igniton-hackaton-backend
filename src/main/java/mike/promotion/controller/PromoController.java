package mike.promotion.controller;
import io.swagger.annotations.ApiParam;
import mike.promotion.domain.GetPromoOfferResponse;
import mike.promotion.domain.Promotion;
import mike.promotion.service.PromoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/promo")
@RestController
@CrossOrigin
public class PromoController {

    @Autowired
    PromoService promoService;

    @GetMapping("/promo-offer/{promoOfferUniqueId}")
    public GetPromoOfferResponse isPromoOffered(@ApiParam(required = true) @Valid @PathVariable(value = "promoOfferUniqueId") String promoOfferUniqueId) throws Exception {
        return promoService.isPromoOffered(promoOfferUniqueId);
    }

    @PutMapping
    public Promotion addPromotions(@ApiParam(required = true) @Valid @RequestBody Promotion promotion){
        return promoService.addPromoOffer(promotion);
    }

    @PostMapping
    public Promotion updatePromotion(@ApiParam(required = true) @Valid @RequestBody Promotion promotion){
        return promoService.updatePromoOffer(promotion);
    }
}
