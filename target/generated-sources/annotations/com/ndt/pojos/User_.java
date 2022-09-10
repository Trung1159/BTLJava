package com.ndt.pojos;

import com.ndt.pojos.Danhgia;
import com.ndt.pojos.Hoidong;
import com.ndt.pojos.Khoaluan;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-09-10T14:19:20")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> password;
    public static volatile ListAttribute<User, Danhgia> danhgiaList;
    public static volatile SingularAttribute<User, Hoidong> hoidongId;
    public static volatile SingularAttribute<User, Khoaluan> khoaluanId;
    public static volatile SingularAttribute<User, String> name;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> userRole;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, String> username;

}