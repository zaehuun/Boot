package com.example.security.security1.dto;

import com.example.security.entity.ClubMemberRole;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;
import java.util.Set;


@Log4j2
@Getter
@Setter
@ToString
public class ClubAuthMemberDTO extends User {

    public ClubAuthMemberDTO(String username, String password, boolean fromSocial, Collection<? extends GrantedAuthority> authorities){
        super(username, password, authorities);
        this.email = username;
        this.fromSocial = fromSocial;
    }

    private String email;

    private String name;

    private boolean fromSocial;


}
