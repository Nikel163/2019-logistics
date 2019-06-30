package ru.ncedu.logistics.data.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "roads")
public class RoadEntity implements Serializable {

    @EmbeddedId
    private RoadId roadId;

    @Column(name = "distance")
    private double distance;

    @ManyToOne
    @MapsId("leftId")
    @JoinColumn(name = "left_town_id")
    private TownEntity leftTown;

    @ManyToOne
    @MapsId("rightId")
    @JoinColumn(name = "right_town_id")
    private TownEntity rightTown;

    public RoadId getRoadId() {
        return roadId;
    }

    public void setRoadId(RoadId roadId) {
        this.roadId = roadId;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public TownEntity getLeftTown() {
        return leftTown;
    }

    public TownEntity getRightTown() {
        return rightTown;
    }

    public void setLeftTown(TownEntity leftTown) {
        this.leftTown = leftTown;
    }

    public void setRightTown(TownEntity rightTown) {
        this.rightTown = rightTown;
    }
}
