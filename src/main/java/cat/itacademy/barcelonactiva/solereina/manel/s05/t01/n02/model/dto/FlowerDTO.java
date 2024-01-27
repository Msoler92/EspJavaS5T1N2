package cat.itacademy.barcelonactiva.solereina.manel.s05.t01.n02.model.dto;

import cat.itacademy.barcelonactiva.solereina.manel.s05.t01.n02.model.domain.FlowerEntity;

import java.util.Arrays;
import java.util.List;

public class FlowerDTO {
    Integer pk_FlorID;
    String flowerName;
    String flowerCountry;
    String flowerType;

    private static final List<String> EU_COUNTRIES = Arrays.asList("Austria", "Belgium", "Bulgaria", "Croatia", "Republic of Cyprus", "Czech Republic", "Denmark", "Estonia", "Finland", "France", "Germany", "Greece", "Hungary", "Ireland", "Italy", "Latvia", "Lithuania", "Luxembourg", "Malta", "Netherlands", "Poland", "Portugal", "Romania", "Slovakia", "Slovenia", "Spain", "Sweden");

    public FlowerDTO() {
    }

    public Integer getPk_FlorID() {
        return pk_FlorID;
    }

    public void setPk_FlorID(Integer pk_FlorID) {
        this.pk_FlorID = pk_FlorID;
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

    public String getFlowerType() {
        return flowerType;
    }

    public void setFlowerType(String flowerType) {
        this.flowerType = flowerType;
    }

    public static FlowerDTO fromEntity(FlowerEntity entity) {
        FlowerDTO dto = new FlowerDTO();
        dto.setPk_FlorID(entity.getPk_FlowerID());
        dto.setFlowerName(entity.getFlowerName());
        dto.setFlowerCountry(entity.getFlowerCountry());

        if (EU_COUNTRIES.contains(entity.getFlowerCountry())) {
            dto.setFlowerType("EU");
        } else {
            dto.setFlowerType("Not EU");
        }

        return dto;
    }

    public static FlowerEntity toEntity (FlowerDTO dto) {
        FlowerEntity entity = new FlowerEntity();
        entity.setPk_FlowerID(dto.getPk_FlorID());
        entity.setFlowerName(dto.getFlowerName());
        entity.setFlowerCountry(dto.getFlowerCountry());

        return entity;
    }
}
