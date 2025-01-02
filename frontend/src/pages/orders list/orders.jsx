import { useState, useEffect } from "react";
import Header from "../../components/header/Header";
import OrderCard from "../../components/order card/OrderCard";
import "./orders.css";

function OrdersList() {
  const [orders, setOrders] = useState([]);

  const id = sessionStorage.getItem("id");
  const role = sessionStorage.getItem("role");

  useEffect(() => {
    // fetch(`http://localhost:8080/orders/${id}`, {
    fetch(`http://localhost:8080/orders/${id}`, {
      method: "GET",
      headers: {
        "Content-Type": "application/json",
        Authorization: `Bearer ${sessionStorage.getItem("token")}`
      },
    })
      .then((response) => response.json())
      .then((data) => {
        console.log(data);
        setOrders(data);
      })
      .catch((error) => {
        console.error(error);
        throw error;
      });
  }, []);

  return (
    <div className="orders-list">
      <Header isVendor={role==='[vendor]'} isAdmin={role==='[admin]'} />
      <div className="cards-list">
        {orders.map((order) => (
          <OrderCard order={order} key={order.id} />
        ))}
      </div>
    </div>
  );
}

export default OrdersList;
