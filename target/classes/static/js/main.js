const proxy = 'https://cors-anywhere.herokuapp.com/'
const api = `${proxy}https://is.gd/create.php`

const getShortUrl = async () => {

    const span = document.querySelector('#shortUrl')
    span.innerHTML = 'carregando...'


    const inputUrl = document.querySelector('#url')
    const shortUrlHidden = document.querySelector('#shorturl_hidden')

    const { data: shortUrl } = await axios.get(`${api}?format=simple&url=${inputUrl.value}`)

    span.innerHTML = shortUrl
    shortUrlHidden.value = shortUrl
    
    if (shortUrlHidden.value.length <= 0) {
        alert('Gere a URL')
        return false
    }

}

document.querySelector("#btnSubmit").addEventListener('click', (e) => {

    const inputUrl = document.querySelector('#url')

    if (inputUrl.value.length <= 0) {
        alert('Preencha o campo com a URL')
        return false
    }

    document.querySelector("#formUrl").submit()

})