SELECT order.OrderID, SUM (order.Quantity * order.OrderPrice) 
    AS TotalPrice FROM Customer custo 
        INNER JOIN Orders order ON order.CustomerId = custo.CustomerId 
            AND custo.CustomerName = 'DeathStar'
                GROUP BY order.OrderID;