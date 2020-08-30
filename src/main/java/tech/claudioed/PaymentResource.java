package tech.claudioed;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

@Path("/api/payments")
public class PaymentResource {

  private final PaymentService paymentService;

  @Inject
  public PaymentResource(PaymentService paymentService) {
    this.paymentService = paymentService;
  }

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Response pay(PaymentRequest paymentRequest,@Context UriInfo uriInfo) {
    final var paymentResult = this.paymentService.pay(paymentRequest);
    if(paymentResult.getOperationSuccess()){
      UriBuilder builder = uriInfo.getAbsolutePathBuilder();
      builder.path(paymentResult.getId());
      return Response.created(builder.build()).entity(paymentResult).build();
    }
    return Response.status(422).entity(paymentResult).build();
  }

}