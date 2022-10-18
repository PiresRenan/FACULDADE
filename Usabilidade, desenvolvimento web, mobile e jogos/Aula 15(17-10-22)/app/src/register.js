const url = 'http://localhost:3306'

const form_register = document.querySelector('#register')

form_register.addEventListener('submit', e => {
    e.preventDefault()
    const ff = new FormData(e.target)
    const fd = Object.fromEntries(ff)

    if(!fd.name || !fd.email || !fd.password) {
        window.alert('Preencha todos os campos.')
        return
    }

    fetch(`${url}/users`, {
        headers: { 'Content-Type': 'application/json' },
        mehtod: 'POST'
    })
})