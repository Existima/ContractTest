package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return hat by id=2"

    request {
        url "/hat/2"
        method GET()
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body (
                id: 2,
                name: "Test Hat 2",
                color: "blue",
                price: 12
        )
    }

}