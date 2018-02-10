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
import com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type for an underlying contract for difference derivative.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code#Bond
 * UnderlyingContractForDifferenceType3Code.Bond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code#Commodity
 * UnderlyingContractForDifferenceType3Code.Commodity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code#Currency
 * UnderlyingContractForDifferenceType3Code.Currency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code#EmissionAllowance
 * UnderlyingContractForDifferenceType3Code.EmissionAllowance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code#Equity
 * UnderlyingContractForDifferenceType3Code.Equity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code#FutureOnEquity
 * UnderlyingContractForDifferenceType3Code.FutureOnEquity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code#OptionOnEquity
 * UnderlyingContractForDifferenceType3Code.OptionOnEquity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code#Other
 * UnderlyingContractForDifferenceType3Code.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code
 * UnderlyingTypeV3Code}</li>
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
 * "UnderlyingContractForDifferenceType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type for an underlying contract for difference derivative."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnderlyingContractForDifferenceType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code
	 * UnderlyingContractForDifferenceType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bond"</li>
	 * </ul>
	 */
	public static final UnderlyingContractForDifferenceType3Code Bond = new UnderlyingContractForDifferenceType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bond";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code.mmObject();
			codeName = UnderlyingTypeV3Code.Bond.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code
	 * UnderlyingContractForDifferenceType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commodity"</li>
	 * </ul>
	 */
	public static final UnderlyingContractForDifferenceType3Code Commodity = new UnderlyingContractForDifferenceType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commodity";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code.mmObject();
			codeName = UnderlyingTypeV3Code.Commodity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code
	 * UnderlyingContractForDifferenceType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * </ul>
	 */
	public static final UnderlyingContractForDifferenceType3Code Currency = new UnderlyingContractForDifferenceType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code.mmObject();
			codeName = UnderlyingTypeV3Code.Currency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code
	 * UnderlyingContractForDifferenceType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmissionAllowance"</li>
	 * </ul>
	 */
	public static final UnderlyingContractForDifferenceType3Code EmissionAllowance = new UnderlyingContractForDifferenceType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmissionAllowance";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code.mmObject();
			codeName = UnderlyingTypeV3Code.EmissionAllowance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code
	 * UnderlyingContractForDifferenceType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equity"</li>
	 * </ul>
	 */
	public static final UnderlyingContractForDifferenceType3Code Equity = new UnderlyingContractForDifferenceType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equity";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code.mmObject();
			codeName = UnderlyingTypeV3Code.Equity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code
	 * UnderlyingContractForDifferenceType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FutureOnEquity"</li>
	 * </ul>
	 */
	public static final UnderlyingContractForDifferenceType3Code FutureOnEquity = new UnderlyingContractForDifferenceType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FutureOnEquity";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code.mmObject();
			codeName = UnderlyingTypeV3Code.FutureOnEquity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code
	 * UnderlyingContractForDifferenceType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionOnEquity"</li>
	 * </ul>
	 */
	public static final UnderlyingContractForDifferenceType3Code OptionOnEquity = new UnderlyingContractForDifferenceType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionOnEquity";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code.mmObject();
			codeName = UnderlyingTypeV3Code.OptionOnEquity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code
	 * UnderlyingContractForDifferenceType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final UnderlyingContractForDifferenceType3Code Other = new UnderlyingContractForDifferenceType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code.mmObject();
			codeName = UnderlyingTypeV3Code.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UnderlyingContractForDifferenceType3Code> codesByName = new LinkedHashMap<>();

	protected UnderlyingContractForDifferenceType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnderlyingContractForDifferenceType3Code";
				definition = "Specifies the type for an underlying contract for difference derivative.";
				trace_lazy = () -> UnderlyingTypeV3Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code.Bond, com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code.Commodity,
						com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code.Currency, com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code.EmissionAllowance,
						com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code.Equity, com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code.FutureOnEquity,
						com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code.OptionOnEquity, com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Bond.getCodeName().get(), Bond);
		codesByName.put(Commodity.getCodeName().get(), Commodity);
		codesByName.put(Currency.getCodeName().get(), Currency);
		codesByName.put(EmissionAllowance.getCodeName().get(), EmissionAllowance);
		codesByName.put(Equity.getCodeName().get(), Equity);
		codesByName.put(FutureOnEquity.getCodeName().get(), FutureOnEquity);
		codesByName.put(OptionOnEquity.getCodeName().get(), OptionOnEquity);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static UnderlyingContractForDifferenceType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnderlyingContractForDifferenceType3Code[] values() {
		UnderlyingContractForDifferenceType3Code[] values = new UnderlyingContractForDifferenceType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnderlyingContractForDifferenceType3Code> {
		@Override
		public UnderlyingContractForDifferenceType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnderlyingContractForDifferenceType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}