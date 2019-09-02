package sample.promotion.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import sample.promotion.enumeration.PromoStatus;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
public class Promotion {
    @Id
    String promoOfferUniqueId;

    @CreationTimestamp
    @JsonIgnore
    Date createDate;

    @NotNull
    PromoStatus promoStatus;

    public String getPromoOfferUniqueId() {
        return promoOfferUniqueId;
    }

    public void setPromoOfferUniqueId(String promoOfferUniqueId) {
        this.promoOfferUniqueId = promoOfferUniqueId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public PromoStatus getPromoStatus() {
        return promoStatus;
    }

    public void setPromoStatus(PromoStatus promoStatus) {
        this.promoStatus = promoStatus;
    }
}
