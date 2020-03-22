const proxy = 'https://cors-anywhere.herokuapp.com/'
const api = `${proxy}https://is.gd/create.php`

const getShortUrl = async () => {
	
    const span = document.querySelector('#shortUrl')
    span.innerHTML = 'carregando...'
    
  
    const inputUrl = document.querySelector('#url')
    const shortUrlHidden = document.querySelector('#shorturl_hidden')
    
    const { data: shortUrl } = await axios.get(`${api}?format=simple&url=${inputUrl.value}`)
    
    span.innerHTML = shortUrl
    shorturl_hidden.value = shortUrl
    return shortUrl

}

document.querySelector("#btnSubmit").addEventListener('click', (e)=> document.querySelector("#formUrl").submit())