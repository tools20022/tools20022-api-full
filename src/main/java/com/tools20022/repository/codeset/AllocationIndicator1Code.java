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
import com.tools20022.repository.codeset.AllocationIndicator1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the trade is a pre-allocation or a post-allocation trade,
 * or whether the trade is unallocated.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AllocationIndicator1Code#Postallocation
 * AllocationIndicator1Code.Postallocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AllocationIndicator1Code#Preallocation
 * AllocationIndicator1Code.Preallocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AllocationIndicator1Code#Unallocated
 * AllocationIndicator1Code.Unallocated}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AllocationIndicatorCode
 * AllocationIndicatorCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"POST"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AllocationIndicator1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the trade is a pre-allocation or a post-allocation trade, or whether the trade is unallocated."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AllocationIndicator1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AllocationIndicator1Code
	 * AllocationIndicator1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Post-allocation"</li>
	 * </ul>
	 */
	public static final AllocationIndicator1Code Postallocation = new AllocationIndicator1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Post-allocation";
			owner_lazy = () -> com.tools20022.repository.codeset.AllocationIndicator1Code.mmObject();
			codeName = AllocationIndicatorCode.Postallocation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AllocationIndicator1Code
	 * AllocationIndicator1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pre-allocation"</li>
	 * </ul>
	 */
	public static final AllocationIndicator1Code Preallocation = new AllocationIndicator1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pre-allocation";
			owner_lazy = () -> com.tools20022.repository.codeset.AllocationIndicator1Code.mmObject();
			codeName = AllocationIndicatorCode.Preallocation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AllocationIndicator1Code
	 * AllocationIndicator1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unallocated"</li>
	 * </ul>
	 */
	public static final AllocationIndicator1Code Unallocated = new AllocationIndicator1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unallocated";
			owner_lazy = () -> com.tools20022.repository.codeset.AllocationIndicator1Code.mmObject();
			codeName = AllocationIndicatorCode.Unallocated.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AllocationIndicator1Code> codesByName = new LinkedHashMap<>();

	protected AllocationIndicator1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("POST");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AllocationIndicator1Code";
				definition = "Specifies whether the trade is a pre-allocation or a post-allocation trade, or whether the trade is unallocated.";
				trace_lazy = () -> AllocationIndicatorCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AllocationIndicator1Code.Postallocation, com.tools20022.repository.codeset.AllocationIndicator1Code.Preallocation,
						com.tools20022.repository.codeset.AllocationIndicator1Code.Unallocated);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Postallocation.getCodeName().get(), Postallocation);
		codesByName.put(Preallocation.getCodeName().get(), Preallocation);
		codesByName.put(Unallocated.getCodeName().get(), Unallocated);
	}

	public static AllocationIndicator1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AllocationIndicator1Code[] values() {
		AllocationIndicator1Code[] values = new AllocationIndicator1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AllocationIndicator1Code> {
		@Override
		public AllocationIndicator1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AllocationIndicator1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}