package net.yangweb.api.member.controller;

import lombok.RequiredArgsConstructor;
import net.yangweb.api.member.domain.MemberDTO;
import net.yangweb.api.member.sevice.MemberService;
import org.springframework.web.bind.annotation.*;

/**
 * packageName: net.yangweb.api.commom.member.controller
 * fileName   : MemberController
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
@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService service;


    @GetMapping("/member/bmi/{name}/{height}/{weight}")
    public String getBmi(@PathVariable String name,
                         @PathVariable double height,
                         @PathVariable double weight){
        System.out.println(" 리액트에서 넘어온 이름: "+name);
        System.out.println(" 리액트에서 넘어온 키: "+height);
        System.out.println(" 리액트에서 넘어온 몸무게: "+weight);
        return "BMI 는 정상";
    }


}