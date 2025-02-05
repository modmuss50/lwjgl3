/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoEncodeH265SliceSegmentHeaderFlags {
 *     uint32_t first_slice_segment_in_pic_flag : 1;
 *     uint32_t no_output_of_prior_pics_flag : 1;
 *     uint32_t dependent_slice_segment_flag : 1;
 *     uint32_t pic_output_flag : 1;
 *     uint32_t short_term_ref_pic_set_sps_flag : 1;
 *     uint32_t slice_temporal_mvp_enable_flag : 1;
 *     uint32_t slice_sao_luma_flag : 1;
 *     uint32_t slice_sao_chroma_flag : 1;
 *     uint32_t num_ref_idx_active_override_flag : 1;
 *     uint32_t mvd_l1_zero_flag : 1;
 *     uint32_t cabac_init_flag : 1;
 *     uint32_t slice_deblocking_filter_disable_flag : 1;
 *     uint32_t collocated_from_l0_flag : 1;
 *     uint32_t slice_loop_filter_across_slices_enabled_flag : 1;
 * }</code></pre>
 */
public class StdVideoEncodeH265SliceSegmentHeaderFlags extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BITFIELD0;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BITFIELD0 = layout.offsetof(0);
    }

    /**
     * Creates a {@code StdVideoEncodeH265SliceSegmentHeaderFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeH265SliceSegmentHeaderFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code first_slice_segment_in_pic_flag} field. */
    @NativeType("uint32_t")
    public boolean first_slice_segment_in_pic_flag() { return nfirst_slice_segment_in_pic_flag(address()) != 0; }
    /** @return the value of the {@code no_output_of_prior_pics_flag} field. */
    @NativeType("uint32_t")
    public boolean no_output_of_prior_pics_flag() { return nno_output_of_prior_pics_flag(address()) != 0; }
    /** @return the value of the {@code dependent_slice_segment_flag} field. */
    @NativeType("uint32_t")
    public boolean dependent_slice_segment_flag() { return ndependent_slice_segment_flag(address()) != 0; }
    /** @return the value of the {@code pic_output_flag} field. */
    @NativeType("uint32_t")
    public boolean pic_output_flag() { return npic_output_flag(address()) != 0; }
    /** @return the value of the {@code short_term_ref_pic_set_sps_flag} field. */
    @NativeType("uint32_t")
    public boolean short_term_ref_pic_set_sps_flag() { return nshort_term_ref_pic_set_sps_flag(address()) != 0; }
    /** @return the value of the {@code slice_temporal_mvp_enable_flag} field. */
    @NativeType("uint32_t")
    public boolean slice_temporal_mvp_enable_flag() { return nslice_temporal_mvp_enable_flag(address()) != 0; }
    /** @return the value of the {@code slice_sao_luma_flag} field. */
    @NativeType("uint32_t")
    public boolean slice_sao_luma_flag() { return nslice_sao_luma_flag(address()) != 0; }
    /** @return the value of the {@code slice_sao_chroma_flag} field. */
    @NativeType("uint32_t")
    public boolean slice_sao_chroma_flag() { return nslice_sao_chroma_flag(address()) != 0; }
    /** @return the value of the {@code num_ref_idx_active_override_flag} field. */
    @NativeType("uint32_t")
    public boolean num_ref_idx_active_override_flag() { return nnum_ref_idx_active_override_flag(address()) != 0; }
    /** @return the value of the {@code mvd_l1_zero_flag} field. */
    @NativeType("uint32_t")
    public boolean mvd_l1_zero_flag() { return nmvd_l1_zero_flag(address()) != 0; }
    /** @return the value of the {@code cabac_init_flag} field. */
    @NativeType("uint32_t")
    public boolean cabac_init_flag() { return ncabac_init_flag(address()) != 0; }
    /** @return the value of the {@code slice_deblocking_filter_disable_flag} field. */
    @NativeType("uint32_t")
    public boolean slice_deblocking_filter_disable_flag() { return nslice_deblocking_filter_disable_flag(address()) != 0; }
    /** @return the value of the {@code collocated_from_l0_flag} field. */
    @NativeType("uint32_t")
    public boolean collocated_from_l0_flag() { return ncollocated_from_l0_flag(address()) != 0; }
    /** @return the value of the {@code slice_loop_filter_across_slices_enabled_flag} field. */
    @NativeType("uint32_t")
    public boolean slice_loop_filter_across_slices_enabled_flag() { return nslice_loop_filter_across_slices_enabled_flag(address()) != 0; }

    /** Sets the specified value to the {@code first_slice_segment_in_pic_flag} field. */
    public StdVideoEncodeH265SliceSegmentHeaderFlags first_slice_segment_in_pic_flag(@NativeType("uint32_t") boolean value) { nfirst_slice_segment_in_pic_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code no_output_of_prior_pics_flag} field. */
    public StdVideoEncodeH265SliceSegmentHeaderFlags no_output_of_prior_pics_flag(@NativeType("uint32_t") boolean value) { nno_output_of_prior_pics_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code dependent_slice_segment_flag} field. */
    public StdVideoEncodeH265SliceSegmentHeaderFlags dependent_slice_segment_flag(@NativeType("uint32_t") boolean value) { ndependent_slice_segment_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code pic_output_flag} field. */
    public StdVideoEncodeH265SliceSegmentHeaderFlags pic_output_flag(@NativeType("uint32_t") boolean value) { npic_output_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code short_term_ref_pic_set_sps_flag} field. */
    public StdVideoEncodeH265SliceSegmentHeaderFlags short_term_ref_pic_set_sps_flag(@NativeType("uint32_t") boolean value) { nshort_term_ref_pic_set_sps_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code slice_temporal_mvp_enable_flag} field. */
    public StdVideoEncodeH265SliceSegmentHeaderFlags slice_temporal_mvp_enable_flag(@NativeType("uint32_t") boolean value) { nslice_temporal_mvp_enable_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code slice_sao_luma_flag} field. */
    public StdVideoEncodeH265SliceSegmentHeaderFlags slice_sao_luma_flag(@NativeType("uint32_t") boolean value) { nslice_sao_luma_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code slice_sao_chroma_flag} field. */
    public StdVideoEncodeH265SliceSegmentHeaderFlags slice_sao_chroma_flag(@NativeType("uint32_t") boolean value) { nslice_sao_chroma_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code num_ref_idx_active_override_flag} field. */
    public StdVideoEncodeH265SliceSegmentHeaderFlags num_ref_idx_active_override_flag(@NativeType("uint32_t") boolean value) { nnum_ref_idx_active_override_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code mvd_l1_zero_flag} field. */
    public StdVideoEncodeH265SliceSegmentHeaderFlags mvd_l1_zero_flag(@NativeType("uint32_t") boolean value) { nmvd_l1_zero_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code cabac_init_flag} field. */
    public StdVideoEncodeH265SliceSegmentHeaderFlags cabac_init_flag(@NativeType("uint32_t") boolean value) { ncabac_init_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code slice_deblocking_filter_disable_flag} field. */
    public StdVideoEncodeH265SliceSegmentHeaderFlags slice_deblocking_filter_disable_flag(@NativeType("uint32_t") boolean value) { nslice_deblocking_filter_disable_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code collocated_from_l0_flag} field. */
    public StdVideoEncodeH265SliceSegmentHeaderFlags collocated_from_l0_flag(@NativeType("uint32_t") boolean value) { ncollocated_from_l0_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code slice_loop_filter_across_slices_enabled_flag} field. */
    public StdVideoEncodeH265SliceSegmentHeaderFlags slice_loop_filter_across_slices_enabled_flag(@NativeType("uint32_t") boolean value) { nslice_loop_filter_across_slices_enabled_flag(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH265SliceSegmentHeaderFlags set(
        boolean first_slice_segment_in_pic_flag,
        boolean no_output_of_prior_pics_flag,
        boolean dependent_slice_segment_flag,
        boolean pic_output_flag,
        boolean short_term_ref_pic_set_sps_flag,
        boolean slice_temporal_mvp_enable_flag,
        boolean slice_sao_luma_flag,
        boolean slice_sao_chroma_flag,
        boolean num_ref_idx_active_override_flag,
        boolean mvd_l1_zero_flag,
        boolean cabac_init_flag,
        boolean slice_deblocking_filter_disable_flag,
        boolean collocated_from_l0_flag,
        boolean slice_loop_filter_across_slices_enabled_flag
    ) {
        first_slice_segment_in_pic_flag(first_slice_segment_in_pic_flag);
        no_output_of_prior_pics_flag(no_output_of_prior_pics_flag);
        dependent_slice_segment_flag(dependent_slice_segment_flag);
        pic_output_flag(pic_output_flag);
        short_term_ref_pic_set_sps_flag(short_term_ref_pic_set_sps_flag);
        slice_temporal_mvp_enable_flag(slice_temporal_mvp_enable_flag);
        slice_sao_luma_flag(slice_sao_luma_flag);
        slice_sao_chroma_flag(slice_sao_chroma_flag);
        num_ref_idx_active_override_flag(num_ref_idx_active_override_flag);
        mvd_l1_zero_flag(mvd_l1_zero_flag);
        cabac_init_flag(cabac_init_flag);
        slice_deblocking_filter_disable_flag(slice_deblocking_filter_disable_flag);
        collocated_from_l0_flag(collocated_from_l0_flag);
        slice_loop_filter_across_slices_enabled_flag(slice_loop_filter_across_slices_enabled_flag);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeH265SliceSegmentHeaderFlags set(StdVideoEncodeH265SliceSegmentHeaderFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeH265SliceSegmentHeaderFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265SliceSegmentHeaderFlags malloc() {
        return wrap(StdVideoEncodeH265SliceSegmentHeaderFlags.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoEncodeH265SliceSegmentHeaderFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265SliceSegmentHeaderFlags calloc() {
        return wrap(StdVideoEncodeH265SliceSegmentHeaderFlags.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoEncodeH265SliceSegmentHeaderFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH265SliceSegmentHeaderFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoEncodeH265SliceSegmentHeaderFlags.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH265SliceSegmentHeaderFlags} instance for the specified memory address. */
    public static StdVideoEncodeH265SliceSegmentHeaderFlags create(long address) {
        return wrap(StdVideoEncodeH265SliceSegmentHeaderFlags.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265SliceSegmentHeaderFlags createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoEncodeH265SliceSegmentHeaderFlags.class, address);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265SliceSegmentHeaderFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265SliceSegmentHeaderFlags.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265SliceSegmentHeaderFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265SliceSegmentHeaderFlags.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265SliceSegmentHeaderFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265SliceSegmentHeaderFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoEncodeH265SliceSegmentHeaderFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265SliceSegmentHeaderFlags.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265SliceSegmentHeaderFlags.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH265SliceSegmentHeaderFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265SliceSegmentHeaderFlags malloc(MemoryStack stack) {
        return wrap(StdVideoEncodeH265SliceSegmentHeaderFlags.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoEncodeH265SliceSegmentHeaderFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265SliceSegmentHeaderFlags calloc(MemoryStack stack) {
        return wrap(StdVideoEncodeH265SliceSegmentHeaderFlags.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoEncodeH265SliceSegmentHeaderFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265SliceSegmentHeaderFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265SliceSegmentHeaderFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265SliceSegmentHeaderFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH265SliceSegmentHeaderFlags.BITFIELD0); }
    /** Unsafe version of {@link #first_slice_segment_in_pic_flag}. */
    public static int nfirst_slice_segment_in_pic_flag(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #no_output_of_prior_pics_flag}. */
    public static int nno_output_of_prior_pics_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    /** Unsafe version of {@link #dependent_slice_segment_flag}. */
    public static int ndependent_slice_segment_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_04) >>> 2; }
    /** Unsafe version of {@link #pic_output_flag}. */
    public static int npic_output_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_08) >>> 3; }
    /** Unsafe version of {@link #short_term_ref_pic_set_sps_flag}. */
    public static int nshort_term_ref_pic_set_sps_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_10) >>> 4; }
    /** Unsafe version of {@link #slice_temporal_mvp_enable_flag}. */
    public static int nslice_temporal_mvp_enable_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_20) >>> 5; }
    /** Unsafe version of {@link #slice_sao_luma_flag}. */
    public static int nslice_sao_luma_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_40) >>> 6; }
    /** Unsafe version of {@link #slice_sao_chroma_flag}. */
    public static int nslice_sao_chroma_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_80) >>> 7; }
    /** Unsafe version of {@link #num_ref_idx_active_override_flag}. */
    public static int nnum_ref_idx_active_override_flag(long struct) { return (nbitfield0(struct) & 0x00_00_01_00) >>> 8; }
    /** Unsafe version of {@link #mvd_l1_zero_flag}. */
    public static int nmvd_l1_zero_flag(long struct) { return (nbitfield0(struct) & 0x00_00_02_00) >>> 9; }
    /** Unsafe version of {@link #cabac_init_flag}. */
    public static int ncabac_init_flag(long struct) { return (nbitfield0(struct) & 0x00_00_04_00) >>> 10; }
    /** Unsafe version of {@link #slice_deblocking_filter_disable_flag}. */
    public static int nslice_deblocking_filter_disable_flag(long struct) { return (nbitfield0(struct) & 0x00_00_08_00) >>> 11; }
    /** Unsafe version of {@link #collocated_from_l0_flag}. */
    public static int ncollocated_from_l0_flag(long struct) { return (nbitfield0(struct) & 0x00_00_10_00) >>> 12; }
    /** Unsafe version of {@link #slice_loop_filter_across_slices_enabled_flag}. */
    public static int nslice_loop_filter_across_slices_enabled_flag(long struct) { return (nbitfield0(struct) & 0x00_00_20_00) >>> 13; }

    public static void nbitfield0(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH265SliceSegmentHeaderFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #first_slice_segment_in_pic_flag(boolean) first_slice_segment_in_pic_flag}. */
    public static void nfirst_slice_segment_in_pic_flag(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #no_output_of_prior_pics_flag(boolean) no_output_of_prior_pics_flag}. */
    public static void nno_output_of_prior_pics_flag(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    /** Unsafe version of {@link #dependent_slice_segment_flag(boolean) dependent_slice_segment_flag}. */
    public static void ndependent_slice_segment_flag(long struct, int value) { nbitfield0(struct, ((value << 2) & 0x00_00_00_04) | (nbitfield0(struct) & 0xFF_FF_FF_FB)); }
    /** Unsafe version of {@link #pic_output_flag(boolean) pic_output_flag}. */
    public static void npic_output_flag(long struct, int value) { nbitfield0(struct, ((value << 3) & 0x00_00_00_08) | (nbitfield0(struct) & 0xFF_FF_FF_F7)); }
    /** Unsafe version of {@link #short_term_ref_pic_set_sps_flag(boolean) short_term_ref_pic_set_sps_flag}. */
    public static void nshort_term_ref_pic_set_sps_flag(long struct, int value) { nbitfield0(struct, ((value << 4) & 0x00_00_00_10) | (nbitfield0(struct) & 0xFF_FF_FF_EF)); }
    /** Unsafe version of {@link #slice_temporal_mvp_enable_flag(boolean) slice_temporal_mvp_enable_flag}. */
    public static void nslice_temporal_mvp_enable_flag(long struct, int value) { nbitfield0(struct, ((value << 5) & 0x00_00_00_20) | (nbitfield0(struct) & 0xFF_FF_FF_DF)); }
    /** Unsafe version of {@link #slice_sao_luma_flag(boolean) slice_sao_luma_flag}. */
    public static void nslice_sao_luma_flag(long struct, int value) { nbitfield0(struct, ((value << 6) & 0x00_00_00_40) | (nbitfield0(struct) & 0xFF_FF_FF_BF)); }
    /** Unsafe version of {@link #slice_sao_chroma_flag(boolean) slice_sao_chroma_flag}. */
    public static void nslice_sao_chroma_flag(long struct, int value) { nbitfield0(struct, ((value << 7) & 0x00_00_00_80) | (nbitfield0(struct) & 0xFF_FF_FF_7F)); }
    /** Unsafe version of {@link #num_ref_idx_active_override_flag(boolean) num_ref_idx_active_override_flag}. */
    public static void nnum_ref_idx_active_override_flag(long struct, int value) { nbitfield0(struct, ((value << 8) & 0x00_00_01_00) | (nbitfield0(struct) & 0xFF_FF_FE_FF)); }
    /** Unsafe version of {@link #mvd_l1_zero_flag(boolean) mvd_l1_zero_flag}. */
    public static void nmvd_l1_zero_flag(long struct, int value) { nbitfield0(struct, ((value << 9) & 0x00_00_02_00) | (nbitfield0(struct) & 0xFF_FF_FD_FF)); }
    /** Unsafe version of {@link #cabac_init_flag(boolean) cabac_init_flag}. */
    public static void ncabac_init_flag(long struct, int value) { nbitfield0(struct, ((value << 10) & 0x00_00_04_00) | (nbitfield0(struct) & 0xFF_FF_FB_FF)); }
    /** Unsafe version of {@link #slice_deblocking_filter_disable_flag(boolean) slice_deblocking_filter_disable_flag}. */
    public static void nslice_deblocking_filter_disable_flag(long struct, int value) { nbitfield0(struct, ((value << 11) & 0x00_00_08_00) | (nbitfield0(struct) & 0xFF_FF_F7_FF)); }
    /** Unsafe version of {@link #collocated_from_l0_flag(boolean) collocated_from_l0_flag}. */
    public static void ncollocated_from_l0_flag(long struct, int value) { nbitfield0(struct, ((value << 12) & 0x00_00_10_00) | (nbitfield0(struct) & 0xFF_FF_EF_FF)); }
    /** Unsafe version of {@link #slice_loop_filter_across_slices_enabled_flag(boolean) slice_loop_filter_across_slices_enabled_flag}. */
    public static void nslice_loop_filter_across_slices_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 13) & 0x00_00_20_00) | (nbitfield0(struct) & 0xFF_FF_DF_FF)); }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH265SliceSegmentHeaderFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH265SliceSegmentHeaderFlags, Buffer> implements NativeResource {

        private static final StdVideoEncodeH265SliceSegmentHeaderFlags ELEMENT_FACTORY = StdVideoEncodeH265SliceSegmentHeaderFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH265SliceSegmentHeaderFlags.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH265SliceSegmentHeaderFlags#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected StdVideoEncodeH265SliceSegmentHeaderFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code first_slice_segment_in_pic_flag} field. */
        @NativeType("uint32_t")
        public boolean first_slice_segment_in_pic_flag() { return StdVideoEncodeH265SliceSegmentHeaderFlags.nfirst_slice_segment_in_pic_flag(address()) != 0; }
        /** @return the value of the {@code no_output_of_prior_pics_flag} field. */
        @NativeType("uint32_t")
        public boolean no_output_of_prior_pics_flag() { return StdVideoEncodeH265SliceSegmentHeaderFlags.nno_output_of_prior_pics_flag(address()) != 0; }
        /** @return the value of the {@code dependent_slice_segment_flag} field. */
        @NativeType("uint32_t")
        public boolean dependent_slice_segment_flag() { return StdVideoEncodeH265SliceSegmentHeaderFlags.ndependent_slice_segment_flag(address()) != 0; }
        /** @return the value of the {@code pic_output_flag} field. */
        @NativeType("uint32_t")
        public boolean pic_output_flag() { return StdVideoEncodeH265SliceSegmentHeaderFlags.npic_output_flag(address()) != 0; }
        /** @return the value of the {@code short_term_ref_pic_set_sps_flag} field. */
        @NativeType("uint32_t")
        public boolean short_term_ref_pic_set_sps_flag() { return StdVideoEncodeH265SliceSegmentHeaderFlags.nshort_term_ref_pic_set_sps_flag(address()) != 0; }
        /** @return the value of the {@code slice_temporal_mvp_enable_flag} field. */
        @NativeType("uint32_t")
        public boolean slice_temporal_mvp_enable_flag() { return StdVideoEncodeH265SliceSegmentHeaderFlags.nslice_temporal_mvp_enable_flag(address()) != 0; }
        /** @return the value of the {@code slice_sao_luma_flag} field. */
        @NativeType("uint32_t")
        public boolean slice_sao_luma_flag() { return StdVideoEncodeH265SliceSegmentHeaderFlags.nslice_sao_luma_flag(address()) != 0; }
        /** @return the value of the {@code slice_sao_chroma_flag} field. */
        @NativeType("uint32_t")
        public boolean slice_sao_chroma_flag() { return StdVideoEncodeH265SliceSegmentHeaderFlags.nslice_sao_chroma_flag(address()) != 0; }
        /** @return the value of the {@code num_ref_idx_active_override_flag} field. */
        @NativeType("uint32_t")
        public boolean num_ref_idx_active_override_flag() { return StdVideoEncodeH265SliceSegmentHeaderFlags.nnum_ref_idx_active_override_flag(address()) != 0; }
        /** @return the value of the {@code mvd_l1_zero_flag} field. */
        @NativeType("uint32_t")
        public boolean mvd_l1_zero_flag() { return StdVideoEncodeH265SliceSegmentHeaderFlags.nmvd_l1_zero_flag(address()) != 0; }
        /** @return the value of the {@code cabac_init_flag} field. */
        @NativeType("uint32_t")
        public boolean cabac_init_flag() { return StdVideoEncodeH265SliceSegmentHeaderFlags.ncabac_init_flag(address()) != 0; }
        /** @return the value of the {@code slice_deblocking_filter_disable_flag} field. */
        @NativeType("uint32_t")
        public boolean slice_deblocking_filter_disable_flag() { return StdVideoEncodeH265SliceSegmentHeaderFlags.nslice_deblocking_filter_disable_flag(address()) != 0; }
        /** @return the value of the {@code collocated_from_l0_flag} field. */
        @NativeType("uint32_t")
        public boolean collocated_from_l0_flag() { return StdVideoEncodeH265SliceSegmentHeaderFlags.ncollocated_from_l0_flag(address()) != 0; }
        /** @return the value of the {@code slice_loop_filter_across_slices_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean slice_loop_filter_across_slices_enabled_flag() { return StdVideoEncodeH265SliceSegmentHeaderFlags.nslice_loop_filter_across_slices_enabled_flag(address()) != 0; }

        /** Sets the specified value to the {@code first_slice_segment_in_pic_flag} field. */
        public StdVideoEncodeH265SliceSegmentHeaderFlags.Buffer first_slice_segment_in_pic_flag(@NativeType("uint32_t") boolean value) { StdVideoEncodeH265SliceSegmentHeaderFlags.nfirst_slice_segment_in_pic_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code no_output_of_prior_pics_flag} field. */
        public StdVideoEncodeH265SliceSegmentHeaderFlags.Buffer no_output_of_prior_pics_flag(@NativeType("uint32_t") boolean value) { StdVideoEncodeH265SliceSegmentHeaderFlags.nno_output_of_prior_pics_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code dependent_slice_segment_flag} field. */
        public StdVideoEncodeH265SliceSegmentHeaderFlags.Buffer dependent_slice_segment_flag(@NativeType("uint32_t") boolean value) { StdVideoEncodeH265SliceSegmentHeaderFlags.ndependent_slice_segment_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code pic_output_flag} field. */
        public StdVideoEncodeH265SliceSegmentHeaderFlags.Buffer pic_output_flag(@NativeType("uint32_t") boolean value) { StdVideoEncodeH265SliceSegmentHeaderFlags.npic_output_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code short_term_ref_pic_set_sps_flag} field. */
        public StdVideoEncodeH265SliceSegmentHeaderFlags.Buffer short_term_ref_pic_set_sps_flag(@NativeType("uint32_t") boolean value) { StdVideoEncodeH265SliceSegmentHeaderFlags.nshort_term_ref_pic_set_sps_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code slice_temporal_mvp_enable_flag} field. */
        public StdVideoEncodeH265SliceSegmentHeaderFlags.Buffer slice_temporal_mvp_enable_flag(@NativeType("uint32_t") boolean value) { StdVideoEncodeH265SliceSegmentHeaderFlags.nslice_temporal_mvp_enable_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code slice_sao_luma_flag} field. */
        public StdVideoEncodeH265SliceSegmentHeaderFlags.Buffer slice_sao_luma_flag(@NativeType("uint32_t") boolean value) { StdVideoEncodeH265SliceSegmentHeaderFlags.nslice_sao_luma_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code slice_sao_chroma_flag} field. */
        public StdVideoEncodeH265SliceSegmentHeaderFlags.Buffer slice_sao_chroma_flag(@NativeType("uint32_t") boolean value) { StdVideoEncodeH265SliceSegmentHeaderFlags.nslice_sao_chroma_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code num_ref_idx_active_override_flag} field. */
        public StdVideoEncodeH265SliceSegmentHeaderFlags.Buffer num_ref_idx_active_override_flag(@NativeType("uint32_t") boolean value) { StdVideoEncodeH265SliceSegmentHeaderFlags.nnum_ref_idx_active_override_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code mvd_l1_zero_flag} field. */
        public StdVideoEncodeH265SliceSegmentHeaderFlags.Buffer mvd_l1_zero_flag(@NativeType("uint32_t") boolean value) { StdVideoEncodeH265SliceSegmentHeaderFlags.nmvd_l1_zero_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code cabac_init_flag} field. */
        public StdVideoEncodeH265SliceSegmentHeaderFlags.Buffer cabac_init_flag(@NativeType("uint32_t") boolean value) { StdVideoEncodeH265SliceSegmentHeaderFlags.ncabac_init_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code slice_deblocking_filter_disable_flag} field. */
        public StdVideoEncodeH265SliceSegmentHeaderFlags.Buffer slice_deblocking_filter_disable_flag(@NativeType("uint32_t") boolean value) { StdVideoEncodeH265SliceSegmentHeaderFlags.nslice_deblocking_filter_disable_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code collocated_from_l0_flag} field. */
        public StdVideoEncodeH265SliceSegmentHeaderFlags.Buffer collocated_from_l0_flag(@NativeType("uint32_t") boolean value) { StdVideoEncodeH265SliceSegmentHeaderFlags.ncollocated_from_l0_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code slice_loop_filter_across_slices_enabled_flag} field. */
        public StdVideoEncodeH265SliceSegmentHeaderFlags.Buffer slice_loop_filter_across_slices_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoEncodeH265SliceSegmentHeaderFlags.nslice_loop_filter_across_slices_enabled_flag(address(), value ? 1 : 0); return this; }

    }

}