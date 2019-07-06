package ru.ncedu.logistics.data.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "offerings")
public class OfferingEntity implements Serializable {

    @EmbeddedId
    private OfferingId offeringId;

    @Column(name = "price")
    private double price;

    @ManyToOne
    @MapsId("officeId")
    @JoinColumn(name = "office_id")
    private OfficeEntity office;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id")
    private ProductEntity product;

    public OfferingId getOfferingId() {
        return offeringId;
    }

    public void setOfferingId(OfferingId offeringId) {
        this.offeringId = offeringId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public OfficeEntity getOffice() {
        return office;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setOffice(OfficeEntity office) {
        this.office = office;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }
}
