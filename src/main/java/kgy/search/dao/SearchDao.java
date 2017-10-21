package kgy.search.dao;

import org.springframework.stereotype.Repository;

import kgy.common.dao.AbstractDAO;

@Repository("searchDAO")
public class SearchDao extends AbstractDAO{

	private static final String namespace = "kgy.search";
}
