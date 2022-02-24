package net.yangweb.api.member.sevice;

/**
 * packageName: net.yangweb.api.commom.service
 * fileName   : MemberService
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
public interface MemberService {
     String memList();
     String memInform();
     int sendList();
     String mailList();
     String reserve();
     String reserveList();
     String calc();
     String bmi();
     String grade();

}
