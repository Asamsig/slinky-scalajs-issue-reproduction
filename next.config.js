module.exports = {
    webpack: (config, { buildId, dev, isServer, defaultLoaders, webpack }) => {
        /* adds client-side webpack optimization rules for splitting chunks during build-time */
        if (!isServer) {
            config.optimization.splitChunks.cacheGroups = {
                ...config.optimization.splitChunks.cacheGroups,
                slinky: {
                    test: /[\\/]target[\\/]scalajs[\\/](slinky.*)/,
                    name: "slinky",
                    priority: 50,
                    chunks: 'all',
                    enforce: true,
                    reuseExistingChunk: true,
                },
                scala: {
                    test: /[\\/]target[\\/]scalajs[\\/](scala.*)/,
                    name: "scala",
                    priority: 50,
                    chunks: 'all',
                    enforce: true,
                    reuseExistingChunk: true,
                },
                java: {
                    test: /[\\/]target[\\/]scalajs[\\/](java.*)/,
                    name: "java",
                    priority: 50,
                    chunks: 'all',
                    enforce: true,
                    reuseExistingChunk: true,
                },
            };
        }
        // Important: return the modified config
        return config
    },
}