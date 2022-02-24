package net.yangweb.api.member.domain;

import lombok.Data;
import net.yangweb.api.buy.domain.BuyDTO;
import org.springframework.stereotype.Component;

/**
 * packageName: net.yangweb.api.commom.domain
 * fileName   : MemberDTO
 * author     : yangjeongo
 * date       : 2022-02-11
 * desc       :
 * 클래스변수 :
 * 파라미터,인스턴스변수 :
 * 로컬변수 :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-11         yangjeongo        최초 생성
 */
@Data
@Component
public class MemberDTO {
    private String userId;
    private String name;
    private String address;
    private String phone;
    private double height;
    private double weight;
    private String regdate;
}