import bcrypt from 'bcrypt'

class Utils {
    static async createHash(data) {
        return await bcrypt.hash(data, 8)
    }

    static async compareHash(data, hash){
        return await bcrypt.compare(data, hash)
    }
}

export default Utils
