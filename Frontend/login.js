fetch("http://localhost:8080/api/auth/login", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify({
        email: email,
        password: password
    })
})
.then(res => res.json())
.then(data => {
    localStorage.setItem("token", data.token);
    window.location.href = "dashboard.html";
});
window.location.href = "login.html";
