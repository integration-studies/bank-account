package tech.claudioed;

import javax.enterprise.context.ApplicationScoped;

/**
 * @author claudioed on 27/08/20.
 * Project bank-account
 */
@ApplicationScoped
public class PaymentService {

  public PaymentResult pay(PaymentRequest paymentRequest){
    final var account = Integer.valueOf(paymentRequest.toAccount);
    if( (account % 2) == 0){
      return new PaymentResult("insufficient funds", false);
    }
    return new PaymentResult("approved", true);
  }

}
