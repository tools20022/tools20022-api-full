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
import com.tools20022.repository.codeset.AllocationIndicatorCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.AllocationIndicatorCode#Postallocation
 * AllocationIndicatorCode.Postallocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AllocationIndicatorCode#Preallocation
 * AllocationIndicatorCode.Preallocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AllocationIndicatorCode#Unallocated
 * AllocationIndicatorCode.Unallocated}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AllocationIndicator1Code
 * AllocationIndicator1Code}</li>
 * </ul>
 * </li>
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
 * "AllocationIndicatorCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the trade is a pre-allocation or a post-allocation trade, or whether the trade is unallocated."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AllocationIndicatorCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Trade is a post-allocation trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AllocationIndicatorCode
	 * AllocationIndicatorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "POST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Post-allocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is a post-allocation trade."</li>
	 * </ul>
	 */
	public static final AllocationIndicatorCode Postallocation = new AllocationIndicatorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Post-allocation";
			definition = "Trade is a post-allocation trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.AllocationIndicatorCode.mmObject();
			codeName = "POST";
		}
	};
	/**
	 * Trade is a pre-allocation trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AllocationIndicatorCode
	 * AllocationIndicatorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PREA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pre-allocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is a pre-allocation trade."</li>
	 * </ul>
	 */
	public static final AllocationIndicatorCode Preallocation = new AllocationIndicatorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pre-allocation";
			definition = "Trade is a pre-allocation trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.AllocationIndicatorCode.mmObject();
			codeName = "PREA";
		}
	};
	/**
	 * Trade is unallocated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AllocationIndicatorCode
	 * AllocationIndicatorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unallocated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is unallocated."</li>
	 * </ul>
	 */
	public static final AllocationIndicatorCode Unallocated = new AllocationIndicatorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unallocated";
			definition = "Trade is unallocated.";
			owner_lazy = () -> com.tools20022.repository.codeset.AllocationIndicatorCode.mmObject();
			codeName = "UNAL";
		}
	};
	final static private LinkedHashMap<String, AllocationIndicatorCode> codesByName = new LinkedHashMap<>();

	protected AllocationIndicatorCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("POST");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AllocationIndicatorCode";
				definition = "Specifies whether the trade is a pre-allocation or a post-allocation trade, or whether the trade is unallocated.";
				derivation_lazy = () -> Arrays.asList(AllocationIndicator1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AllocationIndicatorCode.Postallocation, com.tools20022.repository.codeset.AllocationIndicatorCode.Preallocation,
						com.tools20022.repository.codeset.AllocationIndicatorCode.Unallocated);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Postallocation.getCodeName().get(), Postallocation);
		codesByName.put(Preallocation.getCodeName().get(), Preallocation);
		codesByName.put(Unallocated.getCodeName().get(), Unallocated);
	}

	public static AllocationIndicatorCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AllocationIndicatorCode[] values() {
		AllocationIndicatorCode[] values = new AllocationIndicatorCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AllocationIndicatorCode> {
		@Override
		public AllocationIndicatorCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AllocationIndicatorCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}