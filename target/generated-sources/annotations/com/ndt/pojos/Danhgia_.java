package com.ndt.pojos;

import com.ndt.pojos.Khoaluan;
import com.ndt.pojos.User;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-09-10T14:05:21")
@StaticMetamodel(Danhgia.class)
public class Danhgia_ { 

    public static volatile SingularAttribute<Danhgia, BigDecimal> score;
    public static volatile SingularAttribute<Danhgia, User> sinvienId;
    public static volatile SingularAttribute<Danhgia, Khoaluan> khoaluanId;
    public static volatile SingularAttribute<Danhgia, Integer> id;
    public static volatile SingularAttribute<Danhgia, String> content;

}