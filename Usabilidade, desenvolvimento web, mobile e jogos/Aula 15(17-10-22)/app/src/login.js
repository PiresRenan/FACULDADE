//URL base da API
const url = 'http://localhost:3306'

//Criação de uma variavel de referencia para o formulario de login
const form_login = document.querySelector('#login')

//Tratamento do envio de formulário
form_login.addEventListener('submit', async e => {
    e.preventDefault()

    // As duas linhas seguintes criam um objeto contendo os campos de texto do formulário
    const ff = new FormData(e.target)
    const fd = Object.fromEntries(ff)

    // Validação para saber se todos os campos foram devidamente preenchidos
    if(!fd.email || !fd.password) {
        window.alert('Preencha todos os campos.')
        return
    }

    const response = await fetch(`${url}/auth`, {
        headers: { 'Content-Type': 'application/json' },
        method: 'POST', 
        body: JSON.stringify(fd)
    })

    const data = await response.json()

    if (data.error) {
        console.log(data.error)
        return
    }

    window.location.href = '/list.html'
})