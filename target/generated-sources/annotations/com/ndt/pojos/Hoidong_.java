package com.ndt.pojos;

import com.ndt.pojos.Khoaluan;
import com.ndt.pojos.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-09-10T14:05:21")
@StaticMetamodel(Hoidong.class)
public class Hoidong_ { 

    public static volatile ListAttribute<Hoidong, User> userList;
    public static volatile SingularAttribute<Hoidong, Short> active;
    public static volatile SingularAttribute<Hoidong, Integer> id;
    public static volatile ListAttribute<Hoidong, Khoaluan> khoaluanList;

}