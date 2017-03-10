package services;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import controllers.MemberController;
import models.Member;
import org.apache.commons.lang3.time.DateUtils;
import play.Logger;

import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.TypedQuery;
import java.util.UUID;

import play.db.jpa.JPA;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;

public class UserService {

    private JPAApi jpaApi;

    @Inject
    public UserService (JPAApi jpaApi) {
        this.jpaApi=jpaApi;
    }
    public void createUser(Member user) {

        // TODO Save user in DB

    }

    @Transactional
    public Member authenticate(String username, String password) throws NoSuchAlgorithmException {
        String q = "SELECT m from Member m where m.uname='"+username+"' ";
        Logger.debug(q);
        TypedQuery <Member> query = jpaApi.em().createQuery(q,Member.class);
        List<Member> members = query.getResultList();
            Member mems = query.getSingleResult();
            String existing_password = mems.getPwd().substring(20);
            String salt = mems.getPwd().substring(0, 20);
            String newPwd = MemberController.getSaltedHash(MemberController.getSHA256(password), salt);
            Logger.debug("{}", members);
            if (members.isEmpty()) {
                return null;
            }
            Member member = members.get(0);
            Logger.debug(newPwd + "out");
            Logger.debug(existing_password + "out ex");
            if (newPwd.equals(existing_password)) {
                Logger.debug(newPwd);
                Logger.debug(existing_password);
                member.setAuthToken(UUID.randomUUID().toString());
                Date now = new Date();
                Date newDate = DateUtils.addHours(now, 6);
                Timestamp t = new Timestamp(newDate.getTime());
                member.setExpTime(t);
            } else {
                return null;
            }
            return member;
    }

    @Transactional
    public Member findUserByAuthToken(String authToken) {

     Logger.debug(authToken);
     String q = "SELECT m FROM Member m where m.authToken='" + authToken +"'";
     Logger.debug(q);
     TypedQuery<Member> query = jpaApi.em().createQuery(q,Member.class);
     Logger.debug("{}",query);
     List<Member> members = query.getResultList();
        Logger.debug("{}",members);
        if(members.isEmpty()){
            return null;
        }
        Member member = members.get(0);
        return member;

    }
}
