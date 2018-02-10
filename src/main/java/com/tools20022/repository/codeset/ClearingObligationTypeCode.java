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
import com.tools20022.repository.codeset.ClearingObligationTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the reported contract belongs to a class of OTC derivatives
 * that has been declared subject to the clearing obligation and both
 * counterparties to the contract are subject to the clearing obligation under
 * Regulation (EU) No 648/2012, as of the time of execution of the contract.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingObligationTypeCode#No
 * ClearingObligationTypeCode.No}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingObligationTypeCode#Yes
 * ClearingObligationTypeCode.Yes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingObligationTypeCode#Unknown
 * ClearingObligationTypeCode.Unknown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingObligationType1Code
 * ClearingObligationType1Code}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ClearingObligationTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the reported contract belongs to a class of OTC derivatives that has been declared subject to the clearing obligation and both counterparties to the contract are subject to the clearing obligation under Regulation (EU) No 648/2012, as of the time of execution of the contract."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ClearingObligationTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reported contract does not belong to a class of OTC derivatives that has
	 * been declared subject to the clearing obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingObligationTypeCode
	 * ClearingObligationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FLSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "No"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reported contract does not belong to a class of OTC derivatives that has been declared subject to the clearing obligation."
	 * </li>
	 * </ul>
	 */
	public static final ClearingObligationTypeCode No = new ClearingObligationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "No";
			definition = "Reported contract does not belong to a class of OTC derivatives that has been declared subject to the clearing obligation.";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingObligationTypeCode.mmObject();
			codeName = "FLSE";
		}
	};
	/**
	 * Reported contract belongs to a class of OTC derivatives that has been
	 * declared subject to the clearing obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingObligationTypeCode
	 * ClearingObligationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRUE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Yes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reported contract belongs to a class of OTC derivatives that has been declared subject to the clearing obligation."
	 * </li>
	 * </ul>
	 */
	public static final ClearingObligationTypeCode Yes = new ClearingObligationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Yes";
			definition = "Reported contract belongs to a class of OTC derivatives that has been declared subject to the clearing obligation.";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingObligationTypeCode.mmObject();
			codeName = "TRUE";
		}
	};
	/**
	 * Unkonwn whether reported contract belongs to a class of OTC derivatives
	 * that has been declared subject to the clearing obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingObligationTypeCode
	 * ClearingObligationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKWN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unkonwn whether reported contract belongs to a class of OTC derivatives that has been declared subject to the clearing obligation."
	 * </li>
	 * </ul>
	 */
	public static final ClearingObligationTypeCode Unknown = new ClearingObligationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			definition = "Unkonwn whether reported contract belongs to a class of OTC derivatives that has been declared subject to the clearing obligation.";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingObligationTypeCode.mmObject();
			codeName = "UKWN";
		}
	};
	final static private LinkedHashMap<String, ClearingObligationTypeCode> codesByName = new LinkedHashMap<>();

	protected ClearingObligationTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ClearingObligationTypeCode";
				definition = "Specifies whether the reported contract belongs to a class of OTC derivatives that has been declared subject to the clearing obligation and both counterparties to the contract are subject to the clearing obligation under Regulation (EU) No 648/2012, as of the time of execution of the contract.";
				derivation_lazy = () -> Arrays.asList(ClearingObligationType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ClearingObligationTypeCode.No, com.tools20022.repository.codeset.ClearingObligationTypeCode.Yes,
						com.tools20022.repository.codeset.ClearingObligationTypeCode.Unknown);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(No.getCodeName().get(), No);
		codesByName.put(Yes.getCodeName().get(), Yes);
		codesByName.put(Unknown.getCodeName().get(), Unknown);
	}

	public static ClearingObligationTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ClearingObligationTypeCode[] values() {
		ClearingObligationTypeCode[] values = new ClearingObligationTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ClearingObligationTypeCode> {
		@Override
		public ClearingObligationTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ClearingObligationTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}