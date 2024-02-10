package org.example.codes;

public class Mix2 {
}
/*
@Controller
public class WidgetController {

    @Autowired
    private WidgetRepository widgetRepository;

    @GetMapping("/widget/new")
    public String newWidget(Model model) {
        model.addAttribute("widget", new Widget());
        return "widgetform";
    }

    @PostMapping("/widget")
    public String createWidget(Widget widget, Model model) {
        widgetRepository.save(widget);
        return "redirect:/widget/" + widget.getId();
    }

    @GetMapping("/widget/{id}")
    public String getWidgetById(@PathVariable Long id, Model model) {
        model.addAttribute("widget", widgetRepository.findById(id).orElse(new Widget()));
        return "widget";
    }

    @GetMapping("/widgets")
    public String getWidgets(Model model) {
        model.addAttribute("widgets", widgetRepository.findAll());
        return "widgets";
    }

    @GetMapping("/widget/edit/{id}")
    public String editWidget(@PathVariable Long id, Model model) {
        model.addAttribute("widget", widgetRepository.findById(id).orElse(new Widget()));
        return "widgetform";
    }

    @PostMapping("/widget/{id}")
    public String updateWidget(Widget widget) {
        widgetRepository.save(widget);
        return "redirect:/widget/" + widget.getId();
    }

    @GetMapping("/widget/delete/{id}")
    public String deleteWidget(@PathVariable  Long id) {
        widgetRepository.deleteById(id);
        return "redirect:/widgets";
    }
}


package com.example.demo.controller;

        import com.example.demo.model.Widget;
        import com.example.demo.repository.WidgetRepository;
        import org.apache.logging.log4j.LogManager;
        import org.apache.logging.log4j.Logger;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.http.HttpStatus;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.*;

        import java.net.URI;
        import java.net.URISyntaxException;
        import java.util.Optional;

@RestController
public class WidgetRestController {
    private static final Logger logger = LogManager.getLogger(WidgetRestController.class);
    @Autowired
    private WidgetRepository widgetRepository;

    @GetMapping("/rest/widget/{id}")
    public ResponseEntity<Widget> getWidget(@PathVariable Long id) {
        return widgetRepository.findById(id)
                .map(widget -> ResponseEntity.ok().body(widget))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/rest/widgets")
    //public ResponseEntity<Iterable<Widget>> getWidgets() {
    public Iterable<Widget> getWidgets() {
        return widgetRepository.findAll();
    }

    @PostMapping("/rest/widget")
    public ResponseEntity<Widget> createWidget(@RequestBody Widget widget) {
        logger.info("Received widget: name: " + widget.getName() + ", description: " + widget.getDescription());
        Widget newWidget = widgetRepository.save(widget);
        try {
            return ResponseEntity.created(new URI("/rest/widget/" + newWidget.getId())).body(newWidget);
        } catch (URISyntaxException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/rest/widget/{id}")
    public ResponseEntity<Widget> updateWidget(@RequestBody Widget widget, @PathVariable Long id) {
        widget.setId(id);
        return ResponseEntity.ok().body(widgetRepository.save(widget));
    }

    @PutMapping("/rest/proper/widget/{id}")
    public ResponseEntity<Widget> updateWidgetProper(@RequestBody Widget widget, @PathVariable Long id, @RequestHeader("If-Match") Long ifMatch) {
        Optional<Widget> existingWidget = widgetRepository.findById(id);
        if (existingWidget.isPresent()) {
            if (ifMatch == 7) {
                widget.setId(id);
                return ResponseEntity.ok().body(widgetRepository.save(widget));
            } else {
                return ResponseEntity.status(HttpStatus.CONFLICT).build();
            }
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/rest/widget/{id}")
    public ResponseEntity deleteWidget(@PathVariable Long id) {
        widgetRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}

@Configuration
public class SpringDBConfig {

    @Autowired
    DataSource dataSource;

    @Bean
    public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
        return new NamedParameterJdbcTemplate(dataSource);
    }

    @Bean
    public DataSource getDataSource() {
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        EmbeddedDatabase db = builder.setName("testdb")
                .setType(EmbeddedDatabaseType.HSQL)
                .addScript("db/sql/create-db.sql")
                .addScript("db/sql/insert-data.sql").build();
        return db;
    }

}


    // show update form
    @RequestMapping(value = "/users/{id}/update", method = RequestMethod.GET)
    public String showUpdateUserForm(@PathVariable("id") int id, Model model) {

        logger.debug("showUpdateUserForm() : {}", id);

        User user = userService.findById(id);
        model.addAttribute("userForm", user);

        populateDefaultModel(model);

        return "users/userform";

    }


    private void populateDefaultModel(Model model) {

        List<String> frameworksList = new ArrayList<String>();
        frameworksList.add("Spring MVC");
        frameworksList.add("Struts 2");
        frameworksList.add("JSF 2");
        frameworksList.add("GWT");
        frameworksList.add("Play");
        frameworksList.add("Apache Wicket");
        model.addAttribute("frameworkList", frameworksList);

        Map<String, String> skill = new LinkedHashMap<String, String>();
        skill.put("Hibernate", "Hibernate");
        skill.put("Spring", "Spring");
        skill.put("Struts", "Struts");
        skill.put("Groovy", "Groovy");
        skill.put("Grails", "Grails");
        model.addAttribute("javaSkillList", skill);

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        model.addAttribute("numberList", numbers);

        Map<String, String> country = new LinkedHashMap<String, String>();
        country.put("US", "United Stated");
        country.put("CN", "China");
        country.put("SG", "Singapore");
        country.put("MY", "Malaysia");
        model.addAttribute("countryList", country);

    }


    // delete user
    @RequestMapping(value = "/users/{id}/delete", method = RequestMethod.POST)
    public String deleteUser(@PathVariable("id") int id,
                             final RedirectAttributes redirectAttributes) {

        logger.debug("deleteUser() : {}", id);

        userService.delete(id);

        redirectAttributes.addFlashAttribute("css", "success");
        redirectAttributes.addFlashAttribute("msg", "User is deleted!");

        return "redirect:/users";

    }

    // show user
    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public String showUser(@PathVariable("id") int id, Model model) {

        logger.debug("showUser() id: {}", id);

        User user = userService.findById(id);
        if (user == null) {
            model.addAttribute("css", "danger");
            model.addAttribute("msg", "User not found");
        }
        model.addAttribute("user", user);

        return "users/show";

    }



@Repository
public class UserDaoImpl implements UserDao {

    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    public void setNamedParameterJdbcTemplate(
            NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public User findById(Integer id) {

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", id);

        String sql = "SELECT * FROM users WHERE id=:id";

        User result = null;
        try {
            result = namedParameterJdbcTemplate
                    .queryForObject(sql, params, new UserMapper());
        } catch (EmptyResultDataAccessException e) {
            // do nothing, return null
        }

        return result;

    }

    @Override
    public List<User> findAll() {

        String sql = "SELECT * FROM users";
        List<User> result = namedParameterJdbcTemplate.query(sql, new UserMapper());
        return result;

    }

    @Override
    public void save(User user) {

        KeyHolder keyHolder = new GeneratedKeyHolder();

        String sql = "INSERT INTO USERS(NAME, EMAIL, ADDRESS, PASSWORD, NEWSLETTER, FRAMEWORK, SEX, NUMBER, COUNTRY, SKILL) "
                + "VALUES ( :name, :email, :address, :password, :newsletter, :framework, :sex, :number, :country, :skill)";

        namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(user), keyHolder);
        user.setId(keyHolder.getKey().intValue());

    }

    @Override
    public void update(User user) {

        String sql = "UPDATE USERS SET NAME=:name, EMAIL=:email, ADDRESS=:address, "
                + "PASSWORD=:password, NEWSLETTER=:newsletter, FRAMEWORK=:framework, "
                + "SEX=:sex, NUMBER=:number, COUNTRY=:country, SKILL=:skill WHERE id=:id";

        namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(user));

    }

    @Override
    public void delete(Integer id) {

        String sql = "DELETE FROM USERS WHERE id= :id";
        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource("id", id));

    }

    private SqlParameterSource getSqlParameterByModel(User user) {

        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("id", user.getId());
        paramSource.addValue("name", user.getName());
        paramSource.addValue("email", user.getEmail());
        paramSource.addValue("address", user.getAddress());
        paramSource.addValue("password", user.getPassword());
        paramSource.addValue("newsletter", user.isNewsletter());

        // join String
        paramSource.addValue("framework", convertListToDelimitedString(user.getFramework()));
        paramSource.addValue("sex", user.getSex());
        paramSource.addValue("number", user.getNumber());
        paramSource.addValue("country", user.getCountry());
        paramSource.addValue("skill", convertListToDelimitedString(user.getSkill()));

        return paramSource;
    }

    private static final class UserMapper implements RowMapper<User> {

        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setEmail(rs.getString("email"));
            user.setFramework(convertDelimitedStringToList(rs.getString("framework")));
            user.setAddress(rs.getString("address"));
            user.setCountry(rs.getString("country"));
            user.setNewsletter(rs.getBoolean("newsletter"));
            user.setNumber(rs.getInt("number"));
            user.setPassword(rs.getString("password"));
            user.setSex(rs.getString("sex"));
            user.setSkill(convertDelimitedStringToList(rs.getString("skill")));
            return user;
        }
    }

    private static List<String> convertDelimitedStringToList(String delimitedString) {

        List<String> result = new ArrayList<String>();

        if (!StringUtils.isEmpty(delimitedString)) {
            result = Arrays.asList(StringUtils.delimitedListToStringArray(delimitedString, ","));
        }
        return result;

    }

    private String convertListToDelimitedString(List<String> list) {

        String result = "";
        if (list != null) {
            result = StringUtils.arrayToCommaDelimitedString(list.toArray());
        }
        return result;

    }

}


@Service("userService")
public class UserServiceImpl implements UserService {

    UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void saveOrUpdate(User user) {

        if (findById(user.getId())==null) {
            userDao.save(user);
        } else {
            userDao.update(user);
        }

    }

    @Override
    public void delete(int id) {
        userDao.delete(id);
    }

}


@Service
public class ProductServiceImpl implements ProductService {
    private static Map<String, Product> productRepo = new HashMap<>();
    static {
        Product honey = new Product();
        honey.setId("1");
        honey.setName("product1");
        productRepo.put(honey.getId(), honey);

        Product almond = new Product();
        almond.setId("2");
        almond.setName("product2");
        productRepo.put(almond.getId(), almond);
    }
    @Override
    public void createProduct(Product product) {
        productRepo.put(product.getId(), product);
    }
    @Override
    public void updateProduct(String id, Product product) {
        productRepo.remove(id);
        product.setId(id);
        productRepo.put(id, product);
    }
    @Override
    public void deleteProduct(String id) {
        productRepo.remove(id);

    }


    @RestController
    public class ProductServiceController {
        @Autowired
        ProductService productService;

        @RequestMapping(value = "/products")
        public ResponseEntity<Object> getProduct() {
            return new ResponseEntity<>(productService.getProducts(), HttpStatus.OK);
        }
        @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
        public ResponseEntity<Object>
        updateProduct(@PathVariable("id") String id, @RequestBody Product product) {

            productService.updateProduct(id, product);
            return new ResponseEntity<>("Product is updated successsfully", HttpStatus.OK);
        }
        @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
        public ResponseEntity<Object> delete(@PathVariable("id") String id) {
            productService.deleteProduct(id);
            return new ResponseEntity<>("Product is deleted successsfully", HttpStatus.OK);
        }
        @RequestMapping(value = "/products", method = RequestMethod.POST)
        public ResponseEntity<Object> createProduct(@RequestBody Product product) {
            productService.createProduct(product);
            return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
        }
    }


    @RestController
    public class ProductServiceController {
        private static Map<String, Product> productRepo = new HashMap<>();
        static {
            Product honey = new Product();
            honey.setId("1");
            honey.setName("Honey");
            productRepo.put(honey.getId(), honey);

            Product almond = new Product();
            almond.setId("2");
            almond.setName("Almond");
            productRepo.put(almond.getId(), almond);
        }

        @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
        public ResponseEntity<Object> delete(@PathVariable("id") String id) {
            productRepo.remove(id);
            return new ResponseEntity<>("Product is deleted successsfully", HttpStatus.OK);
        }

        @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
        public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Product product) {
            productRepo.remove(id);
            product.setId(id);
            productRepo.put(id, product);
            return new ResponseEntity<>("Product is updated successsfully", HttpStatus.OK);
        }

        @RequestMapping(value = "/products", method = RequestMethod.POST)
        public ResponseEntity<Object> createProduct(@RequestBody Product product) {
            productRepo.put(product.getId(), product);
            return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
        }

        @RequestMapping(value = "/products")
        public ResponseEntity<Object> getProduct() {
            return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
        }
    }

    @RestController
    public class ConsumeWebService {
        //@Autowired
        RestTemplate restTemplate;

        @RequestMapping(value = "/template/products")
        public String getProductList() {
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            HttpEntity<String> entity = new HttpEntity<String>(headers);

            return restTemplate.exchange(
                    "http://localhost:8080/products", HttpMethod.GET, entity, String.class).getBody();
        }
        @RequestMapping(value = "/template/products", method = RequestMethod.POST)
        public String createProducts(@RequestBody Product product) {
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            HttpEntity<Product> entity = new HttpEntity<Product>(product,headers);

            return restTemplate.exchange(
                    "http://localhost:8080/products", HttpMethod.POST, entity, String.class).getBody();
        }
        @RequestMapping(value = "/template/products/{id}", method = RequestMethod.PUT)
        public String updateProduct(@PathVariable("id") String id, @RequestBody Product product) {
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            HttpEntity<Product> entity = new HttpEntity<Product>(product,headers);

            return restTemplate.exchange(
                    "http://localhost:8080/products/"+id, HttpMethod.PUT, entity, String.class).getBody();
        }
        @RequestMapping(value = "/template/products/{id}", method = RequestMethod.DELETE)
        public String deleteProduct(@PathVariable("id") String id) {
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            HttpEntity<Product> entity = new HttpEntity<Product>(headers);

            return restTemplate.exchange(
                    "http://localhost:8080/products/"+id, HttpMethod.DELETE, entity, String.class).getBody();
        }
    }

    HIBERNATE
package com.example.person.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.example.person.model.PersonInformation;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

    @Repository
    public class PersonInformationDaoImpl implements PersonInformationDao {

        @Autowired
        private EntityManager entityManager;

        private Session getSession() {
            return entityManager.unwrap(Session.class);
        }
        @Override
        public void save(PersonInformation person) {
            getSession().save(person);
        }
        @SuppressWarnings("unchecked")
        @Override
        public List<PersonInformation> getPersonInformationList() {
            return getSession().createCriteria(PersonInformation.class).list();
        }

        @Override
        public PersonInformation getPerson(Integer id) {
            PersonInformation PersonInformation = (PersonInformation)getSession().get(PersonInformation.class, id);
            return PersonInformation;
        }
        @Override
        public void updatePerson(PersonInformation person) {
            getSession().update(person);

        }
        @Override
        public void deletePerson(PersonInformation person) {
            getSession().delete(person);
        }



    }

    @Repository
    public class OwnerRepositoryImpl implements OwnerRepository{

        private Map<Long, Owner> ownerMap = new HashMap<>();

        public OwnerRepositoryImpl() {
            Owner owner1 = new Owner();
            owner1.setId(1L);
            owner1.setName("ohoho");
            owner1.setSurname("zohoho");
            Owner owner2 = new Owner();
            owner2.setId(2L);
            owner2.setName("secondper");
            owner2.setSurname("secondsurname");

            ownerMap.put(owner1.getId(), owner1);
            ownerMap.put(owner2.getId(), owner2);
        }


        @Override
        public List<Owner> findAll() {
            return new ArrayList<>(ownerMap.values());
        }

        @Override
        public Owner findById(Long id) {
            return ownerMap.get(id);

        }
    }

    STUDENT

    @Service
    public class StudentService {

        private static HashMap<Integer, Student> studentHashMap = getStudentHashMap();

        public StudentService() {
            super();
            if (studentHashMap == null) {

                studentHashMap = new HashMap<Integer, Student>();

                Student student1 = new Student(1, "Burak", "Kutbay", "Fen");
                Student student2 = new Student(2, "Ali", "Doğru", "Edebiyat");
                Student student3 = new Student(3, "Veli", "Yanlış", "Biyoloji");
                Student student4 = new Student(4, "Ahmet", "Mehmet", "Matematik");

                studentHashMap.put(1, student1);
                studentHashMap.put(2, student2);
                studentHashMap.put(3, student3);
                studentHashMap.put(4, student4);
            }
        }

        public static int getMaximumId() {
            int max = 0;
            for (int id : studentHashMap.keySet()) {
                if (max <= id) {
                    max = id;
                }
            }
            return max;
        }

        public static HashMap<Integer, Student> getStudentHashMap() {
            return studentHashMap;
        }

        public List<Student> getAllStudents() {
            List<Student> students = new ArrayList<Student>(studentHashMap.values());
            return students;
        }

        public Student getStudent(int id) {
            Student student = studentHashMap.get(id);
            return student;
        }

        public Student addStudent(Student student) {
            student.setId(getMaximumId() + 1);
            studentHashMap.put(student.getId(), student);
            return student;
        }

        public Student updateStudent(Student student) {
            if (student.getId() <= 0)
                return null;
            studentHashMap.put(student.getId(), student);
            return student;
        }

        public void deleteStudent(int id) {
            studentHashMap.remove(id);
        }
    }


    @RestController
    public class StudentController {

        private StudentService studentService = new StudentService();

        @RequestMapping(value = "/students", method = RequestMethod.GET, headers = "Accept=application/json")
        public List<Student> getStudent() {
            List<Student> studentList = studentService.getAllStudents();
            return studentList;
        }

        @RequestMapping(value = "/student/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
        public Student getStudentbyId(@PathVariable int id) {
            return studentService.getStudent(id);
        }

        @RequestMapping(value = "/students", method = RequestMethod.POST, headers = "Accept=application/json")
        public Student addStudent(@RequestBody Student student) {
            return studentService.addStudent(student);
        }


        @RequestMapping(value = "/students", method = RequestMethod.PUT, headers = "Accept=application/json")
        public Student updateStudent(@RequestBody Student student){
            return studentService.updateStudent(student);
        }


        @RequestMapping(value = "/student/{id}" ,method = RequestMethod.DELETE,headers = "Accept=application/json")
        public void deleteStudent(@PathVariable("id") int id){
            studentService.deleteStudent(id);
        }
    }

    @RestController
    @RequestMapping("/api")
    public class MainController {
        @GetMapping("/giveOrder")
        public String giveOrder(){
            return "Give Orders Here!";}
        @GetMapping("/seeOrder")
        public String seeOrder(){
            return "See Orders Here!";}}

package com.example.jpaoracle.model;

import javax.persistence.*;
import java.util.Date;

    @Entity
    public class Customer {

        // "customer_seq" is Oracle sequence name.
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
        @SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name = "CUST_SEQ")
        Long id;

        String name;

        String email;

        @Column(name = "CREATED_DATE")
        Date date;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }
    }

package com.example.jpaoracle.dao;

import com.example.jpaoracle.model.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

    public interface CustomerRepository extends CrudRepository<Customer, Long> {

        List<Customer> findByEmail(String email);

        List<Customer> findByDate(Date date);

        // custom query example and return a stream
        @Query("select c from Customer c where c.email = :email")
        Stream<Customer> findByEmailReturnStream(@Param("email") String email);

    }
package com.example.oracle.dao;

import com.example.oracle.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

    @Repository
    public class CustomerRepository {

        @Autowired
        private JdbcTemplate jdbcTemplate;

        // thanks Java 8, look the custom RowMapper
        public List<Customer> findAll() {

            List<Customer> result = jdbcTemplate.query(
                    "SELECT id, name, email, created_date FROM customer",
                    (rs, rowNum) -> new Customer(rs.getInt("id"),
                            rs.getString("name"), rs.getString("email"), rs.getDate("created_date"))
            );

            return result;

        }

    }

package com.example.jdbc.dao;

import com.example.jdbc.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

    @Repository
    public class CustomerRepository {

        @Autowired
        private JdbcTemplate jdbcTemplate;

        // Find all customers, thanks Java 8, you can create a custom RowMapper like this :
        public List<Customer> findAll() {

            List<Customer> result = jdbcTemplate.query(
                    "SELECT id, name, email, created_date FROM customer",
                    (rs, rowNum) -> new Customer(rs.getInt("id"),
                            rs.getString("name"), rs.getString("email"), rs.getDate("created_date"))
            );

            return result;

        }

        // Add new customer
        public void addCustomer(String name, String email) {

            jdbcTemplate.update("INSERT INTO customer(name, email, created_date) VALUES (?,?,?)",
                    name, email, new Date());

        }
    }

    public int updateDomain(String domain, boolean displayAds) {

        Query query = new Query(Criteria.where("domain").is(domain));
        Update update = new Update();
        update.set("displayAds", displayAds);

        UpdateResult result = mongoTemplate.updateFirst(query, update, Domain.class);

        if(result!=null)
            return result.get;
        else
            return 0;

    }


package com.example.db6.service;

import com.example.db6.model.Person;
import org.springframework.stereotype.Service;

import java.util.Hashtable;

    @Service
    public class PersonService {

        Hashtable<String, Person> persons = new Hashtable<String, Person>();

        //U can user constructor or u can use datasource expressions for database
        public PersonService(){
            Person p = new Person();
            p.setId("1");
            p.setAge(21);
            p.setFirstName("mstafa");
            p.setLastName("akgul");
            persons.put("1", p);

            Person p2 = new Person();
            p.setId("2");
            p.setAge(22);
            p.setFirstName("mstafa");
            p.setLastName("kara");
            persons.put("2", p2);
        }


    }



import com.example.blog.config.CustomUserDetails;
import com.example.blog.model.Post;
import com.example.blog.pojos.PostPojo;
import com.example.blog.service.PostService;
import com.example.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.security.Principal;
import java.util.Date;

    @Controller
    public class BlogController {

        @Autowired
        private PostService postService;

        @Autowired
        private UserService userService;

        @RequestMapping(value = "/posts/add")
        public ModelAndView postAddPage(){
            return new ModelAndView("addPost", "postForm", new Post());
        }

        @RequestMapping(value = "/posts", method = RequestMethod.POST)
        public String handlePostAdd(@Valid @ModelAttribute("postForm") Post post, PostPojo form, BindingResult bindingResult, Principal principle) {
            CustomUserDetails userDetails = (CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//if(post.getDateCreated() == null)
// post.setDateCreated(new Date());
//post.setCreator(userService.getUser(userDetails.getUsername()));
            if (bindingResult.hasErrors())
                return "addPost";
            postService.addPost(form, userService.getUser(userDetails.getUsername()));
            return "redirect:/posts";
        }

        @RequestMapping("/posts")
        public ModelAndView getPostsPage() {
            return new ModelAndView("posts", "posts", postService.getAllPosts());
        }
*/
/**@GetMapping(value = "/posts")
public List<Post> posts(){
return postService.getAllPosts();
}*/

/**@PostMapping(value = "/posts")
public String publishPost(@RequestBody Post post){
CustomUserDetails userDetails = (CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
if(post.getDateCreated() == null)
post.setDateCreated(new Date());
post.setCreator(userService.getUser(userDetails.getUsername()));
postService.insert(post);
return "Post was published";
}*/

/**@GetMapping(value = "/posts/{username}")
public List<Post> postByUsername(@PathVariable String username){
return postService.findByUser(userService.getUser(username));
}*/

/**@RequestMapping("/posts/{username}")
public ModelAndView postByUsername(@PathVariable String username) {
return new ModelAndView("userItems" ,"items", userService.getUser(username));
}*/
    //}

/*
import com.example.blog.model.Post;
import com.example.blog.service.PostService;
import com.example.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

    @RestController
    public class BlogController {

        @Autowired
        private PostService postService;

        @Autowired
        private UserService userService;

        @GetMapping(value="/posts")
        public List<Post> posts(){
            return postService.getAllPosts();
        }

        @GetMapping(value="/the_post/{id}")
        public Post getPostById(@PathVariable Long id){
            return postService.getPost(id);
        }

        @PostMapping(value="/post")
        public String publishPost(@RequestBody Post post){
            CustomUserDetails userDetails = (CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            if(post.getDateCreated() == null)
                post.setDateCreated(new Date());
            post.setCreator(userService.getUser(userDetails.getUsername()));
            postService.insert(post);
            return "Post was published";
        }

        @GetMapping(value="/posts/{username}")
        public List<Post> postsByUser(@PathVariable String username){
            return postService.findByUser(userService.getUser(username));
        }

        @DeleteMapping(value = "/post/{id}")
        public boolean deletePost(@PathVariable Long id){
            return postService.deletePost(id);
        }

        @DeleteMapping(value = "/comment/{id}")
        public boolean deleteComment(@PathVariable Long id){
            return commentService.deletePost(id);
        }


        @GetMapping(value = "/comments/{postId}")
        public List<Comment> getComments(@PathVariable Long postId){
            return commentService.getComments(postId);
        }
*/
/**@PostMapping(value = "/post/postComment")
public boolean postComment(@RequestBody CommentPojo comment){
Post post = postService.find(comment.getPostId());
CustomUserDetails userDetails = (CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
User creator = userService.getUser(userDetails.getUsername());
if(post == null || creator == null)
return false;

commentService.comment(new Comment(comment.getText(),post,creator));
return true;
}*/

   // }
/*
<!--<form th:action="@{/items}" th:object="${itemForm}" th:method="post">
<table>
<tr>
    <td>Item Name:</td>
<td><input type="text" th:field="*{itemName}" /></td>
<td th:if="${#fields.hasErrors('itemName')}" th:errors="*{itemName}">Item Name Error will appear here</td>
</tr>
<tr>
    <td>Item Type:</td>
<td><input type="text" th:field="*{itemType}" /></td>
<td th:if="${#fields.hasErrors('itemType')}" th:errors="*{itemType}">Item Type Error will appear here</td>
</tr>
<tr>
    <td>Item Length:</td>
<td><input type="text" th:field="*{itemlength}" /></td>
<td th:if="${#fields.hasErrors('itemlength')}" th:errors="*{itemlength}">Item Length Error will appear here</td>
</tr>
<tr>
    <td>Item Width:</td>
<td><input type="text" th:field="*{itemwidth}" /></td>
<td th:if="${#fields.hasErrors('itemwidth')}" th:errors="*{itemwidth}">Item Width Error will appear here</td>
</tr>
<tr>
<td>Amount:</td>
<td><input type="text" th:field="*{amount}" /></td>
<td th:if="${#fields.hasErrors('amount')}" th:errors="*{amount}">Amount Error will appear here</td>
</tr>
<tr>
<td><button type="submit">Add</button></td>
</tr>
</table>
</form>-->


<nav class="navbar navbar-inverse">
<div class="container-fluid">
<div class="navbar-header">
<a class="navbar-brand" href="#">Milatcam Sipariş Takip Sistemi</a>
</div>
<ul class="nav navbar-nav">
<li class="active"><a href="/">Anasayfa</a></li>
<li><a href="/users">Kullanıcılar</a></li>
<li><a href="/items/add">Sipariş Ver</a></li>
<li><a href="/items">Siparişler</a></li>
</ul>
<ul class="nav navbar-nav navbar-right">
<li sec:authorize="isAnonymous()"><a th:href="@{/register}"><span class="glyphicon glyphicon-user"></span> Kayıt Ol</a></li>
<li sec:authorize="isAnonymous()"><a th:href="@{/login}"><span class="glyphicon glyphicon-log-in"></span> Giriş</a></li>
<!--<li sec:authorize="isAuthenticated()"><a th:href="@{/users/} + ${user.id} + @{/items}">Siparişlerim</a></li>-->
<li th:if="${#authorization.expression('isAuthenticated()')}">
<a href="/logout" th:href="@{#}" onclick="$('#form').submit();">
<span class="glyphicon glyphicon-log-out" aria-hidden="true"></span>&nbsp;Logout
            </a>
<form style="visibility: hidden" id="form" method="post" action="#" th:action="@{/logout}"></form>
</li>
</ul>
</div>
</nav>


<form th:action="@{/items}" th:object="${itemForm}" th:method="post">
<table>
<tr>
    <td>Item Name:</td>
<td><input type="text" th:field="*{itemName}" /></td>
<td th:if="${#fields.hasErrors('itemName')}" th:errors="*{itemName}">Item Name Error will appear here</td>
</tr>
<tr>
    <td>Item Type:</td>
<td><input type="text" th:field="*{itemType}" /></td>
<td th:if="${#fields.hasErrors('itemType')}" th:errors="*{itemType}">Item Type Error will appear here</td>
</tr>
<tr>
    <td>Item Length:</td>
<td><input type="text" th:field="*{itemlength}" /></td>
<td th:if="${#fields.hasErrors('itemlength')}" th:errors="*{itemlength}">Item Length Error will appear here</td>
</tr>
<tr>
    <td>Item Width:</td>
<td><input type="text" th:field="*{itemwidth}" /></td>
<td th:if="${#fields.hasErrors('itemwidth')}" th:errors="*{itemwidth}">Item Width Error will appear here</td>
</tr>
<tr>
<td>Amount:</td>
<td><input type="text" th:field="*{amount}" /></td>
<td th:if="${#fields.hasErrors('amount')}" th:errors="*{amount}">Amount Error will appear here</td>
</tr>
<tr>
<td><button type="submit">Add</button></td>
</tr>
</table>
</form>

    th:method="post"
<!-- <a th:href="@{/add}" class="btn btn-primary">New Person</a>-->
<!--<li sec:authorize="isAuthenticated()"><form th:action="@{/logout}" method="post"><span class="glyphicon glyphicon-log-out"><input type="submit" value="Log Out"/></span></form></li>-->

    edit perso db order app milatcam

<form th:action="@{/register}" th:object="${userForm}" method="post">
<table>
<tr>
    <td>User Name:</td>
<td><input type="text" th:field="*{username}" /></td>
<td th:if="${#fields.hasErrors('username')}" th:errors="*{username}">Username Error</td>
<td th:if="${#fields.hasGlobalErrors()}" th:errors="*{global}">Global Error</td>
</tr>
<tr>
<td>Password:</td>
<td><input type="password" th:field="*{password}" /></td>
<td th:if="${#fields.hasErrors('password')}" th:errors="*{password}">Password Error</td>
<td th:if="${#fields.hasGlobalErrors()}" th:errors="*{global}">Global Error</td>
</tr>
<tr>
<td>Name:</td>
<td><input type="text" th:field="*{name}" /></td>
<td th:if="${#fields.hasErrors('name')}" th:errors="*{name}">Name Error</td>
</tr>
<tr>
    <td>Last Name:</td>
<td><input type="text" th:field="*{lastName}" /></td>
<td th:if="${#fields.hasErrors('lastName')}" th:errors="*{lastName}">Last Name Error</td>
</tr>
<tr>
<td><button type="submit">Submit</button></td>
</tr>
</table>
</form>
<div th:if="${param.error}">
    Invalid username and password.
</div>
<div th:if="${param.logout}">
    You have been logged out.
</div>

<form th:action="@{/login}" method="post">
<div><label> User Name : <input type="text" name="username"/> </label></div>
<div><label> Password: <input type="password" name="password"/> </label></div>
<input type="hidden" th:name="${_csrf.parameterName}" th:value="${_csrf.token}" />
<div><input type="submit" value="Sign In"/></div>
</form>
<!--<div sec:authorize="isAnonymous()">
<h1>Welcome!</h1>
</div>

<div sec:authorize="isAuthenticated()">
<h1 th:text="'Welcome, ' + ${user.username} + '!'"></h1>
</div>-->

<!--<div sec:authorize="isAnonymous()">
    <p>Click <a th:href="@{/login}">here</a> to login.</p>
    <p>Click <a th:href="@{/register}">here</a> to register.</p>
</div>-->
<div sec:authorize="isAuthenticated()">
<form th:action="@{/logout}" method="post">
<input type="submit" value="Log Out"/>
</form>
</div>

<!--<nav role="navigation">
<ul>
<li><a href="/">Anasayfa</a></li>
<li><a href="/users">Kullanıcılar</a></li>
<li><a href="/items/add">Sipariş Ver</a></li>
<li><a href="/items">Sipariş Gör</a></li>
</ul>
</nav>-->
<!--<tr>
<th></th>
    <th>Sipariş Kodu</th>
    <th>Sipariş İsmi</th>
    <th>Sipariş Tipi</th>
    <th>Ürün Uzunluğu</th>
    <th>Ürün Genişliği</th>
    <th>Belongs to</th>
</tr>-->
<nav role="navigation">
<ul>
<li><a href="/">Anasayfa</a></li>
<li><a href="/users">Kullanıcılar</a></li>
<li><a href="/items/add">Sipariş Ver</a></li>
<li><a href="/items">Sipariş Gör</a></li>
<li sec:authorize="isAuthenticated()">
<a th:href="@{/users/} + ${user.id} + @{/items}">My Items</a>
</li>
</ul>
</nav>

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<link href="../../../resources/css/bootstrap.min.css" rel="stylesheet" media="screen" th:href="@{/resources/css/bootstrap.min.css}"/>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top" th:fragment="header">
<div class="container">
<div class="navbar-header">
<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".nav-collapse">
<span class="icon-bar"></span>
<span class="icon-bar"></span>
<span class="icon-bar"></span>
</button>
<a class="navbar-brand" href="#">My project</a>
</div>
<div class="navbar-collapse collapse">
<ul class="nav navbar-nav">
<li th:classappend="${module == 'home' ? 'active' : ''}">
<a href="#" th:href="@{/}">Home</a>
</li>
<li th:classappend="${module == 'tasks' ? 'active' : ''}">
<a href="#" th:href="@{/task}">Tasks</a>
</li>
<li th:classappend="${module == 'tasks-ld' ? 'active' : ''}">
<a href="#" th:href="@{/task-ld}">Tasks (Layout Dialect)</a>
</li>
</ul>
<ul class="nav navbar-nav navbar-right">
<li th:if="${#authorization.expression('!isAuthenticated()')}">
<a href="/signin" th:href="@{/signin}">
<span class="glyphicon glyphicon-log-in" aria-hidden="true"></span>&nbsp;Sign in
</a>
</li>
<li th:if="${#authorization.expression('isAuthenticated()')}">
<a href="/logout" th:href="@{#}" onclick="$('#form').submit();">
<span class="glyphicon glyphicon-log-out" aria-hidden="true"></span>&nbsp;Logout
            </a>
<form style="visibility: hidden" id="form" method="post" action="#" th:action="@{/logout}"></form>
</li>
</ul>
</div>
<!--/.nav-collapse -->
</div>
</nav>
</body>
</html>

    @PostMapping("/postCurrency")
    public String postExchange(@RequestParam Double fNumber , Model model){
        Double number = exchangeLogic.exchange(fNumber);
        model.addAttribute("resultNumber",number);
        return "exchange";//your html page






        @RequestMapping("/viewAllEmployees")
        public ModelAndView viewAllItems() {
            List<Employee> allEmployees = employeeService.getAllEmployees();
            return new ModelAndView("/displayAllEmployees.jsp", "allEmployees",
                    allEmployees);
        }

        @RequestMapping("/addNewEmployee")
        public ModelAndView addEmployee(@RequestParam("empId") String empId,
                @RequestParam("name") String name,
                @RequestParam("designation") String designation,
                @RequestParam("salary") String salary) {
            double salaryDouble = new Double(salary);
            Employee employee = new Employee(empId, name, designation, salaryDouble);
            employeeService.addNewEmployee(employee);
            return new ModelAndView("/employee-added.jsp", "name", name);
        }

        @RequestMapping(value = "/addNewEmployee", method = RequestMethod.GET)
        public ModelAndView show() {
            return new ModelAndView("/addEmployee.jsp", "emp", new Employee());
        }

        @RequestMapping(value = "/addNewEmployee", method = RequestMethod.POST)
        public ModelAndView processRequest(Employee emp, Errors result) {
            if (result.hasErrors()) {
                return new ModelAndView("/addEmployee.jsp", "emp", emp);
            }
            employeeService.addNewEmployee(emp);
            return new ModelAndView("/employee-added.jsp", "name", emp.getName());
        }

        @GetMapping("/books/{id}")
        Book findOne(@PathVariable Long id) {
            return repository.findById(id)
                    .orElseThrow(() -> new BookNotFoundException(id));
        }

        @RequestMapping(value = "/employee/{empNo}", //
                method = RequestMethod.GET, //
                produces = { MediaType.APPLICATION_JSON_VALUE, //
                        MediaType.APPLICATION_XML_VALUE })
        @ResponseBody
        public Employee getEmployee(@PathVariable("empNo") String empNo) {
            return employeeDAO.getEmployee(empNo);
        }

        // URL:
        // http://localhost:8080/SomeContextPath/employee
        // http://localhost:8080/SomeContextPath/employee.xml
        // http://localhost:8080/SomeContextPath/employee.json

        @RequestMapping(value = "/employee", //
                method = RequestMethod.POST, //
                produces = { MediaType.APPLICATION_JSON_VALUE, //
                        MediaType.APPLICATION_XML_VALUE })
        @ResponseBody
        public Employee addEmployee(@RequestBody Employee emp) {

            System.out.println("(Service Side) Creating employee: " + emp.getEmpNo());

            return employeeDAO.addEmployee(emp);
        }

        // URL:
        // http://localhost:8080/SomeContextPath/employee
        // http://localhost:8080/SomeContextPath/employee.xml
        // http://localhost:8080/SomeContextPath/employee.json
        @RequestMapping(value = "/employee", //
                method = RequestMethod.PUT, //
                produces = { MediaType.APPLICATION_JSON_VALUE, //
                        MediaType.APPLICATION_XML_VALUE })
        @ResponseBody
        public Employee updateEmployee(@RequestBody Employee emp) {

            System.out.println("(Service Side) Editing employee: " + emp.getEmpNo());

            return employeeDAO.updateEmployee(emp);
        }

        // URL:
        // http://localhost:8080/SomeContextPath/employee/{empNo}
        @RequestMapping(value = "/employee/{empNo}", //
                method = RequestMethod.DELETE, //
                produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
        @ResponseBody
        public void deleteEmployee(@PathVariable("empNo") String empNo) {

            System.out.println("(Service Side) Deleting employee: " + empNo);

            employeeDAO.deleteEmployee(empNo);
        }

    }

    // URL:
    // http://localhost:8080/SpringMVCRESTful/employees
    // http://localhost:8080/SpringMVCRESTful/employees.xml
    // http://localhost:8080/SpringMVCRESTful/employees.json
    @RequestMapping(value = "/employees", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public List<Employee> getEmployees() {
        List<Employee> list = employeeDAO.getAllEmployees();
        return list;
    }

    // URL:
    // http://localhost:8080/SpringMVCRESTful/employee/{empNo}
    // http://localhost:8080/SpringMVCRESTful/employee/{empNo}.xml
    // http://localhost:8080/SpringMVCRESTful/employee/{empNo}.json
    @RequestMapping(value = "/employee/{empNo}", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public Employee getEmployee(@PathVariable("empNo") String empNo) {
        return employeeDAO.getEmployee(empNo);
    }

    // URL:
    // http://localhost:8080/SpringMVCRESTful/employee
    // http://localhost:8080/SpringMVCRESTful/employee.xml
    // http://localhost:8080/SpringMVCRESTful/employee.json
    @RequestMapping(value = "/employee", //
            method = RequestMethod.POST, //
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public Employee addEmployee(@RequestBody Employee emp) {

        return employeeDAO.addEmployee(emp);

    }

    // URL:
    // http://localhost:8080/SpringMVCRESTful/employee
    // http://localhost:8080/SpringMVCRESTful/employee.xml
    // http://localhost:8080/SpringMVCRESTful/employee.json
    @RequestMapping(value = "/employee", //
            method = RequestMethod.PUT, //
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public Employee updateEmployee(@RequestBody Employee emp) {

        return employeeDAO.updateEmployee(emp);
    }

    // URL:
    // http://localhost:8080/SpringMVCRESTful/employee/{empNo}
    @RequestMapping(value = "/employees/{empNo}", //
            method = RequestMethod.DELETE, //
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public void deleteEmployee(@PathVariable("empNo") String empNo) {
        employeeDAO.deleteEmployee(empNo);
    }

}

    // URL:
    // http://localhost:8080/SomeContextPath/employees
    // http://localhost:8080/SomeContextPath/employees.xml
    // http://localhost:8080/SomeContextPath/employees.json
    @RequestMapping(value = "/employees", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public List<Employee> getEmployees() {
        List<Employee> list = employeeDAO.getAllEmployees();
        return list;
    }

    // URL:
    // http://localhost:8080/SomeContextPath/employee/{empId}
    // http://localhost:8080/SomeContextPath/employee/{empId}.xml
    // http://localhost:8080/SomeContextPath/employee/{empId}.json
    @RequestMapping(value = "/employee/{empId}", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public Employee getEmployee(@PathVariable("empId") Long empId) {
        return employeeDAO.getEmployee(empId);
    }

    // URL:
    // http://localhost:8080/SomeContextPath/employee
    // http://localhost:8080/SomeContextPath/employee.xml
    // http://localhost:8080/SomeContextPath/employee.json

    @RequestMapping(value = "/employee", //
            method = RequestMethod.POST, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public Employee addEmployee(@RequestBody EmployeeForm empForm) {

        System.out.println("(Service Side) Creating employee with empNo: " + empForm.getEmpNo());

        return employeeDAO.addEmployee(empForm);
    }

    // URL:
    // http://localhost:8080/SomeContextPath/employee
    // http://localhost:8080/SomeContextPath/employee.xml
    // http://localhost:8080/SomeContextPath/employee.json
    @RequestMapping(value = "/employee", //
            method = RequestMethod.PUT, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public Employee updateEmployee(@RequestBody EmployeeForm empForm) {

        System.out.println("(Service Side) Editing employee with Id: " + empForm.getEmpId());

        return employeeDAO.updateEmployee(empForm);
    }

    // URL:
    // http://localhost:8080/SomeContextPath/employee/{empId}
    @RequestMapping(value = "/employee/{empId}", //
            method = RequestMethod.DELETE, //
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public void deleteEmployee(@PathVariable("empId") Long empId) {

        System.out.println("(Service Side) Deleting employee with Id: " + empId);

        employeeDAO.deleteEmployee(empId);
    }

}

@RequestMapping(value = "/", method = RequestMethod.GET)
public String showBankAccounts(Model model) {
        List<BankAccountInfo> list = bankAccountDAO.listBankAccountInfo();

        model.addAttribute("accountInfos", list);

        return "accountsPage";
        }

@RequestMapping(value = "/sendMoney", method = RequestMethod.GET)
public String viewSendMoneyPage(Model model) {

        SendMoneyForm form = new SendMoneyForm(1L, 2L, 700d);

        model.addAttribute("sendMoneyForm", form);

        return "sendMoneyPage";
        }


@RequestMapping(value = "/sendMoney", method = RequestMethod.POST)
public String processSendMoney(Model model, SendMoneyForm sendMoneyForm) {

        System.out.println("Send Money: " + sendMoneyForm.getAmount());

        try {
        bankAccountDAO.sendMoney(sendMoneyForm.getFromAccountId(), //
        sendMoneyForm.getToAccountId(), //
        sendMoneyForm.getAmount());
        } catch (BankTransactionException e) {
        model.addAttribute("errorMessage", "Error: " + e.getMessage());
        return "/sendMoneyPage";
        }
        return "redirect:/";
        }

        }

@RestController
public class StudentController
{
    @Autowired
    StudentRepository studentRepository;
    //Create
    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Student createStudent(@RequestBody Student student)
    {
        return studentRepository.save(student);
    }

    //Read
    @RequestMapping(value="/student/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable long id)
    {
        return studentRepository.findOne(id);
    }

    @RequestMapping(value="/students", method = RequestMethod.GET)
    public List getAllStudents()
    {
        return (List)studentRepository.findAll();
    }

    //Update
    @RequestMapping(value = "/student", method = RequestMethod.PUT)
    public Student updateStudent(@RequestBody Student student)
    {
        return studentRepository.save(student);
    }

    //Delete
    @RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable long id)
    {
        studentRepository.delete(id);
    }
}
*/