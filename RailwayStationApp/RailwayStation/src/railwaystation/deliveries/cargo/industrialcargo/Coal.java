package railwaystation.deliveries.cargo.industrialcargo;

import railwaystation.deliveries.cargo.CommodityCargo;
import railwaystation.deliveries.cargo.interfacescondition.Bulk;
import railwaystation.deliveries.cargo.interfacescondition.IndustrialCargo;
import railwaystation.deliveries.cargo.dangerouscargo.Gas;

public class Coal extends CommodityCargo implements Bulk, IndustrialCargo{

    public Coal() {
        this.setTypeOfCargo("Coal");
        /*
         * Выбираем рандомно количество от 60м3 до 1200м3
         */
        this.setVolumeOfCargo((int)(60 + Math.random() * 1140));
        this.setWeightOfCargo(this.getVolumeOfCargo() * 2600/1000);

    }
}
