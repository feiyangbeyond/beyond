package cn.tsxygfy.blog.security.token;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author ruby woo
 * @version v1.0.0
 * @see cn.tsxygfy.blog.model.dto
 * @since 2020-02-21 15:03:09
 */
@Data
public class AuthToken {

    @JsonProperty("asses_token")
    private String assesToken;

    @JsonProperty("refresh_token")
    private String refreshToken;

    @JsonProperty("expired_in")
    private int expiredIn;
}
