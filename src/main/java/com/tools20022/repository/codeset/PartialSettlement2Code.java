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
import com.tools20022.repository.codeset.PartialSettlement2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Information about partial settlement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartialSettlement2Code#PartialSettlement
 * PartialSettlement2Code.PartialSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartialSettlement2Code#PartiallyConfirmed
 * PartialSettlement2Code.PartiallyConfirmed}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PartialSettlementV2Code
 * PartialSettlementV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PAIN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartialSettlement2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about partial settlement."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PartialSettlement2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartialSettlement2Code
	 * PartialSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlement"</li>
	 * </ul>
	 */
	public static final PartialSettlement2Code PartialSettlement = new PartialSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.PartialSettlement2Code.mmObject();
			codeName = PartialSettlementV2Code.PartialSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartialSettlement2Code
	 * PartialSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyConfirmed"</li>
	 * </ul>
	 */
	public static final PartialSettlement2Code PartiallyConfirmed = new PartialSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyConfirmed";
			owner_lazy = () -> com.tools20022.repository.codeset.PartialSettlement2Code.mmObject();
			codeName = PartialSettlementV2Code.PartiallyConfirmed.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PartialSettlement2Code> codesByName = new LinkedHashMap<>();

	protected PartialSettlement2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PAIN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartialSettlement2Code";
				definition = "Information about partial settlement.";
				trace_lazy = () -> PartialSettlementV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PartialSettlement2Code.PartialSettlement, com.tools20022.repository.codeset.PartialSettlement2Code.PartiallyConfirmed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PartialSettlement.getCodeName().get(), PartialSettlement);
		codesByName.put(PartiallyConfirmed.getCodeName().get(), PartiallyConfirmed);
	}

	public static PartialSettlement2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PartialSettlement2Code[] values() {
		PartialSettlement2Code[] values = new PartialSettlement2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PartialSettlement2Code> {
		@Override
		public PartialSettlement2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PartialSettlement2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}