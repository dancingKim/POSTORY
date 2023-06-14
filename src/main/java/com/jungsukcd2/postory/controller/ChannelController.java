package com.jungsukcd2.postory.controller;

import com.jungsukcd2.postory.dto.ChannelDto;
import com.jungsukcd2.postory.dto.ResponseDto;
import com.jungsukcd2.postory.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("channel")
public class ChannelController {

    private final ChannelService channelService;

    @Autowired
    ChannelController(ChannelService channelService){
        this.channelService = channelService;
    }

    @GetMapping("/channels")
    public List<ChannelDto> getChannels(){
        return channelService.getChannels();
    }



    @PostMapping("/create")
    public ResponseEntity<?> createChannel(@RequestBody ChannelDto dto){

        try{
//            String temporaryUserId = "772d132622ba4b53953e251b254671f";

            ChannelDto channelDto =  new ChannelDto(dto);

            channelDto.setChnlId(null);

//            dto.setCrtId(temporaryUserId);

            List<ChannelDto> dtos = channelService.createChannel(channelDto);


            ResponseDto<ChannelDto> response = ResponseDto.<ChannelDto>builder().data(dtos).build();

            return ResponseEntity.ok().body(response);


        }catch (Exception e){

            String error = e.getMessage();

            ResponseDto<ChannelDto> response = ResponseDto.<ChannelDto>builder().error(error).build();

            return ResponseEntity.badRequest().body(response);
        }

    }

    @GetMapping("/user")
    public ResponseEntity<?> retrieveChannelDto(@RequestParam String crtId){
        List<ChannelDto> dtos = channelService.retrieve(crtId);


        ResponseDto<ChannelDto> response = ResponseDto.<ChannelDto>builder().data(dtos).build();

        return ResponseEntity.ok().body(response);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteChannel(@RequestParam ChannelDto dto){

        try{
            ChannelDto channelDto = new ChannelDto(dto);

            channelDto.setCrtId(dto.getCrtId());

            List<ChannelDto> dtos = channelService.delete(dto);


            ResponseDto<ChannelDto> response = ResponseDto.<ChannelDto>builder().data(dtos).build();

            return ResponseEntity.ok().body(response);

        }catch (Exception e){
            String error = e.getMessage();

            ResponseDto<ChannelDto> response = ResponseDto.<ChannelDto>builder().error(error).build();

            return ResponseEntity.badRequest().body(response);
        }
    }

    @PutMapping
    public ResponseEntity<?> updateTodo(@RequestBody ChannelDto dto){

        ChannelDto channelDto = new ChannelDto(dto);
        channelDto.setCrtId(dto.getCrtId());

        List<ChannelDto> dtos = channelService.update(channelDto);


        ResponseDto<ChannelDto> response = ResponseDto.<ChannelDto>builder().data(dtos).build();

        return ResponseEntity.ok().body(response);
    }






}
