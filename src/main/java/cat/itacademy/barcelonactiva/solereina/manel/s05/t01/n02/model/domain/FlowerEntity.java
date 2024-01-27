package cat.itacademy.barcelonactiva.solereina.manel.s05.t01.n02.model.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "Flower")
public class FlowerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer pk_FlowerID;
    @Column(name = "name")
    String flowerName;
    @Column(name = "country")
    String flowerCountry;

    public FlowerEntity() {
    }

    public Integer getPk_FlowerID() {
        return pk_FlowerID;
    }

    public void setPk_FlowerID(Integer pk_FlowerID) {
        this.pk_FlowerID = pk_FlowerID;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public String getFlowerCountry() {
        return flowerCountry;
    }

    public void setFlowerCountry(String flowerCountry) {
        this.flowerCountry = flowerCountry;
    }
}
