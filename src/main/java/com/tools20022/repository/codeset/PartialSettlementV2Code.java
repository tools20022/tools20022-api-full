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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.PartialSettlementV2Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.PartialSettlementV2Code#PartialSettlement
 * PartialSettlementV2Code.PartialSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartialSettlementV2Code#PartiallyConfirmed
 * PartialSettlementV2Code.PartiallyConfirmed}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PartialSettlement2Code
 * PartialSettlement2Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = ISO15022Synonym: :22F::PARS</li>
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
 * "PartialSettlementV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about partial settlement."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PartialSettlementV2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Confirmation is for partial settlement. Part of the transaction remains
	 * unsettled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartialSettlementV2Code
	 * PartialSettlementV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: 22F::PARS//PAIN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation is for partial settlement. Part of the transaction remains unsettled."
	 * </li>
	 * </ul>
	 */
	public static final PartialSettlementV2Code PartialSettlement = new PartialSettlementV2Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, "22F::PARS//PAIN"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartialSettlement";
			definition = "Confirmation is for partial settlement. Part of the transaction remains unsettled.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartialSettlementV2Code.mmObject();
			codeName = "PAIN";
		}
	};
	/**
	 * Confirmation is for partial settlement. No additional settlement will
	 * take place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartialSettlementV2Code
	 * PartialSettlementV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PARC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PARS//PARC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyConfirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation is for partial settlement. No additional settlement will take place."
	 * </li>
	 * </ul>
	 */
	public static final PartialSettlementV2Code PartiallyConfirmed = new PartialSettlementV2Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PARS//PARC"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartiallyConfirmed";
			definition = "Confirmation is for partial settlement. No additional settlement will take place.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartialSettlementV2Code.mmObject();
			codeName = "PARC";
		}
	};
	final static private LinkedHashMap<String, PartialSettlementV2Code> codesByName = new LinkedHashMap<>();

	protected PartialSettlementV2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PARS"));
				example = Arrays.asList("PAIN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartialSettlementV2Code";
				definition = "Information about partial settlement.";
				derivation_lazy = () -> Arrays.asList(PartialSettlement2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PartialSettlementV2Code.PartialSettlement, com.tools20022.repository.codeset.PartialSettlementV2Code.PartiallyConfirmed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PartialSettlement.getCodeName().get(), PartialSettlement);
		codesByName.put(PartiallyConfirmed.getCodeName().get(), PartiallyConfirmed);
	}

	public static PartialSettlementV2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PartialSettlementV2Code[] values() {
		PartialSettlementV2Code[] values = new PartialSettlementV2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PartialSettlementV2Code> {
		@Override
		public PartialSettlementV2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PartialSettlementV2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}