package com.ndt.pojos;

import com.ndt.pojos.Danhgia;
import com.ndt.pojos.Hoidong;
import com.ndt.pojos.Tieuchi;
import com.ndt.pojos.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-09-10T14:05:21")
@StaticMetamodel(Khoaluan.class)
public class Khoaluan_ { 

    public static volatile SingularAttribute<Khoaluan, Date> createdDate;
    public static volatile ListAttribute<Khoaluan, Danhgia> danhgiaList;
    public static volatile SingularAttribute<Khoaluan, Hoidong> hoidongId;
    public static volatile ListAttribute<Khoaluan, User> userList;
    public static volatile SingularAttribute<Khoaluan, Integer> id;
    public static volatile ListAttribute<Khoaluan, Tieuchi> tieuchiList;
    public static volatile SingularAttribute<Khoaluan, String> title;
    public static volatile SingularAttribute<Khoaluan, Integer> totalScore;

}