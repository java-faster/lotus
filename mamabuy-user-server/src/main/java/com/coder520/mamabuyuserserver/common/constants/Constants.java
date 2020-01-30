package com.coder520.mamabuyuserserver.common.constants;

/**
 * Created by JackWangon[www.] 2017/7/29.
 */
public class Constants {
    /**用户token**/
    public static final String REQUEST_TOKEN_KEY = "user-token";
    /**客户端版本**/
    public static final String REQUEST_VERSION_KEY = "version";
    /**客户端平台 android/ios**/
    public static final String REQUEST_PLATFORM_KEY = "platform";

    public static final String REQUEST_TYPE_KEY = "type";
    /**自定义状态码 start**/
    public static final int RESP_STATUS_OK = 200;

    public static final int RESP_STATUS_NOAUTH = 401;

    public static final int RESP_STATUS_INTERNAL_ERROR = 500;

    public static final int RESP_STATUS_BADREQUEST = 400;
    /**自定义状态码 end**/

    /**秒滴SMS start**/
    public static final String MDSMS_ACCOUNT_SID = "102d929b3a8348d998ab3db8f019badb";

    public static final String MDSMS_AUTH_TOKEN = "fbb7956be657494f87af9f8019cd0c40";

    public static final String MDSMS_REST_URL = "https://api.miaodiyun.com/20150822";

    public static final String MDSMS_VERCODE_TPLID = "567222874";

    /**秒滴SMS end**/


    /***七牛keys start****/
    public static final String QINIU_ACCESS_KEY="gWSgTRj98MdFtvKkYAw0eSa5uWVw2P65LllYmtvm";

    public static final String QINIU_SECRET_KEY="nKTTc8ogHP_jqgZmpa7lQgIxncX0BIoWLgsU2TRU";

    public static final String QINIU_HEAD_IMG_BUCKET_NAME="lotus-person-cloud";

    public static final String QINIU_HEAD_IMG_BUCKET_URL="pe5swt2ae.bkt.clouddn.com";

    /***七牛keys end****/

    /**百度云推送 start**/
    public static final String BAIDU_YUN_PUSH_API_KEY="SNQCgiGUhdXCM4Q4vremLVoG";

    public static final String BAIDU_YUN_PUSH_SECRET_KEY="7sCdcW8V5MOapbjIPCc677OPELcDkv0z";

    public static final String CHANNEL_REST_URL = "api.push.baidu.com";
    /**百度云推送end**/

    /**用户注册分布式锁路径***/
    public static final String USER_REGISTER_DISTRIBUTE_LOCK_PATH = "/user_reg";


    /**用户token**/
    public static final String REQUEST_TOKEN_HEADER = "x-auth-token";
    /**用户session***/
    public static final String REQUEST_USER_SESSION = "current-user";

}
