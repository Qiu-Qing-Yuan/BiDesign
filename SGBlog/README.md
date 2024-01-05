## 示例：

​		[个人博客](http://118.195.213.131/#/Share?classId=16)

​		[天青色博客](http://114.132.81.250:8085/#/Home)







![image-20240103213651898](README.assets/image-20240103213651898.png)

若不设置枚举，若需要统一返回值（为0），则需要逐个修改，代码可维护和复用性不高













~~~Java
public enum AppHttpCodeEnum {
        // 成功
        SUCCESS(200,"操作成功"),
        // 登录
        NEED_LOGIN(401,"需要登录后操作"),
        NO_OPERATOR_AUTH(403,"无权限操作"),
        SYSTEM_ERROR(500,"出现错误"),
        USERNAME_EXIST(501,"用户名已存在"),
        PHONENUMBER_EXIST(502,"手机号已存在"), EMAIL_EXIST(503, "邮箱已存在"),
        REQUIRE_USERNAME(504, "必需填写用户名"),
        LOGIN_ERROR(505,"用户名或密码错误");
        int code;
        String msg;
        AppHttpCodeEnum(int code, String errorMessage){
        this.code = code;
        this.msg = errorMessage;
        }
        public int getCode() {
        return code;
        }
        public String getMsg() {
        return msg;
        }
}
~~~







前后端联调

跨域问题

![image-20240104135704257](README.assets/image-20240104135704257.png)





优化相应数据（前端用不到这么多数据）

![image-20240104142024754](README.assets/image-20240104142024754.png)