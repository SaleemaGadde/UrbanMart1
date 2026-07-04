


function addToCart(name, price, image) {
	    let cart = JSON.parse(localStorage.getItem("cart")) || [];

	    cart.push({
	        name: name,
	        price: price,
	        image: image,
	        quantity: 1
	    });

	    localStorage.setItem("cart", JSON.stringify(cart));

	    alert(name + " added to cart!");
	}
	
	
	item.quantity++;
	item.total = item.price * item.quantity;
	
	
	cartContainer.innerHTML += `
	<tr>
	    <td><img src="${item.image}" class="product-img"></td>
	    <td>${item.name}</td>
	    <td>₹${item.price}</td>
	    <td>${item.quantity}</td>
	    <td>₹${item.price * item.quantity}</td>
	    <td><button class="btn btn-danger btn-sm">X</button></td>
	</tr>
	`;