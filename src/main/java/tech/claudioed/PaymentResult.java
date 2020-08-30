package tech.claudioed;

import java.util.UUID;

/**
 * @author claudioed on 27/08/20.
 * Project bank-account
 */
public class PaymentResult {

  private final String id = UUID.randomUUID().toString();

  private final String reason;

  private final Boolean operationSuccess;

  // Constructors
  public PaymentResult(String reason, Boolean operationSuccess) {
    this.reason = reason;
    this.operationSuccess = operationSuccess;
  }

  public String getId() {
    return id;
  }

  public String getReason() {
    return reason;
  }

  public Boolean getOperationSuccess() {
    return operationSuccess;
  }

}
