import { DataTypes } from 'sequelize'

import sequelize from '../database/config.js'

const User = sequelize.define('users', {
    id: {
        type: DataTypes.INTEGER,
        autoIncrement: true,
        primaryKey: true
    },

    name: {
        type: DataTypes.STRING,
        allowNull: false
    },

    email: {
        type: DataTypes.STRING,
        allowNull: false
    },

    password: {
        type: DataTypes.DECIMAL,
        allowNull: false
    }
}, { timestamps: false})

export default User
