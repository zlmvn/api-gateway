/*
 * ====================================================================
 * ： www.roncoo.com （微信公众号：RonCoo_com）
 * 超级教程系列：《微服务架构的分布式事务解决方案》视频教程
 * 讲师：吴水成（水到渠成），840765167@qq.com
 * 课程地址：http://www.roncoo.com/details/7ae3d7eddc4742f78b0548aa8bd9ccdb
 * ====================================================================
 */
package com.xuxl.apigateway.code;

/**
 * @类功能说明： 业务异常基类，所有业务异常都必须继承于此异常 .
 * @类修改者：
 * @修改日期：
 * @修改说明：
 * @公司名称：广州领课网络科技有限公司（）
 * @作者：Along
 * @创建时间：2016-5-11 上午11:14:10
 * @版本：V1.0
 */
public class BizException extends RuntimeException {

    private static final long serialVersionUID = -5875371379845226068L;

    /**
     * 数据库操作,insert返回0
     */
    public static final BizException DB_INSERT_RESULT_0 = new BizException(
            "数据库操作,insert返回0",  10040001);

    /**
     * 数据库操作,update返回0
     */
    public static final BizException DB_UPDATE_RESULT_0 = new BizException(
            "数据库操作,update返回0",10040002 );

    /**
     * 数据库操作,selectOne返回null
     */
    public static final BizException DB_SELECTONE_IS_NULL = new BizException(
            "数据库操作,selectOne返回null", 10040003);

    /**
     * 数据库操作,list返回null
     */
    public static final BizException DB_LIST_IS_NULL = new BizException(
            "数据库操作,list返回null",10040004);

    /**
     * Token 验证不通过
     */
    public static final BizException TOKEN_IS_ILLICIT = new BizException(
            "Token 验证非法", 10040005);
    /**
     * 会话超时　获取session时，如果是空，throws 下面这个异常 拦截器会拦截爆会话超时页面
     */
    public static final BizException SESSION_IS_OUT_TIME = new BizException(
            "会话超时", 10040006);

    /**
     * 生成序列异常时
     */
    public static final BizException DB_GET_SEQ_NEXT_VALUE_ERROR = new BizException(
            "序列生成超时",10040007);

    /**
     * 异常信息
     */
    protected String msg;

    /**
     * 具体异常码
     */
    protected int code;

    public BizException( String msgFormat,int code, Object... args) {
        super(String.format(msgFormat, args));
        this.code = code;
        this.msg = String.format(msgFormat, args);
    }

    public BizException() {
        super();
    }

    public BizException(String message, Throwable cause) {
        super(message, cause);
    }

    public BizException(Throwable cause) {
        super(cause);
    }

    public BizException(String message) {
        super(message);
    }

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }

    /**
     * 实例化异常
     * 
     * @param msgFormat
     * @param args
     * @return
     */
    public BizException newInstance(String msgFormat, Object... args) {
        return new BizException( msgFormat,this.code, args);
    }

}
