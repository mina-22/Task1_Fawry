import java.time.LocalDate;
import java.util.Date;

public class ExpirableProduct implements Expirable{
    private LocalDate ExpiryDate;
    ExpirableProduct(LocalDate ExpiryDate)
    {
        this.ExpiryDate = ExpiryDate;
    }
    @Override
    public LocalDate getExpiryDate() {
        return this.ExpiryDate;
    }
    public void setExpiryDate(LocalDate ExpiryDate)
    {
        this.ExpiryDate = ExpiryDate;
    }
}
