package com.jungsukcd2.postory.dao;

import com.jungsukcd2.postory.dto.ChannelDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChannelDao {
    


    List<ChannelDto> getChannels();

    void save(ChannelDto ChannelDto);

    ChannelDto findById(int id);

    int findLastId();

    void delete(ChannelDto ChannelDto);


    List<ChannelDto> findByUserId(String id);


}
