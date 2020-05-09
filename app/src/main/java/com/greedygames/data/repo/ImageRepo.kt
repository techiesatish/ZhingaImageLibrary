package khalid.com.newssearcherv4.repositories

import com.greedygames.data.model.ApiImage
import com.greedygames.data.network.ApiHelperService


class ImageRepo(private val apiInterface: ApiHelperService) : BaseRepository() {

    suspend fun getImageList() : List<ApiImage.Data.Children>? {
        return safeApiCall(
            call = {apiInterface.getImages().await()},
            error = "Error fetching images"
        )?.data?.children
    }
}