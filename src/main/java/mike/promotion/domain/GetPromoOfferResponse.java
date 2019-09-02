package mike.promotion.domain;

import lombok.Data;

@Data
public class GetPromoOfferResponse {
    private boolean isPromoOffered;

    public void setPromoOffered(boolean isPromoOffered) {
        this.isPromoOffered = isPromoOffered;
    }

    public boolean getPromoOffered() {
        return isPromoOffered;
    }
}
