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
import com.tools20022.repository.codeset.ClearingObligationType1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.ClearingObligationType1Code#No
 * ClearingObligationType1Code.No}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingObligationType1Code#Unknown
 * ClearingObligationType1Code.Unknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingObligationType1Code#Yes
 * ClearingObligationType1Code.Yes}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ClearingObligationTypeCode
 * ClearingObligationTypeCode}</li>
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
 * "ClearingObligationType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the reported contract belongs to a class of OTC derivatives that has been declared subject to the clearing obligation and both counterparties to the contract are subject to the clearing obligation under Regulation (EU) No 648/2012, as of the time of execution of the contract."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ClearingObligationType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingObligationType1Code
	 * ClearingObligationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "No"</li>
	 * </ul>
	 */
	public static final ClearingObligationType1Code No = new ClearingObligationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "No";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingObligationType1Code.mmObject();
			codeName = ClearingObligationTypeCode.No.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingObligationType1Code
	 * ClearingObligationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * </ul>
	 */
	public static final ClearingObligationType1Code Unknown = new ClearingObligationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingObligationType1Code.mmObject();
			codeName = ClearingObligationTypeCode.Unknown.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingObligationType1Code
	 * ClearingObligationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Yes"</li>
	 * </ul>
	 */
	public static final ClearingObligationType1Code Yes = new ClearingObligationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Yes";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingObligationType1Code.mmObject();
			codeName = ClearingObligationTypeCode.Yes.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ClearingObligationType1Code> codesByName = new LinkedHashMap<>();

	protected ClearingObligationType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ClearingObligationType1Code";
				definition = "Specifies whether the reported contract belongs to a class of OTC derivatives that has been declared subject to the clearing obligation and both counterparties to the contract are subject to the clearing obligation under Regulation (EU) No 648/2012, as of the time of execution of the contract.";
				trace_lazy = () -> ClearingObligationTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ClearingObligationType1Code.No, com.tools20022.repository.codeset.ClearingObligationType1Code.Unknown,
						com.tools20022.repository.codeset.ClearingObligationType1Code.Yes);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(No.getCodeName().get(), No);
		codesByName.put(Unknown.getCodeName().get(), Unknown);
		codesByName.put(Yes.getCodeName().get(), Yes);
	}

	public static ClearingObligationType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ClearingObligationType1Code[] values() {
		ClearingObligationType1Code[] values = new ClearingObligationType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ClearingObligationType1Code> {
		@Override
		public ClearingObligationType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ClearingObligationType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}