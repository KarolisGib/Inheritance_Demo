package lt.karolis.inter;

import java.math.BigDecimal;

public class Taksofonas implements Telefonas {

    private BigDecimal piniguLikutis;
    private final BigDecimal SKAMBUCIO_KAINA = BigDecimal.valueOf(0.25);
    private String numeris = "[Taksofonas]";

    public Taksofonas(Double pinigelis) {

        this.piniguLikutis = BigDecimal.valueOf(pinigelis);
//        this.piniguLikutis = new BigDecimal(pinigelis); kitas variantas kaip aprasyti^
    }

    @Override
    public void paskambink(String telefonoNumeris) {
        if (piniguLikutis.compareTo(SKAMBUCIO_KAINA) > -1) {
//            super.paskambink(telefonoNumeris);
            System.out.println(
                    String.format(
                            "Abonementas %s, skambina i %s",
                            this.numeris,
                            telefonoNumeris
                    )
            );
            this.piniguLikutis = this.piniguLikutis.subtract(SKAMBUCIO_KAINA);
        } else {
            System.out.println("Skambuciui nepakanka pinigu" );
            System.out.println("Pinigu likutis yra " + this.piniguLikutis);
        }
    }

    public BigDecimal getPiniguLikutis() {
        return piniguLikutis;
    }

    public void setPiniguLikutis(Double piniguLikutis) {
        this.piniguLikutis = BigDecimal.valueOf(piniguLikutis).add(this.piniguLikutis);
    }

    @Override
    public String toString() {
        return String.format(
                "Taksofonas[numeris: %s, pinigu likutis: %s]",
                this.numeris,
                this.piniguLikutis
        );
    }
}
