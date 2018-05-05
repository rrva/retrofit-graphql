package io.github.wax911.retgraph.api.retro.request;

import io.github.wax911.library.annotation.GraphQuery;
import io.github.wax911.library.model.body.GraphContainer;
import io.github.wax911.library.model.request.QueryContainerBuilder;
import io.github.wax911.retgraph.model.container.EntryFeed;
import io.github.wax911.retgraph.model.container.TrendingFeed;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;


public interface IndexModel {

    @POST("graphql")
    @GraphQuery("Trending")
    @Headers("Content-Type: application/json")
    Call<GraphContainer<TrendingFeed>> getTrending(@Body QueryContainerBuilder request);

    @POST("graphql")
    @GraphQuery("RepoEntries")
    @Headers("Content-Type: application/json")
    Call<GraphContainer<EntryFeed>> getRepoEntries(@Body QueryContainerBuilder request);
}
