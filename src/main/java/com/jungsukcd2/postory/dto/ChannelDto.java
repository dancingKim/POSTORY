package com.jungsukcd2.postory.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChannelDto {
    /* CHNL_ID */
    private Integer chnlId;

    /* CHNL_TTL */
    private String chnlTtl;

    /* CHNL_INTRO */
    private String chnlIntro;

    /* CHNL_URI */
    private String chnlUri;

    /* CHNL_SB_TTL */
    private String chnlSbTtl;

    /* CHNL_IMG_PATH */
    private String chnlImgPath;

    /* SUBER_CNT */
    private Integer suberCnt;

    /* CHNL_POST_CNT */
    private Integer chnlPostCnt;

    /* CHNL_LIK_CNT */
    private Integer chnlLikCnt;

    /* CHNL_OPEN_DTM */
    private String chnlOpenDtm;

    /* CRT_ID */
    private String crtId;

    /* HMPG_URL */
    private String hmpgUrl;

    /* INSTA_URL */
    private String instaUrl;

    /* GITH_URL */
    private String githUrl;

    /* YTB_URL */
    private String ytbUrl;

    /* TWCH_URL */
    private String twchUrl;

    /* CHNL_STUS_CD */
    private Object chnlStusCd;

    /* CHNL_STUS_CHGR_ID */
    private String chnlStusChgrId;

    /* CHNL_STUS_CHG_DTM */
    private String chnlStusChgDtm;

    public ChannelDto(ChannelDto dto) {
        this.chnlId = dto.getChnlId();
        this.chnlTtl = dto.getChnlTtl();
        this.chnlIntro = dto.getChnlIntro();
        this.chnlUri = dto.getChnlUri();
        this.chnlSbTtl = dto.getChnlSbTtl();
        this.chnlImgPath = dto.getChnlImgPath();
        this.suberCnt = dto.getSuberCnt();
        this.chnlPostCnt = dto.getChnlPostCnt();
        this.chnlLikCnt = dto.getChnlLikCnt();
        this.chnlOpenDtm = dto.getChnlOpenDtm();
        this.crtId = dto.getCrtId();
        this.hmpgUrl = dto.getHmpgUrl();
        this.instaUrl = dto.getInstaUrl();
        this.githUrl = dto.getGithUrl();
        this.ytbUrl = dto.getYtbUrl();
        this.twchUrl = dto.getTwchUrl();
        this.chnlStusCd = dto.getChnlStusCd();
        this.chnlStusChgrId = dto.getChnlStusChgrId();
        this.chnlStusChgDtm = dto.getChnlStusChgDtm();
    }


    public static ChannelDto toEntity(final ChannelDto dto){
        return ChannelDto.builder()
                .chnlId(dto.getChnlId())
                .chnlTtl(dto.getChnlTtl())
                .chnlIntro(dto.getChnlIntro())
                .chnlUri(dto.getChnlUri())
                .chnlSbTtl(dto.getChnlSbTtl())
                .chnlImgPath(dto.getChnlImgPath())
                .suberCnt(dto.getSuberCnt())
                .chnlPostCnt(dto.getChnlPostCnt())
                .chnlLikCnt(dto.getChnlLikCnt())
                .chnlOpenDtm(dto.getChnlOpenDtm())
                .crtId(dto.getCrtId())
                .hmpgUrl(dto.getHmpgUrl())
                .instaUrl(dto.getInstaUrl())
                .githUrl(dto.getGithUrl())
                .ytbUrl(dto.getYtbUrl())
                .twchUrl(dto.getTwchUrl())
                .chnlStusCd(dto.getChnlStusCd())
                .chnlStusChgrId(dto.getChnlStusChgrId())
                .chnlStusChgDtm(dto.getChnlStusChgDtm())
                .build();
    }


}
