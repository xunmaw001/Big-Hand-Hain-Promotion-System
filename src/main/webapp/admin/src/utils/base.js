const base = {
    get() {
                return {
            url : "http://localhost:8080/ssm5b2ht/",
            name: "ssm5b2ht",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm5b2ht/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "大手海恩宣传系统"
        } 
    }
}
export default base
