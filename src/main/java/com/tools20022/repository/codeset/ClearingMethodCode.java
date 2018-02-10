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
import com.tools20022.repository.codeset.ClearingMethodCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the value is net (inclusive of tax) or gross.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingMethodCode#NetNegotiation
 * ClearingMethodCode.NetNegotiation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingMethodCode#GrossNegotiation
 * ClearingMethodCode.GrossNegotiation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingMethodCode#NetMatch
 * ClearingMethodCode.NetMatch}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ClearingMethod1Code
 * ClearingMethod1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ClearingMethodCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the value is net (inclusive of tax) or gross."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ClearingMethodCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settlement done by netting amounts (for trades in the same currency and
	 * for the same value date).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingMethodCode
	 * ClearingMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NENE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetNegotiation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement done by netting amounts (for trades in the same currency and for the same value date)."
	 * </li>
	 * </ul>
	 */
	public static final ClearingMethodCode NetNegotiation = new ClearingMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetNegotiation";
			definition = "Settlement done by netting amounts (for trades in the same currency and for the same value date).";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingMethodCode.mmObject();
			codeName = "NENE";
		}
	};
	/**
	 * Each trade is settled by a single entry to the account of the
	 * beneficiary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingMethodCode
	 * ClearingMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GRNE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossNegotiation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Each trade is settled by a single entry to the account of the beneficiary."
	 * </li>
	 * </ul>
	 */
	public static final ClearingMethodCode GrossNegotiation = new ClearingMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossNegotiation";
			definition = "Each trade is settled by a single entry to the account of the beneficiary.";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingMethodCode.mmObject();
			codeName = "GRNE";
		}
	};
	/**
	 * In a foreign exchange transaction, the third party as a central clearing
	 * counterparty will settle the transaction for both sides respectively.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingMethodCode
	 * ClearingMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NEMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetMatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a foreign exchange transaction, the third party as a central clearing counterparty will settle the transaction for both sides respectively."
	 * </li>
	 * </ul>
	 */
	public static final ClearingMethodCode NetMatch = new ClearingMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetMatch";
			definition = "In a foreign exchange transaction, the third party as a central clearing counterparty will settle the transaction for both sides respectively.";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingMethodCode.mmObject();
			codeName = "NEMA";
		}
	};
	final static private LinkedHashMap<String, ClearingMethodCode> codesByName = new LinkedHashMap<>();

	protected ClearingMethodCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ClearingMethodCode";
				definition = "Specifies whether the value is net (inclusive of tax) or gross.";
				derivation_lazy = () -> Arrays.asList(ClearingMethod1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ClearingMethodCode.NetNegotiation, com.tools20022.repository.codeset.ClearingMethodCode.GrossNegotiation,
						com.tools20022.repository.codeset.ClearingMethodCode.NetMatch);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NetNegotiation.getCodeName().get(), NetNegotiation);
		codesByName.put(GrossNegotiation.getCodeName().get(), GrossNegotiation);
		codesByName.put(NetMatch.getCodeName().get(), NetMatch);
	}

	public static ClearingMethodCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ClearingMethodCode[] values() {
		ClearingMethodCode[] values = new ClearingMethodCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ClearingMethodCode> {
		@Override
		public ClearingMethodCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ClearingMethodCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}