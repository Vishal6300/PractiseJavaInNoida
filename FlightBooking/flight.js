function adminLogin() {
  const adminUsername = document.getElementById("admin-username").value;
  const adminPassword = document.getElementById("admin-password").value;

  if (adminUsername === "admin" && adminPassword === "admin") {
    window.location.href = "admin.html";
  } else {
    alert("Invalid admin login credentials");
  }
}

function customerLogin() {
  const customerUsername = document.getElementById("customer-username").value;
  const customerPassword = document.getElementById("customer-password").value;

  // check login validation part
  if (customerUsername === "vishal" && customerPassword === "vishal@1234") {
    window.location.href = "user.html";
  } else {
    alert("Invalid customer login credentials");
  }
}

function addFlight() {}

function viewBookings() {}

function viewUsers() {}

function bookFlight() {}

function openBookingPage() {
  document.getElementById("booking-page").style.display = "block";
}

function submitBooking() {
  const passenger1Name = document.getElementById("passenger1Name").value;
  const passenger1Class = document.getElementById("passenger1Class").value;
  const passenger2Name = document.getElementById("passenger2Name").value;
  const passenger2Class = document.getElementById("passenger2Class").value;
  const flightDate = document.getElementById("flightDate").value;

  const booking = {
    passenger1: { name: passenger1Name, class: passenger1Class },
    passenger2: { name: passenger2Name, class: passenger2Class },
    date: flightDate,
  };

  // Store booking in local storage
  const bookings = JSON.parse(localStorage.getItem("bookings")) || [];
  bookings.push(booking);
  localStorage.setItem("bookings", JSON.stringify(bookings));

  alert("Booking successful!");

  document.getElementById("passenger1Name").value = "";
  document.getElementById("passenger2Name").value = "";
  document.getElementById("flightDate").value = "";

  document.getElementById("booking-page").style.display = "none";
}

function viewBookings() {
  const bookings = JSON.parse(localStorage.getItem("bookings")) || [];

  let bookingsList = "<h2>Your Bookings</h2>";
  if (bookings.length === 0) {
    bookingsList += "<p>No bookings yet.</p>";
  } else {
    bookingsList += "<ul>";
    bookings.forEach((booking) => {
      bookingsList += `<li>Passenger 1: ${booking.passenger1.name}, Class: ${booking.passenger1.class}</li>`;
      bookingsList += `<li>Passenger 2: ${booking.passenger2.name}, Class: ${booking.passenger2.class}</li>`;
      bookingsList += `<li>Date: ${booking.date}</li>`;
    });
    bookingsList += "</ul>";
  }

  document.querySelector(".customer-container").innerHTML = bookingsList;
}
