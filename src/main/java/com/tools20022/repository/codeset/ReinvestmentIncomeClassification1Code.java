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
import com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code#CashDividend
 * ReinvestmentIncomeClassification1Code.CashDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code#CashDividendOnIncreasedShares
 * ReinvestmentIncomeClassification1Code.CashDividendOnIncreasedShares}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code#CashDividendTaxUnfavorable
 * ReinvestmentIncomeClassification1Code.CashDividendTaxUnfavorable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code#CashDividendTaxFavorable
 * ReinvestmentIncomeClassification1Code.CashDividendTaxFavorable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code#CashDividendTaxExempt
 * ReinvestmentIncomeClassification1Code.CashDividendTaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code#CashDividendSpecial
 * ReinvestmentIncomeClassification1Code.CashDividendSpecial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code#Interest
 * ReinvestmentIncomeClassification1Code.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code#Principal
 * ReinvestmentIncomeClassification1Code.Principal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code#CapitalGains
 * ReinvestmentIncomeClassification1Code.CapitalGains}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code#LongTermCapitalGains
 * ReinvestmentIncomeClassification1Code.LongTermCapitalGains}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code#ShortTermCapitalGains
 * ReinvestmentIncomeClassification1Code.ShortTermCapitalGains}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code#ReturnOfCapital
 * ReinvestmentIncomeClassification1Code.ReturnOfCapital}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DVCA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReinvestmentIncomeClassification1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of cash proceeds that the holder is eligible to reinvest."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ReinvestmentIncomeClassification1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code
	 * ReinvestmentIncomeClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDividend"</li>
	 * </ul>
	 */
	public static final ReinvestmentIncomeClassification1Code CashDividend = new ReinvestmentIncomeClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code.mmObject();
			codeName = ReinvestmentIncomeClassificationCode.CashDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code
	 * ReinvestmentIncomeClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDividendOnIncreasedShares"</li>
	 * </ul>
	 */
	public static final ReinvestmentIncomeClassification1Code CashDividendOnIncreasedShares = new ReinvestmentIncomeClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividendOnIncreasedShares";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code.mmObject();
			codeName = ReinvestmentIncomeClassificationCode.CashDividendOnIncreasedShares.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code
	 * ReinvestmentIncomeClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDividendTaxUnfavorable"</li>
	 * </ul>
	 */
	public static final ReinvestmentIncomeClassification1Code CashDividendTaxUnfavorable = new ReinvestmentIncomeClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividendTaxUnfavorable";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code.mmObject();
			codeName = ReinvestmentIncomeClassificationCode.CashDividendTaxUnfavorable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code
	 * ReinvestmentIncomeClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDividendTaxFavorable"</li>
	 * </ul>
	 */
	public static final ReinvestmentIncomeClassification1Code CashDividendTaxFavorable = new ReinvestmentIncomeClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividendTaxFavorable";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code.mmObject();
			codeName = ReinvestmentIncomeClassificationCode.CashDividendTaxFavorable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code
	 * ReinvestmentIncomeClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDividendTaxExempt"</li>
	 * </ul>
	 */
	public static final ReinvestmentIncomeClassification1Code CashDividendTaxExempt = new ReinvestmentIncomeClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividendTaxExempt";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code.mmObject();
			codeName = ReinvestmentIncomeClassificationCode.CashDividendTaxExempt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code
	 * ReinvestmentIncomeClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDividendSpecial"</li>
	 * </ul>
	 */
	public static final ReinvestmentIncomeClassification1Code CashDividendSpecial = new ReinvestmentIncomeClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividendSpecial";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code.mmObject();
			codeName = ReinvestmentIncomeClassificationCode.CashDividendSpecial.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code
	 * ReinvestmentIncomeClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * </ul>
	 */
	public static final ReinvestmentIncomeClassification1Code Interest = new ReinvestmentIncomeClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code.mmObject();
			codeName = ReinvestmentIncomeClassificationCode.Interest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code
	 * ReinvestmentIncomeClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Principal"</li>
	 * </ul>
	 */
	public static final ReinvestmentIncomeClassification1Code Principal = new ReinvestmentIncomeClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Principal";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code.mmObject();
			codeName = ReinvestmentIncomeClassificationCode.Principal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code
	 * ReinvestmentIncomeClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGains"</li>
	 * </ul>
	 */
	public static final ReinvestmentIncomeClassification1Code CapitalGains = new ReinvestmentIncomeClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGains";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code.mmObject();
			codeName = ReinvestmentIncomeClassificationCode.CapitalGains.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code
	 * ReinvestmentIncomeClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongTermCapitalGains"</li>
	 * </ul>
	 */
	public static final ReinvestmentIncomeClassification1Code LongTermCapitalGains = new ReinvestmentIncomeClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongTermCapitalGains";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code.mmObject();
			codeName = ReinvestmentIncomeClassificationCode.LongTermCapitalGains.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code
	 * ReinvestmentIncomeClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortTermCapitalGains"</li>
	 * </ul>
	 */
	public static final ReinvestmentIncomeClassification1Code ShortTermCapitalGains = new ReinvestmentIncomeClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortTermCapitalGains";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code.mmObject();
			codeName = ReinvestmentIncomeClassificationCode.ShortTermCapitalGains.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code
	 * ReinvestmentIncomeClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnOfCapital"</li>
	 * </ul>
	 */
	public static final ReinvestmentIncomeClassification1Code ReturnOfCapital = new ReinvestmentIncomeClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnOfCapital";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code.mmObject();
			codeName = ReinvestmentIncomeClassificationCode.ReturnOfCapital.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ReinvestmentIncomeClassification1Code> codesByName = new LinkedHashMap<>();

	protected ReinvestmentIncomeClassification1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DVCA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReinvestmentIncomeClassification1Code";
				definition = "Specifies the type of cash proceeds that the holder is eligible to reinvest.";
				trace_lazy = () -> ReinvestmentIncomeClassificationCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code.CashDividend, com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code.CashDividendOnIncreasedShares,
						com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code.CashDividendTaxUnfavorable, com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code.CashDividendTaxFavorable,
						com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code.CashDividendTaxExempt, com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code.CashDividendSpecial,
						com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code.Interest, com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code.Principal,
						com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code.CapitalGains, com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code.LongTermCapitalGains,
						com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code.ShortTermCapitalGains, com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code.ReturnOfCapital);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CashDividend.getCodeName().get(), CashDividend);
		codesByName.put(CashDividendOnIncreasedShares.getCodeName().get(), CashDividendOnIncreasedShares);
		codesByName.put(CashDividendTaxUnfavorable.getCodeName().get(), CashDividendTaxUnfavorable);
		codesByName.put(CashDividendTaxFavorable.getCodeName().get(), CashDividendTaxFavorable);
		codesByName.put(CashDividendTaxExempt.getCodeName().get(), CashDividendTaxExempt);
		codesByName.put(CashDividendSpecial.getCodeName().get(), CashDividendSpecial);
		codesByName.put(Interest.getCodeName().get(), Interest);
		codesByName.put(Principal.getCodeName().get(), Principal);
		codesByName.put(CapitalGains.getCodeName().get(), CapitalGains);
		codesByName.put(LongTermCapitalGains.getCodeName().get(), LongTermCapitalGains);
		codesByName.put(ShortTermCapitalGains.getCodeName().get(), ShortTermCapitalGains);
		codesByName.put(ReturnOfCapital.getCodeName().get(), ReturnOfCapital);
	}

	public static ReinvestmentIncomeClassification1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ReinvestmentIncomeClassification1Code[] values() {
		ReinvestmentIncomeClassification1Code[] values = new ReinvestmentIncomeClassification1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ReinvestmentIncomeClassification1Code> {
		@Override
		public ReinvestmentIncomeClassification1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ReinvestmentIncomeClassification1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}