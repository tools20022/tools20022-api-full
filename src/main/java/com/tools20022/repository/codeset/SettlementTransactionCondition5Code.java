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
import com.tools20022.repository.codeset.SettlementTransactionCondition5Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the conditions under which the order/trade is to be settled.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition5Code#PartialAllowed
 * SettlementTransactionCondition5Code.PartialAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition5Code#PartialNotAllowed
 * SettlementTransactionCondition5Code.PartialNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition5Code#PartialSettlementCashThresholdAllowed
 * SettlementTransactionCondition5Code.PartialSettlementCashThresholdAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition5Code#PartialSettlementQuantityThresholdAllowed
 * SettlementTransactionCondition5Code.PartialSettlementQuantityThresholdAllowed
 * }</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
 * SettlementTransactionConditionCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PART"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementTransactionCondition5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the conditions under which the order/trade is to be settled."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementTransactionCondition5Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition5Code
	 * SettlementTransactionCondition5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialAllowed"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition5Code PartialAllowed = new SettlementTransactionCondition5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialAllowed";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition5Code.mmObject();
			codeName = SettlementTransactionConditionCode.PartialAllowed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition5Code
	 * SettlementTransactionCondition5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialNotAllowed"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition5Code PartialNotAllowed = new SettlementTransactionCondition5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialNotAllowed";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition5Code.mmObject();
			codeName = SettlementTransactionConditionCode.PartialNotAllowed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition5Code
	 * SettlementTransactionCondition5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementCashThresholdAllowed"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition5Code PartialSettlementCashThresholdAllowed = new SettlementTransactionCondition5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementCashThresholdAllowed";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition5Code.mmObject();
			codeName = SettlementTransactionConditionCode.PartialSettlementCashThresholdAllowed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition5Code
	 * SettlementTransactionCondition5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementQuantityThresholdAllowed"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition5Code PartialSettlementQuantityThresholdAllowed = new SettlementTransactionCondition5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementQuantityThresholdAllowed";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition5Code.mmObject();
			codeName = SettlementTransactionConditionCode.PartialSettlementQuantityThresholdAllowed.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SettlementTransactionCondition5Code> codesByName = new LinkedHashMap<>();

	protected SettlementTransactionCondition5Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PART");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementTransactionCondition5Code";
				definition = "Specifies the conditions under which the order/trade is to be settled.";
				trace_lazy = () -> SettlementTransactionConditionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementTransactionCondition5Code.PartialAllowed, com.tools20022.repository.codeset.SettlementTransactionCondition5Code.PartialNotAllowed,
						com.tools20022.repository.codeset.SettlementTransactionCondition5Code.PartialSettlementCashThresholdAllowed,
						com.tools20022.repository.codeset.SettlementTransactionCondition5Code.PartialSettlementQuantityThresholdAllowed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PartialAllowed.getCodeName().get(), PartialAllowed);
		codesByName.put(PartialNotAllowed.getCodeName().get(), PartialNotAllowed);
		codesByName.put(PartialSettlementCashThresholdAllowed.getCodeName().get(), PartialSettlementCashThresholdAllowed);
		codesByName.put(PartialSettlementQuantityThresholdAllowed.getCodeName().get(), PartialSettlementQuantityThresholdAllowed);
	}

	public static SettlementTransactionCondition5Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementTransactionCondition5Code[] values() {
		SettlementTransactionCondition5Code[] values = new SettlementTransactionCondition5Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementTransactionCondition5Code> {
		@Override
		public SettlementTransactionCondition5Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementTransactionCondition5Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}