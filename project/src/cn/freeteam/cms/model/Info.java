package cn.freeteam.cms.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Info implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info.id
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    private String id;
    private String state;
    private String issign;
    private String iscomment;
    private String iscommentStr;
    public static String ISCOMMENT_NO="0";//不允许评论
    public static String ISCOMMENT_MEMBER="1";//会员评论
    public static String ISCOMMENT_ALL="2";//会员和匿名评论
    private String video;
    private List<String> channelids;//查询条件 栏目集合
    private String checkOpenendtime;//查询条件 检查公开时限
    private String addUserLoginName;
    private String addUserName;
    private int countnum;
 
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info.site
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    private String site;
    private String infosite;
    private String sitename;
    private String indexnum;
    private String opentype;
    private String opentimetype;
    private Date openendtime;
    private String openendtimeSec;
    private String openendtimeStr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info.channel
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    private String channel;
    private String channelname;
    private String channelPagemark;
    private String channelParid;
    private String channelParPagemark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info.title
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info.shortTitle
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    private String shorttitle;
    private String showtitle;//列表显示的标题
    private int showtitleLen;//列表显示的标题长度
    private String pageurl;//本信息的链接地址
    private String noids;
    private String sitepath;
    private String[] channels;
    private Date starttime;
    private Date endtime;
    private Date infostarttime;
    private Date infoendtime;
    private String infostarttimeStr;
    private String infoendtimeStr;
    private String searchKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info.titleColor
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    private String titlecolor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info.titleBlod
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    private String titleblod;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info.source
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    private String source;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info.author
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    private String author;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info.description
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info.tags
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    private String tags;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info.img
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    private String img;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info.url
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info.attchs
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    private String attchs;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info.addtime
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    private Date addtime;
    private String addtimeStr;
    private String dateFormat;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info.templet
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    private String templet;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info.isTop
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    private String istop;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info.topEndTime
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    private Date topendtime;
    private String topendtimeStr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info.clickNum
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    private Integer clicknum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info.addUser
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    private String adduser;
    private String adduserLike;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info.content
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info.id
     *
     * @return the value of info.id
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info.id
     *
     * @param id the value for info.id
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info.site
     *
     * @return the value of info.site
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public String getSite() {
        return site;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info.site
     *
     * @param site the value for info.site
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info.channel
     *
     * @return the value of info.channel
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public String getChannel() {
        return channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info.channel
     *
     * @param channel the value for info.channel
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info.title
     *
     * @return the value of info.title
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info.title
     *
     * @param title the value for info.title
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info.shortTitle
     *
     * @return the value of info.shortTitle
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public String getShorttitle() {
        return shorttitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info.shortTitle
     *
     * @param shorttitle the value for info.shortTitle
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public void setShorttitle(String shorttitle) {
        this.shorttitle = shorttitle == null ? null : shorttitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info.titleColor
     *
     * @return the value of info.titleColor
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public String getTitlecolor() {
        return titlecolor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info.titleColor
     *
     * @param titlecolor the value for info.titleColor
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public void setTitlecolor(String titlecolor) {
        this.titlecolor = titlecolor == null ? null : titlecolor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info.titleBlod
     *
     * @return the value of info.titleBlod
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public String getTitleblod() {
        return titleblod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info.titleBlod
     *
     * @param titleblod the value for info.titleBlod
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public void setTitleblod(String titleblod) {
        this.titleblod = titleblod == null ? null : titleblod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info.source
     *
     * @return the value of info.source
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info.source
     *
     * @param source the value for info.source
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info.author
     *
     * @return the value of info.author
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info.author
     *
     * @param author the value for info.author
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info.description
     *
     * @return the value of info.description
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info.description
     *
     * @param description the value for info.description
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info.tags
     *
     * @return the value of info.tags
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public String getTags() {
        return tags;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info.tags
     *
     * @param tags the value for info.tags
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info.img
     *
     * @return the value of info.img
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info.img
     *
     * @param img the value for info.img
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info.url
     *
     * @return the value of info.url
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info.url
     *
     * @param url the value for info.url
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info.attchs
     *
     * @return the value of info.attchs
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public String getAttchs() {
        return attchs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info.attchs
     *
     * @param attchs the value for info.attchs
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public void setAttchs(String attchs) {
        this.attchs = attchs == null ? null : attchs.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info.addtime
     *
     * @return the value of info.addtime
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info.addtime
     *
     * @param addtime the value for info.addtime
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info.templet
     *
     * @return the value of info.templet
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public String getTemplet() {
        return templet;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info.templet
     *
     * @param templet the value for info.templet
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public void setTemplet(String templet) {
        this.templet = templet == null ? null : templet.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info.isTop
     *
     * @return the value of info.isTop
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public String getIstop() {
        return istop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info.isTop
     *
     * @param istop the value for info.isTop
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public void setIstop(String istop) {
        this.istop = istop == null ? null : istop.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info.topEndTime
     *
     * @return the value of info.topEndTime
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public Date getTopendtime() {
        return topendtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info.topEndTime
     *
     * @param topendtime the value for info.topEndTime
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public void setTopendtime(Date topendtime) {
        this.topendtime = topendtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info.clickNum
     *
     * @return the value of info.clickNum
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public Integer getClicknum() {
        return clicknum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info.clickNum
     *
     * @param clicknum the value for info.clickNum
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public void setClicknum(Integer clicknum) {
        this.clicknum = clicknum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info.addUser
     *
     * @return the value of info.addUser
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public String getAdduser() {
        return adduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info.addUser
     *
     * @param adduser the value for info.addUser
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public void setAdduser(String adduser) {
        this.adduser = adduser == null ? null : adduser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info.content
     *
     * @return the value of info.content
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info.content
     *
     * @param content the value for info.content
     *
     * @mbggenerated Wed Feb 01 16:28:18 CST 2012
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

	public String getAddtimeStr() {
		if (dateFormat==null || dateFormat.trim().length()==0) {
			dateFormat="yyyy-MM-dd HH:mm:ss";
		}
		if (addtime!=null) {
			addtimeStr=new SimpleDateFormat(dateFormat).format(addtime);
		}
		return addtimeStr;
	}

	public void setAddtimeStr(String addtimeStr) {
		this.addtimeStr = addtimeStr;
	}

	public String getTopendtimeStr() {
		if (topendtime!=null) {
			topendtimeStr=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(topendtime);
		}
		return topendtimeStr;
	}

	public void setTopendtimeStr(String topendtimeStr) {
		this.topendtimeStr = topendtimeStr;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getShowtitle() {
		//默认为标题
		String title=this.title;
		//判断是否有短标题
		if (shorttitle!=null && shorttitle.trim().length()>0) {
			title=shorttitle;
		}
		//判断标题长度
		if (showtitleLen>0 && title.length()>showtitleLen) {
			title=title.substring(0, showtitleLen);
		}
		//添加标题颜色
		title="<font color='"+titlecolor+"'>"+title+"</font>";
		//判断是否粗体
		if ("1".equals(titleblod)) {
			title="<b>"+title+"</b>";
		}
		return title;
	}

	public void setShowtitle(String showtitle) {
		this.showtitle = showtitle;
	}

	public int getShowtitleLen() {
		return showtitleLen;
	}

	public void setShowtitleLen(int showtitleLen) {
		this.showtitleLen = showtitleLen;
	}

	public String getPageurl() {
		//判断是否有外部链接
		if (url!=null && url.trim().length()>0) {
			pageurl=url;
		}else {
			pageurl=(sitepath!=null?sitepath:"")+channel+"/info/"+(getAddtime().getYear()+1900)+"/"+id+".html";
		}
		return pageurl;
	}

	public void setPageurl(String pageurl) {
		this.pageurl = pageurl;
	}

	public String getNoids() {
		return noids;
	}

	public void setNoids(String noids) {
		this.noids = noids;
	}

	public String getDateFormat() {
		return dateFormat;
	}

	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}

	public String getChannelPagemark() {
		return channelPagemark;
	}

	public void setChannelPagemark(String channelPagemark) {
		this.channelPagemark = channelPagemark;
	}

	public String getSitepath() {
		return sitepath;
	}

	public void setSitepath(String sitepath) {
		this.sitepath = sitepath;
	}

	public String[] getChannels() {
		return channels;
	}

	public void setChannels(String[] channels) {
		this.channels = channels;
	}

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public String getSearchKey() {
		return searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}

	public String getIssign() {
		return issign;
	}

	public void setIssign(String issign) {
		this.issign = issign;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getIscomment() {
		return iscomment;
	}

	public void setIscomment(String iscomment) {
		this.iscomment = iscomment;
	}

	public String getIscommentStr() {
		if (ISCOMMENT_NO.equals(iscomment)) {
			iscommentStr="否";
		}
		else if (ISCOMMENT_MEMBER.equals(iscomment)) {
			iscommentStr="会员评论";
		}
		else if (ISCOMMENT_ALL.equals(iscomment)) {
			iscommentStr="会员和匿名评论";
		}
		return iscommentStr;
	}

	public void setIscommentStr(String iscommentStr) {
		this.iscommentStr = iscommentStr;
	}

	public String getChannelParid() {
		return channelParid;
	}

	public void setChannelParid(String channelParid) {
		this.channelParid = channelParid;
	}

	public String getChannelParPagemark() {
		return channelParPagemark;
	}

	public void setChannelParPagemark(String channelParPagemark) {
		this.channelParPagemark = channelParPagemark;
	}

	public String getIndexnum() {
		return indexnum;
	}

	public void setIndexnum(String indexnum) {
		this.indexnum = indexnum;
	}

	public String getOpentype() {
		return opentype;
	}

	public void setOpentype(String opentype) {
		this.opentype = opentype;
	}

	public String getOpentimetype() {
		return opentimetype;
	}

	public void setOpentimetype(String opentimetype) {
		this.opentimetype = opentimetype;
	}

	public Date getOpenendtime() {
		return openendtime;
	}

	public void setOpenendtime(Date openendtime) {
		this.openendtime = openendtime;
	}

	public String getOpenendtimeStr() {
		if (openendtime!=null) {
			openendtimeStr=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(openendtime);
		}
		return openendtimeStr;
	}

	public void setOpenendtimeStr(String openendtimeStr) {
		this.openendtimeStr = openendtimeStr;
	}

	public List<String> getChannelids() {
		return channelids;
	}

	public void setChannelids(List<String> channelids) {
		this.channelids = channelids;
	}

	public String getCheckOpenendtime() {
		return checkOpenendtime;
	}

	public void setCheckOpenendtime(String checkOpenendtime) {
		this.checkOpenendtime = checkOpenendtime;
	}

	public String getOpenendtimeSec() {
		if (openendtime!=null) {
			openendtimeSec=(""+openendtime.getTime()).replaceAll(",", "");
		}
		return openendtimeSec;
	}

	public void setOpenendtimeSec(String openendtimeSec) {
		this.openendtimeSec = openendtimeSec;
	}

	public String getAddUserLoginName() {
		return addUserLoginName;
	}

	public void setAddUserLoginName(String addUserLoginName) {
		this.addUserLoginName = addUserLoginName;
	}

	public String getAddUserName() {
		return addUserName;
	}

	public void setAddUserName(String addUserName) {
		this.addUserName = addUserName;
	}

	public int getCountnum() {
		return countnum;
	}

	public void setCountnum(int countnum) {
		this.countnum = countnum;
	}

	public String getAdduserLike() {
		return adduserLike;
	}

	public void setAdduserLike(String adduserLike) {
		this.adduserLike = adduserLike;
	}

	public Date getInfostarttime() {
		return infostarttime;
	}

	public void setInfostarttime(Date infostarttime) {
		this.infostarttime = infostarttime;
	}

	public Date getInfoendtime() {
		return infoendtime;
	}

	public void setInfoendtime(Date infoendtime) {
		this.infoendtime = infoendtime;
	}

	public String getInfostarttimeStr() {
		if (infostarttime!=null) {
			infostarttimeStr=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(infostarttime);
		}
		return infostarttimeStr;
	}

	public void setInfostarttimeStr(String infostarttimeStr) {
		this.infostarttimeStr = infostarttimeStr;
	}

	public String getInfoendtimeStr() {
		if (infoendtime!=null) {
			infoendtimeStr=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(infoendtime);
		}
		return infoendtimeStr;
	}

	public void setInfoendtimeStr(String infoendtimeStr) {
		this.infoendtimeStr = infoendtimeStr;
	}

	public String getSitename() {
		return sitename;
	}

	public void setSitename(String sitename) {
		this.sitename = sitename;
	}

	public String getInfosite() {
		return infosite;
	}

	public void setInfosite(String infosite) {
		this.infosite = infosite;
	}

	public String getChannelname() {
		return channelname;
	}

	public void setChannelname(String channelname) {
		this.channelname = channelname;
	}

}