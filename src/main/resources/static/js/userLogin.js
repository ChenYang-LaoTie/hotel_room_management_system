$("#login").click(function () {
    $.ajax({
        url: "127.0.0.1/8081/User/userLogin",
        data: {
            userUsername: $("#userUsername").val(),
            userPassword: $("#userPassword").val()
        },
        type: "POST",
        dataType: "json",
        success :function (data) {
            console.log(data)
        }
    })
})