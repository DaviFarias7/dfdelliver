import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import Home from "./Home";
import Navbar from "./Navbar";
import Orders from "./Orders";

function AppRoutes() {
    return (
        <Router>
            <Navbar />
            <Routes>
                <Route path="/orders" element={<Orders />} />
                <Route path="/" element={<Home />} />
            </Routes>
        </Router>
    )
}

export default AppRoutes;


