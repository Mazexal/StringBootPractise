package stringbootpractise.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Mazexal on 2017/7/26.
 */
@Component
public class zxlProperties {
    @Value("${com.zxl.name}")
    private String name;
}
