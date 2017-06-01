package ddp.axis.v201705.dmpuserservice;

import com.beust.jcommander.JCommander;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.ddp.axis.factory.DdpServices;
import com.google.api.ads.ddp.axis.v201705.dmp.*;
import com.google.api.ads.ddp.lib.client.DdpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * Created by ying on 14/4/16.
 */
public class Mutate {

  public static void main(String[] argv) throws Exception {
    // parse command line parameters
    Args args = new Args();
    JCommander jCommander = new JCommander(args, argv);
    jCommander.setProgramName("Create DMP User List");
    if (args.help) {
      jCommander.usage();
      System.exit(-1);
    }

    // Generate a refreshable OAuth2 credential.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(OfflineCredentials.Api.DDP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct an DdpSession.
    DdpSession session = new DdpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DdpServices ddpServices = new DdpServices();

    addList(ddpServices, session, args.name, args.description);
//    updateList(ddpServices, session);
  }

  public static void addList(
      DdpServices ddpServices, DdpSession session,
      String name, String description) throws Exception {

    DmpUserListServiceInterface userListService = ddpServices.get(session, DmpUserListServiceInterface.class);

    ClientCustomerId clientCustomerId = new ClientCustomerId(Product.INVITE_PARTNER, session.getPartnerId());

    UserList userList = new BasicUserList();
    userList.setName(name);
    userList.setDescription(description);
//    userList.setIntegrationCode("");
    userList.setMembershipLifeSpan(365L);


    UserListOperation operation = new UserListOperation();
    operation.setOperand(userList);
    operation.setOperator(Operator.ADD);
    UserListOperation[] operations = new UserListOperation[] {operation};

    UserListReturnValue result = userListService.mutate(clientCustomerId, operations);

    if (result != null && result.getValue() != null) {
      for (UserList userListResult : result.getValue()) {
        System.out.println("UserList with name \""
            + userListResult.getName() + "\" and id \""
            + userListResult.getId() + "\" was added.");
      }
    } else {
      System.out.println("No user lists were added.");
    }
  }

  public static void updateList(
      DdpServices ddpServices, DdpSession session) throws Exception {

    DmpUserListServiceInterface userListService = ddpServices.get(session, DmpUserListServiceInterface.class);

    ClientCustomerId clientCustomerId = new ClientCustomerId(Product.INVITE_PARTNER, session.getPartnerId());
    UserListOperation[] operations = new UserListOperation[1];
    operations[0] = newOp(478095221L);


    UserListReturnValue result = userListService.mutate(clientCustomerId, operations);

    if (result != null && result.getValue() != null) {
      for (UserList userListResult : result.getValue()) {
        System.out.println("UserList with id \""
            + userListResult.getId() + "\" was updated.");
      }
    } else {
      System.out.println("No user lists were updated.");
    }
  }

  private static UserListOperation newOp(Long id) {
    UserList userList = new BasicUserList();
    userList.setId(id);
    String name = "test_only";
    userList.setName(name);
    userList.setDescription(name);
    userList.setMembershipLifeSpan(1L);

    UserListOperation operation = new UserListOperation();
    operation.setOperand(userList);
    operation.setOperator(Operator.SET);

    return operation;
  }
}
