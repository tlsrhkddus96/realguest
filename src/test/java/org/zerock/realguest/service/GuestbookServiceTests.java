package org.zerock.realguest.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.realguest.dto.GuestbookDTO;
import org.zerock.realguest.dto.PageRequestDTO;
import org.zerock.realguest.dto.PageResultDTO;
import org.zerock.realguest.entity.Guestbook;

@SpringBootTest
public class GuestbookServiceTests {

    @Autowired
    private GuestbookService service;

    @Test
    public void testRegister(){

        GuestbookDTO guestbookDTO = GuestbookDTO.builder()
                .title("SampleTitle")
                .content("SampleContent")
                .writer("user0")
                .build();
        System.out.println(service.register(guestbookDTO));

    }

    @Test
    public void testList(){

        PageRequestDTO pageRequestDTO = PageRequestDTO.builder().page(1).size(10).build();

        PageResultDTO<GuestbookDTO, Guestbook> resultDTO = service.getList(pageRequestDTO);

        System.out.println("Prev : " + resultDTO.isPrev());
        System.out.println("Next : " + resultDTO.isNext());
        System.out.println("TOtal : " + resultDTO.getTotalPage());


        for(GuestbookDTO guestbookDTO : resultDTO.getDtoList()){
            System.out.println(guestbookDTO);
        }

        resultDTO.getPageList().forEach(i -> System.out.println(i));

    }



}
