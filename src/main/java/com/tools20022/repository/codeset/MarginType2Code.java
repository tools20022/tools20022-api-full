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
import com.tools20022.repository.codeset.MarginType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of margin, for example, initial margin, variation margin,
 * initial deposit or coupon margin.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginType2Code#AdditionalDefaultFundMargin
 * MarginType2Code.AdditionalDefaultFundMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginType2Code#CouponMargin
 * MarginType2Code.CouponMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginType2Code#CreditEventMargin
 * MarginType2Code.CreditEventMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginType2Code#SettlementRiskMargin
 * MarginType2Code.SettlementRiskMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginType2Code#ShortChargeMargin
 * MarginType2Code.ShortChargeMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginType2Code#UpfrontMargin
 * MarginType2Code.UpfrontMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginType2Code#MarketRiskMargin
 * MarginType2Code.MarketRiskMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginType2Code#SovereignRiskMargin
 * MarginType2Code.SovereignRiskMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginType2Code#WrongWayRiskMargin
 * MarginType2Code.WrongWayRiskMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginType2Code#BasisRiskMargin
 * MarginType2Code.BasisRiskMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginType2Code#LiquidityRiskMargin
 * MarginType2Code.LiquidityRiskMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginType2Code#CreditRiskAdditionalMargin
 * MarginType2Code.CreditRiskAdditionalMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginType2Code#ContingentVariationMargin
 * MarginType2Code.ContingentVariationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginType2Code#SponsorRiskMargin
 * MarginType2Code.SponsorRiskMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginType2Code#JumpToDefaultRequirement
 * MarginType2Code.JumpToDefaultRequirement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginType2Code#DiscretionaryRiskAddOn
 * MarginType2Code.DiscretionaryRiskAddOn}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MarginType2Code#Other
 * MarginType2Code.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode MarginTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarginType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of margin, for example, initial margin, variation margin, initial deposit or coupon margin."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MarginType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginType2Code
	 * MarginType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDefaultFundMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MarginType2Code AdditionalDefaultFundMargin = new MarginType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDefaultFundMargin";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginType2Code.mmObject();
			codeName = MarginTypeCode.AdditionalDefaultFundMargin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginType2Code
	 * MarginType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CouponMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MarginType2Code CouponMargin = new MarginType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponMargin";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginType2Code.mmObject();
			codeName = MarginTypeCode.CouponMargin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginType2Code
	 * MarginType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditEventMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MarginType2Code CreditEventMargin = new MarginType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditEventMargin";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginType2Code.mmObject();
			codeName = MarginTypeCode.CreditEventMargin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginType2Code
	 * MarginType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementRiskMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MarginType2Code SettlementRiskMargin = new MarginType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementRiskMargin";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginType2Code.mmObject();
			codeName = MarginTypeCode.SettlementRiskMargin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginType2Code
	 * MarginType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortChargeMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MarginType2Code ShortChargeMargin = new MarginType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortChargeMargin";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginType2Code.mmObject();
			codeName = MarginTypeCode.ShortChargeMargin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginType2Code
	 * MarginType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpfrontMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MarginType2Code UpfrontMargin = new MarginType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpfrontMargin";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginType2Code.mmObject();
			codeName = MarginTypeCode.UpfrontMargin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginType2Code
	 * MarginType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketRiskMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MarginType2Code MarketRiskMargin = new MarginType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketRiskMargin";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginType2Code.mmObject();
			codeName = MarginTypeCode.MarketRiskMargin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginType2Code
	 * MarginType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SovereignRiskMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MarginType2Code SovereignRiskMargin = new MarginType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SovereignRiskMargin";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginType2Code.mmObject();
			codeName = MarginTypeCode.SovereignRiskMargin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginType2Code
	 * MarginType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongWayRiskMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MarginType2Code WrongWayRiskMargin = new MarginType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongWayRiskMargin";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginType2Code.mmObject();
			codeName = MarginTypeCode.WrongWayRiskMargin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginType2Code
	 * MarginType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasisRiskMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MarginType2Code BasisRiskMargin = new MarginType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BasisRiskMargin";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginType2Code.mmObject();
			codeName = MarginTypeCode.BasisRiskMargin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginType2Code
	 * MarginType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidityRiskMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MarginType2Code LiquidityRiskMargin = new MarginType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidityRiskMargin";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginType2Code.mmObject();
			codeName = MarginTypeCode.LiquidityRiskMargin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginType2Code
	 * MarginType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditRiskAdditionalMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MarginType2Code CreditRiskAdditionalMargin = new MarginType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditRiskAdditionalMargin";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginType2Code.mmObject();
			codeName = MarginTypeCode.CreditRiskAdditionalMargin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginType2Code
	 * MarginType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContingentVariationMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MarginType2Code ContingentVariationMargin = new MarginType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContingentVariationMargin";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginType2Code.mmObject();
			codeName = MarginTypeCode.ContingentVariationMargin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginType2Code
	 * MarginType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SponsorRiskMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MarginType2Code SponsorRiskMargin = new MarginType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SponsorRiskMargin";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginType2Code.mmObject();
			codeName = MarginTypeCode.SponsorRiskMargin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginType2Code
	 * MarginType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JumpToDefaultRequirement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MarginType2Code JumpToDefaultRequirement = new MarginType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JumpToDefaultRequirement";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginType2Code.mmObject();
			codeName = MarginTypeCode.JumpToDefaultRequirement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginType2Code
	 * MarginType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscretionaryRiskAddOn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MarginType2Code DiscretionaryRiskAddOn = new MarginType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscretionaryRiskAddOn";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginType2Code.mmObject();
			codeName = MarginTypeCode.DiscretionaryRiskAddOn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginType2Code
	 * MarginType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MarginType2Code Other = new MarginType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginType2Code.mmObject();
			codeName = MarginTypeCode.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MarginType2Code> codesByName = new LinkedHashMap<>();

	protected MarginType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "MarginType2Code";
				definition = "Specifies the type of margin, for example, initial margin, variation margin, initial deposit or coupon margin.";
				trace_lazy = () -> MarginTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MarginType2Code.AdditionalDefaultFundMargin, com.tools20022.repository.codeset.MarginType2Code.CouponMargin,
						com.tools20022.repository.codeset.MarginType2Code.CreditEventMargin, com.tools20022.repository.codeset.MarginType2Code.SettlementRiskMargin, com.tools20022.repository.codeset.MarginType2Code.ShortChargeMargin,
						com.tools20022.repository.codeset.MarginType2Code.UpfrontMargin, com.tools20022.repository.codeset.MarginType2Code.MarketRiskMargin, com.tools20022.repository.codeset.MarginType2Code.SovereignRiskMargin,
						com.tools20022.repository.codeset.MarginType2Code.WrongWayRiskMargin, com.tools20022.repository.codeset.MarginType2Code.BasisRiskMargin, com.tools20022.repository.codeset.MarginType2Code.LiquidityRiskMargin,
						com.tools20022.repository.codeset.MarginType2Code.CreditRiskAdditionalMargin, com.tools20022.repository.codeset.MarginType2Code.ContingentVariationMargin,
						com.tools20022.repository.codeset.MarginType2Code.SponsorRiskMargin, com.tools20022.repository.codeset.MarginType2Code.JumpToDefaultRequirement,
						com.tools20022.repository.codeset.MarginType2Code.DiscretionaryRiskAddOn, com.tools20022.repository.codeset.MarginType2Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AdditionalDefaultFundMargin.getCodeName().get(), AdditionalDefaultFundMargin);
		codesByName.put(CouponMargin.getCodeName().get(), CouponMargin);
		codesByName.put(CreditEventMargin.getCodeName().get(), CreditEventMargin);
		codesByName.put(SettlementRiskMargin.getCodeName().get(), SettlementRiskMargin);
		codesByName.put(ShortChargeMargin.getCodeName().get(), ShortChargeMargin);
		codesByName.put(UpfrontMargin.getCodeName().get(), UpfrontMargin);
		codesByName.put(MarketRiskMargin.getCodeName().get(), MarketRiskMargin);
		codesByName.put(SovereignRiskMargin.getCodeName().get(), SovereignRiskMargin);
		codesByName.put(WrongWayRiskMargin.getCodeName().get(), WrongWayRiskMargin);
		codesByName.put(BasisRiskMargin.getCodeName().get(), BasisRiskMargin);
		codesByName.put(LiquidityRiskMargin.getCodeName().get(), LiquidityRiskMargin);
		codesByName.put(CreditRiskAdditionalMargin.getCodeName().get(), CreditRiskAdditionalMargin);
		codesByName.put(ContingentVariationMargin.getCodeName().get(), ContingentVariationMargin);
		codesByName.put(SponsorRiskMargin.getCodeName().get(), SponsorRiskMargin);
		codesByName.put(JumpToDefaultRequirement.getCodeName().get(), JumpToDefaultRequirement);
		codesByName.put(DiscretionaryRiskAddOn.getCodeName().get(), DiscretionaryRiskAddOn);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static MarginType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MarginType2Code[] values() {
		MarginType2Code[] values = new MarginType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MarginType2Code> {
		@Override
		public MarginType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MarginType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}