package net.yangweb.api.member.domain;

import net.yangweb.api.buy.domain.BuyDTO;

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
public class MemberDTO {
    private String memId;
    private String memName;
    private int memNumber;
    private String addr;
    private String phone1;
    private String phone2;
    private int height;
    private String debutDate;

    private final static MemberDTO memberDTO = new MemberDTO();
    private MemberDTO(){}
    public static MemberDTO getInstance(){return memberDTO;}

    public String getMemId() {
        return memId;
    }

    public void setMemId(String memId) {
        this.memId = memId;
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }

    public int getMemNumber() {
        return memNumber;
    }

    public void setMemNumber(int memNumber) {
        this.memNumber = memNumber;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getDebutDate() {
        return debutDate;
    }

    public void setDebutDate(String debutDate) {
        this.debutDate = debutDate;
    }
}
