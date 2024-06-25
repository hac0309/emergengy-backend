package project.emergency.order.entity;

import jakarta.persistence.*;
import lombok.*;
import project.emergency.base.entity.BaseEntity;
import project.emergency.member.entitiy.Member;

@Entity
@Table(name = "tbl_order")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int orderNo;

    @ManyToOne
    Member customer;

    @Column(nullable = false)
    int usedPoint;

    @Column(nullable = false)
    int totalPoint;

    @Column(length = 200, nullable = false)
    String address;

    @Column(length = 50, nullable = false)
    String phone;
}
