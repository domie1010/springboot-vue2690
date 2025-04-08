const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmfado9/",
            name: "ssmfado9",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmfado9/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "小区业主服务平台"
        } 
    }
}
export default base
