const url = 'http://localhost:3306'

const tbody = document.querySelector('.tbody')

const form_edit = document.querySelector('.edit')
const edit_id = document.querySelector('#edit_id')
const edit_name = document.querySelector('#edit_name')
const edit_description = document.querySelector('#edit_description')
const edit_price = document.querySelector('#edit_price')

const form_insert = document.querySelector('.insert')
const modal_insert = document.querySelector('.modal-insert')
const modal = document.querySelector('.modal')
const close_insert = document.querySelector('.close-insert')
const close_edit = document.querySelector('.close-edit')

const show_insert = document.querySelector('#show-form')
const btn_sair = document.querySelector('.btn_sair')

const loadData = async () => {
    try {
        tbody.innerHTML = ''

        const response = await fetch(`${url}/products`)
        const data = await response.json()

        for (let item of data) {
            const row = document.createElement('tr')

            for (const key in item) {
                const cell = document.createElement('td')

                cell.appendChild(document.createTextNode(item[key]))
                row.appendChild(cell)
                }

                const buttonEdit = document.createElement('input')
                buttonEdit.setAttribute('type', 'button')
                buttonEdit.setAttribute('value', 'Editar')
                buttonEdit.setAttribute('class', 'button blue')
                buttonEdit.addEventListener('click', () => {
                    modal.classList.remove('invisible')
                    modal.classList.add('visible')
                    fillEditForm(item.id, item.description, item.price)
                })

                const buttonEditCell = document.createElement('td')
                buttonEditCell.appendChild(buttonEdit)
                row.appendChild(buttonEditCell)

                const buttonRemove = document.createElement('input')
                buttonRemove.setAttribute('type', 'button')
                buttonRemove.setAttribute('value', 'Remover')
                buttonRemove.setAttribute('class', 'button red')
                buttonRemove.addEventListener('click', () => {
                    fetch(`${url}/products/${item.id}`, {
                        method: 'DELETE',
                        headers: { 'Content-Type': 'application/json' }
                    })
                    .then(() => loadData())
                })

                const buttonRemoveCell = document.createElement('td')
                buttonRemoveCell.appendChild(buttonRemove)
                row.appendChild(buttonRemoveCell)

                tbody.append(row)
            }
            
    } catch (error) {
        console.log(error)
    }
}