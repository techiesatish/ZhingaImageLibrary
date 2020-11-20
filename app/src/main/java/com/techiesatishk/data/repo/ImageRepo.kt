package khalid.com.newssearcherv4.repositories

import com.techiesatishk.data.model.ApiImage
import com.techiesatishk.data.network.ApiHelperService
import com.techiesatishk.data.repo.BaseRepository


class ImageRepo(private val apiInterface: ApiHelperService) : BaseRepository() {

    suspend fun getImageList() : List<ApiImage.Data.Children>? {
        return safeApiCall(
            call = {apiInterface.getImages().await()},
            error = "Error fetching images"
        )?.data?.children
    }
}