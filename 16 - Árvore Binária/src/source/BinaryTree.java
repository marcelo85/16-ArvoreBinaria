package source;
import exceptions.BoundaryViolationException;
import exceptions.InvalidPositionException;
import position.Position;


public interface BinaryTree {
	public Position<E> left(Position<E> v) throws InvalidPositionException, BoundaryViolationException;

	public Position<E> right(Position<E> v) throws InvalidPositionException, BoundaryViolationException;

	public boolean hasLeft(Position<E> v) throws InvalidPositionException;

	public boolean hasRight(Position<E> v) throws InvalidPositionException;

}
