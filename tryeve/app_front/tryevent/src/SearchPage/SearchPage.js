import "./SearchPage.css"
import "./SubmitButton.css"

const SearchPage = () => {
  return (
    <section>
      <h1 ><span id="title">Try</span>Event</h1>
      <form method="post">
        <select id="area">
          <div className="DropMenu" name="selectedArea"></div>
          <option disabled>Selected Area ?</option>
          <option value="京都市北区">京都市北区</option>
          <option value="京都市左京区">京都市左京区</option>
          <option value="京都市右京区">京都市右京区</option>
          <option value="京都市上京区">京都市上京区</option>
          <option value="京都市中京区">京都市中京区</option>
          <option value="京都市下京区">京都市下京区</option>
          <option value="京都市南区">京都市南区</option>
          <option value="京都市伏見区">京都市伏見区</option>
          <option value="京都市西京区">京都市西京区</option>
          <option value="京都市東山区">京都市東山区</option>
          <option value="京都市山科区">京都市山科区</option>
          <option value="京都市南区">京都市南区</option>
          <option value="宇治市">宇治市</option>
          <option value="長岡京市">長岡京市</option>
          <option value="八幡市">八幡市</option>
        </select>
        <div class="wrap">
            <button class="btn-submit" >
                <span class="btn-text">検索</span>
                <span class="btn-icon">
                    <i class="fa fa-check fa-2x"></i>
                </span>
            </button>
            <div class="loader" id="loader"></div>
        </div>
      </form>

    </section>
    //        {/* <div className="Category">
    //          <label><i className="Category"></i>カテゴリー</label>
    //          <select className="ui dropdown" name="dropdown">
    //            <option value="祭り">祭り</option>
    //            <option value="フリマ">フリマ</option>
    //            <option value="展示">展示</option>
    //            <option value="食">食</option>
    //            <option value="音楽">音楽</option>
    //          </select>
    //        </div> */}
    //        <div className="Search__Button">
    //          <button type="submit" className="Search__Button__Design">
    //            <i className="search icon"></i>検索
    //          </button>
    //        </div>
    //      </form>
    //    </div>
    //  </div>

  );

}


export default SearchPage;
