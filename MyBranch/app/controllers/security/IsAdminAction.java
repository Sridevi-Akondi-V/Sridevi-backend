package controllers.security;

import models.Member;
import play.Logger;
import play.mvc.Http;
import play.mvc.Result;
import models.User;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class IsAdminAction extends play.mvc.Action.Simple {

    @Override
    public CompletionStage<Result> call(Http.Context ctx) {

        final Member m= (Member) ctx.args.get("user");
        if (m.getRole() != Member.Role.ADMIN) {
            return CompletableFuture.completedFuture(forbidden());
        }

        Logger.debug("User has admin role");

        return delegate.call(ctx);
    }

}
