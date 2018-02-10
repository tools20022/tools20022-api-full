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
import com.tools20022.repository.codeset.DTCCPayoutType3Code.InternalXmlAdapter;
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
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code#CapitalGains
 * DTCCPayoutType3Code.CapitalGains}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code#Cash
 * DTCCPayoutType3Code.Cash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code#Dividend
 * DTCCPayoutType3Code.Dividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code#Interest
 * DTCCPayoutType3Code.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code#LongTermCapitalGains
 * DTCCPayoutType3Code.LongTermCapitalGains}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code#Premium
 * DTCCPayoutType3Code.Premium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code#Principal
 * DTCCPayoutType3Code.Principal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code#ReturnOfCapital
 * DTCCPayoutType3Code.ReturnOfCapital}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code#ShortTermCapitalGains
 * DTCCPayoutType3Code.ShortTermCapitalGains}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCCPayoutType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies DTCC (The Depository Trust and Clearing Corporation) defined payout types."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCPayoutType5Code
 * DTCCPayoutType5Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCCPayoutType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code
	 * DTCCPayoutType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGains"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType5Code#CapitalGains
	 * DTCCPayoutType5Code.CapitalGains}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCCPayoutType3Code CapitalGains = new DTCCPayoutType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGains";
			nextVersions_lazy = () -> Arrays.asList(DTCCPayoutType5Code.CapitalGains);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutType3Code.mmObject();
			codeName = DTCCPayoutTypeCode.CapitalGains.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code
	 * DTCCPayoutType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cash"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType5Code#Cash
	 * DTCCPayoutType5Code.Cash}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCCPayoutType3Code Cash = new DTCCPayoutType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cash";
			nextVersions_lazy = () -> Arrays.asList(DTCCPayoutType5Code.Cash);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutType3Code.mmObject();
			codeName = DTCCPayoutTypeCode.Cash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code
	 * DTCCPayoutType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType5Code#Dividend
	 * DTCCPayoutType5Code.Dividend}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCCPayoutType3Code Dividend = new DTCCPayoutType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dividend";
			nextVersions_lazy = () -> Arrays.asList(DTCCPayoutType5Code.Dividend);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutType3Code.mmObject();
			codeName = DTCCPayoutTypeCode.Dividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code
	 * DTCCPayoutType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType5Code#Interest
	 * DTCCPayoutType5Code.Interest}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCCPayoutType3Code Interest = new DTCCPayoutType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			nextVersions_lazy = () -> Arrays.asList(DTCCPayoutType5Code.Interest);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutType3Code.mmObject();
			codeName = DTCCPayoutTypeCode.Interest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code
	 * DTCCPayoutType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongTermCapitalGains"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType5Code#LongTermCapitalGains
	 * DTCCPayoutType5Code.LongTermCapitalGains}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCCPayoutType3Code LongTermCapitalGains = new DTCCPayoutType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongTermCapitalGains";
			nextVersions_lazy = () -> Arrays.asList(DTCCPayoutType5Code.LongTermCapitalGains);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutType3Code.mmObject();
			codeName = DTCCPayoutTypeCode.LongTermCapitalGains.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code
	 * DTCCPayoutType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Premium"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType5Code#Premium
	 * DTCCPayoutType5Code.Premium}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCCPayoutType3Code Premium = new DTCCPayoutType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Premium";
			nextVersions_lazy = () -> Arrays.asList(DTCCPayoutType5Code.Premium);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutType3Code.mmObject();
			codeName = DTCCPayoutTypeCode.Premium.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code
	 * DTCCPayoutType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Principal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType5Code#Principal
	 * DTCCPayoutType5Code.Principal}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCCPayoutType3Code Principal = new DTCCPayoutType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Principal";
			nextVersions_lazy = () -> Arrays.asList(DTCCPayoutType5Code.Principal);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutType3Code.mmObject();
			codeName = DTCCPayoutTypeCode.Principal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code
	 * DTCCPayoutType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnOfCapital"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType5Code#ReturnOfCapital
	 * DTCCPayoutType5Code.ReturnOfCapital}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCCPayoutType3Code ReturnOfCapital = new DTCCPayoutType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnOfCapital";
			nextVersions_lazy = () -> Arrays.asList(DTCCPayoutType5Code.ReturnOfCapital);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutType3Code.mmObject();
			codeName = DTCCPayoutTypeCode.ReturnOfCapital.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code
	 * DTCCPayoutType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortTermCapitalGains"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType5Code#ShortTermCapitalGains
	 * DTCCPayoutType5Code.ShortTermCapitalGains}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCCPayoutType3Code ShortTermCapitalGains = new DTCCPayoutType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortTermCapitalGains";
			nextVersions_lazy = () -> Arrays.asList(DTCCPayoutType5Code.ShortTermCapitalGains);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutType3Code.mmObject();
			codeName = DTCCPayoutTypeCode.ShortTermCapitalGains.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DTCCPayoutType3Code> codesByName = new LinkedHashMap<>();

	protected DTCCPayoutType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCCPayoutType3Code";
				definition = "Specifies DTCC (The Depository Trust and Clearing Corporation) defined payout types.";
				nextVersions_lazy = () -> Arrays.asList(DTCCPayoutType5Code.mmObject());
				trace_lazy = () -> DTCCPayoutTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCCPayoutType3Code.CapitalGains, com.tools20022.repository.codeset.DTCCPayoutType3Code.Cash, com.tools20022.repository.codeset.DTCCPayoutType3Code.Dividend,
						com.tools20022.repository.codeset.DTCCPayoutType3Code.Interest, com.tools20022.repository.codeset.DTCCPayoutType3Code.LongTermCapitalGains, com.tools20022.repository.codeset.DTCCPayoutType3Code.Premium,
						com.tools20022.repository.codeset.DTCCPayoutType3Code.Principal, com.tools20022.repository.codeset.DTCCPayoutType3Code.ReturnOfCapital, com.tools20022.repository.codeset.DTCCPayoutType3Code.ShortTermCapitalGains);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CapitalGains.getCodeName().get(), CapitalGains);
		codesByName.put(Cash.getCodeName().get(), Cash);
		codesByName.put(Dividend.getCodeName().get(), Dividend);
		codesByName.put(Interest.getCodeName().get(), Interest);
		codesByName.put(LongTermCapitalGains.getCodeName().get(), LongTermCapitalGains);
		codesByName.put(Premium.getCodeName().get(), Premium);
		codesByName.put(Principal.getCodeName().get(), Principal);
		codesByName.put(ReturnOfCapital.getCodeName().get(), ReturnOfCapital);
		codesByName.put(ShortTermCapitalGains.getCodeName().get(), ShortTermCapitalGains);
	}

	public static DTCCPayoutType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCCPayoutType3Code[] values() {
		DTCCPayoutType3Code[] values = new DTCCPayoutType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCCPayoutType3Code> {
		@Override
		public DTCCPayoutType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCCPayoutType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}