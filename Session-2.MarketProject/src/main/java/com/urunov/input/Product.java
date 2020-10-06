package com.urunov.input;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author: apple
 * @created on 21/09/2020
 * @Project is Project
 */

@Data
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product implements Serializable {


    /*** Declare Variables*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, unique = true)
    private Long product_id;

    private String productName;
    private String image;
    private String slug;
    private String type;
    private String unit;
    private int price;
    private float salePrice; // nullable=true
    private int disc_in_pros; // default =0
    private int per_unit;  // default =1
    private int quantity; //
    private String description;
    private Date creation_date;

    /*** Mapping with Hibernate**/

    @ManyToOne(cascade = CascadeType.ALL)
    private Category category;

//    @ManyToMany(mappedBy = "products")
//    private List<Orders> orders;
//    @ManyToOne(cascade = CascadeType.ALL)
//    private Orders orders;
}
