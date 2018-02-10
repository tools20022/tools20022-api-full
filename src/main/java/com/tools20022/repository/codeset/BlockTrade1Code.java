/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.BlockTrade1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the instruction is the parent or a children of a block
 * trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.BlockTrade1Code#Parent
 * BlockTrade1Code.Parent}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BlockTrade1Code#Child
 * BlockTrade1Code.Child}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BlockTradeCode BlockTradeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BLPA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BlockTrade1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the instruction is the parent or a children of a block trade."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BlockTrade1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BlockTrade1Code
	 * BlockTrade1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Parent"</li>
	 * </ul>
	 */
	public static final BlockTrade1Code Parent = new BlockTrade1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Parent";
			owner_lazy = () -> com.tools20022.repository.codeset.BlockTrade1Code.mmObject();
			codeName = BlockTradeCode.Parent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BlockTrade1Code
	 * BlockTrade1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Child"</li>
	 * </ul>
	 */
	public static final BlockTrade1Code Child = new BlockTrade1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Child";
			owner_lazy = () -> com.tools20022.repository.codeset.BlockTrade1Code.mmObject();
			codeName = BlockTradeCode.Child.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, BlockTrade1Code> codesByName = new LinkedHashMap<>();

	protected BlockTrade1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BLPA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BlockTrade1Code";
				definition = "Specifies whether the instruction is the parent or a children of a block trade.";
				trace_lazy = () -> BlockTradeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BlockTrade1Code.Parent, com.tools20022.repository.codeset.BlockTrade1Code.Child);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Parent.getCodeName().get(), Parent);
		codesByName.put(Child.getCodeName().get(), Child);
	}

	public static BlockTrade1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BlockTrade1Code[] values() {
		BlockTrade1Code[] values = new BlockTrade1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BlockTrade1Code> {
		@Override
		public BlockTrade1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BlockTrade1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}