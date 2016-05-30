package ddp.axis.v201603.dmpuserservice;

import com.beust.jcommander.Parameter;

/**
 * Created by ying on 19/4/16.
 */
public class Args {
  @Parameter(names = { "--name", "-n" }, required = true, description = "The name value for the user list")
  String name;

  @Parameter(names = { "--description", "-d" }, required = true, description = "The description value for the user list")
  String description;

  @Parameter(names = { "--help", "-h" }, help = true, description = "Display help information")
  boolean help = false;
}
