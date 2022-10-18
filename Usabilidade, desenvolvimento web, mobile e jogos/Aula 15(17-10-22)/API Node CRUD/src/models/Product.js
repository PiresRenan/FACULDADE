import { DataTypes } from 'sequelize'

import sequelize from '../database/config.js'

const Product = sequelize.define('products', {
    id: {
        type: DataTypes.INTEGER,
        autoIncrement: true,
        primaryKey: true
    },

    name: {
        type: DataTypes.STRING,
        allowNull: false
    },

    description: {
        type: DataTypes.STRING,
        allowNull: false
    },

    price: {
        type: DataTypes.DECIMAL,
        allowNull: false
    }
}, { timestamps: false})

export default Product