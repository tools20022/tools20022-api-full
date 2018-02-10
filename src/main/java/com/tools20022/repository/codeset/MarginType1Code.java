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
import com.tools20022.repository.codeset.MarginType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the type of margin, for example, initial margin, variation margin,
 * initial deposit or coupon margin.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginType1Code#SettlementRiskMargin
 * MarginType1Code.SettlementRiskMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginType1Code#AdditionalDefaultFundMargin
 * MarginType1Code.AdditionalDefaultFundMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginType1Code#ShortChargeMargin
 * MarginType1Code.ShortChargeMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginType1Code#CouponMargin
 * MarginType1Code.CouponMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginType1Code#UpfrontMargin
 * MarginType1Code.UpfrontMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginType1Code#CreditEventMargin
 * MarginType1Code.CreditEventMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginType1Code#InitialDeposit
 * MarginType1Code.InitialDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginType1Code#NegociationMargin
 * MarginType1Code.NegociationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginType1Code#InitialMargin
 * MarginType1Code.InitialMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginType1Code#VariationMargin
 * MarginType1Code.VariationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginType1Code#IncreaseCoverageAmount
 * MarginType1Code.IncreaseCoverageAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode MarginTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SEMA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarginType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the type of margin, for example, initial margin, variation margin, initial deposit or coupon margin."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MarginType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginType1Code
	 * MarginType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementRiskMargin"</li>
	 * </ul>
	 */
	public static final MarginType1Code SettlementRiskMargin = new MarginType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementRiskMargin";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginType1Code.mmObject();
			codeName = MarginTypeCode.SettlementRiskMargin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginType1Code
	 * MarginType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDefaultFundMargin"</li>
	 * </ul>
	 */
	public static final MarginType1Code AdditionalDefaultFundMargin = new MarginType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDefaultFundMargin";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginType1Code.mmObject();
			codeName = MarginTypeCode.AdditionalDefaultFundMargin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginType1Code
	 * MarginType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortChargeMargin"</li>
	 * </ul>
	 */
	public static final MarginType1Code ShortChargeMargin = new MarginType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortChargeMargin";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginType1Code.mmObject();
			codeName = MarginTypeCode.ShortChargeMargin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginType1Code
	 * MarginType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CouponMargin"</li>
	 * </ul>
	 */
	public static final MarginType1Code CouponMargin = new MarginType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponMargin";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginType1Code.mmObject();
			codeName = MarginTypeCode.CouponMargin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginType1Code
	 * MarginType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpfrontMargin"</li>
	 * </ul>
	 */
	public static final MarginType1Code UpfrontMargin = new MarginType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpfrontMargin";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginType1Code.mmObject();
			codeName = MarginTypeCode.UpfrontMargin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginType1Code
	 * MarginType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditEventMargin"</li>
	 * </ul>
	 */
	public static final MarginType1Code CreditEventMargin = new MarginType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditEventMargin";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginType1Code.mmObject();
			codeName = MarginTypeCode.CreditEventMargin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginType1Code
	 * MarginType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialDeposit"</li>
	 * </ul>
	 */
	public static final MarginType1Code InitialDeposit = new MarginType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginType1Code.mmObject();
			codeName = MarginTypeCode.InitialDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginType1Code
	 * MarginType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NegociationMargin"</li>
	 * </ul>
	 */
	public static final MarginType1Code NegociationMargin = new MarginType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegociationMargin";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginType1Code.mmObject();
			codeName = MarginTypeCode.NegociationMargin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginType1Code
	 * MarginType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialMargin"</li>
	 * </ul>
	 */
	public static final MarginType1Code InitialMargin = new MarginType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialMargin";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginType1Code.mmObject();
			codeName = MarginTypeCode.InitialMargin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginType1Code
	 * MarginType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMargin"</li>
	 * </ul>
	 */
	public static final MarginType1Code VariationMargin = new MarginType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMargin";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginType1Code.mmObject();
			codeName = MarginTypeCode.VariationMargin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginType1Code
	 * MarginType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncreaseCoverageAmount"</li>
	 * </ul>
	 */
	public static final MarginType1Code IncreaseCoverageAmount = new MarginType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncreaseCoverageAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginType1Code.mmObject();
			codeName = MarginTypeCode.IncreaseCoverageAmount.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MarginType1Code> codesByName = new LinkedHashMap<>();

	protected MarginType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SEMA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarginType1Code";
				definition = "Indicates the type of margin, for example, initial margin, variation margin, initial deposit or coupon margin.";
				trace_lazy = () -> MarginTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MarginType1Code.SettlementRiskMargin, com.tools20022.repository.codeset.MarginType1Code.AdditionalDefaultFundMargin,
						com.tools20022.repository.codeset.MarginType1Code.ShortChargeMargin, com.tools20022.repository.codeset.MarginType1Code.CouponMargin, com.tools20022.repository.codeset.MarginType1Code.UpfrontMargin,
						com.tools20022.repository.codeset.MarginType1Code.CreditEventMargin, com.tools20022.repository.codeset.MarginType1Code.InitialDeposit, com.tools20022.repository.codeset.MarginType1Code.NegociationMargin,
						com.tools20022.repository.codeset.MarginType1Code.InitialMargin, com.tools20022.repository.codeset.MarginType1Code.VariationMargin, com.tools20022.repository.codeset.MarginType1Code.IncreaseCoverageAmount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SettlementRiskMargin.getCodeName().get(), SettlementRiskMargin);
		codesByName.put(AdditionalDefaultFundMargin.getCodeName().get(), AdditionalDefaultFundMargin);
		codesByName.put(ShortChargeMargin.getCodeName().get(), ShortChargeMargin);
		codesByName.put(CouponMargin.getCodeName().get(), CouponMargin);
		codesByName.put(UpfrontMargin.getCodeName().get(), UpfrontMargin);
		codesByName.put(CreditEventMargin.getCodeName().get(), CreditEventMargin);
		codesByName.put(InitialDeposit.getCodeName().get(), InitialDeposit);
		codesByName.put(NegociationMargin.getCodeName().get(), NegociationMargin);
		codesByName.put(InitialMargin.getCodeName().get(), InitialMargin);
		codesByName.put(VariationMargin.getCodeName().get(), VariationMargin);
		codesByName.put(IncreaseCoverageAmount.getCodeName().get(), IncreaseCoverageAmount);
	}

	public static MarginType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MarginType1Code[] values() {
		MarginType1Code[] values = new MarginType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MarginType1Code> {
		@Override
		public MarginType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MarginType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}