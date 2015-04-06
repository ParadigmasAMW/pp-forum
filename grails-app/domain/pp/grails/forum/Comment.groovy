package pp.grails.forum

import pp.grails.forum.DiscussionThread

class Comment {

    static belongsTo = DiscussionThread
    DiscussionThread thread
    SecUser commentBy
    String body
    Date createDate = new Date()

    static constraints = {
        body( maxSize: 8000)
    }
}
