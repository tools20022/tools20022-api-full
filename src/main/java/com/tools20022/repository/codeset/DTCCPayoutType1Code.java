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
import com.tools20022.repository.codeset.DTCCPayoutType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies DTCC (The Depository Trust and Clearing Corporation) defined payout
 * types.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCPayoutType1Code#Cash
 * DTCCPayoutType1Code.Cash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType1Code#Dividend
 * DTCCPayoutType1Code.Dividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType1Code#ReturnOfCapital
 * DTCCPayoutType1Code.ReturnOfCapital}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType1Code#ShortTermCapitalGains
 * DTCCPayoutType1Code.ShortTermCapitalGains}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType1Code#LongTermCapitalGains
 * DTCCPayoutType1Code.LongTermCapitalGains}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType1Code#CapitalGains
 * DTCCPayoutType1Code.CapitalGains}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType1Code#Premium
 * DTCCPayoutType1Code.Premium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType1Code#Principal
 * DTCCPayoutType1Code.Principal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType1Code#Interest
 * DTCCPayoutType1Code.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType1Code#Franked
 * DTCCPayoutType1Code.Franked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType1Code#Unfranked
 * DTCCPayoutType1Code.Unfranked}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode
 * DTCCPayoutTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CASH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCCPayoutType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies DTCC (The Depository Trust and Clearing Corporation) defined payout types."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCCPayoutType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType1Code
	 * DTCCPayoutType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cash"</li>
	 * </ul>
	 */
	public static final DTCCPayoutType1Code Cash = new DTCCPayoutType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cash";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutType1Code.mmObject();
			codeName = DTCCPayoutTypeCode.Cash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType1Code
	 * DTCCPayoutType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * </ul>
	 */
	public static final DTCCPayoutType1Code Dividend = new DTCCPayoutType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dividend";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutType1Code.mmObject();
			codeName = DTCCPayoutTypeCode.Dividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType1Code
	 * DTCCPayoutType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnOfCapital"</li>
	 * </ul>
	 */
	public static final DTCCPayoutType1Code ReturnOfCapital = new DTCCPayoutType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnOfCapital";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutType1Code.mmObject();
			codeName = DTCCPayoutTypeCode.ReturnOfCapital.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType1Code
	 * DTCCPayoutType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortTermCapitalGains"</li>
	 * </ul>
	 */
	public static final DTCCPayoutType1Code ShortTermCapitalGains = new DTCCPayoutType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortTermCapitalGains";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutType1Code.mmObject();
			codeName = DTCCPayoutTypeCode.ShortTermCapitalGains.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType1Code
	 * DTCCPayoutType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongTermCapitalGains"</li>
	 * </ul>
	 */
	public static final DTCCPayoutType1Code LongTermCapitalGains = new DTCCPayoutType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongTermCapitalGains";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutType1Code.mmObject();
			codeName = DTCCPayoutTypeCode.LongTermCapitalGains.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType1Code
	 * DTCCPayoutType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGains"</li>
	 * </ul>
	 */
	public static final DTCCPayoutType1Code CapitalGains = new DTCCPayoutType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGains";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutType1Code.mmObject();
			codeName = DTCCPayoutTypeCode.CapitalGains.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType1Code
	 * DTCCPayoutType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Premium"</li>
	 * </ul>
	 */
	public static final DTCCPayoutType1Code Premium = new DTCCPayoutType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Premium";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutType1Code.mmObject();
			codeName = DTCCPayoutTypeCode.Premium.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType1Code
	 * DTCCPayoutType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Principal"</li>
	 * </ul>
	 */
	public static final DTCCPayoutType1Code Principal = new DTCCPayoutType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Principal";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutType1Code.mmObject();
			codeName = DTCCPayoutTypeCode.Principal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType1Code
	 * DTCCPayoutType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * </ul>
	 */
	public static final DTCCPayoutType1Code Interest = new DTCCPayoutType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutType1Code.mmObject();
			codeName = DTCCPayoutTypeCode.Interest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType1Code
	 * DTCCPayoutType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Franked"</li>
	 * </ul>
	 */
	public static final DTCCPayoutType1Code Franked = new DTCCPayoutType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Franked";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutType1Code.mmObject();
			codeName = DTCCPayoutTypeCode.Franked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType1Code
	 * DTCCPayoutType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unfranked"</li>
	 * </ul>
	 */
	public static final DTCCPayoutType1Code Unfranked = new DTCCPayoutType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unfranked";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutType1Code.mmObject();
			codeName = DTCCPayoutTypeCode.Unfranked.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DTCCPayoutType1Code> codesByName = new LinkedHashMap<>();

	protected DTCCPayoutType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CASH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCCPayoutType1Code";
				definition = "Specifies DTCC (The Depository Trust and Clearing Corporation) defined payout types.";
				trace_lazy = () -> DTCCPayoutTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCCPayoutType1Code.Cash, com.tools20022.repository.codeset.DTCCPayoutType1Code.Dividend,
						com.tools20022.repository.codeset.DTCCPayoutType1Code.ReturnOfCapital, com.tools20022.repository.codeset.DTCCPayoutType1Code.ShortTermCapitalGains,
						com.tools20022.repository.codeset.DTCCPayoutType1Code.LongTermCapitalGains, com.tools20022.repository.codeset.DTCCPayoutType1Code.CapitalGains, com.tools20022.repository.codeset.DTCCPayoutType1Code.Premium,
						com.tools20022.repository.codeset.DTCCPayoutType1Code.Principal, com.tools20022.repository.codeset.DTCCPayoutType1Code.Interest, com.tools20022.repository.codeset.DTCCPayoutType1Code.Franked,
						com.tools20022.repository.codeset.DTCCPayoutType1Code.Unfranked);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Cash.getCodeName().get(), Cash);
		codesByName.put(Dividend.getCodeName().get(), Dividend);
		codesByName.put(ReturnOfCapital.getCodeName().get(), ReturnOfCapital);
		codesByName.put(ShortTermCapitalGains.getCodeName().get(), ShortTermCapitalGains);
		codesByName.put(LongTermCapitalGains.getCodeName().get(), LongTermCapitalGains);
		codesByName.put(CapitalGains.getCodeName().get(), CapitalGains);
		codesByName.put(Premium.getCodeName().get(), Premium);
		codesByName.put(Principal.getCodeName().get(), Principal);
		codesByName.put(Interest.getCodeName().get(), Interest);
		codesByName.put(Franked.getCodeName().get(), Franked);
		codesByName.put(Unfranked.getCodeName().get(), Unfranked);
	}

	public static DTCCPayoutType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCCPayoutType1Code[] values() {
		DTCCPayoutType1Code[] values = new DTCCPayoutType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCCPayoutType1Code> {
		@Override
		public DTCCPayoutType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCCPayoutType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}