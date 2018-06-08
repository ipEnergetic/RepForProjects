package railwaystation.cargo.industrialcargo;

import railwaystation.administration.direction.interfaces.DeliverWood;

import railwaystation.cargo.Cargo;

public class Wood extends Cargo implements DeliverWood {

    public Wood() {
        this.setTypeOfCargo("Wood");
        /*
         * Выбираем рандомно количество от 60м3 до 1200м3
         */
        this.setVolumeOfCargo((int)(60 + Math.random() * 1140));
        this.setWeightOfCargo(this.getVolumeOfCargo() * 700 / 1000);
    }
}