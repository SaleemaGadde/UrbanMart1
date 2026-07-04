// Search functionality
function searchProducts() {
    let input = document.getElementById("search").value.toLowerCase();
    let cards = document.getElementsByClassName("product-card");

    for (let i = 0; i < cards.length; i++) {
        let title = cards[i].getElementsByTagName("h5")[0].innerText.toLowerCase();

        if (title.includes(input)) {
            cards[i].style.display = "block";
        } else {
            cards[i].style.display = "none";
        }
    }
}

// Add to Cart button
function addToCart(productName) {
    alert(productName + " added to cart!");
}