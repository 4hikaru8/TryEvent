import "./SubmitButton.css"

const SubmitButton = () => {
       
         return <section>    <form method="post" >
        <div class="wrap">
            <button class="btn-submit" >
                <span class="btn-text">検索</span>
                <span class="btn-icon">
                    <i class="fa fa-check fa-2x"></i>
                </span>
            </button>
            <div class="loader" id="loader"></div>
        </div>
    </form></section>
    }

   



export default SubmitButton;
