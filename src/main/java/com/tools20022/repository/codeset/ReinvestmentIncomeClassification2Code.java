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
import com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of cash proceeds that the holder is eligible to reinvest.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code#CapitalGains
 * ReinvestmentIncomeClassification2Code.CapitalGains}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code#CashDividend
 * ReinvestmentIncomeClassification2Code.CashDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code#CashDividendSpecial
 * ReinvestmentIncomeClassification2Code.CashDividendSpecial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code#Interest
 * ReinvestmentIncomeClassification2Code.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code#LongTermCapitalGains
 * ReinvestmentIncomeClassification2Code.LongTermCapitalGains}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code#Principal
 * ReinvestmentIncomeClassification2Code.Principal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code#ReturnOfCapital
 * ReinvestmentIncomeClassification2Code.ReturnOfCapital}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code#ShortTermCapitalGains
 * ReinvestmentIncomeClassification2Code.ShortTermCapitalGains}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode
 * ReinvestmentIncomeClassificationCode}</li>
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
 * "ReinvestmentIncomeClassification2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of cash proceeds that the holder is eligible to reinvest."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ReinvestmentIncomeClassification2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code
	 * ReinvestmentIncomeClassification2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGains"</li>
	 * </ul>
	 */
	public static final ReinvestmentIncomeClassification2Code CapitalGains = new ReinvestmentIncomeClassification2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGains";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code.mmObject();
			codeName = ReinvestmentIncomeClassificationCode.CapitalGains.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code
	 * ReinvestmentIncomeClassification2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDividend"</li>
	 * </ul>
	 */
	public static final ReinvestmentIncomeClassification2Code CashDividend = new ReinvestmentIncomeClassification2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code.mmObject();
			codeName = ReinvestmentIncomeClassificationCode.CashDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code
	 * ReinvestmentIncomeClassification2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDividendSpecial"</li>
	 * </ul>
	 */
	public static final ReinvestmentIncomeClassification2Code CashDividendSpecial = new ReinvestmentIncomeClassification2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividendSpecial";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code.mmObject();
			codeName = ReinvestmentIncomeClassificationCode.CashDividendSpecial.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code
	 * ReinvestmentIncomeClassification2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * </ul>
	 */
	public static final ReinvestmentIncomeClassification2Code Interest = new ReinvestmentIncomeClassification2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code.mmObject();
			codeName = ReinvestmentIncomeClassificationCode.Interest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code
	 * ReinvestmentIncomeClassification2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongTermCapitalGains"</li>
	 * </ul>
	 */
	public static final ReinvestmentIncomeClassification2Code LongTermCapitalGains = new ReinvestmentIncomeClassification2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongTermCapitalGains";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code.mmObject();
			codeName = ReinvestmentIncomeClassificationCode.LongTermCapitalGains.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code
	 * ReinvestmentIncomeClassification2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Principal"</li>
	 * </ul>
	 */
	public static final ReinvestmentIncomeClassification2Code Principal = new ReinvestmentIncomeClassification2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Principal";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code.mmObject();
			codeName = ReinvestmentIncomeClassificationCode.Principal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code
	 * ReinvestmentIncomeClassification2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnOfCapital"</li>
	 * </ul>
	 */
	public static final ReinvestmentIncomeClassification2Code ReturnOfCapital = new ReinvestmentIncomeClassification2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnOfCapital";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code.mmObject();
			codeName = ReinvestmentIncomeClassificationCode.ReturnOfCapital.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code
	 * ReinvestmentIncomeClassification2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortTermCapitalGains"</li>
	 * </ul>
	 */
	public static final ReinvestmentIncomeClassification2Code ShortTermCapitalGains = new ReinvestmentIncomeClassification2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortTermCapitalGains";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code.mmObject();
			codeName = ReinvestmentIncomeClassificationCode.ShortTermCapitalGains.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ReinvestmentIncomeClassification2Code> codesByName = new LinkedHashMap<>();

	protected ReinvestmentIncomeClassification2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReinvestmentIncomeClassification2Code";
				definition = "Specifies the type of cash proceeds that the holder is eligible to reinvest.";
				trace_lazy = () -> ReinvestmentIncomeClassificationCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code.CapitalGains, com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code.CashDividend,
						com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code.CashDividendSpecial, com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code.Interest,
						com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code.LongTermCapitalGains, com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code.Principal,
						com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code.ReturnOfCapital, com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code.ShortTermCapitalGains);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CapitalGains.getCodeName().get(), CapitalGains);
		codesByName.put(CashDividend.getCodeName().get(), CashDividend);
		codesByName.put(CashDividendSpecial.getCodeName().get(), CashDividendSpecial);
		codesByName.put(Interest.getCodeName().get(), Interest);
		codesByName.put(LongTermCapitalGains.getCodeName().get(), LongTermCapitalGains);
		codesByName.put(Principal.getCodeName().get(), Principal);
		codesByName.put(ReturnOfCapital.getCodeName().get(), ReturnOfCapital);
		codesByName.put(ShortTermCapitalGains.getCodeName().get(), ShortTermCapitalGains);
	}

	public static ReinvestmentIncomeClassification2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ReinvestmentIncomeClassification2Code[] values() {
		ReinvestmentIncomeClassification2Code[] values = new ReinvestmentIncomeClassification2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ReinvestmentIncomeClassification2Code> {
		@Override
		public ReinvestmentIncomeClassification2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ReinvestmentIncomeClassification2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}