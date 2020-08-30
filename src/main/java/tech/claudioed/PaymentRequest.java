package tech.claudioed;

import java.math.BigDecimal;

/**
 * @author claudioed on 27/08/20.
 * Project bank-account
 */
public class PaymentRequest {

  String fromAccount;

  String toAccount;

  String value;

  String type;

  String subType;

  String time;

  String deviceType;

  public String getFromAccount() {
    return fromAccount;
  }

  public String getToAccount() {
    return toAccount;
  }

  public String getValue() {
    return value;
  }

  public String getType() {
    return type;
  }

  public String getSubType() {
    return subType;
  }

  public String getTime() {
    return time;
  }

  public String getDeviceType() {
    return deviceType;
  }

}
