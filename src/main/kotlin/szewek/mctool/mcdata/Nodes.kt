package szewek.mctool.mcdata

import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.InsnList
import szewek.mctool.util.KtUtil
import java.util.*
import java.util.stream.Collectors
import java.util.stream.Stream
import java.util.stream.StreamSupport

val FieldNode.fixedDesc: String get() = if (desc.startsWith('L')) desc.substring(1, desc.length - 1) else desc

inline fun <reified T> Map<*, T>.valueStream(): Stream<T> = KtUtil.streamValuesFrom(this)
fun InsnList.stream(): Stream<AbstractInsnNode> = StreamSupport.stream(spliterator(), false)
fun <T> Stream<T>.toSet(): Set<T> = collect(Collectors.toUnmodifiableSet())
@Suppress("UNCHECKED_CAST")
inline fun <reified R> Stream<*>.filterIsInstance(): Stream<R> = filter { it is R } as Stream<R>
@Suppress("UNCHECKED_CAST")
fun <T> Stream<T?>.filterNotNull() = filter(Objects::nonNull) as Stream<T>